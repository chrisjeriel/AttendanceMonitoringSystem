package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0107 extends TModelBase {

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
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "TRDRFI":
this.setTrdrFi(map.get(key));
break;
case "LOALNAME":
this.setLoaLName(map.get(key));
break;
case "LOAFNAME":
this.setLoaFName(map.get(key));
break;
case "LOAMNAME":
this.setLoaMName(map.get(key));
break;}}}}