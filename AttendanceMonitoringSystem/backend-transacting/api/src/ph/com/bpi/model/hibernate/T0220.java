package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0220 extends TModelBase{

	private int id;
	private String trdrFi;
	private String tranFi;
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

	public String getTranFi() {
		return tranFi;
	}

	public void setTranFi(String tranFi) {
		this.tranFi = tranFi;
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
		return "T0220 [id=" + id + ", trdrFi=" + trdrFi + ", tranFi=" + tranFi + ", currCode=" + currCode
				+ ", prchRate=" + prchRate + ", saleRate=" + saleRate + "]";
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
				case "TRAN_FI":
					this.setTranFi((map.get(key)));
					break;
				case "PRCH_RATE":
					this.setPrchRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
				case "SALE_RATE":
					this.setSaleRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
			}
		}

	}

}