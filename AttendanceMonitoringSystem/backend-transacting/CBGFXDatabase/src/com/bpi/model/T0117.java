package com.bpi.model;

import java.math.BigDecimal;

public class T0117 {

	private int id;
	private String brchCode;
	private String brchPcc;
	private String brchName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrchCode() {
		return brchCode;
	}

	public void setBrchCode(String brchCode) {
		this.brchCode = brchCode;
	}

	public String getBrchPcc() {
		return brchPcc;
	}

	public void setBrchPcc(String brchPcc) {
		this.brchPcc = brchPcc;
	}

	public String getBrchName() {
		return brchName;
	}

	public void setBrchName(String brchName) {
		this.brchName = brchName;
	}

	@Override
	public String toString() {
		return "T0117 [id=" + id + ", brchCode=" + brchCode + ", brchPcc=" + brchPcc + ", brchName=" + brchName + "]";
	}

}