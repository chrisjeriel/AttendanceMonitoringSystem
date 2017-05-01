package com.bpi.model;

import java.math.BigDecimal;

public class T0212 {

	private int id;
	private String trdrFi;
	private String currCode;
	private String updtTag;

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

	public String getCurrCode() {
		return currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public String getUpdtTag() {
		return updtTag;
	}

	public void setUpdtTag(String updtTag) {
		this.updtTag = updtTag;
	}

	@Override
	public String toString() {
		return "T0212 [id=" + id + ", trdrFi=" + trdrFi + ", currCode=" + currCode + ", updtTag=" + updtTag + "]";
	}

}