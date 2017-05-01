package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0205 extends TModelBase {

	private int id;
	private String trdrFi;
	private String currCode;
	private BigDecimal usdBId;
	private BigDecimal usdOffr;

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

	public BigDecimal getUsdBId() {
		return usdBId;
	}

	public void setUsdBId(BigDecimal usdBId) {
		this.usdBId = usdBId;
	}

	public BigDecimal getUsdOffr() {
		return usdOffr;
	}

	public void setUsdOffr(BigDecimal usdOffr) {
		this.usdOffr = usdOffr;
	}

	@Override
	public String toString() {
		return "T0205 [id=" + id + ", trdrFi=" + trdrFi + ", currCode=" + currCode + ", usdBId=" + usdBId + ", usdOffr="
				+ usdOffr + "]";
	}
	@Override
	public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key){
				case "TRDR_FI":
					this.setTrdrFi((map.get(key)));
					break;
				case "CURR_CODE":
					this.setCurrCode((map.get(key)));
					break;	
				case "USD_BID":
					this.setUsdBId((BigDecimal.valueOf(Long.valueOf(map.get(key)))));
					break;
				case "USD_OFFR":
					this.setUsdOffr((BigDecimal.valueOf(Long.valueOf(map.get(key)))));
					break;
			}
		}

	}
}