package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0909 {

private int id;
private String bank;
private BigDecimal book;
private String cntrCurr;
private String origCurr;
private BigDecimal prchAmnt;
private BigDecimal prchCost;
private BigDecimal saleAmnt;
private BigDecimal saleCost;
private BigDecimal netAmnt;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getCntrCurr() {
	return cntrCurr;
}
public void setCntrCurr(String cntrCurr) {
	this.cntrCurr = cntrCurr;
}
public String getOrigCurr() {
	return origCurr;
}
public void setOrigCurr(String origCurr) {
	this.origCurr = origCurr;
}
public BigDecimal getPrchAmnt() {
	return prchAmnt;
}
public void setPrchAmnt(BigDecimal prchAmnt) {
	this.prchAmnt = prchAmnt;
}
public BigDecimal getPrchCost() {
	return prchCost;
}
public void setPrchCost(BigDecimal prchCost) {
	this.prchCost = prchCost;
}
public BigDecimal getSaleAmnt() {
	return saleAmnt;
}
public void setSaleAmnt(BigDecimal saleAmnt) {
	this.saleAmnt = saleAmnt;
}
public BigDecimal getSaleCost() {
	return saleCost;
}
public void setSaleCost(BigDecimal saleCost) {
	this.saleCost = saleCost;
}
public BigDecimal getNetAmnt() {
	return netAmnt;
}
public void setNetAmnt(BigDecimal netAmnt) {
	this.netAmnt = netAmnt;
}

}