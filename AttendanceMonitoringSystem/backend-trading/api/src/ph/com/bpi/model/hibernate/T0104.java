package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0104 {

	private int id;
	private String trdrFi;
	private String currCode;
	private BigDecimal minAmnt;
	private BigDecimal pabvLim;
	private BigDecimal sabvLim;
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
	public BigDecimal getMinAmnt() {
		return minAmnt;
	}
	public void setMinAmnt(BigDecimal minAmnt) {
		this.minAmnt = minAmnt;
	}
	public BigDecimal getPabvLim() {
		return pabvLim;
	}
	public void setPabvLim(BigDecimal pabvLim) {
		this.pabvLim = pabvLim;
	}
	public BigDecimal getSabvLim() {
		return sabvLim;
	}
	public void setSabvLim(BigDecimal sabvLim) {
		this.sabvLim = sabvLim;
	}
	@Override
	public String toString() {
		return "T0104 [id=" + id + ", trdrFi=" + trdrFi + ", currCode=" + currCode + ", minAmnt=" + minAmnt
				+ ", pabvLim=" + pabvLim + ", sabvLim=" + sabvLim + "]";
	}
	
	public void parse(HashMap<String, String> map){
		for(String key : map.keySet()){
			switch(key){
				case "TRDR_FI":
					this.setTrdrFi(map.get(key));
					break;
				case "CURR_CODE":
					this.setCurrCode(map.get(key));
					break;
				case "MIN_AMNT":
					this.setMinAmnt(new BigDecimal(map.get(key)));
					break;
				case "PABV_LIM":
					this.setPabvLim(new BigDecimal(map.get(key)));
					break;
				case "SABV_LIM":
					this.setSabvLim(new BigDecimal(map.get(key)));
					break;
			}
		}
	}

}