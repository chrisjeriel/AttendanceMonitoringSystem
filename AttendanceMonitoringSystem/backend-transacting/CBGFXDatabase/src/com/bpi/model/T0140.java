package com.bpi.model;

import java.math.BigDecimal;

public class T0140 {

	private int id;
	private BigDecimal userType;
	private String userDesc;
	private BigDecimal ovrdPt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public BigDecimal getOvrdPt() {
		return ovrdPt;
	}

	public void setOvrdPt(BigDecimal ovrdPt) {
		this.ovrdPt = ovrdPt;
	}

	@Override
	public String toString() {
		return "T0140 [id=" + id + ", userType=" + userType + ", userDesc=" + userDesc + ", ovrdPt=" + ovrdPt + "]";
	}

}