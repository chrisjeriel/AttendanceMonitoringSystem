package com.bpi.model;

import java.math.BigDecimal;

public class T0130 {

	private int id;
	private String trdrFi;
	private String trdrDesc;
	private String trdrGlcd;
	private String trdrUnld;
	private String tranFi;

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

	public String getTrdrDesc() {
		return trdrDesc;
	}

	public void setTrdrDesc(String trdrDesc) {
		this.trdrDesc = trdrDesc;
	}

	public String getTrdrGlcd() {
		return trdrGlcd;
	}

	public void setTrdrGlcd(String trdrPcc) {
		this.trdrGlcd = trdrGlcd;
	}

	public String getTrdrUnld() {
		return trdrUnld;
	}

	public void setTrdrUnld(String trdrUnld) {
		this.trdrUnld = trdrUnld;
	}

	public String getTranFi() {
		return tranFi;
	}

	public void setTranFi(String tranFi) {
		this.tranFi = tranFi;
	}

	@Override
	public String toString() {
		return "T0130 [id=" + id + ", trdrFi=" + trdrFi + ", trdrDesc=" + trdrDesc + ", trdrGlcd=" + trdrGlcd
				+ ", trdrUnld=" + trdrUnld + ", tranFi=" + tranFi + "]";
	}

}