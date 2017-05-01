package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0218 extends TModelBase {

	private int id;
	private String trdrFi;
	private String currCode;
	private BigDecimal phpBId;
	private BigDecimal phpOffr;

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

	public BigDecimal getPhpBId() {
		return phpBId;
	}

	public void setPhpBId(BigDecimal phpBId) {
		this.phpBId = phpBId;
	}

	public BigDecimal getPhpOffr() {
		return phpOffr;
	}

	public void setPhpOffr(BigDecimal phpOffr) {
		this.phpOffr = phpOffr;
	}

	@Override
	public String toString() {
		return "T0218 [id=" + id + ", trdrFi=" + trdrFi + ", currCode=" + currCode + ", phpBId=" + phpBId + ", phpOffr="
				+ phpOffr + "]";
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
				case "PHP_BID":
					this.setPhpBId(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
				case "PHP_OFFR":
					this.setPhpOffr(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
			}
		}

	}
}