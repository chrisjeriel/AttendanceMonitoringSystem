package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0138 {

private int id;
private BigDecimal userType;
private String tranFi;
private String userAccs;

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

public String getTranFi() {
	return tranFi;
}

public void setTranFi(String tranFi) {
	this.tranFi = tranFi;
}

public String getUserAccs() {
	return userAccs;
}

public void setUserAccs(String userAccs) {
	this.userAccs = userAccs;
}

public void parse(HashMap<String, String> map){
for(String key: map.keySet()){
	switch(key){
		case "USER_TYPE":
			userType = new BigDecimal(map.get(key));
			break;

	

		case "TRAN_FI":
			tranFi=(map.get(key));
			break;
		case "USER_ACCS":
			userAccs=(map.get(key));
			break;
}
	}
}
}