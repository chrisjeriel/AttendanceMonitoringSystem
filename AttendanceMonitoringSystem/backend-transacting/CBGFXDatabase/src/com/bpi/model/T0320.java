package com.bpi.model;

import java.math.BigDecimal;

public class T0320 {

	private int id;
	private String tranTrdr;
	private String tranIndc;
	private String refNmbr;
	private String cLName;
	private String cFName;
	private String cMName;
	private String addr1;
	private String addr2;
	private BigDecimal acptMode;
	private String currFr;
	private BigDecimal tranAmnt;
	private BigDecimal setlMode;
	private String currTo;
	private BigDecimal equiAmnt;
	private BigDecimal grntRate;
	private String statRqst;
	private String brchCode;
	private BigDecimal rqstRate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTranTrdr() {
		return tranTrdr;
	}

	public void setTranTrdr(String tranTrdr) {
		this.tranTrdr = tranTrdr;
	}

	public String getTranIndc() {
		return tranIndc;
	}

	public void setTranIndc(String tranIndc) {
		this.tranIndc = tranIndc;
	}

	public String getRefNmbr() {
		return refNmbr;
	}

	public void setRefNmbr(String refNmbr) {
		this.refNmbr = refNmbr;
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

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public BigDecimal getAcptMode() {
		return acptMode;
	}

	public void setAcptMode(BigDecimal acptMode) {
		this.acptMode = acptMode;
	}

	public String getCurrFr() {
		return currFr;
	}

	public void setCurrFr(String currFr) {
		this.currFr = currFr;
	}

	public BigDecimal getTranAmnt() {
		return tranAmnt;
	}

	public void setTranAmnt(BigDecimal tranAmnt) {
		this.tranAmnt = tranAmnt;
	}

	public BigDecimal getSetlMode() {
		return setlMode;
	}

	public void setSetlMode(BigDecimal setlMode) {
		this.setlMode = setlMode;
	}

	public String getCurrTo() {
		return currTo;
	}

	public void setCurrTo(String currTo) {
		this.currTo = currTo;
	}

	public BigDecimal getEquiAmnt() {
		return equiAmnt;
	}

	public void setEquiAmnt(BigDecimal equiAmnt) {
		this.equiAmnt = equiAmnt;
	}

	public BigDecimal getGrntRate() {
		return grntRate;
	}

	public void setGrntRate(BigDecimal grntRate) {
		this.grntRate = grntRate;
	}

	public String getStatRqst() {
		return statRqst;
	}

	public void setStatRqst(String statRqst) {
		this.statRqst = statRqst;
	}

	public String getBrchCode() {
		return brchCode;
	}

	public void setBrchCode(String brchCode) {
		this.brchCode = brchCode;
	}

	public BigDecimal getRqstRate() {
		return rqstRate;
	}

	public void setRqstRate(BigDecimal rqstRate) {
		this.rqstRate = rqstRate;
	}

	@Override
	public String toString() {
		return "T0320 [id=" + id + ", tranTrdr=" + tranTrdr + ", tranIndc=" + tranIndc + ", refNmbr=" + refNmbr
				+ ", cLName=" + cLName + ", cFName=" + cFName + ", cMName=" + cMName + ", addr1=" + addr1 + ", addr2="
				+ addr2 + ", acptMode=" + acptMode + ", currFr=" + currFr + ", tranAmnt=" + tranAmnt + ", setlMode="
				+ setlMode + ", currTo=" + currTo + ", equiAmnt=" + equiAmnt + ", grntRate=" + grntRate + ", statRqst="
				+ statRqst + ", brchCode=" + brchCode + ", rqstRate=" + rqstRate + "]";
	}

}