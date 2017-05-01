package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0232 extends TModelBase {

	private int id;
	private String trdrFi;
	private String currCode;
	private BigDecimal usdAmnt;
	private BigDecimal exchRate;
	private BigDecimal phpEquiv;

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

	public BigDecimal getUsdAmnt() {
		return usdAmnt;
	}

	public void setUsdAmnt(BigDecimal usdAmnt) {
		this.usdAmnt = usdAmnt;
	}

	public BigDecimal getExchRate() {
		return exchRate;
	}

	public void setExchRate(BigDecimal exchRate) {
		this.exchRate = exchRate;
	}

	public BigDecimal getPhpEquiv() {
		return phpEquiv;
	}

	public void setPhpEquiv(BigDecimal phpEquiv) {
		this.phpEquiv = phpEquiv;
	}

	@Override
	public String toString() {
		return "T0232 [id=" + id + ", trdrFi=" + trdrFi + ", currCode=" + currCode + ", usdAmnt=" + usdAmnt
				+ ", exchRate=" + exchRate + ", phpEquiv=" + phpEquiv + "]";
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
				case "USD_AMNT":
					this.setUsdAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
				case "EXCH_RATE":
					this.setExchRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
				case "PHP_EQUIV":
					this.setPhpEquiv(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
			
			}
		}
}

}