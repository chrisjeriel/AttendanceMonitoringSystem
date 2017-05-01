package com.bpi.model;

import java.math.BigDecimal;

public class T0600_01 {

	private int id;
	private String trdrFi;
	private String bank;
	private BigDecimal book;
	private BigDecimal bookH;
	private String curr;
	private BigDecimal prch;
	private BigDecimal sale;
	private BigDecimal unco;
	private BigDecimal cons;
	private BigDecimal unld;
	private BigDecimal totl;

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

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public BigDecimal getBook() {
		return book;
	}

	public void setBook(BigDecimal book) {
		this.book = book;
	}

	public BigDecimal getBookH() {
		return bookH;
	}

	public void setBookH(BigDecimal bookH) {
		this.bookH = bookH;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public BigDecimal getPrch() {
		return prch;
	}

	public void setPrch(BigDecimal prch) {
		this.prch = prch;
	}

	public BigDecimal getSale() {
		return sale;
	}

	public void setSale(BigDecimal sale) {
		this.sale = sale;
	}

	public BigDecimal getUnco() {
		return unco;
	}

	public void setUnco(BigDecimal unco) {
		this.unco = unco;
	}

	public BigDecimal getCons() {
		return cons;
	}

	public void setCons(BigDecimal cons) {
		this.cons = cons;
	}

	public BigDecimal getUnld() {
		return unld;
	}

	public void setUnld(BigDecimal unld) {
		this.unld = unld;
	}

	public BigDecimal getTotl() {
		return totl;
	}

	public void setTotl(BigDecimal totl) {
		this.totl = totl;
	}

	@Override
	public String toString() {
		return "T0600_01 [id=" + id + ", trdrFi=" + trdrFi + ", bank=" + bank + ", book=" + book + ", bookH=" + bookH
				+ ", curr=" + curr + ", prch=" + prch + ", sale=" + sale + ", unco=" + unco + ", cons=" + cons
				+ ", unld=" + unld + ", totl=" + totl + "]";
	}

}