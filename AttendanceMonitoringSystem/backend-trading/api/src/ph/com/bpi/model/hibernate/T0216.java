package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0216 {

private int id;
private String trdrFi;
private String currCode;
private BigDecimal refrRate;
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
public BigDecimal getRefrRate() {
	return refrRate;
}
public void setRefrRate(BigDecimal refrRate) {
	this.refrRate = refrRate;
}

}