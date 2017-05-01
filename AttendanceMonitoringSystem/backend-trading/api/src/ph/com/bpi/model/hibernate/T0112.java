package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0112 {

private int id;
private String trdrFi;
private String tranFi;
private String currFrom;
private String currTo;
private BigDecimal acptMode;
private String achrgInd;
private BigDecimal arecStat;
private BigDecimal setlMode;
private String schrgInd;
private BigDecimal srecStat;
private String tranType;
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
public String getTranFi() {
	return tranFi;
}
public void setTranFi(String tranFi) {
	this.tranFi = tranFi;
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
public BigDecimal getAcptMode() {
	return acptMode;
}
public void setAcptMode(BigDecimal acptMode) {
	this.acptMode = acptMode;
}
public String getAchrgInd() {
	return achrgInd;
}
public void setAchrgInd(String achrgInd) {
	this.achrgInd = achrgInd;
}
public BigDecimal getArecStat() {
	return arecStat;
}
public void setArecStat(BigDecimal arecStat) {
	this.arecStat = arecStat;
}
public BigDecimal getSetlMode() {
	return setlMode;
}
public void setSetlMode(BigDecimal setlMode) {
	this.setlMode = setlMode;
}
public String getSchrgInd() {
	return schrgInd;
}
public void setSchrgInd(String schrgInd) {
	this.schrgInd = schrgInd;
}
public BigDecimal getSrecStat() {
	return srecStat;
}
public void setSrecStat(BigDecimal srecStat) {
	this.srecStat = srecStat;
}
public String getTranType() {
	return tranType;
}
public void setTranType(String tranType) {
	this.tranType = tranType;
}

}