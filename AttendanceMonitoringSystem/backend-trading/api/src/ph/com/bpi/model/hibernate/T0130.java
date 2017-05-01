package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0130 {

private int id;
private String trdrFi;
private String trdrDesc;
private String trdrPcc;
private String forcUnld;
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

public String getTrdrPcc() {
	return trdrPcc;
}

public void setTrdrPcc(String trdrPcc) {
	this.trdrPcc = trdrPcc;
}

public String getForcUnld() {
	return forcUnld;
}

public void setForcUnld(String forcUnld) {
	this.forcUnld = forcUnld;
}

public String getTranFi() {
	return tranFi;
}

public void setTranFi(String tranFi) {
	this.tranFi = tranFi;
}

public void parse(HashMap<String, String> map){

	for(String key: map.keySet()){
		switch(key){
			case "TRDR_FI":
				trdrFi = (map.get(key));
				break;

			case "TRDR_DESC":
				trdrDesc=(map.get(key));
				break;

			case "TRDR_PCC":
				trdrPcc=(map.get(key));
				break;

			case "FORC_UNLD":
				forcUnld=(map.get(key));
				break;
			case "TRAN_FI":
				tranFi=(map.get(key));
				break;
		}
	}
}
}