package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0901 extends TModelBase {

	private int id;
	private String trdrFi;
	private BigDecimal runBal;
	private String refNmbr;
	private String mcSerNo;
	private String cLName;
	private String cFName;
	private String cMName;
	private BigDecimal phpAmt;

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

	public BigDecimal getRunBal() {
		return runBal;
	}

	public void setRunBal(BigDecimal runBal) {
		this.runBal = runBal;
	}

	public String getRefNmbr() {
		return refNmbr;
	}

	public void setRefNmbr(String refNmbr) {
		this.refNmbr = refNmbr;
	}

	public String getMcSerNo() {
		return mcSerNo;
	}

	public void setMcSerNo(String mcSerNo) {
		this.mcSerNo = mcSerNo;
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

	public BigDecimal getPhpAmt() {
		return phpAmt;
	}

	public void setPhpAmt(BigDecimal phpAmt) {
		this.phpAmt = phpAmt;
	}

	@Override
	public String toString() {
		return "T0901 [id=" + id + ", trdrFi=" + trdrFi + ", runBal=" + runBal + ", refNmbr=" + refNmbr + ", mcSerNo="
				+ mcSerNo + ", cLName=" + cLName + ", cFName=" + cFName + ", cMName=" + cMName + ", phpAmt=" + phpAmt
				+ "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "TRDRFI":
this.setTrdrFi(map.get(key));
break;
case "RUNBAL":
this.setRunBal(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "REFNMBR":
this.setRefNmbr(map.get(key));
break;
case "MCSERNO":
this.setMcSerNo(map.get(key));
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
case "PHPAMT":
this.setPhpAmt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;}}}}