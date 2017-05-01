package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0208 {

private int id;
private String trdrFi;
private String currCode;
private String drecTag;
private BigDecimal fcduPrch;
private BigDecimal fcduSale;
private BigDecimal notePrch;


public BigDecimal getNotePrch() {
	return notePrch;
}

public void setNotePrch(BigDecimal notePrch) {
	this.notePrch = notePrch;
}

public void setTrdrFi(String trdrFi) {
	this.trdrFi = trdrFi;
}

public void setCurrCode(String currCode) {
	this.currCode = currCode;
}

public void setDrecTag(String drecTag) {
	this.drecTag = drecTag;
}

public void setFcduPrch(BigDecimal fcduPrch) {
	this.fcduPrch = fcduPrch;
}

public void setFcduSale(BigDecimal fcduSale) {
	this.fcduSale = fcduSale;
}

public String getTrdrFi(){
	return trdrFi;
}

public String getCurrCode(){
	return currCode;
}

public String getDrecTag(){
	return drecTag;
}
public BigDecimal getFcduPrch(){
	return fcduPrch;
}
public BigDecimal getFcduSale(){
	return fcduSale;
}
public BigDecimal getNotePtch(){
	return notePrch;
}

public void parse(HashMap<String, String> map){
for(String key: map.keySet()){
	switch(key){
		case "TRDR_FI":
			trdrFi = (map.get(key));
			break;
		case "DREC_TAG":
			drecTag = (map.get(key));
			break;
	

		case "CURR_CODE":
			currCode=(map.get(key));
			break;
		case "FCDU_PRCH":
			fcduPrch=new BigDecimal(map.get(key));
			break;
		case "FCDU_SALE":
			fcduSale=new BigDecimal(map.get(key));
			break;
		case "NOTE_PRCH":
			notePrch=new BigDecimal(map.get(key));
			break;
	
		
}
	}
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
}