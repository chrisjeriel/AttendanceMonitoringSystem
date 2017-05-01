package com.bpi.model;

import java.math.BigDecimal;

public class T0901 {

	private int id;
	private String trdrFi;
	private BigDecimal runBal;
	private String refNmbr;
	private String mcSerNo;
	private String cLName;
	private String cFName;
	private String cMName;
	private BigDecimal phpAmt;

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

	public BigDecimal getRunBal() {
		return runBal;
	}

	public void setRunBal(BigDecimal runBal) {
		this.runBal = runBal;
	}

	public String getRefNmbr() {
		return refNmbr;
	}

	public void setRefNmbr(String refNmbr) {
		this.refNmbr = refNmbr;
	}

	public String getMcSerNo() {
		return mcSerNo;
	}

	public void setMcSerNo(String mcSerNo) {
		this.mcSerNo = mcSerNo;
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

	public BigDecimal getPhpAmt() {
		return phpAmt;
	}

	public void setPhpAmt(BigDecimal phpAmt) {
		this.phpAmt = phpAmt;
	}

	@Override
	public String toString() {
		return "T0901 [id=" + id + ", trdrFi=" + trdrFi + ", runBal=" + runBal + ", refNmbr=" + refNmbr + ", mcSerNo="
				+ mcSerNo + ", cLName=" + cLName + ", cFName=" + cFName + ", cMName=" + cMName + ", phpAmt=" + phpAmt
				+ "]";
	}

}