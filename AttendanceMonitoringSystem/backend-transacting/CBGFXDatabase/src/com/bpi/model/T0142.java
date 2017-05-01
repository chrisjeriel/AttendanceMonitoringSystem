package com.bpi.model;

public class T0142 {

	private int id;
	private String applCode;
	private String applDesc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApplCode() {
		return applCode;
	}

	public void setApplCode(String applCode) {
		this.applCode = applCode;
	}

	public String getApplDesc() {
		return applDesc;
	}

	public void setApplDesc(String applDesc) {
		this.applDesc = applDesc;
	}

	@Override
	public String toString() {
		return "T0142 [id=" + id + ", applCode=" + applCode + ", applDesc=" + applDesc + "]";
	}

}