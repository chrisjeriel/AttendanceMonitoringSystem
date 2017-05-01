package com.bpi.model;

import java.math.BigDecimal;

public class T0301 {

	private int id;
	private BigDecimal dealRate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getDealRate() {
		return dealRate;
	}

	public void setDealRate(BigDecimal dealRate) {
		this.dealRate = dealRate;
	}

	@Override
	public String toString() {
		return "T0301 [id=" + id + ", dealRate=" + dealRate + "]";
	}

}