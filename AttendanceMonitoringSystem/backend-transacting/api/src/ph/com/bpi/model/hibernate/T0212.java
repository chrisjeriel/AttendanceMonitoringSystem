package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0212 extends TModelBase {

	private int id;
	private String trdrFi;
	private String currCode;
	private String updtTag;

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

	public String getUpdtTag() {
		return updtTag;
	}

	public void setUpdtTag(String updtTag) {
		this.updtTag = updtTag;
	}

	@Override
	public String toString() {
		return "T0212 [id=" + id + ", trdrFi=" + trdrFi + ", currCode=" + currCode + ", updtTag=" + updtTag + "]";
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
				case "UPDT_TAG":
					this.setUpdtTag((map.get(key)));
					break;
			
			}
		}

	}
}