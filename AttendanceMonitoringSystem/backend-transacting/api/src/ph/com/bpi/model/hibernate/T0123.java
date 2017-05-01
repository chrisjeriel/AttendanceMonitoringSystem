package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0123 extends TModelBase {

private int id;
private String trdrFi;
private BigDecimal modeCode;
private BigDecimal adocPerc;
private BigDecimal adocAmnt;
private BigDecimal acomPerc;
private BigDecimal acomAmnt;
private BigDecimal sdocPerc;
private BigDecimal sdocAmnt;
private BigDecimal scomPerc;
private BigDecimal scomAmnt;
private BigDecimal tcPost;
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
public BigDecimal getModeCode() {
	return modeCode;
}
public void setModeCode(BigDecimal modeCode) {
	this.modeCode = modeCode;
}
public BigDecimal getAdocPerc() {
	return adocPerc;
}
public void setAdocPerc(BigDecimal adocPerc) {
	this.adocPerc = adocPerc;
}
public BigDecimal getAdocAmnt() {
	return adocAmnt;
}
public void setAdocAmnt(BigDecimal adocAmnt) {
	this.adocAmnt = adocAmnt;
}
public BigDecimal getAcomPerc() {
	return acomPerc;
}
public void setAcomPerc(BigDecimal acomPerc) {
	this.acomPerc = acomPerc;
}
public BigDecimal getAcomAmnt() {
	return acomAmnt;
}
public void setAcomAmnt(BigDecimal acomAmnt) {
	this.acomAmnt = acomAmnt;
}
public BigDecimal getSdocPerc() {
	return sdocPerc;
}
public void setSdocPerc(BigDecimal sdocPerc) {
	this.sdocPerc = sdocPerc;
}
public BigDecimal getSdocAmnt() {
	return sdocAmnt;
}
public void setSdocAmnt(BigDecimal sdocAmnt) {
	this.sdocAmnt = sdocAmnt;
}
public BigDecimal getScomPerc() {
	return scomPerc;
}
public void setScomPerc(BigDecimal scomPerc) {
	this.scomPerc = scomPerc;
}
public BigDecimal getScomAmnt() {
	return scomAmnt;
}
public void setScomAmnt(BigDecimal scomAmnt) {
	this.scomAmnt = scomAmnt;
}
public BigDecimal getTcPost() {
	return tcPost;
}
public void setTcPost(BigDecimal tcPost) {
	this.tcPost = tcPost;
}
@Override
public String toString() {
	return "T0123 [id=" + id + ", trdrFi=" + trdrFi + ", modeCode=" + modeCode + ", adocPerc=" + adocPerc
			+ ", adocAmnt=" + adocAmnt + ", acomPerc=" + acomPerc + ", acomAmnt=" + acomAmnt + ", sdocPerc=" + sdocPerc
			+ ", sdocAmnt=" + sdocAmnt + ", scomPerc=" + scomPerc + ", scomAmnt=" + scomAmnt + ", tcPost=" + tcPost
			+ "]";
}
@Override
public void parse(HashMap<String, String> map){

	for(String key: map.keySet()){
		switch(key){
			case "TRDR_FI":
				this.setTrdrFi((map.get(key)));
				break;
			case "MODE_CODE":
				this.setModeCode(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
			case "ADOC_PERC":
				this.setAcomPerc(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
			case "ADOC_AMNT":
				this.setAdocAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
			case "ACOM_PERC":
				this.setAcomPerc(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
			case "ACOM_AMNT":
				this.setAcomAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
			case "SDOC_PERC":
				this.setSdocPerc(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
			case "SDOC_AMNT":
				this.setSdocAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
			case "SCOM_PERC":
				this.setScomPerc(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
			case "SCOM_AMNT":
				this.setScomAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
			case "TC_POST":
				this.setTcPost(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
		}
	}

}
}