package ph.com.bpi.utilities;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;

import ph.com.bpi.utilities.AppConstants;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.HeaderDataDAO;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.hibernate.HeaderData;

public class ApplicationUtils{

	/**
	 * Encrypts field.
	 * 
	 * @param forEncryption
	 *            Field to be encrypted.
	 * @param ncr
	 * @return
	 */
	public static String encrypt(String forEncryption, boolean ncr){
		String encrypted = "";
		String tx2benc = ncr ? ">@C*B.9-JUSTINE:#L=A7G(D8\\0;64F%/K}H&3P{V_Z1M)Q52+WY,R?X$0!<"
				: "){HMT};S!E#K@.NX%G<O*V/B_6+4D&P$Z:2Y>R-F=Q\\C?W,JULIA0718359(";
		String correnc = ncr ? "){HMT};S!E#K@.NX%G<O*V/B_6+4D&P$Z:2Y>R-F=Q\\C?W,JULIA0718359("
				: ">@C*B.9-JUSTINE:#L=A7G(D8\\0;64F%/K}H&3P{V_Z1M)Q52+WY,R?X$0!<";

		int length = forEncryption.trim().length();
		for(int i = 0; i < length; i++){

			char ttarget = forEncryption.toUpperCase().charAt(i);
			int ptarget = tx2benc.indexOf(ttarget);

			if(ptarget > -1){
				if(i < 8){
					ptarget = correnc.length() - ptarget;
				}
				encrypted += correnc.charAt(ptarget - 1);
			}
		}

		return encrypted;
	}

	/**
	 * Decrypts field.
	 * 
	 * @param mPassword
	 * @param mUser
	 * @return
	 */
	public static String decrypt(String mUser, String mPassword){
		String conv1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
		String conv2 = "W;!*%\\$#A8&@4Q?,>SDL/1CVG(H\"~XJ<EIU=K";
		String conv3 = ">?;\"@YT45&*):Q9(5XV=-%#2WRGKS7M!RIFZ8";
		String first = StringUtils.EMPTY;
		String user = StringUtils.EMPTY;
		String password = StringUtils.EMPTY;
		int mod = -1;

		user = StringUtils.rightPad(mUser.toUpperCase(), 8);
		first = StringUtils.replaceChars(String.valueOf(mPassword.toUpperCase().charAt(0)), conv3, conv1);
		mod = ((int) first.charAt(0) + (int) user.charAt(0)) % 36;
		password = StringUtils.replaceChars(mPassword.toUpperCase().substring(1),
				conv2.substring(mod) + conv2.substring(0, mod - 1), conv1);
		password = first + password;

		return password;
	}

	/**
	 * 
	 * @param forEncryption
	 * @param ncr
	 * @return
	 */
	public static String fEncrypt(String forEncryption, boolean ncr){
		String prefix = "|\\=&*$%@#;";
		String encrypted = "";
		String tx2benc = ncr ? ">@C*B.9-JUSTINE:#L=A7G(D8\\O;64F%/K}H&3P{V_Z1M)Q52+WY,R?X$0!<"
				: "){HMT};S!E#K@.NX%G<O*V/B_6+4D&P$Z:2Y>R-F=Q\\C?W,JULIA0718359(";
		String correnc = ncr ? "){HMT};S!E#K@.NX%G<O*V/B_6+4D&P$Z:2Y>R-F=Q\\C?W,JULIA0718359("
				: ">@C*B.9-JUSTINE:#L=A7G(D8\\O;64F%/K}H&3P{V_Z1M)Q52+WY,R?X$0!<";

		/**
		 * Returns a string consists of 18 spaces when blank.
		 */
		if(StringUtils.isEmpty(forEncryption.trim())){
			return StringUtils.repeat(StringUtils.SPACE, 18);
		}

		int length = forEncryption.trim().length();
		for(int i = 0; i < length; i++){
			char ttarget = forEncryption.toUpperCase().charAt(i);
			int ptarget = tx2benc.indexOf(ttarget);

			if(ptarget > -1){
				if(i < 8){
					ptarget = correnc.length() - ptarget;
				}
				encrypted += correnc.charAt(ptarget - 1);
			}
		}

		encrypted = StringUtils.rightPad(encrypted, 8);

		return prefix.concat(encrypted);
	}

	public static String mfLogon(HashMap<String, String> data){
		String returnValue = "";
		String mfResponse = "";

		for(int i = 0; i < 3; i++){
			try{
				data.put(AppConstants.G_LOG_TYPE, "1");

				mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_LOGON, data);
				if(StringUtils.left(mfResponse, 4).equalsIgnoreCase("ACF0")){
					break;
				}

			}catch(MFResponseException e){
				e.printStackTrace();
			}
		}

		returnValue = ApplicationUtils.checkMFResponse(mfResponse);
		return returnValue;
	}

	/**
	 * 
	 * @param response
	 * @return
	 */
	public static String checkMFResponse(String response){
		String parsed = StringUtils.repeat(StringUtils.SPACE, 8);

		if(StringUtils.trim(response).equalsIgnoreCase("90")){
			ApplicationUtils.log("Not connected to host. Please inform system administrator.");

		}else if(StringUtils.trim(response).equalsIgnoreCase("91")){
			ApplicationUtils.log("Not connected to application.");

		}else if(StringUtils.trim(response).equalsIgnoreCase("92")){
			ApplicationUtils.log("Host time-out.");

		}else if(StringUtils.trim(response).equalsIgnoreCase("93")){
			ApplicationUtils.log("Insufficient memory. Please inform system administrator.");

		}else if(StringUtils.left(StringUtils.trim(response), 4).equalsIgnoreCase("ACF0")){
			ArrayList<String> list = new ArrayList<>(Arrays.asList("ACF01137", "ACF01138", "ACF01129", "ACF01134"));

			if(list.contains(StringUtils.upperCase(StringUtils.left(StringUtils.trim(response), 8)))){
				if(StringUtils.upperCase(ApplicationUtils.subString(StringUtils.trim(response), 80, 8))
						.equalsIgnoreCase("ACFAE145")){
					parsed = StringUtils.join("0000", StringUtils.left(StringUtils.trim(response), 8));
				}else{
					parsed = "0000";
				}
			}else{
				parsed = StringUtils.join("0000", StringUtils.left(StringUtils.trim(response), 8));
			}

		}else if(StringUtils.left(StringUtils.trim(response), 4).equalsIgnoreCase("0000")
				&& (StringUtils.length(response) == 4)){
			parsed = StringUtils.left(StringUtils.trim(response), 4);

		}else{
			parsed = response;
		}

		return parsed;
	}

	/**
	 * Numeric to decimal.
	 * 
	 * @param number
	 *            Number to convert.
	 * @param length
	 *            Length of result.
	 * @return
	 */
	public static String numberToString(String number, int length){
		return StringUtils.leftPad(StringUtils.remove(number, "."), length, "0");
	}

	/**
	 * Numeric to Character.
	 * 
	 * @param number
	 *            Number to convert with/without decimal.
	 * @param length
	 *            Length of result without decimal.
	 * @param decimalIncl
	 *            Number of decimal places to be included in the result.
	 * @return
	 */
	public static String numberToString(String number, int length, int decimalIncl){
		int power = (decimalIncl <= 0) ? 0 : decimalIncl;
		double mult = (int) Math.pow(10, power);
		String num = String.valueOf(Math.round(Double.valueOf(number) * mult));

		return StringUtils.remove(StringUtils.leftPad(num, length, "0"), ".");
	}

	/**
	 * Returns length of numeric fields.
	 * 
	 * @param numberLength
	 *            Length of number part.
	 * @param decimalLength
	 *            Length of decimal part.
	 * @return
	 */
	public static int returnNLength(int numberLength, int decimalLength){
		return ((decimalLength > 0) ? numberLength - 1 : numberLength);
	}

	/**
	 * Returns a substring of the string with the desired length starting from
	 * desired position.
	 * 
	 * @param string
	 *            String.
	 * @param start
	 *            Start position.
	 * @param length
	 *            Desired length of resulting substring.
	 * @return
	 */
	public static String subString(String string, int start, int length){
		return string.substring(start, Math.min(start + length, string.length()));
	}

	/**
	 * Java implementation of STUFF() function from FoxPro.
	 * 
	 * @param mString
	 * @param nStartReplacement
	 * @param nCharactersReplaced
	 * @param cReplacement
	 * @return
	 */
	public static String stuff(String mString, int nStartReplacement, int nCharactersReplaced, String cReplacement){
		String pre = StringUtils.substring(mString, 0, nStartReplacement);
		String suf = StringUtils.substring(mString, nStartReplacement + nCharactersReplaced, mString.length());

		return pre.concat(cReplacement).concat(suf);
	}

	/**
	 * Java implementation of ROUND() function from FoxPro.
	 * 
	 * @param number
	 * @param decimal
	 * @return
	 */
	public static String round(String number, int decimal){
		String format = (decimal <= 0) ? "" : ".".concat(StringUtils.repeat("0", decimal));
		DecimalFormat df = new DecimalFormat("0".concat(format));
		df.setRoundingMode(RoundingMode.HALF_UP);

		return String.valueOf(df.format(Double.valueOf(number)));
	}

	/**
	 * Java implementation of STR() function from FoxPro.
	 * 
	 * @param number
	 * @param length
	 * @param decimal
	 * @return
	 */
	public static String str(String number, int length, int decimal){

		String rounded = String.valueOf(Math.round(Double.valueOf(number)));
		int numCount = rounded.length();

		if(numCount < length){
			String format = (decimal <= 0) ? "" : ".".concat(StringUtils.repeat("0", decimal));
			DecimalFormat df = new DecimalFormat("0".concat(format));
			df.setRoundingMode(RoundingMode.HALF_UP);

			return StringUtils.left(df.format(Double.valueOf(number)), length);
		}else{
			return rounded;
		}
	}

	/**
	 * Returns number of declared fields of a class.
	 * 
	 * @param clazz
	 * @return
	 */
	public static int getFieldsCount(Class clazz){
		return clazz.getDeclaredFields().length;
	}

	/**
	 * Convert date to string. (MMddyy-format)
	 * 
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date){
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy");
		return formatter.format(date);
	}

	/**
	 * 
	 * @param date
	 * @return
	 */
	public static String datetimeToString(Date date){
		SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
		return formatter.format(date);
	}

	public static double decimalRound(double value, int places){
		if(places < 0)
			throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	/**
	 * Returns data required by send details from DB.
	 * 
	 * @return
	 */
	public static HashMap<String, String> getHeaderDetails(){
		HashMap<String, String> data = new HashMap<>();

		HeaderDataDAO headerDao = DaoFactory.getHeaderDataDAO();
		HeaderData headerData = headerDao.getAllRecords().get(0);
		
		if(headerData != null){
			data.put(AppConstants.G_LUID, headerData.getLuid());
			data.put(AppConstants.G_OFFICE_CODE, headerData.getOfficeCode());
			data.put(AppConstants.G_USER_ID, headerData.getUserId());
			data.put(AppConstants.C_LOG_DATE, StringUtils.leftPad(headerData.getLogDate(), 6, "0"));
			data.put(AppConstants.G_LOG_TIME, StringUtils.leftPad(headerData.getLogTime(), 6, "0"));
			data.put(AppConstants.G_TRAN_FI, headerData.getTranFi());
		}

		return data;
	}

	/**
	 * Dummy logging.
	 * 
	 * @param message
	 *            Message to be logged.
	 */
	public static void log(String message){
		System.out.println(message);
	}
	
	/**
	 * NVL
	 * 
	 * 
	 */
	public static <T> T nvl(T arg0, T arg1){
		return (arg0 == null)?arg1:arg0;
	}
}
