package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0218 {

private int id;
private String trdrFi;
private String currCode;
private BigDecimal phpBId;
private BigDecimal phpOffr;
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
public BigDecimal getPhpBId() {
	return phpBId;
}
public void setPhpBId(BigDecimal phpBId) {
	this.phpBId = phpBId;
}
public BigDecimal getPhpOffr() {
	return phpOffr;
}
public void setPhpOffr(BigDecimal phpOffr) {
	this.phpOffr = phpOffr;
}

}