package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0908 {

private int id;
private String trdrFi;
private BigDecimal book;
private String currCode;
private BigDecimal amount;
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
public BigDecimal getBook() {
	return book;
}
public void setBook(BigDecimal book) {
	this.book = book;
}
public String getCurrCode() {
	return currCode;
}
public void setCurrCode(String currCode) {
	this.currCode = currCode;
}
public BigDecimal getAmount() {
	return amount;
}
public void setAmount(BigDecimal amount) {
	this.amount = amount;
}

}