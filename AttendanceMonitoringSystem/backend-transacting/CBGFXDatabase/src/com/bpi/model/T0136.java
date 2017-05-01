package com.bpi.model;

import java.math.BigDecimal;

public class T0136 {

	private int id;
	private String trdrFi;
	private BigDecimal intrLmit;

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

	public BigDecimal getIntrLmit() {
		return intrLmit;
	}

	public void setIntrLmit(BigDecimal intrLmit) {
		this.intrLmit = intrLmit;
	}

	@Override
	public String toString() {
		return "T0136 [id=" + id + ", trdrFi=" + trdrFi + ", intrLmit=" + intrLmit + "]";
	}

}