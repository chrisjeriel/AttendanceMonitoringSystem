package ph.com.bpi.model.hibernate;

import java.util.HashMap;

public class T0110 {

	private int id;
	private String trdrFi;
	private String currCode;
	private String bpiAcct;
	private String bfbAcct;
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
	public String getBpiAcct() {
		return bpiAcct;
	}
	public void setBpiAcct(String bpiAcct) {
		this.bpiAcct = bpiAcct;
	}
	public String getBfbAcct() {
		return bfbAcct;
	}
	public void setBfbAcct(String bfbAcct) {
		this.bfbAcct = bfbAcct;
	}
	@Override
	public String toString() {
		return "T0110 [id=" + id + ", trdrFi=" + trdrFi + ", currCode=" + currCode + ", bpiAcct=" + bpiAcct
				+ ", bfbAcct=" + bfbAcct + "]";
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
				case "BPI_ACCT":
					this.setBfbAcct(map.get(key));
					break;
				case "BFB_ACCT":
					this.setBfbAcct(map.get(key));
					break;
			}
		}
	}

}