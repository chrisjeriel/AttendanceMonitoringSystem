package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0334 extends TModelBase {

	private int id;
	private String tranIndc;
	private String cLName;
	private String cFName;
	private String cMName;
	private BigDecimal accmAmnt;
	private BigDecimal accmAmnt2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTranIndc() {
		return tranIndc;
	}

	public void setTranIndc(String tranIndc) {
		this.tranIndc = tranIndc;
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

	public BigDecimal getAccmAmnt() {
		return accmAmnt;
	}

	public void setAccmAmnt(BigDecimal accmAmnt) {
		this.accmAmnt = accmAmnt;
	}

	public BigDecimal getAccmAmnt2() {
		return accmAmnt2;
	}

	public void setAccmAmnt2(BigDecimal accmAmnt2) {
		this.accmAmnt2 = accmAmnt2;
	}

	@Override
	public String toString() {
		return "T0334 [id=" + id + ", tranIndc=" + tranIndc + ", cLName=" + cLName + ", cFName=" + cFName + ", cMName="
				+ cMName + ", accmAmnt=" + accmAmnt + ", accmAmnt2=" + accmAmnt2 + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "TRANINDC":
this.setTranIndc(map.get(key));
break;
case "CLNAME":
this.setcLName(map.get(key));
break;
case "CFNAME":
this.setcFName(map.get(key));
break;
case "CMNAME":
this.setcMName(map.get(key));
break;
case "ACCMAMNT":
this.setAccmAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "ACCMAMNT2":
this.setAccmAmnt2(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;}}}}