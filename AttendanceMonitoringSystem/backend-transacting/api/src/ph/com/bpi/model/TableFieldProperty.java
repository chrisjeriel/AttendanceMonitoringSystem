package ph.com.bpi.model;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author ralphangelobautista
 *
 */
public class TableFieldProperty{
	private String	name;
	private char	dataType;
	private int		length;
	private int		decimal;
	private boolean	isDate8Format;

	public TableFieldProperty(){
		// TODO Auto-generated constructor stub
	}

	public TableFieldProperty(String mName, char mDataType, int mLength, boolean mIsDate8Format){
		this.setName(StringUtils.rightPad(mName, 10));
		this.setDataType(mDataType);
		this.setLength(mLength);
		this.setDecimal(0);
		this.setIsDate8Format(mIsDate8Format);
	}

	public TableFieldProperty(String mName, char mDataType, int mLength, int mDecimal, boolean mIsDate8Format){
		this.setName(StringUtils.rightPad(mName, 10));
		this.setDataType(mDataType);
		this.setLength(mLength);
		this.setDecimal(mDecimal);
		this.setIsDate8Format(mIsDate8Format);
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public char getDataType(){
		return dataType;
	}

	public void setDataType(char dataType){
		this.dataType = dataType;
	}

	public int getLength(){
		return length;
	}

	public void setLength(int length){
		this.length = length;
	}

	public int getDecimal(){
		return decimal;
	}

	public void setDecimal(int decimal){
		this.decimal = decimal;
	}

	public boolean getIsDate8Format(){
		return isDate8Format;
	}

	public void setIsDate8Format(boolean isDate8Format){
		this.isDate8Format = isDate8Format;
	}

	@Override
	public String toString(){
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		builder.append("TableFieldProperty {\n");
		builder.append("\tName: ").append(this.getName()).append(",\n");
		builder.append("\tData Type: ").append(this.getDataType()).append(",\n");
		builder.append("\tLength: ").append(this.getLength()).append(",\n");
		builder.append("\tDecimal: ").append(this.getDecimal()).append("\n");
		builder.append("\t8 Date Format: ").append(this.getIsDate8Format()).append("\n");
		builder.append("}");

		return builder.toString();
	}
}
