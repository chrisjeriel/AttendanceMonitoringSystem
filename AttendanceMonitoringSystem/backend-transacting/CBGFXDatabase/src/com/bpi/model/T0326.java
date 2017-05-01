package com.bpi.model;

import java.math.BigDecimal;

public class T0326 {

	private int id;
	private String refNmbr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRefNmbr() {
		return refNmbr;
	}

	public void setRefNmbr(String refNmbr) {
		this.refNmbr = refNmbr;
	}

	@Override
	public String toString() {
		return "T0326 [id=" + id + ", refNmbr=" + refNmbr + "]";
	}

}