package com.bpi.model;

import java.math.BigDecimal;

public class T0803 {

	private int id;
	private String bankCode;
	private String cntrPrty;
	private String bankName;
	private String address1;
	private String address2;
	private String cntcPrsn;
	private String recvAcct;
	private String othrInst;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getCntrPrty() {
		return cntrPrty;
	}

	public void setCntrPrty(String cntrPrty) {
		this.cntrPrty = cntrPrty;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
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

	public String getCntcPrsn() {
		return cntcPrsn;
	}

	public void setCntcPrsn(String cntcPrsn) {
		this.cntcPrsn = cntcPrsn;
	}

	public String getRecvAcct() {
		return recvAcct;
	}

	public void setRecvAcct(String recvAcct) {
		this.recvAcct = recvAcct;
	}

	public String getOthrInst() {
		return othrInst;
	}

	public void setOthrInst(String othrInst) {
		this.othrInst = othrInst;
	}

	@Override
	public String toString() {
		return "T0803 [id=" + id + ", bankCode=" + bankCode + ", cntrPrty=" + cntrPrty + ", bankName=" + bankName
				+ ", address1=" + address1 + ", address2=" + address2 + ", cntcPrsn=" + cntcPrsn + ", recvAcct="
				+ recvAcct + ", othrInst=" + othrInst + "]";
	}

}