package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0204 {

private int id;
private String trdrFi;
private String currCode;
private BigDecimal usdBId;
private BigDecimal usdOffr;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTrdrFi() {
	return trdrFi;
}

public void setTrdrFi(String trdrFi) {
	this.trdrFi = trdrFi;
}

public String getCurrCode() {
	return currCode;
}

public void setCurrCode(String currCode) {
	this.currCode = currCode;
}

public BigDecimal getUsdBId() {
	return usdBId;
}

public void setUsdBId(BigDecimal usdBId) {
	this.usdBId = usdBId;
}

public BigDecimal getUsdOffr() {
	return usdOffr;
}

public void setUsdOffr(BigDecimal usdOffr) {
	this.usdOffr = usdOffr;
}

public void parse(HashMap<String, String> map){

	for(String key: map.keySet()){
		switch(key){
			case "TRDR_FI":
				trdrFi = (map.get(key));
				break;

			case "CURR_CODE":
				currCode=(map.get(key));
				break;

			case "USD_BID":
				usdBId=new BigDecimal(map.get(key));
				break;

			case "USD_OFFR":
				usdOffr=new BigDecimal(map.get(key));
				break;
		
		}
	}
}
}