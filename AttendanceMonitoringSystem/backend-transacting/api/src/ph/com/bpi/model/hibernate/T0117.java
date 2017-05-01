package ph.com.bpi.model.hibernate;

import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0117 extends TModelBase {

	private int id;
	private String brchCode;
	private String brchPcc;
	private String brchName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrchCode() {
		return brchCode;
	}

	public void setBrchCode(String brchCode) {
		this.brchCode = brchCode;
	}

	public String getBrchPcc() {
		return brchPcc;
	}

	public void setBrchPcc(String brchPcc) {
		this.brchPcc = brchPcc;
	}

	public String getBrchName() {
		return brchName;
	}

	public void setBrchName(String brchName) {
		this.brchName = brchName;
	}

	@Override
	public String toString() {
		return "T0117 [id=" + id + ", brchCode=" + brchCode + ", brchPcc=" + brchPcc + ", brchName=" + brchName + "]";
	}
	@Override
	public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key){
				case "BRCH_CODE":
					this.setBrchCode((map.get(key)));
					break;
				case "BRCH_PCC":
					this.setBrchPcc((map.get(key)));
					break;
				case "BRCH_NAME":
					this.setBrchName((map.get(key)));
					break;
		
			}
		}

	}
	
	

}