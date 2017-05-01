package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0134 extends TModelBase{

	private int id;
	private String tranFi;
	private String tranDesc;
	private String trdrTag;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTranFi() {
		return tranFi;
	}

	public void setTranFi(String tranFi) {
		this.tranFi = tranFi;
	}

	public String getTranDesc() {
		return tranDesc;
	}

	public void setTranDesc(String tranDesc) {
		this.tranDesc = tranDesc;
	}

	public String getTrdrTag() {
		return trdrTag;
	}

	public void setTrdrTag(String trdrTag) {
		this.trdrTag = trdrTag;
	}

	@Override
	public String toString() {
		return "T0134 [id=" + id + ", tranFi=" + tranFi + ", tranDesc=" + tranDesc + ", trdrTag=" + trdrTag + "]";
	}
	@Override
	public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key){
				case "TRAN_FI":
					this.setTranFi((map.get(key)));
					break;
				case "TRAN_DESC":
					this.setTranDesc((map.get(key)));
					break;
				case "TRDR_TAG":
					this.setTrdrTag((map.get(key)));
					break;
				
			}
		}

	}

}