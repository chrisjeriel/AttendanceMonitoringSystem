package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0200 extends TModelBase{

	private int id;
	private String trdrFi;
	private String tranFi;
	private BigDecimal rateType;
	private String rateDesc;

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

	public String getTranFi() {
		return tranFi;
	}

	public void setTranFi(String tranFi) {
		this.tranFi = tranFi;
	}

	public BigDecimal getRateType() {
		return rateType;
	}

	public void setRateType(BigDecimal rateType) {
		this.rateType = rateType;
	}

	public String getRateDesc() {
		return rateDesc;
	}

	public void setRateDesc(String rateDesc) {
		this.rateDesc = rateDesc;
	}

	@Override
	public String toString() {
		return "T0200 [id=" + id + ", trdrFi=" + trdrFi + ", tranFi=" + tranFi + ", rateType=" + rateType
				+ ", rateDesc=" + rateDesc + "]";
	}
	
	@Override
	public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key){
				case "TRDR_FI":
					this.setTrdrFi((map.get(key)));
					break;
				case "TRAN_FI":
					this.setTrdrFi((map.get(key)));
					break;		
				case "RATE_TYPE":
					this.setRateType((BigDecimal.valueOf(Long.valueOf(map.get(key)))));
					break;
				case "RATE_DESC":
					this.setRateDesc((map.get(key)));
					break;	
			
			}
		}

	}

}