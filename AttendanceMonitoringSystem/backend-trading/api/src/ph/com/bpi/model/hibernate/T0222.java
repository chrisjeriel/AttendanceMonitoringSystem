package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0222 {

private int id;
private String trdrFi;
private String tranFi;
private String currCode;
private BigDecimal prchSprd;
private BigDecimal saleSprd;
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
public String getTranFi() {
	return tranFi;
}
public void setTranFi(String tranFi) {
	this.tranFi = tranFi;
}
public String getCurrCode() {
	return currCode;
}
public void setCurrCode(String currCode) {
	this.currCode = currCode;
}
public BigDecimal getPrchSprd() {
	return prchSprd;
}
public void setPrchSprd(BigDecimal prchSprd) {
	this.prchSprd = prchSprd;
}
public BigDecimal getSaleSprd() {
	return saleSprd;
}
public void setSaleSprd(BigDecimal saleSprd) {
	this.saleSprd = saleSprd;
}

}