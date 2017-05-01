package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0127 extends TModelBase {

	private int id;
	private String trdrFi;
	private String modeIndc;
	private BigDecimal modeCode;
	private String mtsCode;
	private String mtsDesc;

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

	public String getModeIndc() {
		return modeIndc;
	}

	public void setModeIndc(String modeIndc) {
		this.modeIndc = modeIndc;
	}

	public BigDecimal getModeCode() {
		return modeCode;
	}

	public void setModeCode(BigDecimal modeCode) {
		this.modeCode = modeCode;
	}

	public String getMtsCode() {
		return mtsCode;
	}

	public void setMtsCode(String mtsCode) {
		this.mtsCode = mtsCode;
	}

	public String getMtsDesc() {
		return mtsDesc;
	}

	public void setMtsDesc(String mtsDesc) {
		this.mtsDesc = mtsDesc;
	}

	@Override
	public String toString() {
		return "T0127 [id=" + id + ", trdrFi=" + trdrFi + ", modeIndc=" + modeIndc + ", modeCode=" + modeCode
				+ ", mtsCode=" + mtsCode + ", mtsDesc=" + mtsDesc + "]";
	}
	@Override
	public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key){
				case "TRDR_FI":
					this.setTrdrFi((map.get(key)));
					break;
				case "MODE_INDC":
					this.setModeIndc((map.get(key)));
					break;
				case "MODE_CODE":
					this.setModeCode(BigDecimal.valueOf(Long.valueOf(map.get(key))));
					break;
				case "MTS_CODE":
					this.setMtsCode((map.get(key)));
					break;
				case "MTS_DESC":
					this.setMtsDesc((map.get(key)));
					break;
			
				
				
			}
		}

	}

}