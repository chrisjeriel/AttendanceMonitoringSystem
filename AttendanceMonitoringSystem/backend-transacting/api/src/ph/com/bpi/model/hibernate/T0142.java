package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0142 extends TModelBase{

	private int id;
	private String applCode;
	private String applDesc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApplCode() {
		return applCode;
	}

	public void setApplCode(String applCode) {
		this.applCode = applCode;
	}

	public String getApplDesc() {
		return applDesc;
	}

	public void setApplDesc(String applDesc) {
		this.applDesc = applDesc;
	}

	@Override
	public String toString() {
		return "T0142 [id=" + id + ", applCode=" + applCode + ", applDesc=" + applDesc + "]";
	}
	@Override
	public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key){
				case "APPL_CODE":
					this.setApplCode((map.get(key)));
					break;
				case "APPL_DESC":
					this.setApplDesc((map.get(key)));
					break;				
			}
		}

	}
}