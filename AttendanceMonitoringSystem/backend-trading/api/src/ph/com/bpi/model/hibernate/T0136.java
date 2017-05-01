package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.HashMap;

public class T0136 {

private int id;
private String trdrFi;
private BigDecimal intrLmit;
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
public BigDecimal getIntrLmit() {
	return intrLmit;
}
public void setIntrLmit(BigDecimal intrLmit) {
	this.intrLmit = intrLmit;
}

public void parse(HashMap<String, String> map){
	for(String key : map.keySet()){
		switch(key){
			case "TRDR_FI":
				this.setTrdrFi(map.get(key));
				break;
			case "INTR_LMIR":
				this.setIntrLmit(BigDecimal.valueOf(Long.valueOf(map.get(key))));
				break;
		}
	}
}

}