package com.bpi.model;

import java.math.BigDecimal;

public class T0114 {

	private int id;
	private BigDecimal modeCode;
	private String modeDesc;
	private BigDecimal mcroTag;
	private String actvTag;
	private String phpTag;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getModeCode() {
		return modeCode;
	}

	public void setModeCode(BigDecimal modeCode) {
		this.modeCode = modeCode;
	}

	public String getModeDesc() {
		return modeDesc;
	}

	public void setModeDesc(String modeDesc) {
		this.modeDesc = modeDesc;
	}

	public BigDecimal getMcroTag() {
		return mcroTag;
	}

	public void setMcroTag(BigDecimal mcroTag) {
		this.mcroTag = mcroTag;
	}

	public String getActvTag() {
		return actvTag;
	}

	public void setActvTag(String actvTag) {
		this.actvTag = actvTag;
	}

	public String getPhpTag() {
		return phpTag;
	}

	public void setPhpTag(String phpTag) {
		this.phpTag = phpTag;
	}

	@Override
	public String toString() {
		return "T0114 [id=" + id + ", modeCode=" + modeCode + ", modeDesc=" + modeDesc + ", mcroTag=" + mcroTag
				+ ", actvTag=" + actvTag + ", phpTag=" + phpTag + "]";
	}

}