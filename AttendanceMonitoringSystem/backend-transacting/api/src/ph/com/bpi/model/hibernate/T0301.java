package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0301 extends TModelBase {

	private int id;
	private BigDecimal dealRate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getDealRate() {
		return dealRate;
	}

	public void setDealRate(BigDecimal dealRate) {
		this.dealRate = dealRate;
	}

	@Override
	public String toString() {
		return "T0301 [id=" + id + ", dealRate=" + dealRate + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "DEALRATE":
this.setDealRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;}}}}