package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0134 {

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

public void parse(HashMap<String, String> map){

	for(String key: map.keySet()){
		switch(key){
			case "TRAN_FI":
				tranFi = (map.get(key));
				break;

			case "TRAN _DESC":
				tranDesc=(map.get(key));
				break;

			case "TRDR_TAG":
				trdrTag=(map.get(key));
				break;

	
		}
	}
}
}