package com.bpi.model;

import java.math.BigDecimal;

public class T0107 {

private int id;
private String trdrFi;
private String loaLName;
private String loaFName;
private String loaMName;

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
public String getLoaLName() {
	return loaLName;
}
public void setLoaLName(String loaLName) {
	this.loaLName = loaLName;
}
public String getLoaFName() {
	return loaFName;
}
public void setLoaFName(String loaFName) {
	this.loaFName = loaFName;
}
public String getLoaMName() {
	return loaMName;
}
public void setLoaMName(String loaMName) {
	this.loaMName = loaMName;
}
@Override
public String toString() {
	return "T0107 [id=" + id + ", trdrFi=" + trdrFi + ", loaLName=" + loaLName + ", loaFName=" + loaFName
			+ ", loaMName=" + loaMName + "]";
}

}