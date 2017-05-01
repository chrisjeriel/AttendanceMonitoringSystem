package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0136 extends TModelBase{

	private int id;
	private String trdrFi;
	private BigDecimal intrLmit;

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

	public BigDecimal getIntrLmit() {
		return intrLmit;
	}

	public void setIntrLmit(BigDecimal intrLmit) {
		this.intrLmit = intrLmit;
	}

	@Override
	public String toString() {
		return "T0136 [id=" + id + ", trdrFi=" + trdrFi + ", intrLmit=" + intrLmit + "]";
	}
	@Override
	public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key){
				case "TRDR_FI":
					this.setTrdrFi((map.get(key)));
					break;
				case "INTR_LMIT":
					this.setIntrLmit(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;				
			}
		}

	}
}