package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0314 extends TModelBase {

	private int id;
	private String tranTrdr;
	private String tranIndc;
	private String refNmbr;
	private String cLName;
	private String cFName;
	private String cMName;
	private String addr1;
	private String addr2;
	private BigDecimal acptMode;
	private String currFr;
	private BigDecimal tranAmnt;
	private BigDecimal setlMode;
	private String currTo;
	private BigDecimal equiAmnt;
	private BigDecimal grntRate;
	private String statRqst;
	private String brchCode;
	private BigDecimal rqstRate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTranTrdr() {
		return tranTrdr;
	}

	public void setTranTrdr(String tranTrdr) {
		this.tranTrdr = tranTrdr;
	}

	public String getTranIndc() {
		return tranIndc;
	}

	public void setTranIndc(String tranIndc) {
		this.tranIndc = tranIndc;
	}

	public String getRefNmbr() {
		return refNmbr;
	}

	public void setRefNmbr(String refNmbr) {
		this.refNmbr = refNmbr;
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

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public BigDecimal getAcptMode() {
		return acptMode;
	}

	public void setAcptMode(BigDecimal acptMode) {
		this.acptMode = acptMode;
	}

	public String getCurrFr() {
		return currFr;
	}

	public void setCurrFr(String currFr) {
		this.currFr = currFr;
	}

	public BigDecimal getTranAmnt() {
		return tranAmnt;
	}

	public void setTranAmnt(BigDecimal tranAmnt) {
		this.tranAmnt = tranAmnt;
	}

	public BigDecimal getSetlMode() {
		return setlMode;
	}

	public void setSetlMode(BigDecimal setlMode) {
		this.setlMode = setlMode;
	}

	public String getCurrTo() {
		return currTo;
	}

	public void setCurrTo(String currTo) {
		this.currTo = currTo;
	}

	public BigDecimal getEquiAmnt() {
		return equiAmnt;
	}

	public void setEquiAmnt(BigDecimal equiAmnt) {
		this.equiAmnt = equiAmnt;
	}

	public BigDecimal getGrntRate() {
		return grntRate;
	}

	public void setGrntRate(BigDecimal grntRate) {
		this.grntRate = grntRate;
	}

	public String getStatRqst() {
		return statRqst;
	}

	public void setStatRqst(String statRqst) {
		this.statRqst = statRqst;
	}

	public String getBrchCode() {
		return brchCode;
	}

	public void setBrchCode(String brchCode) {
		this.brchCode = brchCode;
	}

	public BigDecimal getRqstRate() {
		return rqstRate;
	}

	public void setRqstRate(BigDecimal rqstRate) {
		this.rqstRate = rqstRate;
	}

	@Override
	public String toString() {
		return "T0314 [id=" + id + ", tranTrdr=" + tranTrdr + ", tranIndc=" + tranIndc + ", refNmbr=" + refNmbr
				+ ", cLName=" + cLName + ", cFName=" + cFName + ", cMName=" + cMName + ", addr1=" + addr1 + ", addr2="
				+ addr2 + ", acptMode=" + acptMode + ", currFr=" + currFr + ", tranAmnt=" + tranAmnt + ", setlMode="
				+ setlMode + ", currTo=" + currTo + ", equiAmnt=" + equiAmnt + ", grntRate=" + grntRate + ", statRqst="
				+ statRqst + ", brchCode=" + brchCode + ", rqstRate=" + rqstRate + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "TRANTRDR":
this.setTranTrdr(map.get(key));
break;
case "TRANINDC":
this.setTranIndc(map.get(key));
break;
case "REFNMBR":
this.setRefNmbr(map.get(key));
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
case "ADDR1":
this.setAddr1(map.get(key));
break;
case "ADDR2":
this.setAddr2(map.get(key));
break;
case "ACPTMODE":
this.setAcptMode(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "CURRFR":
this.setCurrFr(map.get(key));
break;
case "TRANAMNT":
this.setTranAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SETLMODE":
this.setSetlMode(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "CURRTO":
this.setCurrTo(map.get(key));
break;
case "EQUIAMNT":
this.setEquiAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "GRNTRATE":
this.setGrntRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "STATRQST":
this.setStatRqst(map.get(key));
break;
case "BRCHCODE":
this.setBrchCode(map.get(key));
break;
case "RQSTRATE":
this.setRqstRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;}}}}