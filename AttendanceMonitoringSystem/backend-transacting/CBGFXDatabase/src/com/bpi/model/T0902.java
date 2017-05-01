package com.bpi.model;

import java.math.BigDecimal;

public class T0902 {

	private int id;
	private String refNmbr;
	private BigDecimal totlAmt;
	private String tranUnit;
	private String currCode;
	private String tcSerNo;
	private BigDecimal tcAmt;

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

	public BigDecimal getTotlAmt() {
		return totlAmt;
	}

	public void setTotlAmt(BigDecimal totlAmt) {
		this.totlAmt = totlAmt;
	}

	public String getTranUnit() {
		return tranUnit;
	}

	public void setTranUnit(String tranUnit) {
		this.tranUnit = tranUnit;
	}

	public String getCurrCode() {
		return currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public String getTcSerNo() {
		return tcSerNo;
	}

	public void setTcSerNo(String tcSerNo) {
		this.tcSerNo = tcSerNo;
	}

	public BigDecimal getTcAmt() {
		return tcAmt;
	}

	public void setTcAmt(BigDecimal tcAmt) {
		this.tcAmt = tcAmt;
	}

	@Override
	public String toString() {
		return "T0902 [id=" + id + ", refNmbr=" + refNmbr + ", totlAmt=" + totlAmt + ", tranUnit=" + tranUnit
				+ ", currCode=" + currCode + ", tcSerNo=" + tcSerNo + ", tcAmt=" + tcAmt + "]";
	}

}