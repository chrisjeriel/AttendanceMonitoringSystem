package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0307 {

private int id;
private String tranIndc;
private String cLName;
private String cFName;
private String cMName;
private BigDecimal bday;
private String tin;
private String cAddr1;
private String cAddr2;
private String tel;
private String tranDate;
private String tranTime;
private String tranUnit;
private String refNo;
private String currFrom;
private String currTo;
private BigDecimal tranAmnt;
private BigDecimal usdAmnt;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTranIndc() {
	return tranIndc;
}
public void setTranIndc(String tranIndc) {
	this.tranIndc = tranIndc;
}
public String getcLName() {
	return cLName;
}
public void setcLName(String cLName) {
	this.cLName = cLName;
}
public String getcFName() {
	return cFName;
}
public void setcFName(String cFName) {
	this.cFName = cFName;
}
public String getcMName() {
	return cMName;
}
public void setcMName(String cMName) {
	this.cMName = cMName;
}
public BigDecimal getBday() {
	return bday;
}
public void setBday(BigDecimal bday) {
	this.bday = bday;
}
public String getTin() {
	return tin;
}
public void setTin(String tin) {
	this.tin = tin;
}
public String getcAddr1() {
	return cAddr1;
}
public void setcAddr1(String cAddr1) {
	this.cAddr1 = cAddr1;
}
public String getcAddr2() {
	return cAddr2;
}
public void setcAddr2(String cAddr2) {
	this.cAddr2 = cAddr2;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getTranDate() {
	return tranDate;
}
public void setTranDate(String tranDate) {
	this.tranDate = tranDate;
}
public String getTranTime() {
	return tranTime;
}
public void setTranTime(String tranTime) {
	this.tranTime = tranTime;
}
public String getTranUnit() {
	return tranUnit;
}
public void setTranUnit(String tranUnit) {
	this.tranUnit = tranUnit;
}
public String getRefNo() {
	return refNo;
}
public void setRefNo(String refNo) {
	this.refNo = refNo;
}
public String getCurrFrom() {
	return currFrom;
}
public void setCurrFrom(String currFrom) {
	this.currFrom = currFrom;
}
public String getCurrTo() {
	return currTo;
}
public void setCurrTo(String currTo) {
	this.currTo = currTo;
}
public BigDecimal getTranAmnt() {
	return tranAmnt;
}
public void setTranAmnt(BigDecimal tranAmnt) {
	this.tranAmnt = tranAmnt;
}
public BigDecimal getUsdAmnt() {
	return usdAmnt;
}
public void setUsdAmnt(BigDecimal usdAmnt) {
	this.usdAmnt = usdAmnt;
}

}