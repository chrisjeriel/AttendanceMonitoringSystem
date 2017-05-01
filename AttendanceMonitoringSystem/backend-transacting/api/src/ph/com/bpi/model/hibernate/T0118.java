package ph.com.bpi.model.hibernate;

import java.util.HashMap;

import ph.com.bpi.model.TModelBase;

public class T0118 extends TModelBase {

	private int id;
	private String currCode;
	private String currBpi;
	private String currCasa;
	private String currDesc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurrCode() {
		return currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public String getCurrBpi() {
		return currBpi;
	}

	public void setCurrBpi(String currBpi) {
		this.currBpi = currBpi;
	}

	public String getCurrCasa() {
		return currCasa;
	}

	public void setCurrCasa(String currCasa) {
		this.currCasa = currCasa;
	}

	public String getCurrDesc() {
		return currDesc;
	}

	public void setCurrDesc(String currDesc) {
		this.currDesc = currDesc;
	}

	@Override
	public String toString() {
		return "T0118 [id=" + id + ", currCode=" + currCode + ", currBpi=" + currBpi + ", currCasa=" + currCasa
				+ ", currDesc=" + currDesc + "]";
	}
	@Override
	public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key){
				case "CURR_CODE":
					this.setCurrCode((map.get(key)));
					break;
				case "CURR_BPI":
					this.setCurrBpi((map.get(key)));
					break;
				case "CURR_CASA":
					this.setCurrCasa(map.get(key));
					break;
				case "CURR_DESC":
					this.setCurrDesc((map.get(key)));
					break;
			}
		}

	}

}