package com.bpi.model;

import java.math.BigDecimal;

public class T0010 {

	private int id;
	private String fiDesc;
	private String brchCode;
	private String brchName;
	private String userId;
	private String lName;
	private String fName;
	private String mName;
	private String userStat;
	private String userDesc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFiDesc() {
		return fiDesc;
	}

	public void setFiDesc(String fiDesc) {
		this.fiDesc = fiDesc;
	}

	public String getBrchCode() {
		return brchCode;
	}

	public void setBrchCode(String brchCode) {
		this.brchCode = brchCode;
	}

	public String getBrchName() {
		return brchName;
	}

	public void setBrchName(String brchName) {
		this.brchName = brchName;
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

	public String getUserStat() {
		return userStat;
	}

	public void setUserStat(String userStat) {
		this.userStat = userStat;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	@Override
	public String toString() {
		return "T0010 [id=" + id + ", fiDesc=" + fiDesc + ", brchCode=" + brchCode + ", brchName=" + brchName
				+ ", userId=" + userId + ", lName=" + lName + ", fName=" + fName + ", mName=" + mName + ", userStat="
				+ userStat + ", userDesc=" + userDesc + "]";
	}

}