package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;
import java.util.HashMap;

 public class T0102 extends TModelBase {

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
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "TRDRFI":
this.setTrdrFi(map.get(key));
break;
case "SPCLMSG1":
this.setSpclMsg1(map.get(key));
break;}}}}