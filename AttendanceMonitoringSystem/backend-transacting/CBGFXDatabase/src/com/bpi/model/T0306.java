package com.bpi.model;

import java.math.BigDecimal;

public class T0306 {

	private int id;
	private String cLName;
	private String cFName;
	private String cMName;
	private String tranIndc;
	private BigDecimal accmUsd;
	private BigDecimal convAmnt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getTranIndc() {
		return tranIndc;
	}

	public void setTranIndc(String tranIndc) {
		this.tranIndc = tranIndc;
	}

	public BigDecimal getAccmUsd() {
		return accmUsd;
	}

	public void setAccmUsd(BigDecimal accmUsd) {
		this.accmUsd = accmUsd;
	}

	public BigDecimal getConvAmnt() {
		return convAmnt;
	}

	public void setConvAmnt(BigDecimal convAmnt) {
		this.convAmnt = convAmnt;
	}

	@Override
	public String toString() {
		return "T0306 [id=" + id + ", cLName=" + cLName + ", cFName=" + cFName + ", cMName=" + cMName + ", tranIndc="
				+ tranIndc + ", accmUsd=" + accmUsd + ", convAmnt=" + convAmnt + "]";
	}

}