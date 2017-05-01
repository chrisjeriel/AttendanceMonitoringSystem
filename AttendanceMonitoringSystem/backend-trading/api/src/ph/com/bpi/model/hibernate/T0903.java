package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0903 {

private int id;
private String tranIndc;
private String cLName;
private String cFName;
private String cMName;
private BigDecimal accuAmnt;
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
public BigDecimal getAccuAmnt() {
	return accuAmnt;
}
public void setAccuAmnt(BigDecimal accuAmnt) {
	this.accuAmnt = accuAmnt;
}

}