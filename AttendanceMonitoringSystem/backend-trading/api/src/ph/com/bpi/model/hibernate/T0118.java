package ph.com.bpi.model.hibernate;

import java.util.HashMap;

public class T0118 {

private int id;
private String currCode;
private String currBpi;
private String currCasa;
private String currDesc;



public void parse(HashMap<String, String> map){

	for(String key: map.keySet()){
		switch(key){
			case "CURR_CODE":
				currCode = (map.get(key));
				break;

			case "CURR_BPI":
				currBpi=(map.get(key));
				break;

			case "CURR_CASA":
				currCasa=(map.get(key));
				break;

			case "CURR_DESC":
				currDesc=(map.get(key));
				break;
		}
	}
}



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


}