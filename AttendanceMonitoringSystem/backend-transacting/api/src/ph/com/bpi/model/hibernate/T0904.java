package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0904 extends TModelBase {

	private int id;
	private String tranIndc;
	private String cLName;
	private String cFName;
	private String cMName;
	private String bday;
	private String tin;
	private String cAddr1;
	private String cAddr2;
	private String telNo;
	private String tranDate;
	private String tranUnit;
	private String refNmbr;
	private String currFr;
	private String currTo;
	private BigDecimal tranAmnt;
	private BigDecimal usdAmnt;
	private String tranTime;

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

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
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

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public String getTranUnit() {
		return tranUnit;
	}

	public void setTranUnit(String tranUnit) {
		this.tranUnit = tranUnit;
	}

	public String getRefNmbr() {
		return refNmbr;
	}

	public void setRefNmbr(String refNmbr) {
		this.refNmbr = refNmbr;
	}

	public String getCurrFr() {
		return currFr;
	}

	public void setCurrFr(String currFr) {
		this.currFr = currFr;
	}

	public String getCurrTo() {
		return currTo;
	}

	public void setCurrTo(String currTo) {
		this.currTo = currTo;
	}

	public BigDecimal getTranAmnt() {
		return tranAmnt;
	}

	public void setTranAmnt(BigDecimal tranAmnt) {
		this.tranAmnt = tranAmnt;
	}

	public BigDecimal getUsdAmnt() {
		return usdAmnt;
	}

	public void setUsdAmnt(BigDecimal usdAmnt) {
		this.usdAmnt = usdAmnt;
	}

	public String getTranTime() {
		return tranTime;
	}

	public void setTranTime(String tranTime) {
		this.tranTime = tranTime;
	}

	@Override
	public String toString() {
		return "T0904 [id=" + id + ", tranIndc=" + tranIndc + ", cLName=" + cLName + ", cFName=" + cFName + ", cMName="
				+ cMName + ", bday=" + bday + ", tin=" + tin + ", cAddr1=" + cAddr1 + ", cAddr2=" + cAddr2 + ", telNo="
				+ telNo + ", tranDate=" + tranDate + ", tranUnit=" + tranUnit + ", refNmbr=" + refNmbr + ", currFr="
				+ currFr + ", currTo=" + currTo + ", tranAmnt=" + tranAmnt + ", usdAmnt=" + usdAmnt + ", tranTime="
				+ tranTime + "]";
	

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
case "BDAY":
this.setBday(map.get(key));
break;
case "TIN":
this.setTin(map.get(key));
break;
case "CADDR1":
this.setcAddr1(map.get(key));
break;
case "CADDR2":
this.setcAddr2(map.get(key));
break;
case "TELNO":
this.setTelNo(map.get(key));
break;
case "TRANDATE":
this.setTranDate(map.get(key));
break;
case "TRANUNIT":
this.setTranUnit(map.get(key));
break;
case "REFNMBR":
this.setRefNmbr(map.get(key));
break;
case "CURRFR":
this.setCurrFr(map.get(key));
break;
case "CURRTO":
this.setCurrTo(map.get(key));
break;
case "TRANAMNT":
this.setTranAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "USDAMNT":
this.setUsdAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "TRANTIME":
this.setTranTime(map.get(key));
break;}}}}