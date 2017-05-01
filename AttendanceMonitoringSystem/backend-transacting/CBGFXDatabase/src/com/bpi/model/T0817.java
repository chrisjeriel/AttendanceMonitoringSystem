package com.bpi.model;

import java.math.BigDecimal;

public class T0817 {

	private int id;
	private String acctNmbr;
	private String loaNmbr;
	private String valDate;
	private String bankName;
	private String cntrPrty;
	private BigDecimal tranAmnt;
	private String refNmbr;
	private String address1;
	private String address2;
	private String recvAcct;
	private String absTime;
	private String othrInst;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcctNmbr() {
		return acctNmbr;
	}

	public void setAcctNmbr(String acctNmbr) {
		this.acctNmbr = acctNmbr;
	}

	public String getLoaNmbr() {
		return loaNmbr;
	}

	public void setLoaNmbr(String loaNmbr) {
		this.loaNmbr = loaNmbr;
	}

	public String getValDate() {
		return valDate;
	}

	public void setValDate(String valDate) {
		this.valDate = valDate;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCntrPrty() {
		return cntrPrty;
	}

	public void setCntrPrty(String cntrPrty) {
		this.cntrPrty = cntrPrty;
	}

	public BigDecimal getTranAmnt() {
		return tranAmnt;
	}

	public void setTranAmnt(BigDecimal tranAmnt) {
		this.tranAmnt = tranAmnt;
	}

	public String getRefNmbr() {
		return refNmbr;
	}

	public void setRefNmbr(String refNmbr) {
		this.refNmbr = refNmbr;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getRecvAcct() {
		return recvAcct;
	}

	public void setRecvAcct(String recvAcct) {
		this.recvAcct = recvAcct;
	}

	public String getAbsTime() {
		return absTime;
	}

	public void setAbsTime(String absTime) {
		this.absTime = absTime;
	}

	public String getOthrInst() {
		return othrInst;
	}

	public void setOthrInst(String othrInst) {
		this.othrInst = othrInst;
	}

	@Override
	public String toString() {
		return "T0817 [id=" + id + ", acctNmbr=" + acctNmbr + ", loaNmbr=" + loaNmbr + ", valDate=" + valDate
				+ ", bankName=" + bankName + ", cntrPrty=" + cntrPrty + ", tranAmnt=" + tranAmnt + ", refNmbr="
				+ refNmbr + ", address1=" + address1 + ", address2=" + address2 + ", recvAcct=" + recvAcct
				+ ", absTime=" + absTime + ", othrInst=" + othrInst + "]";
	}

}