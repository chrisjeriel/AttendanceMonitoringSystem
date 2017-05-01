package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0123 {

private int id;
private String trdrFi;
private BigDecimal modeCode;
private BigDecimal adocPerc;
private BigDecimal adocAmnt;
private BigDecimal adocIndc;
private BigDecimal acomPerc;
private BigDecimal acomAmnt;
private BigDecimal acomIndc;
private BigDecimal sdocPerc;
private BigDecimal sdocAmnt;
private BigDecimal sdocIndc;
private BigDecimal scomPerc;
private BigDecimal scomAmnt;
private BigDecimal scomIndc;
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


public BigDecimal getAdocIndc() {
	return adocIndc;
}


public void setAdocIndc(BigDecimal adocIndc) {
	this.adocIndc = adocIndc;
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


public BigDecimal getAcomIndc() {
	return acomIndc;
}


public void setAcomIndc(BigDecimal acomIndc) {
	this.acomIndc = acomIndc;
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


public BigDecimal getSdocIndc() {
	return sdocIndc;
}


public void setSdocIndc(BigDecimal sdocIndc) {
	this.sdocIndc = sdocIndc;
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


public BigDecimal getScomIndc() {
	return scomIndc;
}


public void setScomIndc(BigDecimal scomIndc) {
	this.scomIndc = scomIndc;
}


public BigDecimal getTcPost() {
	return tcPost;
}


public void setTcPost(BigDecimal tcPost) {
	this.tcPost = tcPost;
}


public void parse(HashMap<String, String> map){

	for(String key: map.keySet()){
		switch(key){
			case "TRDR_FI":
				trdrFi = (map.get(key));
				break;
			case "MODE_CODE":
				modeCode=new BigDecimal(map.get(key));
				break;
			case "ADOC_PERC":
				adocPerc=new BigDecimal(map.get(key));
				break;
			case "ADOC_AMNT":
				adocAmnt=new BigDecimal(map.get(key));
				break;
			case "ADOC_INDC":
				adocIndc=new BigDecimal(map.get(key));
				break;
			case "ACOM_PERC":
				acomPerc=new BigDecimal(map.get(key));
				break;
			case "ACOM_AMNT":
				acomAmnt=new BigDecimal(map.get(key));
				break;
			case "ACOM_INDC":
				acomIndc=new BigDecimal(map.get(key));
				break;
			case "SCOM_PERC":
				scomPerc=new BigDecimal(map.get(key));
				break;
			case "SCOM_AMNT":
				scomAmnt=new BigDecimal(map.get(key));
				break;
			case "SCOM_INDC":
				scomIndc=new BigDecimal(map.get(key));
				break;
			case "SDOC_PERC":
				sdocPerc=new BigDecimal(map.get(key));
				break;
			case "SDOC_AMNT":
				sdocAmnt=new BigDecimal(map.get(key));
				break;
			case "SDOC_INDC":
				sdocIndc=new BigDecimal(map.get(key));
				break;
			case "TC_POST":
				tcPost=new BigDecimal(map.get(key));
				break;
			
		}
	}
}


@Override
public String toString() {
	return "T0123 [id=" + id + ", trdrFi=" + trdrFi + ", modeCode=" + modeCode + ", adocPerc=" + adocPerc
			+ ", adocAmnt=" + adocAmnt + ", adocIndc=" + adocIndc + ", acomPerc=" + acomPerc + ", acomAmnt=" + acomAmnt
			+ ", acomIndc=" + acomIndc + ", sdocPerc=" + sdocPerc + ", sdocAmnt=" + sdocAmnt + ", sdocIndc=" + sdocIndc
			+ ", scomPerc=" + scomPerc + ", scomAmnt=" + scomAmnt + ", scomIndc=" + scomIndc + ", tcPost=" + tcPost
			+ "]";
}
}