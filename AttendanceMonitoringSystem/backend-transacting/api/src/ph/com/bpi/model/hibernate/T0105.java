package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0105 extends TModelBase{

private int id;
private String trdrFi;
private String currCode;
private BigDecimal minAmnt;
private BigDecimal pabvLim;
private BigDecimal sabvLim;
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
public BigDecimal getMinAmnt() {
	return minAmnt;
}
public void setMinAmnt(BigDecimal minAmnt) {
	this.minAmnt = minAmnt;
}
public BigDecimal getPabvLim() {
	return pabvLim;
}
public void setPabvLim(BigDecimal pabvLim) {
	this.pabvLim = pabvLim;
}
public BigDecimal getSabvLim() {
	return sabvLim;
}
public void setSabvLim(BigDecimal sabvLim) {
	this.sabvLim = sabvLim;
}
@Override
public String toString() {
	return "T0105 [id=" + id + ", trdrFi=" + trdrFi + ", currCode=" + currCode + ", minAmnt=" + minAmnt + ", pabvLim="
			+ pabvLim + ", sabvLim=" + sabvLim + "]";
}
@Override
public void parse(HashMap<String, String> map) {
	// TODO Auto-generated method stub
	
}


}