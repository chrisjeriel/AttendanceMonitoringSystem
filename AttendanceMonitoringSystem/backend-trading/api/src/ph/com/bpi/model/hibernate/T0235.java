package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0235 {

private int id;
private String trdrFi;
private String currCode;
private BigDecimal fcduPrch;
private BigDecimal fcduSale;
private BigDecimal notePrch;
private BigDecimal ddttPrch;
private BigDecimal sale;

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

public BigDecimal getFcduPrch() {
	return fcduPrch;
}

public void setFcduPrch(BigDecimal fcduPrch) {
	this.fcduPrch = fcduPrch;
}

public BigDecimal getFcduSale() {
	return fcduSale;
}

public void setFcduSale(BigDecimal fcduSale) {
	this.fcduSale = fcduSale;
}

public BigDecimal getNotePrch() {
	return notePrch;
}

public void setNotePrch(BigDecimal notePrch) {
	this.notePrch = notePrch;
}

public BigDecimal getDdttPrch() {
	return ddttPrch;
}

public void setDdttPrch(BigDecimal ddttPrch) {
	this.ddttPrch = ddttPrch;
}

public BigDecimal getSale() {
	return sale;
}

public void setSale(BigDecimal sale) {
	this.sale = sale;
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
		case "FCDU_PRCH":
			fcduPrch=new BigDecimal(map.get(key));
			break;
		case "FCDU_SALE":
			fcduSale=new BigDecimal(map.get(key));
			break;
		case "NOTE_PRCH":
			notePrch=new BigDecimal(map.get(key));
			break;
		case "DDTT_PRCH":
			ddttPrch=new BigDecimal(map.get(key));
			break;
		case "SALE":
			sale=new BigDecimal(map.get(key));
			break;
}
	}
}
}