package ph.com.bpi.model.hibernate;

import java.util.HashMap;

public class T0102 {

private int id;
private String trdrFi;
private String spclMsg1;
private String spclMsg2;
private String spclMsg3;
private String spclMsg4;

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

public String getSpclMsg1() {
	return spclMsg1;
}

public void setSpclMsg1(String spclMsg1) {
	this.spclMsg1 = spclMsg1;
}

public String getSpclMsg2() {
	return spclMsg2;
}

public void setSpclMsg2(String spclMsg2) {
	this.spclMsg2 = spclMsg2;
}

public String getSpclMsg3() {
	return spclMsg3;
}

public void setSpclMsg3(String spclMsg3) {
	this.spclMsg3 = spclMsg3;
}

public String getSpclMsg4() {
	return spclMsg4;
}

public void setSpclMsg4(String spclMsg4) {
	this.spclMsg4 = spclMsg4;
}

public void parse(HashMap<String, String> map){

	for(String key: map.keySet()){
		switch(key){
			case "TRDR_FI":
				trdrFi = (map.get(key));
				break;

			case "spcl_msg1":
				spclMsg1=(map.get(key));
				break;

			case "spcl_msg2":
				spclMsg2=(map.get(key));
				break;
			case "spcl_msg3":
				spclMsg3=(map.get(key));
				break;
			case "spcl_msg4":
				spclMsg4=(map.get(key));
				break;
		
		}
	}
}

}