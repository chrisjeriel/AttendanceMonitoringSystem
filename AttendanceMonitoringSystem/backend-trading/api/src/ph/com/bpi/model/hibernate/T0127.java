package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;

public class T0127 {

private int id;
private String trdrFi;
private String modeIndc;
private BigDecimal modeCode;
private String mtsCode;
private String mtsDesc;
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
public String getModeIndc() {
	return modeIndc;
}
public void setModeIndc(String modeIndc) {
	this.modeIndc = modeIndc;
}
public BigDecimal getModeCode() {
	return modeCode;
}
public void setModeCode(BigDecimal modeCode) {
	this.modeCode = modeCode;
}
public String getMtsCode() {
	return mtsCode;
}
public void setMtsCode(String mtsCode) {
	this.mtsCode = mtsCode;
}
public String getMtsDesc() {
	return mtsDesc;
}
public void setMtsDesc(String mtsDesc) {
	this.mtsDesc = mtsDesc;
}

}