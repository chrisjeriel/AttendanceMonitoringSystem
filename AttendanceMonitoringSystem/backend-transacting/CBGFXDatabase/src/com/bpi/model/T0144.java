package com.bpi.model;

import java.math.BigDecimal;

public class T0144 {

	private int id;
	private String ptrckIndc;
	private BigDecimal ptrckDays;
	private BigDecimal ptrckAmnt;
	private String strckIndc;
	private BigDecimal strckDays;
	private BigDecimal strckAmnt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPtrckIndc() {
		return ptrckIndc;
	}

	public void setPtrckIndc(String ptrckIndc) {
		this.ptrckIndc = ptrckIndc;
	}

	public BigDecimal getPtrckDays() {
		return ptrckDays;
	}

	public void setPtrckDays(BigDecimal ptrckDays) {
		this.ptrckDays = ptrckDays;
	}

	public BigDecimal getPtrckAmnt() {
		return ptrckAmnt;
	}

	public void setPtrckAmnt(BigDecimal ptrckAmnt) {
		this.ptrckAmnt = ptrckAmnt;
	}

	public String getStrckIndc() {
		return strckIndc;
	}

	public void setStrckIndc(String strckIndc) {
		this.strckIndc = strckIndc;
	}

	public BigDecimal getStrckDays() {
		return strckDays;
	}

	public void setStrckDays(BigDecimal strckDays) {
		this.strckDays = strckDays;
	}

	public BigDecimal getStrckAmnt() {
		return strckAmnt;
	}

	public void setStrckAmnt(BigDecimal strckAmnt) {
		this.strckAmnt = strckAmnt;
	}

	@Override
	public String toString() {
		return "T0144 [id=" + id + ", ptrckIndc=" + ptrckIndc + ", ptrckDays=" + ptrckDays + ", ptrckAmnt=" + ptrckAmnt
				+ ", strckIndc=" + strckIndc + ", strckDays=" + strckDays + ", strckAmnt=" + strckAmnt + "]";
	}

}