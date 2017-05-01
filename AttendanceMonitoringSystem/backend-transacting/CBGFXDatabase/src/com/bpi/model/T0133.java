package com.bpi.model;

import java.math.BigDecimal;

public class T0133 {

	private int id;
	private String tranFi;
	private String tranDesc;
	private String trdrTag;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTranFi() {
		return tranFi;
	}

	public void setTranFi(String tranFi) {
		this.tranFi = tranFi;
	}

	public String getTranDesc() {
		return tranDesc;
	}

	public void setTranDesc(String tranDesc) {
		this.tranDesc = tranDesc;
	}

	public String getTrdrTag() {
		return trdrTag;
	}

	public void setTrdrTag(String trdrTag) {
		this.trdrTag = trdrTag;
	}

	@Override
	public String toString() {
		return "T0133 [id=" + id + ", tranFi=" + tranFi + ", tranDesc=" + tranDesc + ", trdrTag=" + trdrTag + "]";
	}

}