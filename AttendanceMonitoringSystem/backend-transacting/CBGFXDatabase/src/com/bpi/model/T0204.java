package com.bpi.model;

import java.math.BigDecimal;

public class T0204 {

	private int id;
	private String trdrFi;
	private String currCode;
	private BigDecimal usdBId;
	private BigDecimal usdOffr;

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

	public BigDecimal getUsdBId() {
		return usdBId;
	}

	public void setUsdBId(BigDecimal usdBId) {
		this.usdBId = usdBId;
	}

	public BigDecimal getUsdOffr() {
		return usdOffr;
	}

	public void setUsdOffr(BigDecimal usdOffr) {
		this.usdOffr = usdOffr;
	}

	@Override
	public String toString() {
		return "T0204 [id=" + id + ", trdrFi=" + trdrFi + ", currCode=" + currCode + ", usdBId=" + usdBId + ", usdOffr="
				+ usdOffr + "]";
	}

}