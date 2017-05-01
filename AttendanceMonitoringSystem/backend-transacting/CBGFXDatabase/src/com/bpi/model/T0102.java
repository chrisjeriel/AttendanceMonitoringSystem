package com.bpi.model;

import java.math.BigDecimal;

public class T0102 {

private int id;
private String trdrFi;
private String spclMsg1;
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
public String getSpclMsg1() {
	return spclMsg1;
}
public void setSpclMsg1(String spclMsg1) {
	this.spclMsg1 = spclMsg1;
}
@Override
public String toString() {
	return "T0102 [id=" + id + ", trdrFi=" + trdrFi + ", spclMsg1=" + spclMsg1 + "]";
}

}