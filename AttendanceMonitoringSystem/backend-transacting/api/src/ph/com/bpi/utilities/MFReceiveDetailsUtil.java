package ph.com.bpi.utilities;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import ph.com.bpi.model.TModelBase;
import ph.com.bpi.model.TableFieldProperty;
import ph.com.bpi.model.hibernate.T0001;
import ph.com.bpi.model.hibernate.T0105;

/**
 * 
 * @author ralphangelobautista
 *
 */
public class MFReceiveDetailsUtil{

	private static Logger logger = Logger.getLogger(MFReceiveDetailsUtil.class);

	/**
	 * Receive details from MainFrame.
	 * 
	 * @param messageDetails
	 *            Message Details from MainFrame
	 * @param transactionCode
	 *            Transaction Code as Cursor Name too.
	 * @param toc
	 * @param indexField
	 * @return
	 */
	public static List<HashMap<String, String>> receiveDetails(String messageDetails, String transactionCode,
			String toc, String indexField){
		String alyas = toc.concat(transactionCode);

		/**
		 * TODO: Define gmaxdlen.
		 */
		int gmaxdlen = messageDetails.length();
		boolean date8 = true; // True if date = 8-digit

		boolean occursSw = true; // True if there's an occurs clause
		int occurType; // Number of occurs clause in cobol format
		int occurLength = 0; // Total length in characters of of occurs clause
		int occurTimes; // Number of occurrence on the last occurs clause
		int fieldNumA = 0; // Field number where the occurs clause ends	
		int fieldNumOne; // Field number where the last occurs clause starts
		int fieldNumTwo = 0; // Field number where the occurs clause ends
		int headLength = 0; // Total length of header
		int tailLength = 0; // Total length of header
		int w_length = 0;
		String rMessageDetails = "";
		String xMessageDetails = "";

		int fieldCount = 0;
		double mRecordCount = 0.0;
		double mOccurence = 0.0;
		Class<? extends TModelBase> clazz = null;
		LinkedHashMap<String, TableFieldProperty> map = null;
		List<HashMap<String, String>> records = new ArrayList<HashMap<String, String>>();

		messageDetails = ApplicationUtils.subString(messageDetails, 0, gmaxdlen - 130);
		String tTranCode = "T" + transactionCode;
		String myClassName = "ph.com.bpi.model.hibernate."+tTranCode;
		try {
			clazz = (Class<? extends TModelBase>) Class.forName(myClassName);
			map = (LinkedHashMap<String, TableFieldProperty>) AppTableProperties.class.getDeclaredField(tTranCode + "TFProperty")
					.get(AppTableProperties.class);
//			AppTableProperties app = new AppTableProperties();
//	        java.lang.reflect.Method m = AppTableProperties.class.getMethod("build"+tTranCode+"TFProperty");
////	        map = (LinkedHashMap<String, TableFieldProperty>) m.invoke(null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		switch(transactionCode){
			case "0001":
				occurType = 1;
				fieldNumOne = 3;
				occurTimes = 12;
				break;

			case "0105":
			case "0121":
			case "0903":
				occurType = 1;
				fieldNumOne = 2;
				occurTimes = 20;
				break;

			case "0334":
				occurType = 1;
				fieldNumOne = 2;
				occurTimes = 15;
				break;

			case "0102":
				occurType = 1;
				fieldNumOne = 2;
				occurTimes = 4;
				break;

			case "0107":
			case "0817":
				occurType = 1;
				fieldNumOne = 2;
				occurTimes = 5;
				break;

			case "0110":
			case "0112":
			case "0205":
			case "0211":
			case "0214":
			case "0235":
				occurType = 1;
				fieldNumOne = 2;
				occurTimes = 30;
				break;

			case "0128":
				occurType = 1;
				fieldNumOne = 3;
				occurTimes = 20;
				break;

			case "0201":
				occurType = 1;
				fieldNumOne = 2;
				occurTimes = 9;
				break;

			case "0206":
			case "0209":
			case "0212":
				occurType = 1;
				fieldNumOne = 2;
				occurTimes = 40;
				break;

			case "0208":
				occurType = 1;
				fieldNumOne = 2;
				occurTimes = 35;
				break;

			case "0228":
				occurType = 1;
				fieldNumOne = 4;
				occurTimes = 15;
				break;

			case "0904":
			case "0307":
				occurType = 1;
				fieldNumOne = 10;
				occurTimes = 20;
				break;

			case "0906":
				occurType = 1;
				fieldNumOne = 3;
				occurTimes = 10;
				break;

			case "0310":
			case "0312":
			case "0314":
			case "0316":
			case "0318":
			case "0320":
			case "0907":
				occurType = 1;
				fieldNumOne = 3;
				occurTimes = 5;
				break;

			case "0327":
				occurType = 1;
				fieldNumOne = 27;
				occurTimes = 15;
				fieldNumA = 28;
				break;

			case "0400":
				occurType = 1;
				fieldNumOne = 4;
				occurTimes = 8;
				break;

			case "0501":
				occurType = 1;
				fieldNumOne = 3;
				occurTimes = 25;
				break;

			case "0502":
				occurType = 1;
				fieldNumOne = 4;
				occurTimes = 40;
				break;

			case "0600":
				occurType = 1;
				fieldNumOne = 4;
				occurTimes = 15;
				break;

			case "0604":
				occurType = 1;
				fieldNumOne = 4;
				occurTimes = 25;
				break;

			case "0815":
				occurType = 1;
				fieldNumOne = 4;
				occurTimes = 30;
				break;

			case "0816":
				occurType = 1;
				fieldNumOne = 4;
				occurTimes = 8;
				break;

			case "0901":
				occurType = 1;
				fieldNumOne = 3;
				occurTimes = 15;
				break;

			case "0902":
				occurType = 3;
				fieldNumOne = 5;
				occurTimes = 15;
				break;

			case "0910":
				occurType = 1;
				fieldNumOne = 5;
				occurTimes = 15;
				break;

			default:
				occursSw = false;
				fieldCount = ApplicationUtils.getFieldsCount(clazz) - 1; // Minus 1 because of auto-increment id.
				occurLength = 0;

				w_length = computeMessageLength(map);
				occurLength = w_length;

				mRecordCount = StringUtils.length(messageDetails.trim()) / w_length;

				if((mRecordCount - (int) mRecordCount) > 0){
					mRecordCount += 1;
				}

				records = parseMessage(messageDetails.trim(), (int) mRecordCount, map);

				return records;
		}

		/**
		 * Transaction Codes with Occurs.
		 */
		if(occursSw){
			occurLength = 0;
			headLength = 0;
			tailLength = 0;
			fieldNumTwo = 0;

			fieldNumTwo = ApplicationUtils.getFieldsCount(clazz) - 1; // Minus 1 because of auto-increment id.
			headLength = computeMessageLength(map, 0, fieldNumOne);

			if(fieldNumA == 0){
				occurLength = computeMessageLength(map, fieldNumOne, fieldNumTwo);
				int totalLength = headLength + (occurLength * occurTimes);

				rMessageDetails = messageDetails;
				messageDetails = StringUtils.left(rMessageDetails, totalLength);

				while(!StringUtils.isBlank(rMessageDetails)){
					xMessageDetails = messageDetails.trim();
					mRecordCount = xMessageDetails.length() - headLength;
					mRecordCount = mRecordCount / occurLength;
					if((mRecordCount - (int) mRecordCount) > 0){
						mRecordCount += 1;
					}
					mOccurence = mRecordCount;

					List<HashMap<String, String>> newRecords = parseSpecialMessage(messageDetails, (int) mRecordCount,
							fieldNumOne, fieldNumTwo, headLength, occurType, totalLength, map);
					records.addAll(newRecords);
					rMessageDetails = ApplicationUtils.stuff(rMessageDetails, 0, totalLength, StringUtils.EMPTY);
					messageDetails = StringUtils.left(rMessageDetails, totalLength);
				}
			}else{
				int totalLength = 0;
				occurLength = computeMessageLength(map, fieldNumOne, fieldNumA);
				tailLength = computeMessageLength(map, fieldNumA, fieldNumTwo);

				totalLength = headLength + (occurLength * occurTimes) + tailLength;

				rMessageDetails = messageDetails;
				messageDetails = StringUtils.left(rMessageDetails, totalLength);

				while(!StringUtils.isBlank(rMessageDetails)){
					xMessageDetails = messageDetails.trim();

					mRecordCount = xMessageDetails.length() - headLength - tailLength;
					mRecordCount = mRecordCount / occurLength;
					if((mRecordCount - (int) mRecordCount) > 0){
						mRecordCount += 1;
					}
					mRecordCount = occurTimes; // See RECVDETL.PRG (line 279). 
					mOccurence = mRecordCount;

					List<HashMap<String, String>> newRecords = parseWithinMessage(messageDetails, (int) mRecordCount,
							fieldNumOne, fieldNumTwo, fieldNumA, headLength, tailLength, occurLength, occurTimes,
							occurType, totalLength, map);
					records.addAll(newRecords);
					rMessageDetails = ApplicationUtils.stuff(rMessageDetails, 0, totalLength, StringUtils.EMPTY);
					messageDetails = StringUtils.left(rMessageDetails, totalLength);
				}

			}
		}

		return records;
	}

	/**
	 * Regular parsing of data coming from sendhost in which the details will be
	 * places to their respective aliases/tables.
	 * 
	 * @param message
	 * @param recordCount
	 * @param properties
	 * @return
	 */
	private static List<HashMap<String, String>> parseMessage(String message, int recordCount,
			LinkedHashMap<String, TableFieldProperty> properties){
		List<HashMap<String, String>> records = new ArrayList<HashMap<String, String>>();

		int fieldCount = properties.size();
		int messageEntryLength = computeMessageLength(properties);

		for(int i = 0; i < recordCount; i++){
			HashMap<String, String> map = new HashMap<String, String>();
			String messageEntry = StringUtils.left(message, messageEntryLength);
			message = ApplicationUtils.stuff(message, 0, messageEntryLength, StringUtils.EMPTY);
			map = parse(messageEntry, 0, fieldCount, properties);
			records.add(map);
		}

		return records;
	}

	/**
	 * Special parsing.
	 * Parsing data coming from SendHost in which the details will be placed to
	 * their respective aliases/tables. Where last field included in the
	 * occurs statement is the last field in the table.
	 * 
	 * @param message
	 * @param recordCount
	 * @param mFieldNumOne
	 * @param mFieldNumTwo
	 * @param mHeadLength
	 * @param mOccurType
	 * @param mTotalLength
	 * @param properties
	 * @return
	 */
	private static List<HashMap<String, String>> parseSpecialMessage(String message, int recordCount, int mFieldNumOne,
			int mFieldNumTwo, int mHeadLength, int mOccurType, int mTotalLength,
			LinkedHashMap<String, TableFieldProperty> properties){

		List<HashMap<String, String>> records = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> header = new HashMap<String, String>();
		HashMap<String, String> record;

		/**
		 * Getting headers.
		 */
		String headerMessage = StringUtils.left(message, mHeadLength);
		header = parse(headerMessage, 0, mFieldNumOne, properties);

		/**
		 * Compute occur length.
		 * Trim header details.
		 */
		int mOccurLength = computeMessageLength(properties, mFieldNumOne, mFieldNumTwo);
		message = ApplicationUtils.stuff(message, 0, mHeadLength, StringUtils.EMPTY);

		/**
		 * Start parsing from the start.
		 */
		for(int i = 0; i < recordCount; i++){
			record = new HashMap<String, String>(header);

			HashMap<String, String> value = new HashMap<>();
			String valueMessage = StringUtils.left(message, mOccurLength);
			message = ApplicationUtils.stuff(message, 0, mOccurLength, StringUtils.EMPTY);
			value = parse(valueMessage, mFieldNumOne, mFieldNumTwo, properties);
			record.putAll(value);

			if((mOccurType != 2)
					|| StringUtils.isBlank(ApplicationUtils.stuff(message, 0, mTotalLength, StringUtils.EMPTY))){
				records.add(record);
			}
		}

		return records;
	}

	/**
	 * Parse Within.
	 * Parsing data coming from SendHost in which the details will be placed to
	 * their respective aliases/tables. Where last field included in the
	 * occurs statement is not the last field in the table.
	 * 
	 * @param message
	 * @param recordCount
	 * @param mFieldNumOne
	 * @param mFieldNumTwo
	 * @param mFieldNumA
	 * @param mHeadLength
	 * @param mTailLength
	 * @param mOccurLength
	 * @param mOccurTimes
	 * @param mOccurType
	 * @param mTotalLength
	 * @param properties
	 * @return
	 */
	private static List<HashMap<String, String>> parseWithinMessage(String message, int recordCount, int mFieldNumOne,
			int mFieldNumTwo, int mFieldNumA, int mHeadLength, int mTailLength, int mOccurLength, int mOccurTimes,
			int mOccurType, int mTotalLength, LinkedHashMap<String, TableFieldProperty> properties){

		List<HashMap<String, String>> records = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> header = new HashMap<String, String>();
		HashMap<String, String> tail = new HashMap<String, String>();
		HashMap<String, String> record;

		/**
		 * Get header part from message.
		 */
		String headerMessage = StringUtils.left(message, mHeadLength);
		header = parse(headerMessage, 0, mFieldNumOne, properties);

		/**
		 * Get tail part from message.
		 */
		String tailMessage = ApplicationUtils.stuff(message, 0, (mHeadLength + (mOccurLength * mOccurTimes)),
				StringUtils.EMPTY);
		tail = parse(tailMessage, mFieldNumA, mFieldNumTwo, properties);

		/**
		 * Compute occur length.
		 * Trim header details.
		 */
		message = ApplicationUtils.stuff(message, 0, mHeadLength, StringUtils.EMPTY);

		/**
		 * Start parsing from the start.
		 */
		for(int i = 0; i < recordCount; i++){
			record = new HashMap<String, String>();
			record.putAll(header);
			record.putAll(tail);

			HashMap<String, String> value = new HashMap<>();
			String valueMessage = StringUtils.left(message, mOccurLength);
			message = ApplicationUtils.stuff(message, 0, mOccurLength, StringUtils.EMPTY);
			value = parse(valueMessage, mFieldNumOne, mFieldNumTwo, properties);
			record.putAll(value);

			if((mOccurType != 2)
					|| StringUtils.isBlank(ApplicationUtils.stuff(message, 0, mTotalLength, StringUtils.EMPTY))){
				records.add(record);
			}
		}

		return records;
	}

	/**
	 * Parse message using the provided table field properties.
	 * 
	 * @param message
	 *            Message to be parsed.
	 * @param fieldStart
	 *            Starting field index from the given table field property list.
	 * @param fieldEnd
	 *            Ending field index from the given table field property list.
	 * @param properties
	 *            Table field property list.
	 * @return
	 */
	private static HashMap<String, String> parse(String message, int fieldStart, int fieldEnd,
			LinkedHashMap<String, TableFieldProperty> properties){
		HashMap<String, String> map = new HashMap<String, String>();

		List<Map.Entry<String, TableFieldProperty>> propertyEntries = new ArrayList<Map.Entry<String, TableFieldProperty>>(
				properties.entrySet());
		int index = 0;
		int length = 0;

		try{

			for(int i = fieldStart; (i < fieldEnd) && (i < propertyEntries.size()); i++){
				Map.Entry<String, TableFieldProperty> entry = propertyEntries.get(i);
				String key = entry.getKey();
				TableFieldProperty property = entry.getValue();
				String value = "";
				index += length;

				switch(property.getDataType()){
					case 'C':
						value = ApplicationUtils.subString(message, index, property.getLength());
						index += property.getLength();
						break;

					case 'N':
						value = ApplicationUtils.subString(message, index,
								ApplicationUtils.returnNLength(property.getLength(), property.getDecimal()));
						length += value.length();
						value = new StringBuilder(value).insert(value.length() - property.getDecimal(), ".").toString();
						break;

					case 'D':
						int dateLength = property.getIsDate8Format() ? property.getLength() : property.getLength() - 2;
						value = ApplicationUtils.subString(message, index, dateLength);
						length += dateLength;
						break;

				}
				map.put(key, value);
			}
		}catch(Exception e){
			logger.info("Error parsing message!");
			e.printStackTrace();
		}

		return map;
	}

	/**
	 * Compute Message Length.
	 * 
	 * @return
	 */
	private static int computeMessageLength(LinkedHashMap<String, TableFieldProperty> map){
		int length = (map != null) ? map.entrySet().size() : 0;
		return computeMessageLength(map, 0, length);
	}

	/**
	 * Compute message length from one field to another.
	 * 
	 * @param map
	 * @param start
	 * @param end
	 * @return
	 */
	private static int computeMessageLength(LinkedHashMap<String, TableFieldProperty> map, int start, int end){
		int messageLength = 0;

		if((map != null) && !map.isEmpty()){
			ArrayList<Map.Entry<String, TableFieldProperty>> entries = new ArrayList<>(map.entrySet());

			for(int i = start; i < end; i++){
				Map.Entry<String, TableFieldProperty> entry = entries.get(i);
				TableFieldProperty property = entry.getValue();

				int excess = 0;

				switch(property.getDataType()){
					case 'N':
						excess = (property.getDecimal() > 0) ? 1 : 0;
						break;

					case 'D':
						excess = property.getIsDate8Format() ? 2 : 0;
						break;

					default:
						excess = 0;
						break;
				}

				messageLength += (property.getLength() - excess);
			}
		}

		return messageLength;
	}

}
