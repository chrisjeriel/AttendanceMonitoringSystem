package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0229 {

private int id;
private String trdrFi;
private String currCode;
private BigDecimal prchRate;
private BigDecimal saleRate;
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
public String getCurrCode() {
	return currCode;
}
public void setCurrCode(String currCode) {
	this.currCode = currCode;
}
public BigDecimal getPrchRate() {
	return prchRate;
}
public void setPrchRate(BigDecimal prchRate) {
	this.prchRate = prchRate;
}
public BigDecimal getSaleRate() {
	return saleRate;
}
public void setSaleRate(BigDecimal saleRate) {
	this.saleRate = saleRate;
}

}