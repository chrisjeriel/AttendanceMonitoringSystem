package ph.com.bpi.model.hibernate;

import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0130 extends TModelBase {


	private int id;
	private String trdrFi;
	private String trdrDesc;
	private String trdrGlcd;
	private String trdrUnld;
	private String tranFi;

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

	public String getTrdrDesc() {
		return trdrDesc;
	}

	public void setTrdrDesc(String trdrDesc) {
		this.trdrDesc = trdrDesc;
	}

	public String getTrdrGlcd() {
		return trdrGlcd;
	}

	public void setTrdrGlcd(String trdrPcc) {
		this.trdrGlcd = trdrGlcd;
	}

	public String getTrdrUnld() {
		return trdrUnld;
	}

	public void setTrdrUnld(String trdrUnld) {
		this.trdrUnld = trdrUnld;
	}

	public String getTranFi() {
		return tranFi;
	}

	public void setTranFi(String tranFi) {
		this.tranFi = tranFi;
	}

	@Override
	public String toString() {
		return "T0130 [id=" + id + ", trdrFi=" + trdrFi + ", trdrDesc=" + trdrDesc + ", trdrGlcd=" + trdrGlcd
				+ ", trdrUnld=" + trdrUnld + ", tranFi=" + tranFi + "]";
	}
	@Override
	public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key){
				case "TRDR_FI":
					this.setTrdrFi((map.get(key)));
					break;
				case "TRDR_DESC":
					this.setTrdrDesc((map.get(key)));
					break;
				case "TRDR_GLCD":
					this.setTrdrGlcd((map.get(key)));
					break;
				case "TRDR_UNLD":
					this.setTrdrUnld((map.get(key)));
					break;
				case "TRAN_FI":
					this.setTranFi((map.get(key)));
					break;
			
				
				
			}
		}

	}
}