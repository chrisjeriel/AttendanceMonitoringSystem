package com.bpi.model;

import java.math.BigDecimal;

public class T0001 {

private int id;
private String gUserId;
private BigDecimal gUserType;
private String brchName;
private String procDate;
private String userAccs;
private String gTranFi;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getgUserId() {
	return gUserId;
}
public void setgUserId(String gUserId) {
	this.gUserId = gUserId;
}
public BigDecimal getgUserType() {
	return gUserType;
}
public void setgUserType(BigDecimal gUserType) {
	this.gUserType = gUserType;
}
public String getBrchName() {
	return brchName;
}
public void setBrchName(String brchName) {
	this.brchName = brchName;
}
public String getProcDate() {
	return procDate;
}
public void setProcDate(String procDate) {
	this.procDate = procDate;
}
public String getUserAccs() {
	return userAccs;
}
public void setUserAccs(String userAccs) {
	this.userAccs = userAccs;
}
public String getgTranFi() {
	return gTranFi;
}
public void setgTranFi(String gTranFi) {
	this.gTranFi = gTranFi;
}
@Override
public String toString() {
	return "T0001 [id=" + id + ", gUserId=" + gUserId + ", gUserType=" + gUserType + ", brchName=" + brchName
			+ ", procDate=" + procDate + ", userAccs=" + userAccs + ", gTranFi=" + gTranFi + "]";
}

}