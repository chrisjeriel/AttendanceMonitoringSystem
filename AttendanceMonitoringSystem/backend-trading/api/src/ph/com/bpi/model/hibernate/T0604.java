package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0604 {

private int id;
private String trdrFi;
private String tranIndc;
private String bank;
private String book;
private String refrNmbr;
private String acptCurr;
private String setlCurr;
private BigDecimal tranAmnt;
private BigDecimal sqreRate;
private BigDecimal eqvlAmnt;
private String unldType;
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
public String getTranIndc() {
	return tranIndc;
}
public void setTranIndc(String tranIndc) {
	this.tranIndc = tranIndc;
}
public String getBank() {
	return bank;
}
public void setBank(String bank) {
	this.bank = bank;
}
public String getBook() {
	return book;
}
public void setBook(String book) {
	this.book = book;
}
public String getRefrNmbr() {
	return refrNmbr;
}
public void setRefrNmbr(String refrNmbr) {
	this.refrNmbr = refrNmbr;
}
public String getAcptCurr() {
	return acptCurr;
}
public void setAcptCurr(String acptCurr) {
	this.acptCurr = acptCurr;
}
public String getSetlCurr() {
	return setlCurr;
}
public void setSetlCurr(String setlCurr) {
	this.setlCurr = setlCurr;
}
public BigDecimal getTranAmnt() {
	return tranAmnt;
}
public void setTranAmnt(BigDecimal tranAmnt) {
	this.tranAmnt = tranAmnt;
}
public BigDecimal getSqreRate() {
	return sqreRate;
}
public void setSqreRate(BigDecimal sqreRate) {
	this.sqreRate = sqreRate;
}
public BigDecimal getEqvlAmnt() {
	return eqvlAmnt;
}
public void setEqvlAmnt(BigDecimal eqvlAmnt) {
	this.eqvlAmnt = eqvlAmnt;
}
public String getUnldType() {
	return unldType;
}
public void setUnldType(String unldType) {
	this.unldType = unldType;
}

}