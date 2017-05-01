package ph.com.bpi.utilities;

import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.bpi.EHLLAPIImpl;

import ph.com.bpi.api.AppConstants;
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
		return sendDetails(tCode, StringUtils.EMPTY, StringUtils.EMPTY, data);
	}
	
	public static String sendDetails(String tCode, String procTag, String rOccurs, HashMap<String, String> data)
			throws MFResponseException{

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

		/**
		 * Check if initial logon.
		 */
		if(!tCode.equalsIgnoreCase("0001")){
			gInitial = false;
		}

		int tCodeInt = Integer.valueOf(tCode);
		if(tCodeInt < 900){
			if(tCodeInt < 100){
				pCode = "FF" + ApplicationUtils.subString(tCode, 1, 2);
				ioProg = "FFPCS" + ApplicationUtils.subString(tCode, 1, 2) + "0";
			}else{
				pCode = "FF" + ApplicationUtils.subString(tCode, 1, 1) + "0";
				ioProg = "FFPCS" + ApplicationUtils.subString(tCode, 1, 1) + "00";
			}
		}else{
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
		builder.append(gLUID);
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
			messageDetail = transactionSeries0100(tCode, procTag, data);

		}else if((tCodeInt >= Integer.valueOf("0200")) && (tCodeInt < Integer.valueOf("0300"))){ //200: Rates and Spreads
			messageDetail = transactionSeries0200(tCode, procTag, data);

		}else if((tCodeInt >= Integer.valueOf("0300")) && (tCodeInt < Integer.valueOf("0400"))){ //300: Purchase and Sale
			messageDetail = transactionSeries0300(tCode, procTag, data);

		}else if((tCodeInt >= Integer.valueOf("0500")) && (tCodeInt < Integer.valueOf("0600"))){ //500: Forex Stations Cash Flow
			messageDetail = transactionSeries0500(tCode, procTag, data);

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

		MFSendDetailsUtil.logTransaction(sentMessage, receivedMessage);

		if(StringUtils.isEmpty(receivedMessage) || StringUtils.left(receivedMessage, 1).equalsIgnoreCase("9")){
			errorMessage = "9000Unable to interface with the MainFrame";
			logger.error(errorMessage);
			throw new MFResponseException("9000", errorMessage);
		}

		receive = StringUtils.left(receivedMessage.trim(), 4);

		try{
			receiveCode = Integer.valueOf(receive);
		}catch(Exception e){
			logger.warn("Error parsing receive code.");
		}

		if((receiveCode == Integer.valueOf("0090")) || receive.equalsIgnoreCase("0090")){
			errorMessage = "Emulation/EHLLAPI not loaded.";

		}else if((((receiveCode == Integer.valueOf("0091")) || receive.equalsIgnoreCase("0091"))
				|| ((receiveCode == Integer.valueOf("0090")) || receive.equalsIgnoreCase("0090"))
				|| ((receiveCode == Integer.valueOf("0092")) || receive.equalsIgnoreCase("0092")))
				|| (receivedMessage.trim().length() == 1) || receivedMessage.trim().equalsIgnoreCase("A2BPy")
				|| StringUtils.isEmpty(StringUtils.left(receivedMessage.trim(), 1900))
				|| StringUtils.left(receivedMessage.trim(), 22).equalsIgnoreCase("INVALID COMMAND SYNTAX")
				|| (!gInitial && ((receive.equalsIgnoreCase(StringUtils.repeat(StringUtils.SPACE, 4)))
						|| StringUtils.left(receivedMessage, 10).equalsIgnoreCase(" DFHAC2002")
						|| StringUtils.left(receivedMessage, 12).equalsIgnoreCase("CESN=REENTER")
						|| (StringUtils.left(receivedMessage, 6).equalsIgnoreCase(" DFHAC")
								&& ApplicationUtils.subString(receivedMessage, 63, 4).equals("SECW"))
						|| StringUtils.left(receivedMessage, 5).equals("ACFAE")))){

			if(tCode.equalsIgnoreCase("0002")){
				errorMessage = "Application was disconnected from CICS Region.";

			}else{
				if(!(!gInitial || (!gInitial && (receivedMessage.trim().length() == 1)))){
					receivedMessage = StringUtils.rightPad("RECONNECTION SUCCESSFUL", 56).concat("2004")
							.concat(StringUtils.rightPad("Last request not processed... Please retry.", 70));

				}else if(StringUtils.left(receivedMessage, 6).equalsIgnoreCase(" DFHAC")
						|| StringUtils.left(receivedMessage, 5).equals("ACFAE")
						|| StringUtils.left(receivedMessage, 12).equalsIgnoreCase("CESN=REENTER")){
					errorMessage = "ACF2 ID was logged off due to CICS inactivity. Please sign-in again.";

				}else{
					errorMessage = "Application was disconnected from CICS Region... Please check.";
				}
			}

		}else if((receiveCode == Integer.valueOf("0092")) || receive.equalsIgnoreCase("0092")){
			errorMessage = "Host timed out.";

		}else if((receiveCode == Integer.valueOf("0093")) || receive.equalsIgnoreCase("0093")){
			errorMessage = "Not enough memory.";

		}else if(StringUtils.isEmpty(receivedMessage.trim())){
			errorMessage = StringUtils.repeat(StringUtils.SPACE, 56) + tCode
					+ "Cannot connect to MainFrame... Press any key to retry.";
		}

		if(StringUtils.isNotEmpty(errorMessage)){
			logger.info(errorMessage);
			throw new MFResponseException("9000", errorMessage);
		}

		if(StringUtils.left(receivedMessage, 5).equalsIgnoreCase(" DFHA")){
			receivedMessage = StringUtils.left(receivedMessage, 60)
					+ ApplicationUtils.subString(receivedMessage, 20, 70);
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
		String mLogType = data.get(AppConstants.G_LOG_TYPE);
		String mNewPassword = data.get(AppConstants.G_NEW_PASS);
		String mPassword = data.get(AppConstants.G_PASSWORD);

		if(mLogType.equalsIgnoreCase("2") && StringUtils.isNotEmpty(mNewPassword)){
			mPassword = mNewPassword;
			mNewPassword = StringUtils.EMPTY;
		}

		if(StringUtils.isEmpty(mNewPassword)){
			mNewPassword = StringUtils.repeat(StringUtils.SPACE, 18);
		}else{
			mNewPassword = ApplicationUtils.fEncrypt(mNewPassword, true);
		}

		builder.append(ApplicationUtils.fEncrypt(mPassword, true));
		builder.append(mNewPassword);
		builder.append(mLogDate);
		builder.append(StringUtils.remove(mLogTime, ":"));
		builder.append(mLogType);

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
		String tranFi = data.get(AppConstants.TRAN_FI);
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
			HashMap<String, String> data){
		StringBuilder builder = new StringBuilder();

		String acptMode = StringUtils.leftPad(data.get(AppConstants.ACCEPTANCE_MODE), 2, '0');
		String branchCode = StringUtils.replace(data.get(AppConstants.BRANCH_CODE), StringUtils.SPACE,
				String.valueOf(0), 7);
		String currencyCode = StringUtils.rightPad(StringUtils.trim(data.get(AppConstants.CURRENCY_CODE)), 3);
		String currFrom = data.get(AppConstants.CURRENCY_FROM);
		String currTo = data.get(AppConstants.CURRENCY_TO);
		String cutTimeOne = ApplicationUtils.numberToString(data.get(AppConstants.CUT_TIME_ONE), 4);
		String cutTimeTwo = ApplicationUtils.numberToString(data.get(AppConstants.CUT_TIME_TWO), 4);
		String formNmbr = data.get(AppConstants.FORM_NMBR);
		String invisibleCode = StringUtils.rightPad(StringUtils.trim(data.get(AppConstants.INVISIBLE_CODE)), 9);
		String invisibleCodeDesc = StringUtils.rightPad(StringUtils.trim(data.get(AppConstants.INVI_DESC)), 60);
		String invisibleCodeTag = data.get(AppConstants.TAG);
		String listIndc = ApplicationUtils.str(data.get(AppConstants.LIST_INDC), 1, 0);
		String listOptn = ApplicationUtils.str(data.get(AppConstants.LIST_OPTN), 1, 0);
		String modeCode = StringUtils
				.leftPad(StringUtils.trim(ApplicationUtils.str(data.get(AppConstants.MODE_CODE), 2, 0)), 2, '0');
		String modeIndc = data.get(AppConstants.MODE_INDC);
		String mtsCode = StringUtils.rightPad(StringUtils.trim(data.get(AppConstants.MTS_CODE)), 4);
		String povrdIndc = data.get(AppConstants.POVRD_INDC);
		String rateVprd = ApplicationUtils.numberToString(data.get(AppConstants.RATE_VPRD), 2);
		String setlMode = StringUtils.leftPad(data.get(AppConstants.SETTLEMENT_MODE), 2, '0');
		String sovrdIndc = data.get(AppConstants.SOVRD_INDC);
		String tranCode = data.get(AppConstants.TRAN_CODE);
		String tranFi = data.get(AppConstants.TRAN_FI);
		String trdrFI = data.get(AppConstants.TRDR_FI);
		String userType = ApplicationUtils.numberToString(data.get(AppConstants.USER_TYPE), 2);

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

			// Inquire/List Amount Settings
			case "0104":
			case "0105":
				builder.append(trdrFI).append(currencyCode).append(mProcessingTag);
				break;

			// List Currency Pair and Acceptance/Settlement Mode
			case "0112":
				builder.append(trdrFI).append(listIndc).append(listOptn).append(tranFi).append(currFrom).append(currTo)
						.append(acptMode).append(setlMode).append(mProcessingTag);
				break;

			// Inquire/List Mode Code
			case "0114":
			case "0115":
				builder.append(modeCode).append(mProcessingTag);
				break;

			// List Currency Code
			case "0118":
				builder.append(currencyCode).append(mProcessingTag);
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

			// Inquire MTS Code
			case "0127":
				builder.append(trdrFI).append(modeIndc).append(modeCode).append(mtsCode);
				break;

			// List MTS Code
			case "0128":
				builder.append(trdrFI).append(modeIndc).append(modeCode).append(mProcessingTag);
				break;

			// Inquiry/List Trading Code
			case "0130":
			case "0131":
				builder.append(trdrFI).append(mProcessingTag);
				break;

			// Inquiry/List Transacting Unit
			case "0133":
			case "0134":
				builder.append(trdrFI).append(mProcessingTag);
				break;
		}

		return builder.toString();
	}

	private static String transactionSeries0200(String mTransactionCode, String mProcessingTag,
			HashMap<String, String> data){
		StringBuilder builder = new StringBuilder();

		String currencyCode = StringUtils.rightPad(StringUtils.trim(data.get(AppConstants.CURRENCY_CODE)), 3);
		String tierNmbr = ApplicationUtils.numberToString(data.get(AppConstants.TIER_NMBR), 2);
		String tranFi = data.get(AppConstants.TRAN_FI);
		String trdrFI = data.get(AppConstants.TRDR_FI);

		switch(mTransactionCode){
			// List Rate Types
			case "0200":
				builder.append(StringUtils.SPACE);
				break;

			// Inquiry Other Rate Types
			case "0210":
			case "0211":
			case "0213":
			case "0214":
			case "0216":
			case "0229":
			case "0232":
			case "0234":
			case "0235":
				builder.append(trdrFI).append(currencyCode).append(mProcessingTag);
				break;

			// Inquire OTC
			case "0220":
				builder.append(trdrFI).append(tranFi).append(currencyCode);
				break;

			// Inquire Thirds Buying and Selling Rates
			case "0224":
			case "0225":
				builder.append(trdrFI).append(tranFi).append(currencyCode).append(tierNmbr).append(mProcessingTag);
				break;
		}

		return builder.toString();
	}

	private static String transactionSeries0300(String mTransactionCode, String mProcessingTag,
			HashMap<String, String> data){
		StringBuilder builder = new StringBuilder();

		String achrgDed = data.get(AppConstants.ACHRG_DED);
		String acptAmnt = ApplicationUtils.numberToString(ApplicationUtils.round(data.get(AppConstants.ACPT_AMNT), 2),
				15, 2);
		String acptChckIndc = data.get(AppConstants.ACPT_CHCK_INDC);
		String acptComm = ApplicationUtils.numberToString(data.get(AppConstants.ACPT_COMM), 15, 2);
		String acptDocs = ApplicationUtils.numberToString(data.get(AppConstants.ACPT_DOCS), 15, 2);
		String acptMode = StringUtils.leftPad(data.get(AppConstants.ACCEPTANCE_MODE), 2, '0');
		String acptPost = ApplicationUtils.numberToString(data.get(AppConstants.ACPT_POST), 15, 2);
		String acptRefno = StringUtils.rightPad(StringUtils.trim(data.get(AppConstants.ACPT_REFNO)), 14);
		String bAddr1 = data.get(AppConstants.B_ADDR1);
		String bAddr2 = data.get(AppConstants.B_ADDR2);
		String bBday = StringUtils.remove(data.get(AppConstants.B_BDAY), "/");
		String bday = StringUtils.remove(data.get(AppConstants.BDAY), "/");
		String beneTag = data.get(AppConstants.BENE_TAG);
		String bFname = data.get(AppConstants.B_FNAME);
		String bLname = StringUtils.left(data.get(AppConstants.B_LNAME), 20);
		String bMname = data.get(AppConstants.B_MNAME);
		String bookUnit = data.get(AppConstants.BOOK_UNIT);
		String branchCode = StringUtils.replace(data.get(AppConstants.BRANCH_CODE), StringUtils.SPACE,
				String.valueOf(0), 7);
		String bTin = data.get(AppConstants.B_TIN);
		String cAddr1 = data.get(AppConstants.C_ADDR1);
		String cAddr2 = data.get(AppConstants.C_ADDR2);
		String cFname = data.get(AppConstants.C_FNAME);
		String chkdtl1 = StringUtils.left(data.get(AppConstants.CHKDTL1), 450);
		String chkdtl2 = StringUtils.left(data.get(AppConstants.CHKDTL2), 450);
		String cLname = data.get(AppConstants.C_LNAME);
		String cMname = data.get(AppConstants.C_MNAME);
		String corpTag = data.get(AppConstants.CORP_TAG);
		String currencyCode = StringUtils.rightPad(StringUtils.trim(data.get(AppConstants.CURRENCY_CODE)), 3);
		String currFr = data.get(AppConstants.CURR_FR);
		String currFrom = data.get(AppConstants.CURRENCY_FROM);
		String currTo = data.get(AppConstants.CURRENCY_TO);
		String custIndc = data.get(AppConstants.CUST_INDC);
		String cutTimeOne = ApplicationUtils.numberToString(data.get(AppConstants.CUT_TIME_ONE), 4);
		String cutTimeTwo = ApplicationUtils.numberToString(data.get(AppConstants.CUT_TIME_TWO), 4);
		String dealRate = ApplicationUtils.numberToString(data.get(AppConstants.DEAL_RATE), 9, 4);
		String docuTag = data.get(AppConstants.DOCU_TAG);
		String formNmbr = data.get(AppConstants.FORM_NMBR);
		String fvecTag = data.get(AppConstants.FVEC_TAG);
		String gOffCode = data.get(AppConstants.GOFFCODE);
		String grntRate = ApplicationUtils.numberToString(data.get(AppConstants.GRNT_RATE), 9, 4);
		String guserid = data.get(AppConstants.GUSERID);
		String inviCode = data.get(AppConstants.INVI_CODE);
		String invisibleCode = StringUtils.rightPad(StringUtils.trim(data.get(AppConstants.INVISIBLE_CODE)), 9);
		String invisibleCodeDesc = StringUtils.rightPad(StringUtils.trim(data.get(AppConstants.INVI_DESC)), 60);
		String invisibleCodeTag = data.get(AppConstants.TAG);
		String listIndc = ApplicationUtils.str(data.get(AppConstants.LIST_INDC), 1, 0);
		String listOptn = ApplicationUtils.str(data.get(AppConstants.LIST_OPTN), 1, 0);
		String mangUnit = data.get(AppConstants.MANG_UNIT);
		String modeCode = StringUtils
				.leftPad(StringUtils.trim(ApplicationUtils.str(data.get(AppConstants.MODE_CODE), 2, 0)), 2, '0');
		String modeIndc = data.get(AppConstants.MODE_INDC);
		String mtsCode = StringUtils.rightPad(StringUtils.trim(data.get(AppConstants.MTS_CODE)), 4);
		String netAmnt = ApplicationUtils.numberToString(data.get(AppConstants.NET_AMNT), 15, 2);
		String ovrdId1 = data.get(AppConstants.OVRD_ID1);
		String ovrdId2 = data.get(AppConstants.OVRD_ID2);
		String ovrdPtt = ApplicationUtils.numberToString(data.get(AppConstants.OVRD_PTT), 2, 0);
		String povrdIndc = data.get(AppConstants.POVRD_INDC);
		String rateVprd = ApplicationUtils.numberToString(data.get(AppConstants.RATE_VPRD), 2);
		String rFname = data.get(AppConstants.R_FNAME);
		String rLname = data.get(AppConstants.R_LNAME);
		String rMname = data.get(AppConstants.R_MNAME);
		String rmrkBrch = data.get(AppConstants.RMRK_BRCH);
		String rqstRate = ApplicationUtils.numberToString(data.get(AppConstants.RQST_RATE), 9, 4);
		String schrgDed = data.get(AppConstants.SCHRG_DED);
		String setlAmnt = ApplicationUtils.numberToString(ApplicationUtils.round(data.get(AppConstants.SETL_AMNT), 2),
				15, 2);
		String setlChckIndc = data.get(AppConstants.SETL_CHCK_INDC);
		String setlComm = ApplicationUtils.numberToString(data.get(AppConstants.SETL_COMM), 15, 2);
		String setlDocs = ApplicationUtils.numberToString(data.get(AppConstants.SETL_DOCS), 15, 2);
		String setlMode = StringUtils.leftPad(data.get(AppConstants.SETTLEMENT_MODE), 2, '0');
		String setlPost = ApplicationUtils.numberToString(data.get(AppConstants.SETL_POST), 15, 2);
		String setlRefno = data.get(AppConstants.SETL_REFNO);
		String sovrdIndc = data.get(AppConstants.SOVRD_INDC);
		String telno = StringUtils.left(data.get(AppConstants.TELNO), 15);
		String tin = data.get(AppConstants.TIN);
		String tranAmnt = ApplicationUtils.numberToString(data.get(AppConstants.TRAN_AMNT), 15, 2);
		String tranCode = data.get(AppConstants.TRAN_CODE);
		String tranFi = data.get(AppConstants.TRAN_FI);
		String tranIndc = data.get(AppConstants.TRAN_INDC);
		String tranTag = ApplicationUtils.numberToString(data.get(AppConstants.TRAN_TAG), 1, 0);
		String trdrFi = data.get(AppConstants.TRDR_FI);
		String userType = ApplicationUtils.numberToString(data.get(AppConstants.USER_TYPE), 2);
		String acptAcct = StringUtils
				.left(StringUtils.replace(data.get(AppConstants.ACPT_ACCT), StringUtils.SPACE, "0", 10), 10);
		String setlAcct = StringUtils
				.left(StringUtils.replace(data.get(AppConstants.SETL_ACCT), StringUtils.SPACE, "0", 10), 10);
		String rateIndc = ApplicationUtils.str(data.get(AppConstants.RATE_INDC), 1, 0);
		String vtranIndc = data.get(AppConstants.VTRAN_INDC);
		String vcLname = data.get(AppConstants.VC_LNAME);
		String vcFname = data.get(AppConstants.VC_FNAME);
		String vcMname = data.get(AppConstants.VC_MNAME);
		String vtranDate = data.get(AppConstants.VTRAN_DATE);
		String frcrdTag = data.get(AppConstants.FRCRD_TAG);
		String vtranTime = data.get(AppConstants.VTRAN_TIME);
		String bank = data.get(AppConstants.BANK);
		String refNmbr = StringUtils.rightPad(StringUtils.trim(data.get(AppConstants.REF_NMBR)), 19);
		String inqyType = data.get(AppConstants.INQY_TYPE);
		String listType = data.get(AppConstants.LIST_TYPE);
		String atelVald = StringUtils.rightPad(StringUtils.trim(data.get(AppConstants.ATEL_VALD)), 14);
		String stelVald = StringUtils.rightPad(StringUtils.trim(data.get(AppConstants.STEL_VALD)), 14);
		String mcNmbr = data.get(AppConstants.MC_NMBR);
		String chktype = data.get(AppConstants.CHKTYPE);
		String chkdtl = data.get(AppConstants.CHKDTL);
		String Gpassword = data.get(AppConstants.GPASSWORD);
		String pwordO1 = data.get(AppConstants.PWORD_O1);
		String pwordO2 = data.get(AppConstants.PWORD_O2);
		String useridO1 = StringUtils.rightPad(data.get(AppConstants.USERID_O1), 8);
		String useridO2 = StringUtils.rightPad(data.get(AppConstants.USERID_O2), 8);
		String clntAcct = ApplicationUtils.numberToString(data.get(AppConstants.CLNT_ACCT), 10);
		String currAcct = data.get(AppConstants.CURR_ACCT);
		String rqstCode = ApplicationUtils.str(data.get(AppConstants.RQST_CODE), 1, 0);

		switch(mTransactionCode){
			// Data Entry
			case "0300":
				builder.append(trdrFi).append(tranIndc).append(cLname).append(cFname).append(cMname).append(cAddr1)
						.append(cAddr2).append(telno).append(tin).append(bday).append(custIndc).append(corpTag)
						.append(docuTag).append(gOffCode).append(bookUnit).append(mangUnit).append(dealRate)
						.append(rqstRate).append(grntRate).append(netAmnt).append(acptAmnt).append(currFr)
						.append(acptMode).append(acptChckIndc).append(chkdtl1).append(acptRefno).append(achrgDed)
						.append(acptDocs).append(acptComm).append(acptPost).append(rLname).append(rFname).append(rMname)
						.append(setlAmnt).append(currTo).append(setlMode).append(setlChckIndc).append(chkdtl2)
						.append(setlRefno).append(schrgDed).append(setlDocs).append(setlComm).append(setlPost)
						.append(bLname).append(bFname).append(bMname).append(bBday).append(bAddr1).append(bAddr2)
						.append(inviCode).append(guserid).append(rmrkBrch).append(ovrdId1).append(ovrdId2)
						.append(ovrdPtt).append(beneTag).append(bTin).append(tranTag).append(fvecTag);
				break;

			// Deal Rate
			case "0301":
				builder.append(trdrFi).append(tranFi).append(custIndc).append(tranIndc).append(currFr).append(currTo)
						.append(acptMode).append(setlMode).append(tranAmnt).append(fvecTag);
				break;

			// CLIENT HISTORY
			case "0302":
				builder.append(tranIndc).append(cLname).append(cFname).append(cMname);
				break;

			// AMOUNT COMPUTATION
			case "0303":
				if(StringUtils.isBlank(chkdtl1)){
					chkdtl1 = StringUtils.EMPTY;
					chkdtl1 = StringUtils.leftPad(chkdtl1, 450, '0');
				}

				if(StringUtils.isBlank(chkdtl2)){
					chkdtl2 = StringUtils.EMPTY;
					chkdtl2 = StringUtils.leftPad(chkdtl2, 450, '0');
				}

				builder.append(trdrFi).append(tranFi).append(tranIndc).append(custIndc).append(acptAcct).append(currFr)
						.append(acptMode).append(acptChckIndc).append(achrgDed).append(chkdtl1).append(setlAmnt)
						.append(currTo).append(setlMode).append(setlChckIndc).append(schrgDed).append(chkdtl2)
						.append(rateIndc).append(dealRate).append(rqstRate)
						.append(StringUtils.repeat(StringUtils.SPACE, 17)).append(StringUtils.rightPad(cLname, 20))
						.append(StringUtils.rightPad(cFname, 20)).append(StringUtils.rightPad(cMname, 20))
						.append(docuTag).append(fvecTag);
				break;

			// send Account Numbers and amounts
			case "0305":
				builder.append(trdrFi).append(tranIndc).append(currFr).append(acptAcct)
						.append(ApplicationUtils
								.numberToString(ApplicationUtils.round(data.get(AppConstants.ACPT_AMNT), 2), 16, 2))
						.append(acptMode).append(currTo).append(setlAcct)
						.append(ApplicationUtils
								.numberToString(ApplicationUtils.round(data.get(AppConstants.NET_AMNT), 2), 16, 2))
						.append(setlMode);

				break;

			// send Transaction Details
			case "0307":
				builder.append(vtranIndc).append(vcLname).append(vcFname).append(vcMname).append(vtranDate)
						.append(frcrdTag).append(vtranTime).append(mProcessingTag);
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
						.append(inqyType);
				break;

			// LIST TRANSACTION REGULAR   314
			case "0310":
			case "0312":
			case "0314":
			case "0316":
			case "0318":
			case "0320":
				builder.append(trdrFi).append(tranIndc).append(branchCode).append(currencyCode).append(refNmbr)
						.append(listType).append(mProcessingTag);
				break;

			// Final  Special Rate (UPDT-SPCL-RATE)
			case "0323":
				builder.append(refNmbr).append(ovrdId1).append(ovrdId2);
				break;

			// Authorize Trader Override
			case "0324":
				builder.append(refNmbr);
				break;

			// (UPDT-CASH-ACPT-SETL)
			case "0325":
				builder.append(refNmbr).append(atelVald).append(stelVald);
				break;

			// (UPDT-MC-SETL)
			case "0326":
				builder.append(refNmbr).append(mcNmbr);
				break;

			// (OR-CHCK-DETL)
			case "0327":
				builder.append(refNmbr);
				break;

			// Acceptanc/Settlement Check Entries
			case "0328":
				builder.append(refNmbr).append(chktype).append(currFr).append(chkdtl);
				break;

			// Cancel Transaction
			case "0329":
				builder.append(refNmbr);
				break;

			// Transacting Local Override
			case "0331":
				if(StringUtils.equals(useridO2, StringUtils.repeat(StringUtils.SPACE, 8))
						&& StringUtils.equals(pwordO2, StringUtils.repeat(StringUtils.SPACE, 18))){
					builder.append(gOffCode).append(useridO1).append(ApplicationUtils.fEncrypt(pwordO1, true))
							.append(StringUtils.repeat(StringUtils.SPACE, 8))
							.append(StringUtils.repeat(StringUtils.SPACE, 18)).append(mProcessingTag)
							.append(ApplicationUtils.fEncrypt(Gpassword, true));
				}else{
					builder.append(gOffCode).append(useridO1).append(ApplicationUtils.fEncrypt(pwordO1, true))
							.append(useridO2).append(ApplicationUtils.fEncrypt(pwordO2, true)).append(mProcessingTag)
							.append(ApplicationUtils.fEncrypt(Gpassword, true));
				}
				break;

			// Check Account Number if BPI/BFB client
			case "0333":
				builder.append(clntAcct).append(currAcct);
				break;

			// List Client Historical Summary Info
			case "0334":
				builder.append(tranIndc).append(rqstCode).append(cLname).append(cFname).append(cMname)
						.append(mProcessingTag);
				break;
		}

		return builder.toString();
	}

	private static String transactionSeries0500(String mTransactionCode, String mProcessingTag,
			HashMap<String, String> data){
		StringBuilder builder = new StringBuilder();

		String currCode = data.get(AppConstants.CURR_CODE);
		String tranUnit = data.get(AppConstants.TRAN_UNIT);
		String flowIndc = ApplicationUtils.numberToString(data.get(AppConstants.FLOW_INDC), 1);
		String seqNo = ApplicationUtils.numberToString(
				ApplicationUtils.decimalRound(Double.parseDouble(data.get(AppConstants.SEQ_NO)), 2) + "", 16, 2);
		String tag = data.get(AppConstants.TAG);
		String tranFi = data.get(AppConstants.TRAN_FI);
		String amount = data.get(AppConstants.AMOUNT);

		switch(mTransactionCode){
			// INQUIRE summary Cash Flow
			case "0500":
				builder.append(tranFi).append(tranUnit).append(currCode);
				break;

			// LIST CASH FLOW SUMMARY
			case "0501":
				builder.append(tranFi).append(tranUnit).append(currCode).append(mProcessingTag);
				break;

			// LIST CASH FLOW DETAIL  
			case "0502":
				builder.append(tranFi).append(tranUnit).append(flowIndc).append(currCode).append(seqNo)
						.append(mProcessingTag);
				break;

			// Update CASH FLOW DETAIL  
			case "0503":
				builder.append(tranFi).append(tranUnit).append(currCode).append(amount).append(tag)
						.append(mProcessingTag);
				break;

			default:
				break;
		}

		return builder.toString();
	}

	private static String transactionSeries0900(String mTransactionCode, String mProcessingTag,
			HashMap<String, String> data){
		StringBuilder builder = new StringBuilder();

		String refNumber = StringUtils.rightPad(data.get(AppConstants.REF_NUMBER).trim(), 19);
		String tranUnit = data.get(AppConstants.TRAN_UNIT);
		String trdrFi = data.get(AppConstants.TRDR_FI);
		String mcSerno = StringUtils.rightPad(data.get(AppConstants.MC_SERNO).trim(), 15);
		String listIndc = data.get(AppConstants.LIST_INDC);
		String cLname = StringUtils.rightPad(data.get(AppConstants.C_LNAME), 20);
		String cFname = StringUtils.rightPad(data.get(AppConstants.C_FNAME), 20);
		String cMname = StringUtils.rightPad(data.get(AppConstants.C_MNAME), 20);
		String tranDate = data.get(AppConstants.TRAN_DATE);
		String tranTime = data.get(AppConstants.TRAN_TIME);
		String rqstType = data.get(AppConstants.RQST_TYPE);
		String goffCode = StringUtils.rightPad(data.get(AppConstants.GOFFCODE).trim(), 7);
		String tranIndc = data.get(AppConstants.TRAN_INDC);
		String currFrom = data.get(AppConstants.CURR_FR);
		String currTo = data.get(AppConstants.CURR_TO);
		String amntSw = data.get(AppConstants.AMNT_SW);
		String tag = data.get(AppConstants.TAG);
		String tranFi = data.get(AppConstants.TRAN_FI);

		switch(mTransactionCode){
			//INQUIRY ON ISSUED MC - Specific 
			case "0900":
				builder.append(refNumber).append(mProcessingTag);
				break;

			// INQUIRY ON ISSUED MCs - LIST 
			case "0901":
				builder.append(tranUnit).append(trdrFi).append(mcSerno).append(mProcessingTag);
				break;

			// INQUIRY ON ACCEPTED TCs
			case "0902":
				builder.append(listIndc).append(trdrFi).append(tranUnit).append(refNumber).append(mProcessingTag);
				break;

			// Inquiry on Client Historical Record (List Summary)  
			case "0903":
				builder.append(tranIndc).append(tag).append(cLname).append(cFname).append(cMname)
						.append(mProcessingTag);
				break;

			//Inquiry on Client Historical Record(Details)
			case "0904":
				builder.append(tranIndc).append(cLname).append(cFname).append(cMname).append(tranDate).append(tranTime)
						.append(mProcessingTag);
				break;
			//INQUIRY ON DAILY TRANSACTIONS
			case "0905":
				builder.append(tranFi).append(tranIndc).append(refNumber).append(rqstType);
				break;
			//LIST DAILY TRANSACTIONS
			case "0906":
				builder.append(goffCode).append(trdrFi).append(tranIndc).append(rqstType).append(amntSw)
						.append(refNumber);
				String x = (tranIndc.equals("P")) ? currFrom : currTo;
				builder.append(x).append(mProcessingTag);

				break;
			//IST LIST-SUMM-TRAN
			case "0907":
				builder.append(trdrFi).append(tranIndc).append(refNumber).append(rqstType).append(mProcessingTag);
				break;
			//List Average Cost
			case "0908":
				builder.append(trdrFi);
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
