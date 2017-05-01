package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0140 {

private int id;
private BigDecimal userType;
private String userDesc;
private BigDecimal ovrdPt;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public BigDecimal getUserType() {
	return userType;
}
public void setUserType(BigDecimal userType) {
	this.userType = userType;
}
public String getUserDesc() {
	return userDesc;
}
public void setUserDesc(String userDesc) {
	this.userDesc = userDesc;
}
public BigDecimal getOvrdPt() {
	return ovrdPt;
}
public void setOvrdPt(BigDecimal ovrdPt) {
	this.ovrdPt = ovrdPt;
}

public void parse(HashMap<String, String> map){
	for(String key : map.keySet()){
		switch(key){
			case "USER_TYPE":
				this.setUserType(new BigDecimal(map.get(key)));
				break;
			case "USER_DESC":
				this.setUserDesc(map.get(key));
				break;
			case "OVRD_PT":
				this.setOvrdPt(new BigDecimal(map.get(key)));
				break;
		}
	}
}

}