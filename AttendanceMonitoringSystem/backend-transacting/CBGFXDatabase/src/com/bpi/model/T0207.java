package com.bpi.model;

import java.math.BigDecimal;

public class T0207 {

	private int id;
	private String trdrFi;
	private String currCode;
	private String drecTag;
	private BigDecimal fcduPrch;
	private BigDecimal fcduSale;
	private BigDecimal notePrch;

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

	public String getDrecTag() {
		return drecTag;
	}

	public void setDrecTag(String drecTag) {
		this.drecTag = drecTag;
	}

	public BigDecimal getFcduPrch() {
		return fcduPrch;
	}

	public void setFcduPrch(BigDecimal fcduPrch) {
		this.fcduPrch = fcduPrch;
	}

	public BigDecimal getFcduSale() {
		return fcduSale;
	}

	public void setFcduSale(BigDecimal fcduSale) {
		this.fcduSale = fcduSale;
	}

	public BigDecimal getNotePrch() {
		return notePrch;
	}

	public void setNotePrch(BigDecimal notePrch) {
		this.notePrch = notePrch;
	}

	@Override
	public String toString() {
		return "T0207 [id=" + id + ", trdrFi=" + trdrFi + ", currCode=" + currCode + ", drecTag=" + drecTag
				+ ", fcduPrch=" + fcduPrch + ", fcduSale=" + fcduSale + ", notePrch=" + notePrch + "]";
	}

}