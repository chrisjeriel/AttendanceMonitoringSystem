package com.bpi.model;

import java.math.BigDecimal;

public class T0305 {

	private int id;
	private String tranIndc;
	private BigDecimal acptStat;
	private BigDecimal setlStat;
	private String acptName;
	private String setlName;
	private BigDecimal acptClean;
	private BigDecimal setlClean;

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

	public BigDecimal getAcptStat() {
		return acptStat;
	}

	public void setAcptStat(BigDecimal acptStat) {
		this.acptStat = acptStat;
	}

	public BigDecimal getSetlStat() {
		return setlStat;
	}

	public void setSetlStat(BigDecimal setlStat) {
		this.setlStat = setlStat;
	}

	public String getAcptName() {
		return acptName;
	}

	public void setAcptName(String acptName) {
		this.acptName = acptName;
	}

	public String getSetlName() {
		return setlName;
	}

	public void setSetlName(String setlName) {
		this.setlName = setlName;
	}

	public BigDecimal getAcptClean() {
		return acptClean;
	}

	public void setAcptClean(BigDecimal acptClean) {
		this.acptClean = acptClean;
	}

	public BigDecimal getSetlClean() {
		return setlClean;
	}

	public void setSetlClean(BigDecimal setlClean) {
		this.setlClean = setlClean;
	}

	@Override
	public String toString() {
		return "T0305 [id=" + id + ", tranIndc=" + tranIndc + ", acptStat=" + acptStat + ", setlStat=" + setlStat
				+ ", acptName=" + acptName + ", setlName=" + setlName + ", acptClean=" + acptClean + ", setlClean="
				+ setlClean + "]";
	}

}