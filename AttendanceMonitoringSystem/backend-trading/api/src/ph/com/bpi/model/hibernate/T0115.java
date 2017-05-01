package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0115 {

private int id;
private BigDecimal modeCode;
private String modeDesc;
private BigDecimal mcroTag;
private String actvTag;
private String phpTag;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public BigDecimal getModeCode() {
	return modeCode;
}
public void setModeCode(BigDecimal modeCode) {
	this.modeCode = modeCode;
}
public String getModeDesc() {
	return modeDesc;
}
public void setModeDesc(String modeDesc) {
	this.modeDesc = modeDesc;
}
public BigDecimal getMcroTag() {
	return mcroTag;
}
public void setMcroTag(BigDecimal mcroTag) {
	this.mcroTag = mcroTag;
}
public String getActvTag() {
	return actvTag;
}
public void setActvTag(String actvTag) {
	this.actvTag = actvTag;
}
public String getPhpTag() {
	return phpTag;
}
public void setPhpTag(String phpTag) {
	this.phpTag = phpTag;
}

public void parse(HashMap<String, String> map){

	for(String key: map.keySet()){
		System.out.print(key);
		switch(key){
			
			case "MODE_CODE":
				modeCode = new BigDecimal(map.get(key));
				break;

		

			case "MODE_DESC":
				modeDesc=(map.get(key));
				break;
			case "MCRO_TAG":
				mcroTag=new BigDecimal(map.get(key));
				break;
			case "ACTV_TAG":
				actvTag=(map.get(key));
				break;
			case "PHP_TAG":
				phpTag=(map.get(key));
				break;

		}
	}
}
}