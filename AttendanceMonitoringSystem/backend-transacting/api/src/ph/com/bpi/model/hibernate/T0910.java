package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0910 extends TModelBase {

	private int id;
	private String refNmbr;
	private BigDecimal totlAmt;
	private String tranUnit;
	private String brchCode;
	private String currCode;
	private String tcSerNo;
	private BigDecimal tcAmt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRefNmbr() {
		return refNmbr;
	}

	public void setRefNmbr(String refNmbr) {
		this.refNmbr = refNmbr;
	}

	public BigDecimal getTotlAmt() {
		return totlAmt;
	}

	public void setTotlAmt(BigDecimal totlAmt) {
		this.totlAmt = totlAmt;
	}

	public String getTranUnit() {
		return tranUnit;
	}

	public void setTranUnit(String tranUnit) {
		this.tranUnit = tranUnit;
	}

	public String getBrchCode() {
		return brchCode;
	}

	public void setBrchCode(String brchCode) {
		this.brchCode = brchCode;
	}

	public String getCurrCode() {
		return currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public String getTcSerNo() {
		return tcSerNo;
	}

	public void setTcSerNo(String tcSerNo) {
		this.tcSerNo = tcSerNo;
	}

	public BigDecimal getTcAmt() {
		return tcAmt;
	}

	public void setTcAmt(BigDecimal tcAmt) {
		this.tcAmt = tcAmt;
	}

	@Override
	public String toString() {
		return "T0910 [id=" + id + ", refNmbr=" + refNmbr + ", totlAmt=" + totlAmt + ", tranUnit=" + tranUnit
				+ ", brchCode=" + brchCode + ", currCode=" + currCode + ", tcSerNo=" + tcSerNo + ", tcAmt=" + tcAmt
				+ "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "REFNMBR":
this.setRefNmbr(map.get(key));
break;
case "TOTLAMT":
this.setTotlAmt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "TRANUNIT":
this.setTranUnit(map.get(key));
break;
case "BRCHCODE":
this.setBrchCode(map.get(key));
break;
case "CURRCODE":
this.setCurrCode(map.get(key));
break;
case "TCSERNO":
this.setTcSerNo(map.get(key));
break;
case "TCAMT":
this.setTcAmt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;}}}}