package com.bpi.model;

import java.math.BigDecimal;

public class T0011 {

private int id;
private String brchName;
private String fiDesc;
private String userId;
private String lName;
private String fName;
private String mName;
private BigDecimal userType;
private String userDesc;
private String userStat;
private BigDecimal ovrdPt;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrchName() {
	return brchName;
}
public void setBrchName(String brchName) {
	this.brchName = brchName;
}
public String getFiDesc() {
	return fiDesc;
}
public void setFiDesc(String fiDesc) {
	this.fiDesc = fiDesc;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getmName() {
	return mName;
}
public void setmName(String mName) {
	this.mName = mName;
}
public BigDecimal getUserType() {
	return userType;
}
public void setUserType(BigDecimal userType) {
	this.userType = userType;
}
public String getUserDesc() {
	return userDesc;
}
public void setUserDesc(String userDesc) {
	this.userDesc = userDesc;
}
public String getUserStat() {
	return userStat;
}
public void setUserStat(String userStat) {
	this.userStat = userStat;
}
public BigDecimal getOvrdPt() {
	return ovrdPt;
}
public void setOvrdPt(BigDecimal ovrdPt) {
	this.ovrdPt = ovrdPt;
}
@Override
public String toString() {
	return "T0011 [id=" + id + ", brchName=" + brchName + ", fiDesc=" + fiDesc + ", userId=" + userId + ", lName="
			+ lName + ", fName=" + fName + ", mName=" + mName + ", userType=" + userType + ", userDesc=" + userDesc
			+ ", userStat=" + userStat + ", ovrdPt=" + ovrdPt + "]";
}



}