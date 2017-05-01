package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class TFFM1 {

private int id;
private String tranType;
private String rqstType;
private String tranUnit;
private String refNmbr;
private String tranTime;
private String currFrom;
private String currTo;
private BigDecimal tranAmnt;
private BigDecimal eqvlAmnt;
private BigDecimal dealRate;
private BigDecimal rqstRate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTranType() {
	return tranType;
}
public void setTranType(String tranType) {
	this.tranType = tranType;
}
public String getRqstType() {
	return rqstType;
}
public void setRqstType(String rqstType) {
	this.rqstType = rqstType;
}
public String getTranUnit() {
	return tranUnit;
}
public void setTranUnit(String tranUnit) {
	this.tranUnit = tranUnit;
}
public String getRefNmbr() {
	return refNmbr;
}
public void setRefNmbr(String refNmbr) {
	this.refNmbr = refNmbr;
}
public String getTranTime() {
	return tranTime;
}
public void setTranTime(String tranTime) {
	this.tranTime = tranTime;
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
public BigDecimal getEqvlAmnt() {
	return eqvlAmnt;
}
public void setEqvlAmnt(BigDecimal eqvlAmnt) {
	this.eqvlAmnt = eqvlAmnt;
}
public BigDecimal getDealRate() {
	return dealRate;
}
public void setDealRate(BigDecimal dealRate) {
	this.dealRate = dealRate;
}
public BigDecimal getRqstRate() {
	return rqstRate;
}
public void setRqstRate(BigDecimal rqstRate) {
	this.rqstRate = rqstRate;
}

}