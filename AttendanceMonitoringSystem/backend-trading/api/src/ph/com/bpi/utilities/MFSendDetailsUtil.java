package ph.com.bpi.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.bpi.EHLLAPIImpl;

import ph.com.bpi.utilities.AppConstants;
import ph.com.bpi.exception.MFResponseException;

public class MFSendDetailsUtil{

	private static Logger logger = Logger.getLogger(MFSendDetailsUtil.class);

	/**
	 * Returns the value of the fields from the last record received from
	 * MainFrame.
	 * This will be used for:
	 * • Requesting data for trancodes with inquire list purpose.
	 * • Updating data for trancodes with occurs.
	 * 
	 * @param tCode
	 *            Transaction Code
	 * @param procTag
	 *            Processing Tag
	 * @param rOccurs
	 *            No. of occurs
	 * @param data
	 *            Data
	 * @return
	 */
	public static String sendDetails(String tCode, HashMap<String, String> data) throws MFResponseException{
		return sendDetails(tCode, StringUtils.EMPTY, StringUtils.EMPTY, data, new ArrayList<>());
	}
	
	public static String sendDetails(String tCode, HashMap<String, String> data, List<HashMap<String, String>> dataList) throws MFResponseException{
		return sendDetails(tCode, StringUtils.EMPTY, StringUtils.EMPTY, data, dataList);
	}
	
	public static String sendDetails(String tCode, String procTag, HashMap<String, String> data) throws MFResponseException{
		return sendDetails(tCode, procTag, StringUtils.EMPTY, data, new ArrayList<>());
	}

	public static String sendDetails(String tCode, String procTag, String rOccurs, HashMap<String, String> data, List<HashMap<String, String>> dataList)
			throws MFResponseException {

		String pCode = "";
		String ioProg = "";
		String messageHeader = "";
		String messageDetail = "";
		String sentMessage = "";
		String receivedMessage = "";
		String receive = "";
		int receiveCode = -1;
		String errorMessage = null;
		StringBuilder builder;
		boolean gInitial = true;
		
		String gLUID = data.get(AppConstants.G_LUID);
		String gOffCode = data.get(AppConstants.G_OFFICE_CODE);
		String gUserId = data.get(AppConstants.G_USER_ID);
		String cLogDate = data.get(AppConstants.C_LOG_DATE);
		String gLogTime = data.get(AppConstants.G_LOG_TIME);
		String gTranFI = data.get(AppConstants.G_TRAN_FI);

		/**
		 * Got from FXPARAM.JAG.
		 */
		String gVersion = AppConstants.FX_SYSTEM_VERSION;
		String gCICSSession = AppConstants.FX_MFREGION;

		
		int tCodeInt = Integer.valueOf(tCode);
		if (tCodeInt < 900) {
			if(tCodeInt < 100){
				pCode = "FF" + ApplicationUtils.subString(tCode, 1, 2);
				ioProg = "FFPCS" + ApplicationUtils.subString(tCode, 1, 2) + "0";
			} else {
				switch(tCode){
					case "0239":
					case "0240":
					case "0241":
					case "0242":
					case "0243":
						pCode = "FF21";
						ioProg = "FFPCS210";
						break;
					default:
						pCode = "FF" + ApplicationUtils.subString(tCode, 1, 1) + "0";
						ioProg = "FFPCS" + ApplicationUtils.subString(tCode, 1, 1) + "00";
				}
			}
		} else {
			switch(tCode){
				case "0900":
				case "0901":
				case "0902":
				case "0903":
				case "0904":
				case "0905":
				case "0906":
				case "0908":
				case "0910":
					pCode = "FFI1";
					ioProg = "FFPCI001";
					break;
				case "0909":
					pCode = "FFI2";
					ioProg = "FFPCI002";
					break;
				case "0907":
					pCode = "FFR1";
					ioProg = "FFPCR001";
					break;
				default:
					errorMessage = "Transaction code not yet defined.";
					logger.info(errorMessage);
					throw new MFResponseException("9000", errorMessage);
			}
		}

		builder = new StringBuilder();
		builder.append(pCode);
		builder.append(gVersion);
		builder.append("    ");
		builder.append(gOffCode);
		builder.append(StringUtils.rightPad(gUserId.trim(), 8));
		builder.append(cLogDate);
		builder.append(StringUtils.remove(gLogTime, ":"));
		builder.append(ioProg);
		builder.append("R");
		builder.append(gTranFI);
		builder.append(tCode);

		messageHeader = builder.toString();
		
		if(tCodeInt == Integer.valueOf("0001")){ // Transaction Type for LOGON
			messageDetail = logToHost(tCode, data);

		}else if(tCodeInt == Integer.valueOf("0002")){ // Transaction Type for LOGOFF
			messageDetail = logFromHost(tCode, data);

		}else if(tCodeInt == Integer.valueOf("0003")){ // Transaction Type for LOCAL OVERRIDE
			messageDetail = localOverride(tCode, data);

		}else if((tCodeInt >= Integer.valueOf("0010")) && (tCodeInt < Integer.valueOf("0100"))){ // 10: User file Maintenance
			messageDetail = transactionSeries0010(tCode, procTag, data);

		}else if((tCodeInt >= Integer.valueOf("0100")) && (tCodeInt < Integer.valueOf("0200"))){ //100: System Controls
			messageDetail = transactionSeries0100(tCode, procTag, data, dataList);

		}else if((tCodeInt >= Integer.valueOf("0200")) && (tCodeInt < Integer.valueOf("0300"))){ //200: Rates and Spreads
			messageDetail = transactionSeries0200(tCode, procTag, data, dataList);

		}else if((tCodeInt >= Integer.valueOf("0300")) && (tCodeInt < Integer.valueOf("0400"))){ //300: Purchase and Sale
			messageDetail = transactionSeries0300(tCode, procTag, data);

		}else if((tCodeInt >= Integer.valueOf("0400")) && (tCodeInt < Integer.valueOf("0500"))){ //400:  BTSU Transactions
			messageDetail = transactionSeries0400(tCode, procTag, data);
			
		}else if((tCodeInt >= Integer.valueOf("0500")) && (tCodeInt < Integer.valueOf("0600"))){ //500: Forex Stations Cash Flow
			messageDetail = transactionSeries0500(tCode, procTag, data);

		}else if((tCodeInt >= Integer.valueOf("0600")) && (tCodeInt < Integer.valueOf("0700"))){ //600: FX Position 
			messageDetail = transactionSeries0600(tCode, procTag, data, dataList);

		}else if((tCodeInt >= Integer.valueOf("0800")) && (tCodeInt < Integer.valueOf("0900"))){ //800: Interbank File Maintenance 
			messageDetail = transactionSeries0800(tCode, procTag, data);

		}else if((tCodeInt >= Integer.valueOf("0900")) && (tCodeInt < Integer.valueOf("1000"))){ //900: Inquiry/Report/Downloads
			messageDetail = transactionSeries0900(tCode, procTag, data);
		}else{
			errorMessage = "Transaction code not yet defined.";
			logger.info(errorMessage);
			throw new MFResponseException("9000", errorMessage);
		}
		sentMessage = messageHeader + messageDetail;
		EHLLAPIImpl ehllapi = new EHLLAPIImpl();

		/**
		 * Call to mainframe.
		 */
		receivedMessage = ehllapi.sendhost(sentMessage, gCICSSession);

		// Test for EHLLAPI-layer errors.
		String testCode = receivedMessage.trim();
		switch(testCode){
			case "90":
				throw new MFResponseException(testCode, "Emulation/EHLLAPI not loaded.");
			case "91":
				throw new MFResponseException(testCode, "No connection to host (CICS Region) application.");
			case "92":
				throw new MFResponseException(testCode, "Host timed out");
			case "93":
				throw new MFResponseException(testCode, "Not enough memory");
			default:
				// Congrats, you survived
		}

		// 4-character Result code is located in the 56th index (zero-based) and 70-character Error message is located in the 61st index
		System.out.println(testCode);
		switch(testCode.substring(56, 60)){
			case "0030":
			case "0032":
				if(!"".equals(receivedMessage.substring(131).trim())){
					receivedMessage = receivedMessage.substring(130);
				}else{
					throw new MFResponseException(testCode.substring(56, 60), "No data received!");
				}
				break;
			default:
				if(!testCode.substring(56, 60).equals("0000") || "".equals(receivedMessage.substring(131).trim())){
					if("".equals(receivedMessage.substring(61, 130).trim())){
						throw new MFResponseException(testCode.substring(56, 60), "No data received!");
					}else{
						throw new MFResponseException(testCode.substring(56, 60), receivedMessage.substring(60, 130));
					}
				}else{
					receivedMessage = receivedMessage.substring(60);
				}
				break;
		}

		return receivedMessage;
	}

	/**
	 * Logon to MainFrame.
	 * 
	 * @param mTransactionCode
	 * @param data
	 * @return
	 */
	private static String logToHost(String mTransactionCode, HashMap<String, String> data){
		StringBuilder builder = new StringBuilder();
		String tdel = "";

		String mLogDate = data.get(AppConstants.C_LOG_DATE);
		String mLogTime = data.get(AppConstants.G_LOG_TIME);
		String gUserId = data.get(AppConstants.G_USER_ID);
		String mNewPassword = data.get(AppConstants.G_NEW_PASS);
		String mPassword = data.get(AppConstants.G_PASSWORD);

		String dummy = StringUtils.rightPad(ApplicationUtils.fEncrypt(gUserId, true), 10, '$');
		String userpass = dummy + ApplicationUtils.fEncrypt(mPassword, true);

		if(StringUtils.isEmpty(StringUtils.trim(mNewPassword))){
			mNewPassword = dummy + ApplicationUtils.fEncrypt(mNewPassword, true);
		}
		
		builder.append(StringUtils.rightPad(StringUtils.trim(userpass), 18));
		builder.append(StringUtils.rightPad(StringUtils.trim(mNewPassword), 18));
		builder.append(StringUtils.remove(mLogDate, "/"));
		builder.append(StringUtils.remove(mLogTime, ":"));
		builder.append('2');

		tdel = builder.toString().replaceAll("@", "@@");

		return tdel;
	}

	/**
	 * 
	 * @param mTransactionCode
	 * @param data
	 * @return
	 */
	private static String logFromHost(String mTransactionCode, HashMap<String, String> data){
		StringBuilder builder = new StringBuilder();
		String officeCode = data.get(AppConstants.G_OFFICE_CODE);
		String userId = data.get(AppConstants.G_USER_ID);

		builder.append(officeCode);
		builder.append(StringUtils.rightPad(StringUtils.trim(userId), 8));

		return builder.toString();
	}

	/**
	 * Local OVerride.
	 * 
	 * @param mTransactionCode
	 * @param data
	 * @return
	 */
	private static String localOverride(String mTransactionCode, HashMap<String, String> data){
		StringBuilder builder = new StringBuilder();

		return builder.toString();
	}

	/**
	 * Transaction Series 10 - User File Maintenance.
	 * 
	 * @param mTransactionCode
	 * @param mProcessingTag
	 * @param data
	 * @return
	 */
	private static String transactionSeries0010(String mTransactionCode, String mProcessingTag,
			HashMap<String, String> data){
		StringBuilder builder = new StringBuilder();

		String branchCode = data.get(AppConstants.BRANCH_CODE);
		String firstName = StringUtils.rightPad(data.get(AppConstants.FIRST_NAME), 20);
		String lastName = StringUtils.rightPad(data.get(AppConstants.LAST_NAME), 20);
		String middleName = StringUtils.rightPad(data.get(AppConstants.MIDDLE_NAME), 20);
		String nBranchCode = StringUtils.rightPad(data.get(AppConstants.N_BRANCH_CODE), 7);
		String tranFi = StringUtils.rightPad(data.get(AppConstants.TRAN_FI), 2);
		String userId = StringUtils.rightPad(StringUtils.trim(data.get(AppConstants.USER_ID)), 8);
		String userType = ApplicationUtils.numberToString(data.get(AppConstants.USER_TYPE), 2);

		switch(mTransactionCode){
			// User Inquiry (Per Record)
			case "0010":
				builder.append(userId).append(mProcessingTag);
				break;

			// User Inquiry (Browse 10 Record.)
			case "0011":
				builder.append(tranFi).append(branchCode).append(userId).append(mProcessingTag);
				break;

			// User Inquiry (Add/Modify/Delete)
			case "0012":
				builder.append(tranFi).append(branchCode).append(userId).append(lastName).append(firstName)
						.append(middleName).append(userType).append(mProcessingTag).append(nBranchCode);
				break;

			default:
				break;
		}

		return builder.toString();
	}

	/**
	 * Transaction Series 100 - System Controls.
	 * 
	 * @param mTransactionCode
	 * @param mProcessingTag
	 * @param data
	 * @return
	 */
	private static String transactionSeries0100(String mTransactionCode, String mProcessingTag,
			HashMap<String, String> data, List<HashMap<String, String>> dataList){
		StringBuilder builder = new StringBuilder();

		String acptMode = StringUtils.leftPad(ApplicationUtils.nvl(data.get(AppConstants.ACCEPTANCE_MODE), ""), 2, '0');


		String acptPhp = StringUtils.leftPad(ApplicationUtils.nvl(data.get(AppConstants.ACPT_PHP), ""), 1);
		String achrgInd = ApplicationUtils.nvl(data.get(AppConstants.ACHRG_IND), "");
		String acecStat = ApplicationUtils.subString(ApplicationUtils.nvl(data.get(AppConstants.ACEC_STAT), ""), 0, 1);
		String acomPerc = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.ACOM_PERC), "0"), 2), 5, 2);
		String acomAmnt = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.ACOM_AMNT), "0"), 2), 15, 2);
		String acomIndc = ApplicationUtils.subString(ApplicationUtils.nvl(data.get(AppConstants.ACOM_INDC), ""), 0, 1);
		String actvTag = ApplicationUtils.subString(ApplicationUtils.nvl(data.get(AppConstants.ACTV_TAG), ""), 0, 1);
		String adocPerc = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.ADOC_PERC), "0"), 2), 5, 2);
		String adocAmnt = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.ADOC_AMNT), "0"), 2), 15, 2);
		String adocIndc = ApplicationUtils.subString(ApplicationUtils.nvl(data.get(AppConstants.ADOC_INDC), ""), 0, 1);
		String BFBAcct = StringUtils.rightPad(StringUtils.replace(ApplicationUtils.nvl(data.get(AppConstants.BFB_ACCT), ""), " ", "0", 10), 10, "0");
		String BPIAcct = StringUtils.rightPad(StringUtils.replace(ApplicationUtils.nvl(data.get(AppConstants.BPI_ACCT), ""), " ", "0", 10), 10, "0");
		String branchCode = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.BRANCH_CODE), "")), 7);
		String currencyCode = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.CURRENCY_CODE), "")), 3);
		String currBPI = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.CURR_BPI), "")), 3, '0');
		String currCasa = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.CURR_CASA), "")), 2);
		String currDesc = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.CURR_DESC), "")), 30);
		String currFrom = ApplicationUtils.nvl(data.get(AppConstants.CURRENCY_FROM), "");
		String currTo = ApplicationUtils.nvl(data.get(AppConstants.CURRENCY_TO), "");
		String cutTimeOne = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.CUT_TIME_ONE), ""), 4);
		String cutTimeTwo = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.CUT_TIME_TWO), ""), 4);
		String delIndc = ApplicationUtils.nvl(data.get(AppConstants.DEL_INDC), "");
		String forcUnld = StringUtils.right(ApplicationUtils.nvl(data.get(AppConstants.FORC_UNLD), ""), 1);
		String formNmbr = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.FORM_NMBR), ""),5);
		String indc = ApplicationUtils.nvl(data.get(AppConstants.INDC), "");
		String invisibleCode = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.INVISIBLE_CODE), "")), 9);
		String invisibleCodeDesc = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.INVI_DESC), "")), 60);
		String invisibleCodeTag = ApplicationUtils.nvl(data.get(AppConstants.TAG), "");
		String intrLimit = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.INTR_LIMIT), "0"), 2), 15, 2);
		String mcroTag = ApplicationUtils.subString(ApplicationUtils.nvl(data.get(AppConstants.MCRO_TAG), ""), 0, 1);
		String minAmnt = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.MIN_AMNT), "0"), 2), 15, 2);
		String modeCode = StringUtils
				.leftPad(StringUtils.trim(ApplicationUtils.str(ApplicationUtils.nvl(data.get(AppConstants.MODE_CODE), "0"), 2, 0)), 2, '0');
		String modeDesc = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.MODE_CODE), "")), 30);
		String modeIndc = ApplicationUtils.nvl(data.get(AppConstants.MODE_INDC), "");
		String mtsCode = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.MTS_CODE), "")), 4);
		String mtsDesc = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.MTS_DESC), ""), 30);
		String ovrdPttOne = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.OVRD_PPT1), "0"), 2), 2, 0);
		String ovrdPttTwo = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.OVRD_PPT2), "0"), 2), 2, 0);
		String ovrdPttThree = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.OVRD_PPT3), "0"), 2), 2, 0);
		String ovrdPttFour = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.OVRD_PPT4), "0"), 2), 2, 0);
		String ofcrOneTypOne = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.OFCR1_TYP1), "0"), 2), 2, 0);
		String ofcrOneTypTwo = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.OFCR1_TYP2), "0"), 2), 2, 0);
		String ofcrOneTypThree = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.OFCR1_TYP3), "0"), 2), 2, 0);
		String ofcrOneTypFour = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.OFCR1_TYP4), "0"), 2), 2, 0);
		String ofcrTwoTypOne = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.OFCR2_TYP1), "0"), 2), 2, 0);
		String ofcrTwoTypTwo = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.OFCR2_TYP2), "0"), 2), 2, 0);
		String ofcrTwoTypThree = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.OFCR2_TYP3), "0"), 2), 2, 0);
		String ofcrTwoTypFour = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.OFCR2_TYP4), "0"), 2), 2, 0);
		String pabvLim = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.PABV_LIM), "0"), 2), 15, 2);
		String phpTag = ApplicationUtils.subString(ApplicationUtils.nvl(data.get(AppConstants.PHP_TAG), ""), 0, 1);
		String povrdIndc = ApplicationUtils.nvl(data.get(AppConstants.POVRD_INDC), "");
		String phpLimitOne = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.PHP_LIMIT1), "0"), 2), 15, 2);
		String phpLimitTwo = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.PHP_LIMIT2), "0"), 2), 15, 2);
		String phpLimitThree = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.PHP_LIMIT3), "0"), 2), 15, 2);
		String phpLimitFour = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.PHP_LIMIT4), "0"), 2), 15, 2);
		String ptrckIndc = ApplicationUtils.nvl(data.get(AppConstants.PTRCK_INDC), "");
		String ptrckDays = StringUtils.leftPad(StringUtils.trim(ApplicationUtils.subString(ApplicationUtils.nvl(data.get(AppConstants.PTRCK_DAYS), ""), 0, 1)), 2, "0");
		String ptrckAmnt = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.PTRCK_AMNT), "0"), 2), 16, 2);
		String rateVprd = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.RATE_VPRD), "0"), 2);
		String sabvLim = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.SABV_LIM), "0"), 2), 15, 2);
		String scutTime = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.SCUT_TIME), "0"), 4, 0);
		String schrgInd = ApplicationUtils.nvl(data.get(AppConstants.SCHRG_IND), "");
		String scomPerc = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.SCOM_PERC), "0"), 2), 5, 2);
		String scomAmnt = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.SCOM_AMNT), "0"), 2), 15, 2);
		String scomIndc = ApplicationUtils.subString(ApplicationUtils.nvl(data.get(AppConstants.SCOM_INDC), ""), 0, 1);
		String sdocPerc = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.SDOC_PERC), "0"), 2), 5, 2);
		String sdocAmnt = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.SDOC_AMNT), "0"), 2), 15, 2);
		String sdocIndc = ApplicationUtils.subString(ApplicationUtils.nvl(data.get(AppConstants.SDOC_INDC), ""), 0, 1);
		String setlMode = StringUtils.leftPad(ApplicationUtils.nvl(data.get(AppConstants.SETTLEMENT_MODE), ""), 2, '0');
		String setlPhp = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.SETL_PHP), "")), 1);
		String specMsgOne = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.SPCL_MSG1), "")), 60);
		String specMsgTwo = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.SPCL_MSG2), "")), 60);
		String specMsgThree = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.SPCL_MSG3), "")), 60);
		String specMsgFour = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.SPCL_MSG4), "")), 60);
		String sovrdIndc = ApplicationUtils.nvl(data.get(AppConstants.SOVRD_INDC), "");
		String srecStat = ApplicationUtils.subString(ApplicationUtils.nvl(data.get(AppConstants.SREC_STAT), ""), 0, 1);
		String strckIndc = ApplicationUtils.nvl(data.get(AppConstants.STRCK_INDC), "");
		String strckDays = StringUtils.leftPad(StringUtils.trim(ApplicationUtils.subString(ApplicationUtils.nvl(data.get(AppConstants.STRCK_DAYS), ""), 0, 1)), 2, "0");
		String strckAmnt = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.STRCK_AMNT), "0"), 2), 16, 2);
		String tag = ApplicationUtils.subString(ApplicationUtils.nvl(data.get(AppConstants.TAG), ""), 0, 1);
		String tcPost = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.TC_POST), "0"), 2), 15, 2);
		String tranCode = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.TRAN_CODE), ""), 3);
		String tranDesc = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.TRAN_DESC), "")), 30);
		String tranType = ApplicationUtils.nvl(data.get(AppConstants.TRAN_TYPE), "");
		String tranFi = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.TRAN_FI), ""),2);
		String trdrFI = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.TRDR_FI), ""), 1);
		String trdrDesc = StringUtils.right(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.TRDR_DESC), "")), 30);
		String trdrPcc = StringUtils.right(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.TRDR_PCC), "")), 7);
		String userAccs = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.USER_ACCS), ""), 150);
		String userType = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.USER_TYPE), ""), 2);

		switch(mTransactionCode){
			// List of Branches(BMFOFCD)
			case "0117":
				builder.append(branchCode).append(mProcessingTag);
				break;

			// List of User Types
			case "0140":
				builder.append(userType).append(mProcessingTag);
				break;

			// Inquire Primary Controls
			case "0100":
				builder.append(trdrFI);
				break;

			// Update Primary Controls
			case "0101":
				builder.append(trdrFI).append(cutTimeOne).append(cutTimeTwo).append(rateVprd).append(povrdIndc)
						.append(sovrdIndc);
				break;

			// Inquire Bulletin Board
			case "0102":
				builder.append(trdrFI);
				break;

			// Update Bulletin Board
			case "0103":
				builder.append(trdrFI).append(specMsgOne).append(specMsgTwo).append(specMsgThree).append(specMsgFour);
				break;
				
			// Inquire/List Amount Settings
			case "0104":
			case "0105":
				builder.append(trdrFI).append(currencyCode).append(mProcessingTag);
				break;

			// Update Amount Settings
			case "0106":
				builder.append(trdrFI).append(currencyCode).append(minAmnt).append(pabvLim).append(sabvLim);
				break;

			// Inquire LOA Signatories
			case "0107":
				builder.append(trdrFI);
				break;
				

			// Update LOA Signatories
			case "0108":
				builder.append(trdrFI);
				for (int i = 0; i < 5; i++) {
					String fName = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(dataList.get(i).get(AppConstants.FNAME), "")), 20);
					String lName = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(dataList.get(i).get(AppConstants.LNAME), "")), 20);
					String mName = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(dataList.get(i).get(AppConstants.MNAME), "")), 20);
					
					builder.append(lName).append(fName).append(mName);
				}
				break;

			// Inquire/List Settlement Account
			case "0109":
			case "0110":
				builder.append(trdrFI).append(currencyCode).append(mProcessingTag);
				break;			

			// Update Amount Settings
			case "0111":
				builder.append(trdrFI).append(currencyCode).append(BPIAcct).append(BFBAcct).append(mProcessingTag);
				break;
				
			// List Currency Pair and Acceptance/Settlement Mode
			case "0112":
				builder.append(trdrFI).append(indc).append(delIndc).append(tranFi).append(currFrom).append(currTo)
						.append(acptMode).append(setlMode).append(mProcessingTag);				
				break;
				
			// Update Currency Pair and Acceptance/Settlement Mode
			case "0113":
				builder.append(trdrFI).append(indc).append(modeIndc).append(delIndc).append(tranFi).append(currFrom)
				.append(currTo).append(acptMode).append(acptPhp).append(achrgInd).append(acecStat)
				.append(setlMode).append(setlPhp).append(schrgInd).append(srecStat).append(tranType);		
				break;


			// Inquire/List Mode Code
			case "0114":
			case "0115":
				builder.append(modeCode).append(mProcessingTag);
				break;

			// List Update Mode Code
			case "0116":
				builder.append(modeCode).append(modeDesc).append(mcroTag).append(actvTag).append(phpTag).append(tag);
				break;

			// List Currency Code
			case "0118":
				builder.append(currencyCode).append(mProcessingTag);
				break;


			// Update Amount Settings
			case "0119":
				builder.append(currencyCode).append(currBPI).append(currCasa).append(currDesc).append(mProcessingTag);
				break;
				
			// Inquire/List Invisible Code 
			case "0120":
			case "0121":
				builder.append(trdrFI).append(invisibleCode).append(mProcessingTag);
				break;

			// Update Invisible Code   
			case "0122":
				builder.append(trdrFI).append(invisibleCode).append(tranCode).append(formNmbr).append(invisibleCodeDesc)
						.append(invisibleCodeTag);
				break;

			// Inquire Charges
			case "0123":
				builder.append(trdrFI).append(modeCode);
				break;
				
			// Update Charges
			case "0124":
				builder.append(trdrFI).append(modeCode).append(adocPerc).append(adocAmnt).append(adocIndc)
						.append(acomPerc).append(acomAmnt).append(acomIndc).append(sdocPerc)
						.append(sdocAmnt).append(sdocIndc).append(scomPerc).append(scomAmnt).append(scomIndc)
						.append(tcPost);
				break;

			// List Squaring Cut Off 
			case "0125":
				builder.append(trdrFI).append(mProcessingTag);
				break;

			// Update List Squaring Cut Off 
			case "0126":
				builder.append(trdrFI).append(scutTime).append(mProcessingTag);
				break;
				
			// Inquire MTS Code
			case "0127":
				builder.append(trdrFI).append(modeIndc).append(modeCode).append(mtsCode);
				break;

			// List MTS Code
			case "0128":
				builder.append(trdrFI).append(modeIndc).append(modeCode).append(mProcessingTag);
				break;

			// Update MTS Code
			case "0129":
				builder.append(trdrFI).append(modeIndc).append(modeCode).append(mtsCode).append(tag).append(mtsDesc);
				break;

			// Inquiry/List Trading Code
			case "0130":
			case "0131":
				builder.append(trdrFI).append(mProcessingTag);
				break;

			// Update Trading Code
			case "0132":
				builder.append(trdrFI).append(trdrDesc).append(trdrPcc).append(forcUnld).append(tranFi).append(tag);
				break;

			// Inquiry/List Transacting Unit
			case "0133":
			case "0134":
				builder.append(tranFi).append(mProcessingTag);
				break;
				
			// Update Transacting Unit
			case "0135":
				builder.append(tranFi).append(tranDesc).append(tag);
				break;
			
			// List Intraday Limit
			case "0136":
				builder.append(trdrFI).append(mProcessingTag);
				break;
				
			// Update Intraday Limit
			case "0137":
				builder.append(trdrFI).append(intrLimit).append(mProcessingTag);
				break;
			
			// List User Access per User Types
			case "0138":
				builder.append(userType).append(tranFi).append(mProcessingTag);
				break;

			// Update User Access per User Types
			case "0139":
				builder.append(userType).append(tranFi).append(userAccs).append(mProcessingTag);
				break;
				
			// List Application Code / Update Application Code
			case "0142":
			case "0143":
				for (int i = 0; i < 5; i++) {
				
					String applCod = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(dataList.get(i).get(AppConstants.APPL_COD), "")), 2);
					String applDes = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(dataList.get(i).get(AppConstants.APPL_DES), "")), 30);
					builder.append(applCod).append(applDes);
				}
				break;
				
			// List Inquire Transaction Tracking / Update Transaction Tracking
			case "0144":
			case "0145":
				builder.append(ptrckIndc).append(ptrckDays).append(ptrckAmnt)
						.append(strckIndc).append(strckDays).append(strckAmnt);
				break;		
				
			// what is this?
			// case Tcode = '0145'   		&& List User Access per User Types
			//	tdetl = num2chr(m.user_type,2,0) + padr(allt(m.tran_fi),2) + padr(m.user_accs,150)
				
			// Inquire Approving Authority Limit / Update Approving Authority Limit	
			case "0146":
			case "0147":
				builder.append(phpLimitOne).append(ovrdPttOne).append(ofcrOneTypOne).append(ofcrTwoTypOne)
				.append(phpLimitTwo).append(ovrdPttTwo).append(ofcrOneTypTwo).append(ofcrTwoTypTwo)
				.append(phpLimitThree).append(ovrdPttThree).append(ofcrOneTypThree).append(ofcrTwoTypThree)
				.append(phpLimitFour).append(ovrdPttFour).append(ofcrOneTypFour).append(ofcrTwoTypFour);
				break;		
		}

		return builder.toString();
	}

	private static String transactionSeries0200(String mTransactionCode, String mProcessingTag,
			HashMap<String, String> data, List<HashMap<String, String>> dataList){
		StringBuilder builder = new StringBuilder();
		
		String currencyCode = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.CURRENCY_CODE), "")), 3);
		String exchRate = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.EXCH_RATE), "0"), 4), 10, 4);
		String lTrdrFI = ApplicationUtils.nvl(data.get(AppConstants.LTRDR_FI), "");
		String lTranFi = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.LTRAN_FI), ""), 2);
		String lChngIndc = ApplicationUtils.nvl(data.get(AppConstants.LCHNG_INDC), "");
		String lRateType = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.LRATE_TYPE), "0"), 2, 0);
		String lCurrencyCode = ApplicationUtils.nvl(data.get(AppConstants.LCURR_CODE), "");
		String lockType = ApplicationUtils.nvl(data.get(AppConstants.LOCK_TYPE), "");
		String lUpdtIndc = ApplicationUtils.nvl(data.get(AppConstants.LUPDT_INDC), "");
		String refrRate = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.RFR_RATE), "0"), 10), 16, 10);
		String nRefrRate = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.NRFR_RATE), "0"), 10), 16, 10);
		String nPrchRate = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.NPRCH_RATE), "0"), 4), 10, 4);
		String newBid = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.NEW_BID), "0"), 4), 10, 4);
		String newOffer = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.NEW_OFFR), "0"), 4), 10, 4);
		String nExchRate = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.NEXCH_RATE), "0"), 4), 10, 4);
		String nUSDAmnt = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.NUSD_AMNT), "0"), 2), 16, 2);
		String PHPBid = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.PHP_BID), "0"), 4), 10, 4);
		String PHPEquiv = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.PHP_EQUIV), "0"), 2), 16, 2);
		String PHPOffer = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.PHP_OFFR), "0"), 4), 10, 4);
		String prchRate = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.PRCH_RATE), "0"), 4), 10, 4);
		String saleRate = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.SALE_RATE), "0"), 4), 10, 4);
		String spreads = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.SPREADS), "0"), 2), 8, 2);
		String nSaleRate = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.NSALE_RATE), "0"), 4), 10, 4);
		String prchSprd = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.PRCH_SPRD), "0"), 2), 8, 2);
		String saleSprd = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.SALE_SPRD), "0"), 2), 8, 2);
		String nPrchSprd = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.NPRCH_SPRD), "0"), 2), 8, 2);
		String nSaleSprd = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.NSALE_SPRD), "0"), 2), 8, 2);
		String tierNmbr = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.TIER_NMBR), ""), 2);
		String tranFi = ApplicationUtils.nvl(data.get(AppConstants.TRAN_FI), "");
		String trdrFI = ApplicationUtils.nvl(data.get(AppConstants.TRDR_FI), "");
		String USDAmnt = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.USD_AMNT), "0"), 2), 16, 2);
		
		int i = 0;
		String temp = "";
		
		switch(mTransactionCode){
			// Inquire Spread List
			case "0201":
				builder.append(trdrFI).append(spreads);
				break;

			// Update Spreads
			case "0202":
				i = 0; 
				String seqNo = StringUtils.EMPTY;
				while (i < dataList.size() && i < 9) {
					seqNo = ApplicationUtils.subString(dataList.get(i).get(AppConstants.SEQN_NO), 0, 1);
					spreads = ApplicationUtils.numberToString(ApplicationUtils.round(dataList.get(i).get(AppConstants.SPREADS), 2), 8, 2);
					
					builder.append(seqNo).append(spreads);

			  		System.out.println(i + ": "+ builder.toString());
					i++;
				}
				
				while (builder.length() < 72) {
					temp = "0" + StringUtils.rightPad("0", 7, "0");
					builder.append(temp);
				}
				
				temp = StringUtils.rightPad(builder.toString(), 72);

				builder = new StringBuilder();
				
				builder.append(trdrFI).append(temp);
				
				break;

			// Inquiry Other Rate Types
			case "0204":
			case "0205":
			case "0207":
			case "0208":
			case "0210":
			case "0211":
			case "0213":
			case "0214":
			case "0216":
			case "0218":
			case "0229":
			case "0230":
			case "0232":
			case "0234":
			case "0235":
				builder.append(trdrFI).append(currencyCode).append(mProcessingTag);
				break;
				
			// Upload Bid and Offer
			case "0206":
				i = 0;
				String USDBid = StringUtils.EMPTY, USDOffer = StringUtils.EMPTY;
				
				while (i < dataList.size() && i < 40) {
					currencyCode = dataList.get(i).get(AppConstants.CURR_CODE);
					USDBid = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(dataList.get(i).get(AppConstants.USD_BID), ""), 4), 10, 4);
					USDOffer = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(dataList.get(i).get(AppConstants.USD_OFFER), ""), 4), 10, 4);
					
					builder.append(currencyCode).append(USDBid).append(USDOffer);
					i++;
				}
				
				while (builder.length() < 840) {
					temp = "   " + StringUtils.rightPad("0", 9, "0") +  StringUtils.rightPad("0", 9, "0") ;
					builder.append(temp);
				}
				
				temp = StringUtils.rightPad(builder.toString(), 840);

				builder = new StringBuilder();
				builder.append(trdrFI).append(temp).append(newBid).append(newOffer);
				
				break;		
				
			// Update Thirds Buying and Selling Spreads
			case "0209": 
				i = 0;
				String drecTag = StringUtils.EMPTY, fcduPrch = StringUtils.EMPTY, fcduSale = StringUtils.EMPTY,
						notePrch = StringUtils.EMPTY, ndrecTag = StringUtils.EMPTY, nfcduPrch = StringUtils.EMPTY, 
						nfcduSale = StringUtils.EMPTY, nnotePrch = StringUtils.EMPTY;
				while (i < dataList.size() && i < 40) {
					currencyCode = dataList.get(i).get(AppConstants.CURR_CODE);
					drecTag = StringUtils.rightPad(dataList.get(i).get(AppConstants.DREC_TAG), 1, "N");
					fcduPrch = ApplicationUtils.numberToString(ApplicationUtils.round(dataList.get(i).get(AppConstants.FCDU_PRCH), 2), 8, 2);
					fcduSale = ApplicationUtils.numberToString(ApplicationUtils.round(dataList.get(i).get(AppConstants.FCDU_SALE), 2), 8, 2);
					notePrch = ApplicationUtils.numberToString(ApplicationUtils.round(dataList.get(i).get(AppConstants.NOTE_PRCH), 2), 8, 2);
					ndrecTag = StringUtils.rightPad(dataList.get(i).get(AppConstants.NDREC_TAG), 1, "N");
					nfcduPrch = ApplicationUtils.numberToString(ApplicationUtils.round(dataList.get(i).get(AppConstants.NFCDU_PRCH), 2), 8, 2);
					nfcduSale = ApplicationUtils.numberToString(ApplicationUtils.round(dataList.get(i).get(AppConstants.NFCDU_SALE), 2), 8, 2);
					nnotePrch = ApplicationUtils.numberToString(ApplicationUtils.round(dataList.get(i).get(AppConstants.NNOTE_PRCH), 2), 8, 2);
					
					builder.append(currencyCode).append(drecTag).append(fcduPrch).append(fcduSale)
							.append(notePrch).append(ndrecTag).append(nfcduPrch).append(nfcduSale)
							.append(nnotePrch);
					i++;
				}
				
				while (builder.length() < 1645) {
					temp = "    " + StringUtils.rightPad("0", 7, "0") + StringUtils.rightPad("0", 7, "0") + " " +  StringUtils.rightPad("0", 7, "0") +
					 StringUtils.rightPad("0", 7, "0") +  StringUtils.rightPad("0", 7, "0");
					builder.append(temp);
				}
				
				temp = StringUtils.rightPad(builder.toString(), 1645);

				builder = new StringBuilder();
				builder.append(trdrFI).append(temp);
				
				break;		
				
			//  Update USD Reference Rate for 3RDS
			case "0212":

				i = 0;
				while (i < dataList.size() && i < 40) {
					currencyCode = dataList.get(i).get(AppConstants.CURR_CODE);
					refrRate = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(dataList.get(i).get(AppConstants.RFR_RATE), "0"), 10), 15, 10);
					//refrRate = ApplicationUtils.round(ApplicationUtils.nvl(dataList.get(i).get(AppConstants.RFR_RATE), "0"), 10);
					nRefrRate = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(dataList.get(i).get(AppConstants.NRFR_RATE),"0"), 10), 15, 10);
					
					builder.append(currencyCode).append(refrRate).append(nRefrRate);
					i++;
				}
				
				while (builder.length() < 840) {
					temp = "   " + StringUtils.rightPad("0", 9, "0") + StringUtils.rightPad("0", 9, "0");
					builder.append(temp);
				}
				
				temp = StringUtils.rightPad(builder.toString(), 840);

				builder = new StringBuilder();
				builder.append(trdrFI).append(temp);
				
				break;		
				
			//  Update PHP Reference Rate for 3RDS
			case "0215":
				i = 0;
				
				while (i < dataList.size() && i < 40) {
					currencyCode = dataList.get(i).get(AppConstants.CURR_CODE);
					refrRate = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(dataList.get(i).get(AppConstants.RFR_RATE), "0"), 10), 16, 10);
					nRefrRate = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(dataList.get(i).get(AppConstants.NRFR_RATE),"0"), 10), 16, 10);
					
					builder.append(currencyCode).append(refrRate).append(nRefrRate);
					i++;
				}
				
				while (builder.length() < 840) {
					temp = "   " + StringUtils.rightPad("0", 9, "0") + StringUtils.rightPad("0", 9, "0");
					builder.append(temp);
				}
				
				temp = StringUtils.rightPad(builder.toString(), 840);

				builder = new StringBuilder();
				builder.append(trdrFI).append(temp);
				
				break;		
				
			// Update Reference Rate
			case "0217":
				builder.append(trdrFI).append(currencyCode).append(refrRate).append(nRefrRate);
				break;
				
			// USSD=PHP Bid and Offer
			case "0219":
				builder.append(trdrFI).append(currencyCode).append(PHPBid).append(PHPOffer).append(newBid).append(newOffer);
				break;
				
			// Inquire OTC Rate/Spreads
			case "0220":
			case "0222":
				builder.append(trdrFI).append(tranFi).append(currencyCode);
				break;
			
			// Update USD-PHP Rates for BFC
			case "0221":
				builder.append(trdrFI).append(currencyCode).append(prchRate).append(saleRate).append(nPrchRate).append(nSaleRate);
				break;

			// Update OTC Spread
			case "0223":
				builder.append(trdrFI).append(tranFi).append(currencyCode).append(prchSprd).append(saleSprd).append(nPrchSprd).append(nSaleSprd);
				break;
				
			// Inquire Thirds Buying and Selling Rates
			case "0224":
			case "0225":
			case "0226":
			case "0227":
				builder.append(trdrFI).append(tranFi).append(currencyCode).append(tierNmbr).append(mProcessingTag);
				break;
				
			// Update Tiering Spreads
			case "0228":
				i = 0;
				String amntFrom = StringUtils.EMPTY, amntTo = StringUtils.EMPTY, nAmntFrom = StringUtils.EMPTY, nAmntTo = StringUtils.EMPTY;
				
				while (i < dataList.size() && i < 15) {
					tranFi = dataList.get(i).get(AppConstants.TRAN_FI);
					currencyCode = dataList.get(i).get(AppConstants.CURR_CODE);
					tierNmbr = ApplicationUtils.numberToString(dataList.get(i).get(AppConstants.TIER_NMBR), 2, 0);
					amntFrom = ApplicationUtils.numberToString(ApplicationUtils.round(dataList.get(i).get(AppConstants.AMNT_FROM), 2), 16, 2);
					amntTo = ApplicationUtils.numberToString(ApplicationUtils.round(dataList.get(i).get(AppConstants.AMNT_TO), 2), 16, 2);
					prchSprd = ApplicationUtils.numberToString(ApplicationUtils.round(dataList.get(i).get(AppConstants.PRCH_SPRD), 2), 8, 2);
					saleSprd = ApplicationUtils.numberToString(ApplicationUtils.round(dataList.get(i).get(AppConstants.SALE_SPRD), 2), 8, 2);
					nAmntFrom = ApplicationUtils.numberToString(ApplicationUtils.round(dataList.get(i).get(AppConstants.NAMNT_FROM), 2), 16, 2);
					nAmntTo = ApplicationUtils.numberToString(ApplicationUtils.round(dataList.get(i).get(AppConstants.NAMNT_TO), 2), 16, 2);
					nPrchSprd = ApplicationUtils.numberToString(ApplicationUtils.round(dataList.get(i).get(AppConstants.NPRCH_SPRD), 2), 8, 2);
					nSaleSprd = ApplicationUtils.numberToString(ApplicationUtils.round(dataList.get(i).get(AppConstants.NSALE_SPRD), 2), 8, 2);
					
					builder.append(tranFi).append(currencyCode).append(tierNmbr).append(amntFrom).append(amntTo).append(prchSprd).append(saleSprd)
								.append(nAmntFrom).append(nAmntTo).append(nPrchSprd).append(nSaleSprd);
					i++;
				}
				
				while (builder.length() < 1425) {
					temp = "  " + "   " + "00" + StringUtils.rightPad("0", 15, "0") + StringUtils.rightPad("0", 15, "0") + StringUtils.rightPad("0", 7, "0")
					 + StringUtils.rightPad("0", 7, "0") + StringUtils.rightPad("0", 15, "0") + StringUtils.rightPad("0", 7, "0") + StringUtils.rightPad("0", 7, "0");
					builder.append(temp);
				}
				
				temp = StringUtils.rightPad(builder.toString(), 1425);

				builder = new StringBuilder();
				builder.append(trdrFI).append(temp);
				
				break;		
				
			// Update Pref Client Spread
			case "0231":
				builder.append(trdrFI).append(currencyCode).append(prchSprd).append(saleSprd).append(nPrchSprd).append(nSaleSprd);
				break;
			
			// Update US Visa Fee
			case "0233":
				builder.append(trdrFI).append(currencyCode).append(exchRate).append(USDAmnt).append(PHPEquiv).append(nExchRate).append(nUSDAmnt);
				break;
				
			// Lock and Unlock Rates
			case "0236":
				builder.append(lTrdrFI).append(lTranFi).append(lChngIndc).append(lRateType).append(lCurrencyCode).append(lUpdtIndc);
				break;
				
			// Copy End of Day Rates
			case "0237":
				builder.append(trdrFI).append(currencyCode).append(prchSprd).append(saleSprd).append(nPrchSprd).append(nSaleSprd);
				break;
				
			// Treasury Lock/Unlock Rates
			case "0238":
				builder.append(lTrdrFI).append(lockType);
				break;
		}

		return builder.toString();
	}

	private static String transactionSeries0300(String mTransactionCode, String mProcessingTag,
			HashMap<String, String> data){
		StringBuilder builder = new StringBuilder();
		
		String acctNmbr = StringUtils.leftPad(ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.ACCT_NMBR), ""), 10), 10, "0");
		String acptMode = StringUtils.leftPad(StringUtils.trim(ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.SETL_MODE), ""), 2)), 2, "0");
		String acptModeChck = StringUtils.substring(ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.ACPT_MODE), ""), 2), 0, 1);
		String acptAmnt = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.ACPT_AMNT), "0"), 2), 15, 2);
		String archrgIndc = ApplicationUtils.nvl(data.get(AppConstants.ACHRG_IND), "");
		String currTo = ApplicationUtils.nvl(data.get(AppConstants.CURR_TO), "");
		String currFrom = ApplicationUtils.nvl(data.get(AppConstants.CURR_FR), "");
		String clntTag = ApplicationUtils.nvl(data.get(AppConstants.CLNT_TAG), "");
		String dealRate = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.DEAL_RATE), "0"), 4), 9, 4);
		String grntRate = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.GRNT_RATE), "0"), 4), 9, 4);
		String rateIndc = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.RATE_INDC), ""), 1);
		String schrgIndc = ApplicationUtils.nvl(data.get(AppConstants.SCHRG_IND), "");
		String setlAmnt = ApplicationUtils.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.SETL_AMNT), "0"), 2), 15, 2);
		String setlMode = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.ACPT_MODE), ""), 2)), 2, "0");
		String setlModeChck = StringUtils.substring(ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.ACPT_MODE), ""), 2), 0, 1);
		String tranFi = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.TRAN_FI), ""), 2);
		String branchCode = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.BRANCH_CODE), "")), 7);
		String currencyCode = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.CURRENCY_CODE), "")), 3);
		String gOffCode = ApplicationUtils.nvl(data.get(AppConstants.GOFFCODE), "");
		String tranIndc = ApplicationUtils.nvl(data.get(AppConstants.TRAN_INDC), "");
		String trdrFi = ApplicationUtils.nvl(data.get(AppConstants.TRDR_FI), "");
		String bank = ApplicationUtils.nvl(data.get(AppConstants.BANK), "");
		String refNmbr = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.REF_NMBR), "")), 19);
		String inqyType = ApplicationUtils.nvl(data.get(AppConstants.INQY_TYPE), "");
		String listType = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.LIST_TYPE), ""), 1);
		String pwordO1 = ApplicationUtils.nvl(data.get(AppConstants.PWORD_O1), "");
		String pwordO2 = ApplicationUtils.nvl(data.get(AppConstants.PWORD_O2), "");
		String useridO1 = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.USERID_O1), ""), 8);
		String useridO2 = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.USERID_O2), ""), 8);
		String grntStat = ApplicationUtils.nvl(data.get(AppConstants.GRNT_STAT), "");
		String rmrkTrdr = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.RMRK_TRDR), ""), 60);
		String gUserID = ApplicationUtils.nvl(data.get(AppConstants.G_USER_ID), "");
		String gUserPass = ApplicationUtils.nvl(data.get(AppConstants.G_USER_PASSWORD), "");
		String dummy = StringUtils.rightPad(ApplicationUtils.encrypt(gUserID, true), 10, "$");
		String password = StringUtils.rightPad(dummy + ApplicationUtils.encrypt(pwordO1, true), 18);
		String userPass = StringUtils.rightPad(dummy + ApplicationUtils.encrypt(gUserPass, true), 18);	

		switch(mTransactionCode){
			// AMOUNT COMPUTATION
			case "0303":
				builder.append(trdrFi).append(tranFi).append(tranIndc).append(clntTag).append(acptAmnt)
						.append(currFrom).append(acptMode).append(acptModeChck == "4" ? "Y":"N").append(archrgIndc).append(StringUtils.repeat(StringUtils.SPACE, 450))
						.append(setlAmnt).append(currTo).append(setlMode).append(setlModeChck == "4" ? "Y":"N")
						.append(schrgIndc).append(StringUtils.repeat(StringUtils.SPACE, 450)).append(rateIndc).append(dealRate).append(grntRate)
						.append(refNmbr);
				break;
			case "0308":
				builder.append(trdrFi).append(bank);
				break;

			// INQUIRE TRANSACTION REGULAR
			case "0309":
			case "0311":
			case "0313":
			case "0315":
			case "0317":
			case "0319":
				builder.append(trdrFi).append(tranIndc).append(branchCode).append(currencyCode).append(refNmbr)
						.append(inqyType).append(listType);
				break;

			// LIST TRANSACTION REGULAR   
			case "0310":
			case "0312":
			case "0314":
			case "0316":
			case "0318":
			case "0320":
				builder.append(trdrFi).append(tranIndc).append(branchCode).append(currencyCode).append(refNmbr)
						.append(listType).append(mProcessingTag);
				break;
				

			// Authorize Special Rate
			case "0321":
				builder.append(trdrFi).append(refNmbr).append(grntStat).append(StringUtils.rightPad(grntRate, 15, "0")).append(rmrkTrdr).append(gUserID);
				
				break;

			// Authorize Trader Override
			case "0322":
				builder.append(trdrFi).append(refNmbr).append(grntStat).append(rmrkTrdr).append(gUserID);
				break;

			// Cancel Transaction
			case "0329":
				builder.append(refNmbr);
				break;

			// Transacting Local Override
			case "0331":
				String password2 = StringUtils.EMPTY;
				
				if (StringUtils.trim(pwordO2).toString().isEmpty()) {
					password2 = StringUtils.rightPad(dummy + ApplicationUtils.encrypt(pwordO2, true), 18);	
				}
				
				
				builder.append(gOffCode).append(useridO1).append(password).append(useridO2).append(password2).append(mProcessingTag).append(userPass);
				
				break;
			
			// Trading Local Override
			case "0332": 
				builder.append(gOffCode).append(useridO1).append(password).append(userPass);
				break;
				
			// Inquire TCs in Pending Transaction
			case "0327":
				builder.append(refNmbr);
				break;

			// Check Account Number if BPI/BFB client
			case "0333":
				builder.append(acctNmbr);
				
				
				break;

		}

		return builder.toString();
	}
	private static String transactionSeries0400(String mTransactionCode, String mProcessingTag,
			HashMap<String, String> data){
		StringBuilder builder = new StringBuilder();


		String bank = StringUtils.left(ApplicationUtils.nvl(data.get(AppConstants.BANK), ""), 2);
		String book = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.BOOK), ""), 1);
		String listType = ApplicationUtils.nvl(data.get(AppConstants.LIST_TYPE), "");
		String refNmbr = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.REF_NMBR), "")), 19);
		String tranIndc = ApplicationUtils.nvl(data.get(AppConstants.TRAN_INDC), "");
		String trdrFi = StringUtils.left(ApplicationUtils.nvl(data.get(AppConstants.TRDR_FI), ""), 2);
		String dealWith = ApplicationUtils.nvl(data.get(AppConstants.DEAL_WITH), "");
		String gTranFi = ApplicationUtils.nvl(data.get(AppConstants.G_TRAN_FI), "");
		String tranType = ApplicationUtils.nvl(data.get(AppConstants.TRAN_TYPE), "");
		String currFr = ApplicationUtils.subString(ApplicationUtils.nvl(data.get(AppConstants.CURR_PAIR), StringUtils.repeat(StringUtils.SPACE, 7)), 0, 3);
		String currTo = ApplicationUtils.subString(ApplicationUtils.nvl(data.get(AppConstants.CURR_PAIR), StringUtils.repeat(StringUtils.SPACE, 7)), 4, 3);
		String acptAmnt = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.ACPT_AMNT), "0"), 16, 2);
		String acptMode = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.ACPT_MODE), "0"), 2, 0);
		String setlAmnt = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.SETL_AMNT), "0"), 16, 2);
		String setlMode = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.SETL_MODE), "0"), 2, 0);
		String grntRate = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.GRNT_RATE), "0"), 10, 4);
		String trsyGrnt = ApplicationUtils.nvl(data.get(AppConstants.TRSY_GRNT), "");
		String trsyEqvl = ApplicationUtils.nvl(data.get(AppConstants.TRSY_EQVL), "");
		String trsyRate = ApplicationUtils.nvl(data.get(AppConstants.TRSY_RATE), "");
		String trsyRrmk = ApplicationUtils.nvl(data.get(AppConstants.TRSY_RMRK), "");
		String grntStat = ApplicationUtils.nvl(data.get(AppConstants.GRNT_STAT), "");
		String gOffCode = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.G_OFFICE_CODE), ""), 60);
		String tranAmnt = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.TRAN_AMNT), "0"), 16, 2);
		String eqvtAmnt = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.EQVT_AMNT), "0"), 16, 2);
		String inviCode = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.INVI_CODE), "")), 9, '0');
		String BTSURmrk = StringUtils.rightPad(StringUtils.trim(ApplicationUtils.nvl(data.get(AppConstants.BTSU_RMRK), "")), 60);
		
		switch(mTransactionCode){
			// Inquiry
			case "0400":
				builder.append(trdrFi).append(bank).append(book).append(tranIndc).append(refNmbr)
					.append(listType).append(mProcessingTag);
				break;
			case "0401":
				builder.append(dealWith).append(bank).append(book).append(tranType)
					.append(currFr).append(currTo)
					.append(tranAmnt).append(eqvtAmnt)
					.append(acptMode).append(setlMode).append(grntRate)
					.append(inviCode).append(BTSURmrk);
				break;
			// treasury approval
			case "0402":
				builder.append(dealWith).append(refNmbr).append(trsyGrnt).append(trsyEqvl).append(trsyRate)
					.append(trsyRrmk).append(gOffCode);
				break;
			// final update
			case "0403":
				builder.append(dealWith).append(refNmbr).append(grntStat).append(gOffCode);
				break;
			// compute the equivalent amount
			case "0404":
				builder.append(dealWith).append(gTranFi).append(tranType).append(acptAmnt)
						.append(currFr).append(acptMode).append(setlAmnt).append(currTo).append(setlMode)
						.append(grntRate);
				break;			
	
			default:
				break;
		}

		return builder.toString();
	}
	
	private static String transactionSeries0500(String mTransactionCode, String mProcessingTag,
			HashMap<String, String> data){
		StringBuilder builder = new StringBuilder();

		String currCode = ApplicationUtils.nvl(data.get(AppConstants.CURR_CODE), "");
		String tranUnit = ApplicationUtils.nvl(data.get(AppConstants.TRAN_UNIT), "");
		String flowIndc = ApplicationUtils.numberToString(ApplicationUtils.nvl(data.get(AppConstants.FLOW_INDC), ""), 1);
		String seqNo = ApplicationUtils.numberToString(
				ApplicationUtils.decimalRound(Double.parseDouble(ApplicationUtils.nvl(data.get(AppConstants.SEQ_NO), "0")), 2) + "", 16, 2);
		String tranFi = ApplicationUtils.nvl(data.get(AppConstants.TRAN_FI), "");

		switch(mTransactionCode){
			// LIST CASH FLOW SUMMARY
			case "0501":
				builder.append(tranFi).append(tranUnit).append(currCode).append(mProcessingTag);
				break;

			// LIST CASH FLOW DETAIL  
			case "0502":
				builder.append(tranFi).append(tranUnit).append(flowIndc).append(currCode).append(seqNo)
						.append(mProcessingTag);
				break;

			default:
				break;
		}

		return builder.toString();
	}
	
	private static String transactionSeries0600(String mTransactionCode, String mPorcessingTag,
			HashMap<String, String> data, List<HashMap<String, String>> dataList){
		StringBuilder builder = new StringBuilder();
		
		String tradUnit = ApplicationUtils.nvl(data.get(AppConstants.TRAD_UNIT), "");
		String listOpt = ApplicationUtils.nvl(data.get(AppConstants.LIST_OPT), "");
		String bank = ApplicationUtils.nvl(data.get(AppConstants.BANK), "");
		String book = ApplicationUtils.nvl(data.get(AppConstants.BOOK), "");
		String appl = ApplicationUtils.nvl(data.get(AppConstants.APPL), "");
		String fxUnit = ApplicationUtils.nvl(data.get(AppConstants.FX_UNIT), "");
		String tranUnit = ApplicationUtils.nvl(data.get(AppConstants.TRAN_UNIT), "");
		String tranIndc = ApplicationUtils.nvl(data.get(AppConstants.TRAN_INDC), "");
		String curr = ApplicationUtils.nvl(data.get(AppConstants.CURR), "");
		String acptCurr = ApplicationUtils.nvl(data.get(AppConstants.ACPT_CURR), "");
		String setlCurr = ApplicationUtils.nvl(data.get(AppConstants.SETL_CURR), "");
		String refrNmbr = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.REFR_NMBR), ""), 19);
		String pendTag = ApplicationUtils.nvl(data.get(AppConstants.PEND_TAG), "");
		String reqrStat = ApplicationUtils.nvl(data.get(AppConstants.REQR_STAT), "");
		String refr = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.REFR), ""), 19);
		String stat = ApplicationUtils.nvl(data.get(AppConstants.STAT), "");
		String rmrk = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.RMRK), ""), 60);
		String gOffCode = ApplicationUtils.nvl(data.get(AppConstants.GOFFCODE), "");
		String gUserId = ApplicationUtils.nvl(data.get(AppConstants.G_USER_ID), "");
		String invicode = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.INVICODE), ""), 9, "0");
		String sqreRate = ApplicationUtils
				.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.SQRE_RATE), "0"), 2), 16, 2);
		String amnt = ApplicationUtils
				.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.AMNT), "0"), 2), 16, 2);
		
		switch(mTransactionCode){
			//list FX Position w/ Average Cost per Currency
			case "0600":
				builder.append(tradUnit).append(listOpt).append(bank).append(book).append(appl)
				.append(fxUnit).append(tranUnit).append(curr).append(mPorcessingTag);
				break;
				
			//process consolidate
			case "0601":
				StringBuilder tDetlH = new StringBuilder();
				StringBuilder tDetlB = new StringBuilder();
				Integer cntr = 0;
				
				tDetlH.append(tradUnit).append(bank).append(book).append(listOpt)
				.append(appl).append(fxUnit).append(tranUnit);
				for(HashMap<String, String> map : dataList){
					String curr601 = StringUtils.left(map.get(AppConstants.CURR), 3);
					String prchFxcy = ApplicationUtils
							.numberToString(ApplicationUtils.round(map.get(AppConstants.PRCH_FXCY), 2), 16, 2);
					String prchCnttr = ApplicationUtils
							.numberToString(ApplicationUtils.round(map.get(AppConstants.PRCH_CNTTR), 2), 16, 2);
					String prchAvec = ApplicationUtils
							.numberToString(ApplicationUtils.round(map.get(AppConstants.PRCH_AVEC), 2), 16, 2);
					String prchUsd = ApplicationUtils
							.numberToString(ApplicationUtils.round(map.get(AppConstants.PRCH_USD), 2), 16, 2);
					String saleFxcy = ApplicationUtils
							.numberToString(ApplicationUtils.round(map.get(AppConstants.SALE_FXCY), 2), 16, 2);
					String saleCntr = ApplicationUtils
							.numberToString(ApplicationUtils.round(map.get(AppConstants.SALE_CNTR), 2), 16, 2);
					String saleAvec = ApplicationUtils
							.numberToString(ApplicationUtils.round(map.get(AppConstants.SALE_AVEC), 2), 16, 2);
					String saleUsd = ApplicationUtils
							.numberToString(ApplicationUtils.round(map.get(AppConstants.SALE_USD), 2), 16, 2);
					String uncoFxcy = ApplicationUtils
							.numberToString(ApplicationUtils.round(map.get(AppConstants.UNCO_FXCY), 2), 16, 2);
					String uncoUsd = ApplicationUtils
							.numberToString(ApplicationUtils.round(map.get(AppConstants.UNCO_USD), 2), 16, 2);
					String consFxcy = ApplicationUtils
							.numberToString(ApplicationUtils.round(map.get(AppConstants.CONS_FXCY), 2), 16, 2);
					String consUsd = ApplicationUtils
							.numberToString(ApplicationUtils.round(map.get(AppConstants.CONS_USD), 2), 16, 2);
					String unld = ApplicationUtils
							.numberToString(ApplicationUtils.round(map.get(AppConstants.UNLD), 2), 16, 2);
					String totl = ApplicationUtils
							.numberToString(ApplicationUtils.round(map.get(AppConstants.TOTL), 2), 16, 2);
					
					tDetlB.append(curr601).append(prchFxcy).append(prchCnttr).append(prchAvec).append(prchUsd)
					.append(saleFxcy).append(saleCntr).append(saleAvec).append(saleUsd)
					.append(uncoFxcy).append(uncoUsd).append(consFxcy).append(consUsd)
					.append(unld).append(totl);
					cntr++;
					if(cntr >= 7) break;
				}
				while (tDetlB.length() < 1407) {
					tDetlB.append(StringUtils.repeat(StringUtils.SPACE, 3)).append(StringUtils.rightPad("0", 198, "0"));
				}
				builder.append(tDetlH.toString()).append(StringUtils.rightPad(tDetlB.toString(), 1407));
				break;
				
			//process unload (new)
			case "0602":
				builder.append(tradUnit).append(bank).append(book)
				.append(listOpt).append(appl).append(fxUnit).append(tranUnit).append(tranIndc)
				.append(acptCurr).append(setlCurr).append(sqreRate).append(amnt).append(invicode);
				break;
			
			//list unload (pending), accept fx
			case "0604":
				builder.append(tradUnit).append(tranIndc).append(refrNmbr).append(pendTag).append(reqrStat).append(mPorcessingTag);
				break;
				
			//process accept FX position
			case "0605":
				builder.append(tranUnit).append(refr).append(stat).append(rmrk).append(gOffCode).append(gUserId);
				break;
				
			//process unload (pending)
			case "0606":
				builder.append(tradUnit).append(refr).append(stat).append(sqreRate).append(rmrk).append(gOffCode).append(gUserId);
				break;
		}
		
		return builder.toString();
	}
	
	public static String transactionSeries0800(String mTransactionCode, String mProcessingTag,
			HashMap<String, String> data){
		StringBuilder builder = new StringBuilder();
		
		String bankCode = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.BANK_CODE), ""), 10);
		String cntrPrty = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.CNTR_PRTY), ""), 30);
		String bankName = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.BANK_NAME), ""), 30);
		String addressOne = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.ADDRESS1), ""), 30);
		String addressTwo = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.ADDRESS2), ""), 30);
		String cntcPrsn = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.CNTC_PRSN), ""), 30);
		String othrInst = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.OTHR_INST), ""), 30);
		String recvAcct = StringUtils.rightPad(StringUtils.replace(ApplicationUtils.nvl(data.get(AppConstants.RECV_ACCT), ""), " ", "0", 10), 10, "0");
		String tranType = ApplicationUtils.nvl(data.get(AppConstants.TRAN_TYPE), "");
		String tranAmnt = ApplicationUtils
				.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.TRAN_AMNT), "0"), 2), 15, 2);
		String exchRate = ApplicationUtils
				.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.EXCH_RATE), "0"), 4), 9, 4);
		String eqvtAmnt = ApplicationUtils
				.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.EQVT_AMNT), "0"), 2), 15, 2);
		String valDate = ApplicationUtils.nvl(data.get(AppConstants.VAL_DATE), "");
		String remarks = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.REMARKS), ""), 40);
		String tranIndtr = ApplicationUtils.nvl(data.get(AppConstants.TRAN_INDTR), "");
		String refNmbr = StringUtils.rightPad(StringUtils.replace(ApplicationUtils.nvl(data.get(AppConstants.REF_NMBR), ""), " ", "0", 7), 7, "0");
		String tranName = ApplicationUtils.nvl(data.get(AppConstants.TRAN_NAME), "");
		String gLogDate = ApplicationUtils.nvl(data.get(AppConstants.G_LOG_DATE), "");
		String mangUnit = ApplicationUtils.nvl(data.get(AppConstants.MANG_UNIT), "");
		String loaNmbr = StringUtils.leftPad(StringUtils.replace(ApplicationUtils.nvl(data.get(AppConstants.LOA_NMBR), ""), " ", "0", 6), 6);
		String absTime = ApplicationUtils
				.numberToString(ApplicationUtils.round(ApplicationUtils.nvl(data.get(AppConstants.ABS_TIME),"0"), 0), 16, 0);
		
		switch(mTransactionCode){
			//Inquiry/List Interbank Record/s
			case "0803":
			case "0804":
				builder.append(bankCode).append(mProcessingTag);
				break;

			//Update Interbank Record
			case "0805":
				builder.append(bankCode).append(cntrPrty).append(bankName).append(addressOne)
				.append(addressTwo).append(cntcPrsn).append(recvAcct).append(othrInst)
				.append(mProcessingTag);
				break;
				
			//Interbank Data Entry
			case "0810":
				builder.append(tranType).append(cntrPrty).append(cntcPrsn)
				.append(addressOne).append(addressTwo).append(tranAmnt).append(exchRate)
				.append(eqvtAmnt).append(valDate).append(recvAcct).append(remarks)
				.append(bankName).append(othrInst);
				break;
				
			//Inquiry/List of Interbank Transaction
			case "0811":
			case "0812":
				builder.append(tranIndtr).append(refNmbr).append(mProcessingTag);
				break;
				
			case "0813":
				builder.append(tranName).append(gLogDate).append(refNmbr).append(tranIndtr).append(mangUnit);
				break;
				
			//Daily Summary of Interbank Transactions;
			case "0814":
				builder.append(tranIndtr).append(refNmbr).append(mProcessingTag);
				break;
				
			//LOA Interbank Purchase
			case "0815":
				builder.append(gLogDate).append(loaNmbr);
				break;
				
			//LOA Interbank Sale
			case "0816":
				builder.append(gLogDate).append(cntrPrty);
				break;
				
			//Inquiry of Printed LOA
			case "0817":
				builder.append(tranIndtr).append(loaNmbr).append(cntrPrty).append(absTime).append(mProcessingTag);
				break;
		}
		return builder.toString();
	}
	

	private static String transactionSeries0900(String mTransactionCode, String mProcessingTag,
			HashMap<String, String> data){
		StringBuilder builder = new StringBuilder();

		String refNumber = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.REF_NUMBER), "").trim(), 19);
		String trdrFi = ApplicationUtils.nvl(data.get(AppConstants.TRDR_FI), "");
		String mcSerno = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.MC_SERNO), "").trim(), 15);
		String listIndc = ApplicationUtils.nvl(data.get(AppConstants.LIST_INDC), "");
		String rqstType = ApplicationUtils.nvl(data.get(AppConstants.RQST_TYPE), "");
		String tranIndc = ApplicationUtils.nvl(data.get(AppConstants.TRAN_INDC), "");
		String currFrom = ApplicationUtils.nvl(data.get(AppConstants.CURR_FR), "");
		String currTo = ApplicationUtils.nvl(data.get(AppConstants.CURR_TO), "");
		String amntSw = ApplicationUtils.nvl(data.get(AppConstants.AMNT_SW), "");
		String brchCode = StringUtils.rightPad(ApplicationUtils.nvl(data.get(AppConstants.BRANCH_CODE), ""), 7);
		String tradUnit = ApplicationUtils.nvl(data.get(AppConstants.TRAD_UNIT), "");
		String bank = ApplicationUtils.nvl(data.get(AppConstants.BANK), "");
		String book = ApplicationUtils.nvl(data.get(AppConstants.BOOK), "");
		String cntrCurr = ApplicationUtils.nvl(data.get(AppConstants.CNTR_CURR), "");
		String origCurr	= ApplicationUtils.nvl(data.get(AppConstants.ORIG_CURR), "");
		

		switch(mTransactionCode){
			// INQUIRY ON ISSUED MCs - LIST 
			case "0901":
				builder.append(brchCode).append(trdrFi).append(mcSerno).append(mProcessingTag);
				break;

			// INQUIRY ON ACCEPTED TCs -List
			case "0902":
				builder.append(listIndc).append(trdrFi).append(brchCode).append(refNumber).append(mProcessingTag);
				break;

			//INQUIRY ON DAILY TRANSACTIONS
			case "0905":
				builder.append(trdrFi).append(tranIndc).append(refNumber).append(rqstType);
				break;
			//LIST DAILY TRANSACTIONS
			case "0906":
				builder.append(brchCode).append(trdrFi).append(tranIndc).append(rqstType).append(amntSw)
						.append(refNumber);
				String x = (tranIndc.equals("P")) ? currFrom : currTo;
				builder.append(x).append(mProcessingTag);

				break;
			//IST LIST-SUMM-TRAN
			case "0907":
				builder.append(trdrFi).append(tranIndc).append(refNumber).append(rqstType).append(mProcessingTag);
				break;
			//List Average Cost
			case "0909":
				builder.append(tradUnit).append(bank).append(book).append(cntrCurr).append(origCurr).append(mProcessingTag);
					// tdetl 	= m.trad_unit + m.bank + str(m.book,1) + m.cntr_curr + m.orig_curr + Proctag
				break;
			//INQUIRY ON ACCEPTED TCs
			case "0910":
				builder.append(refNumber);
				break;

			default:
				break;
		}

		return builder.toString();
	}

	/**
	 * Log transaction details to db.
	 * 
	 * @param sent
	 *            Message send to MainFrame.
	 * @param received
	 *            Message received from MainFrame.
	 */
	private static void logTransaction(String sent, String received){
		System.out.println("SENT:" + sent);
		System.out.println("RECEIVED:" + received);
	}
}
