package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0502 {

private int id;
private String tranFi;
private String tranUnit;
private String currCode;
private BigDecimal seqNo;
private BigDecimal amount;
private String userId;
private String termId;
private BigDecimal timeStmp;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTranFi() {
	return tranFi;
}
public void setTranFi(String tranFi) {
	this.tranFi = tranFi;
}
public String getTranUnit() {
	return tranUnit;
}
public void setTranUnit(String tranUnit) {
	this.tranUnit = tranUnit;
}
public String getCurrCode() {
	return currCode;
}
public void setCurrCode(String currCode) {
	this.currCode = currCode;
}
public BigDecimal getSeqNo() {
	return seqNo;
}
public void setSeqNo(BigDecimal seqNo) {
	this.seqNo = seqNo;
}
public BigDecimal getAmount() {
	return amount;
}
public void setAmount(BigDecimal amount) {
	this.amount = amount;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getTermId() {
	return termId;
}
public void setTermId(String termId) {
	this.termId = termId;
}
public BigDecimal getTimeStmp() {
	return timeStmp;
}
public void setTimeStmp(BigDecimal timeStmp) {
	this.timeStmp = timeStmp;
}

}