package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0235 extends TModelBase{

	private int id;
	private String trdrFi;
	private String currCode;
	private BigDecimal fcduPrch;
	private BigDecimal fcduSale;
	private BigDecimal notePrch;
	private BigDecimal ddttPrch;
	private BigDecimal sale;

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

	public BigDecimal getFcduPrch() {
		return fcduPrch;
	}

	public void setFcduPrch(BigDecimal fcduPrch) {
		this.fcduPrch = fcduPrch;
	}

	public BigDecimal getFcduSale() {
		return fcduSale;
	}

	public void setFcduSale(BigDecimal fcduSale) {
		this.fcduSale = fcduSale;
	}

	public BigDecimal getNotePrch() {
		return notePrch;
	}

	public void setNotePrch(BigDecimal notePrch) {
		this.notePrch = notePrch;
	}

	public BigDecimal getDdttPrch() {
		return ddttPrch;
	}

	public void setDdttPrch(BigDecimal ddttPrch) {
		this.ddttPrch = ddttPrch;
	}

	public BigDecimal getSale() {
		return sale;
	}

	public void setSale(BigDecimal sale) {
		this.sale = sale;
	}

	@Override
	public String toString() {
		return "T0235 [id=" + id + ", trdrFi=" + trdrFi + ", currCode=" + currCode + ", fcduPrch=" + fcduPrch
				+ ", fcduSale=" + fcduSale + ", notePrch=" + notePrch + ", ddttPrch=" + ddttPrch + ", sale=" + sale
				+ "]";
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
				case "FCDU_PRCH":
					this.setFcduPrch(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
				case "FCDU_SALE":
					this.setFcduSale(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
				case "NOTE_PRCH":
					this.setNotePrch(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;	
				case "DDTT_PRCH":
					this.setDdttPrch(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
				case "SALE":
					this.setSale(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
			}
		}
}


}