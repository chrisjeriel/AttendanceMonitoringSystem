package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0225 extends TModelBase{

	private int id;
	private String trdrFi;
	private String tranFi;
	private String currCode;
	private BigDecimal tierNmbr;
	private BigDecimal amntFrom;
	private BigDecimal amntTo;
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

	public BigDecimal getTierNmbr() {
		return tierNmbr;
	}

	public void setTierNmbr(BigDecimal tierNmbr) {
		this.tierNmbr = tierNmbr;
	}

	public BigDecimal getAmntFrom() {
		return amntFrom;
	}

	public void setAmntFrom(BigDecimal amntFrom) {
		this.amntFrom = amntFrom;
	}

	public BigDecimal getAmntTo() {
		return amntTo;
	}

	public void setAmntTo(BigDecimal amntTo) {
		this.amntTo = amntTo;
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
		return "T0225 [id=" + id + ", trdrFi=" + trdrFi + ", tranFi=" + tranFi + ", currCode=" + currCode
				+ ", tierNmbr=" + tierNmbr + ", amntFrom=" + amntFrom + ", amntTo=" + amntTo + ", prchRate=" + prchRate
				+ ", saleRate=" + saleRate + "]";
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
				case "TIER_NMBR":
					this.setTierNmbr(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
				case "AMNT_FROM":
					this.setAmntFrom(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
				case "AMNT_TO":
					this.setAmntTo(BigDecimal.valueOf(Long.valueOf(map.get(key))));
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