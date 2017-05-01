package com.bpi.model;

import java.math.BigDecimal;

public class T0118 {

	private int id;
	private String currCode;
	private String currBpi;
	private String currCasa;
	private String currDesc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurrCode() {
		return currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public String getCurrBpi() {
		return currBpi;
	}

	public void setCurrBpi(String currBpi) {
		this.currBpi = currBpi;
	}

	public String getCurrCasa() {
		return currCasa;
	}

	public void setCurrCasa(String currCasa) {
		this.currCasa = currCasa;
	}

	public String getCurrDesc() {
		return currDesc;
	}

	public void setCurrDesc(String currDesc) {
		this.currDesc = currDesc;
	}

	@Override
	public String toString() {
		return "T0118 [id=" + id + ", currCode=" + currCode + ", currBpi=" + currBpi + ", currCasa=" + currCasa
				+ ", currDesc=" + currDesc + "]";
	}

}