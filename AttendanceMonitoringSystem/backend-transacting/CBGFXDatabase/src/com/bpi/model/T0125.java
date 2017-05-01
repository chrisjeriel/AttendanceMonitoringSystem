package com.bpi.model;

import java.math.BigDecimal;

public class T0125 {

	private int id;
	private String trdrFi;
	private BigDecimal scutTime;
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
	public BigDecimal getScutTime() {
		return scutTime;
	}
	public void setScutTime(BigDecimal scutTime) {
		this.scutTime = scutTime;
	}
	@Override
	public String toString() {
		return "T0125 [id=" + id + ", trdrFi=" + trdrFi + ", scutTime=" + scutTime + "]";
	}

}