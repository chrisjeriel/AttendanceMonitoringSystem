package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0240 {

private int id;
private String trdrFi;
private String origCurr;
private String cntrCurr;
private String drecTag;
private BigDecimal sprdPrch;
private BigDecimal sprdSale;
private BigDecimal rateRefr;
private BigDecimal ratePrch;
private BigDecimal rateSale;
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
public String getOrigCurr() {
	return origCurr;
}
public void setOrigCurr(String origCurr) {
	this.origCurr = origCurr;
}
public String getCntrCurr() {
	return cntrCurr;
}
public void setCntrCurr(String cntrCurr) {
	this.cntrCurr = cntrCurr;
}
public String getDrecTag() {
	return drecTag;
}
public void setDrecTag(String drecTag) {
	this.drecTag = drecTag;
}
public BigDecimal getSprdPrch() {
	return sprdPrch;
}
public void setSprdPrch(BigDecimal sprdPrch) {
	this.sprdPrch = sprdPrch;
}
public BigDecimal getSprdSale() {
	return sprdSale;
}
public void setSprdSale(BigDecimal sprdSale) {
	this.sprdSale = sprdSale;
}
public BigDecimal getRateRefr() {
	return rateRefr;
}
public void setRateRefr(BigDecimal rateRefr) {
	this.rateRefr = rateRefr;
}
public BigDecimal getRatePrch() {
	return ratePrch;
}
public void setRatePrch(BigDecimal ratePrch) {
	this.ratePrch = ratePrch;
}
public BigDecimal getRateSale() {
	return rateSale;
}
public void setRateSale(BigDecimal rateSale) {
	this.rateSale = rateSale;
}

}