package com.bpi.model;

import java.math.BigDecimal;

public class T0200 {

	private int id;
	private String trdrFi;
	private String tranFi;
	private BigDecimal rateType;
	private String rateDesc;

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

	public String getTranFi() {
		return tranFi;
	}

	public void setTranFi(String tranFi) {
		this.tranFi = tranFi;
	}

	public BigDecimal getRateType() {
		return rateType;
	}

	public void setRateType(BigDecimal rateType) {
		this.rateType = rateType;
	}

	public String getRateDesc() {
		return rateDesc;
	}

	public void setRateDesc(String rateDesc) {
		this.rateDesc = rateDesc;
	}

	@Override
	public String toString() {
		return "T0200 [id=" + id + ", trdrFi=" + trdrFi + ", tranFi=" + tranFi + ", rateType=" + rateType
				+ ", rateDesc=" + rateDesc + "]";
	}

}