package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0900 {

private int id;
private String trdrFi;
private String refNmbr;
private String mcSerNo;
private String cLName;
private String cFName;
private String cMName;
private BigDecimal phpAmt;
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
public String getRefNmbr() {
	return refNmbr;
}
public void setRefNmbr(String refNmbr) {
	this.refNmbr = refNmbr;
}
public String getMcSerNo() {
	return mcSerNo;
}
public void setMcSerNo(String mcSerNo) {
	this.mcSerNo = mcSerNo;
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
public BigDecimal getPhpAmt() {
	return phpAmt;
}
public void setPhpAmt(BigDecimal phpAmt) {
	this.phpAmt = phpAmt;
}

}