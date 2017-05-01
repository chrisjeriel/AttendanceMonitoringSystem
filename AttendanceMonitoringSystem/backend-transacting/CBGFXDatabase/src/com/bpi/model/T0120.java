package com.bpi.model;

import java.math.BigDecimal;

public class T0120 {

	private int id;
	private String trdrFi;
	private String inviCode;
	private String tranCode;
	private String formNmbr;
	private String inviDesc;

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

	public String getInviCode() {
		return inviCode;
	}

	public void setInviCode(String inviCode) {
		this.inviCode = inviCode;
	}

	public String getTranCode() {
		return tranCode;
	}

	public void setTranCode(String tranCode) {
		this.tranCode = tranCode;
	}

	public String getFormNmbr() {
		return formNmbr;
	}

	public void setFormNmbr(String formNmbr) {
		this.formNmbr = formNmbr;
	}

	public String getInviDesc() {
		return inviDesc;
	}

	public void setInviDesc(String inviDesc) {
		this.inviDesc = inviDesc;
	}

	@Override
	public String toString() {
		return "T0120 [id=" + id + ", trdrFi=" + trdrFi + ", inviCode=" + inviCode + ", tranCode=" + tranCode
				+ ", formNmbr=" + formNmbr + ", inviDesc=" + inviDesc + "]";
	}

}