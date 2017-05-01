package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0110 extends TModelBase {

private int id;
private String trdrFi;
private String currCode;
private String bpiAcct;
private String bfbAcct;

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
public String getBpiAcct() {
	return bpiAcct;
}
public void setBpiAcct(String bpiAcct) {
	this.bpiAcct = bpiAcct;
}
public String getBfbAcct() {
	return bfbAcct;
}
public void setBfbAcct(String bfbAcct) {
	this.bfbAcct = bfbAcct;
}
@Override
public String toString() {
	return "T0110 [id=" + id + ", trdrFi=" + trdrFi + ", currCode=" + currCode + ", bpiAcct=" + bpiAcct + ", bfbAcct="
			+ bfbAcct + "]";


}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "TRDRFI":
this.setTrdrFi(map.get(key));
break;
case "CURRCODE":
this.setCurrCode(map.get(key));
break;
case "BPIACCT":
this.setBpiAcct(map.get(key));
break;
case "BFBACCT":
this.setBfbAcct(map.get(key));
break;}}}}