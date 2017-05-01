package com.bpi.model;

import java.math.BigDecimal;

public class T0908 {

	private int id;
	private String trdrFi;
	private BigDecimal regAmnt;
	private BigDecimal fcdAmnt;

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

	public BigDecimal getRegAmnt() {
		return regAmnt;
	}

	public void setRegAmnt(BigDecimal regAmnt) {
		this.regAmnt = regAmnt;
	}

	public BigDecimal getFcdAmnt() {
		return fcdAmnt;
	}

	public void setFcdAmnt(BigDecimal fcdAmnt) {
		this.fcdAmnt = fcdAmnt;
	}

	@Override
	public String toString() {
		return "T0908 [id=" + id + ", trdrFi=" + trdrFi + ", regAmnt=" + regAmnt + ", fcdAmnt=" + fcdAmnt + "]";
	}

}