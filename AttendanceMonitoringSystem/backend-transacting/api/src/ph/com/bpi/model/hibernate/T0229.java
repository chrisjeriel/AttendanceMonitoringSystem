package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0229 extends TModelBase {

	private int id;
	private String trdrFi;
	private String currCode;
	private BigDecimal prchRate;
	private BigDecimal saleRate;

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

	public BigDecimal getPrchRate() {
		return prchRate;
	}

	public void setPrchRate(BigDecimal prchRate) {
		this.prchRate = prchRate;
	}

	public BigDecimal getSaleRate() {
		return saleRate;
	}

	public void setSaleRate(BigDecimal saleRate) {
		this.saleRate = saleRate;
	}

	@Override
	public String toString() {
		return "T0229 [id=" + id + ", trdrFi=" + trdrFi + ", currCode=" + currCode + ", prchRate=" + prchRate
				+ ", saleRate=" + saleRate + "]";
	

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
case "PRCHRATE":
this.setPrchRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SALERATE":
this.setSaleRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;}}}}