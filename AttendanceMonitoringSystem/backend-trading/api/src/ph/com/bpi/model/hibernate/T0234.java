package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0234 {

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

}