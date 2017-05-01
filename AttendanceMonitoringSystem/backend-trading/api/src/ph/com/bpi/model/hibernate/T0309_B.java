package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0309_B {

private int id;
private String refNmbr;
private BigDecimal acctNmbr;
private BigDecimal tranAmnt;
private BigDecimal eqvlAmnt;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRefNmbr() {
	return refNmbr;
}
public void setRefNmbr(String refNmbr) {
	this.refNmbr = refNmbr;
}
public BigDecimal getAcctNmbr() {
	return acctNmbr;
}
public void setAcctNmbr(BigDecimal acctNmbr) {
	this.acctNmbr = acctNmbr;
}
public BigDecimal getTranAmnt() {
	return tranAmnt;
}
public void setTranAmnt(BigDecimal tranAmnt) {
	this.tranAmnt = tranAmnt;
}
public BigDecimal getEqvlAmnt() {
	return eqvlAmnt;
}
public void setEqvlAmnt(BigDecimal eqvlAmnt) {
	this.eqvlAmnt = eqvlAmnt;
}

}