package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0125 extends TModelBase {

	private int id;
	private String trdrFi;
	private BigDecimal scutTime;
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
	public BigDecimal getScutTime() {
		return scutTime;
	}
	public void setScutTime(BigDecimal scutTime) {
		this.scutTime = scutTime;
	}
	@Override
	public String toString() {
		return "T0125 [id=" + id + ", trdrFi=" + trdrFi + ", scutTime=" + scutTime + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "TRDRFI":
this.setTrdrFi(map.get(key));
break;
case "SCUTTIME":
this.setScutTime(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;}}}}