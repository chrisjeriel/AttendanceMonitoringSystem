package com.bpi.model;

import java.math.BigDecimal;

public class T0333 {

	private int id;
	private String clntName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClntName() {
		return clntName;
	}

	public void setClntName(String clntName) {
		this.clntName = clntName;
	}

	@Override
	public String toString() {
		return "T0333 [id=" + id + ", clntName=" + clntName + "]";
	}

}