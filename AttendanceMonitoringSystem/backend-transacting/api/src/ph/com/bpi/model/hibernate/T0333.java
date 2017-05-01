package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0333 extends TModelBase {

	private int id;
	private String clntName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClntName() {
		return clntName;
	}

	public void setClntName(String clntName) {
		this.clntName = clntName;
	}

	@Override
	public String toString() {
		return "T0333 [id=" + id + ", clntName=" + clntName + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "CLNTNAME":
this.setClntName(map.get(key));
break;}}}}