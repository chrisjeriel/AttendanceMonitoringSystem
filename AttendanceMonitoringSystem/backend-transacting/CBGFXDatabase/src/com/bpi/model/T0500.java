package com.bpi.model;

import java.math.BigDecimal;

public class T0500 {

	private int id;
	private String tranFi;
	private String tranUnit;
	private String currCode;
	private BigDecimal mIflow;
	private BigDecimal tIflow;
	private BigDecimal mOflow;
	private BigDecimal tOflow;
	private BigDecimal runnBaln;

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

	public BigDecimal getmIflow() {
		return mIflow;
	}

	public void setmIflow(BigDecimal mIflow) {
		this.mIflow = mIflow;
	}

	public BigDecimal gettIflow() {
		return tIflow;
	}

	public void settIflow(BigDecimal tIflow) {
		this.tIflow = tIflow;
	}

	public BigDecimal getmOflow() {
		return mOflow;
	}

	public void setmOflow(BigDecimal mOflow) {
		this.mOflow = mOflow;
	}

	public BigDecimal gettOflow() {
		return tOflow;
	}

	public void settOflow(BigDecimal tOflow) {
		this.tOflow = tOflow;
	}

	public BigDecimal getRunnBaln() {
		return runnBaln;
	}

	public void setRunnBaln(BigDecimal runnBaln) {
		this.runnBaln = runnBaln;
	}

	@Override
	public String toString() {
		return "T0500 [id=" + id + ", tranFi=" + tranFi + ", tranUnit=" + tranUnit + ", currCode=" + currCode
				+ ", mIflow=" + mIflow + ", tIflow=" + tIflow + ", mOflow=" + mOflow + ", tOflow=" + tOflow
				+ ", runnBaln=" + runnBaln + "]";
	}

}