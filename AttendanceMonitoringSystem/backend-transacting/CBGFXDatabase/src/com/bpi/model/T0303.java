package com.bpi.model;

import java.math.BigDecimal;

public class T0303 {

	private int id;
	private BigDecimal equiAmnt;
	private BigDecimal acptDocs;
	private BigDecimal acptComm;
	private BigDecimal setlDocs;
	private BigDecimal setlComm;
	private BigDecimal acptPost;
	private BigDecimal setlPost;
	private BigDecimal netAmnt;
	private BigDecimal ovrdPt;
	private BigDecimal tranTag;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getEquiAmnt() {
		return equiAmnt;
	}

	public void setEquiAmnt(BigDecimal equiAmnt) {
		this.equiAmnt = equiAmnt;
	}

	public BigDecimal getAcptDocs() {
		return acptDocs;
	}

	public void setAcptDocs(BigDecimal acptDocs) {
		this.acptDocs = acptDocs;
	}

	public BigDecimal getAcptComm() {
		return acptComm;
	}

	public void setAcptComm(BigDecimal acptComm) {
		this.acptComm = acptComm;
	}

	public BigDecimal getSetlDocs() {
		return setlDocs;
	}

	public void setSetlDocs(BigDecimal setlDocs) {
		this.setlDocs = setlDocs;
	}

	public BigDecimal getSetlComm() {
		return setlComm;
	}

	public void setSetlComm(BigDecimal setlComm) {
		this.setlComm = setlComm;
	}

	public BigDecimal getAcptPost() {
		return acptPost;
	}

	public void setAcptPost(BigDecimal acptPost) {
		this.acptPost = acptPost;
	}

	public BigDecimal getSetlPost() {
		return setlPost;
	}

	public void setSetlPost(BigDecimal setlPost) {
		this.setlPost = setlPost;
	}

	public BigDecimal getNetAmnt() {
		return netAmnt;
	}

	public void setNetAmnt(BigDecimal netAmnt) {
		this.netAmnt = netAmnt;
	}

	public BigDecimal getOvrdPt() {
		return ovrdPt;
	}

	public void setOvrdPt(BigDecimal ovrdPt) {
		this.ovrdPt = ovrdPt;
	}

	public BigDecimal getTranTag() {
		return tranTag;
	}

	public void setTranTag(BigDecimal tranTag) {
		this.tranTag = tranTag;
	}

	@Override
	public String toString() {
		return "T0303 [id=" + id + ", equiAmnt=" + equiAmnt + ", acptDocs=" + acptDocs + ", acptComm=" + acptComm
				+ ", setlDocs=" + setlDocs + ", setlComm=" + setlComm + ", acptPost=" + acptPost + ", setlPost="
				+ setlPost + ", netAmnt=" + netAmnt + ", ovrdPt=" + ovrdPt + ", tranTag=" + tranTag + "]";
	}

}