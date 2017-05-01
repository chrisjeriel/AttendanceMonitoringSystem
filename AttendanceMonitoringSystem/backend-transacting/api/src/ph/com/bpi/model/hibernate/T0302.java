package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0302 extends TModelBase {

	private int id;
	private String cLName;
	private String cFName;
	private String cMName;
	private String cAddr1;
	private String cAddr2;
	private String bday;
	private String tel;
	private String tin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getcLName() {
		return cLName;
	}

	public void setcLName(String cLName) {
		this.cLName = cLName;
	}

	public String getcFName() {
		return cFName;
	}

	public void setcFName(String cFName) {
		this.cFName = cFName;
	}

	public String getcMName() {
		return cMName;
	}

	public void setcMName(String cMName) {
		this.cMName = cMName;
	}

	public String getcAddr1() {
		return cAddr1;
	}

	public void setcAddr1(String cAddr1) {
		this.cAddr1 = cAddr1;
	}

	public String getcAddr2() {
		return cAddr2;
	}

	public void setcAddr2(String cAddr2) {
		this.cAddr2 = cAddr2;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	@Override
	public String toString() {
		return "T0302 [id=" + id + ", cLName=" + cLName + ", cFName=" + cFName + ", cMName=" + cMName + ", cAddr1="
				+ cAddr1 + ", cAddr2=" + cAddr2 + ", bday=" + bday + ", tel=" + tel + ", tin=" + tin + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "CLNAME":
this.setcLName(map.get(key));
break;
case "CFNAME":
this.setcFName(map.get(key));
break;
case "CMNAME":
this.setcMName(map.get(key));
break;
case "CADDR1":
this.setcAddr1(map.get(key));
break;
case "CADDR2":
this.setcAddr2(map.get(key));
break;
case "BDAY":
this.setBday(map.get(key));
break;
case "TEL":
this.setTel(map.get(key));
break;
case "TIN":
this.setTin(map.get(key));
break;}}}}