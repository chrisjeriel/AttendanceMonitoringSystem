package com.bpi.model;

import java.math.BigDecimal;

public class T0334 {

	private int id;
	private String tranIndc;
	private String cLName;
	private String cFName;
	private String cMName;
	private BigDecimal accmAmnt;
	private BigDecimal accmAmnt2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTranIndc() {
		return tranIndc;
	}

	public void setTranIndc(String tranIndc) {
		this.tranIndc = tranIndc;
	}

	public String getcLName() {
		return cLName;
	}

	public void setcLName(String cLName) {
		this.cLName = cLName;
	}

	public String getcFName() {
		return cFName;
	}

	public void setcFName(String cFName) {
		this.cFName = cFName;
	}

	public String getcMName() {
		return cMName;
	}

	public void setcMName(String cMName) {
		this.cMName = cMName;
	}

	public BigDecimal getAccmAmnt() {
		return accmAmnt;
	}

	public void setAccmAmnt(BigDecimal accmAmnt) {
		this.accmAmnt = accmAmnt;
	}

	public BigDecimal getAccmAmnt2() {
		return accmAmnt2;
	}

	public void setAccmAmnt2(BigDecimal accmAmnt2) {
		this.accmAmnt2 = accmAmnt2;
	}

	@Override
	public String toString() {
		return "T0334 [id=" + id + ", tranIndc=" + tranIndc + ", cLName=" + cLName + ", cFName=" + cFName + ", cMName="
				+ cMName + ", accmAmnt=" + accmAmnt + ", accmAmnt2=" + accmAmnt2 + "]";
	}

}