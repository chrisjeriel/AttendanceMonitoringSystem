package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0327 extends TModelBase {

	private int id;
	private String tranIndc;
	private String refNo;
	private String cLName;
	private String cFName;
	private String cMName;
	private String cAddr1;
	private String cAddr2;
	private String tel;
	private String tin;
	private String bday;
	private String tranUnit;
	private String currFr;
	private BigDecimal tranAmnt;
	private BigDecimal grntRate;
	private String currTo;
	private BigDecimal equivAmt;
	private BigDecimal netAmt;
	private BigDecimal acptMode;
	private String chckIndc;
	private String acptRefNo;
	private BigDecimal acptDocs;
	private BigDecimal acptComm;
	private String rLName;
	private String rFName;
	private String rMName;
	private String atelrVald;
	private String serlNmbr;
	private BigDecimal chckAmnt;
	private BigDecimal setlMode;
	private String setlRefNo;
	private BigDecimal setlDocs;
	private BigDecimal setlComm;
	private String bLName;
	private String bFName;
	private String bMName;
	private String bBday;
	private String bAddr1;
	private String bAddr2;
	private String stelrVald;
	private BigDecimal acptPost;
	private BigDecimal setlPost;
	private String bTin;

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

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
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

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public String getTranUnit() {
		return tranUnit;
	}

	public void setTranUnit(String tranUnit) {
		this.tranUnit = tranUnit;
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

	public BigDecimal getGrntRate() {
		return grntRate;
	}

	public void setGrntRate(BigDecimal grntRate) {
		this.grntRate = grntRate;
	}

	public String getCurrTo() {
		return currTo;
	}

	public void setCurrTo(String currTo) {
		this.currTo = currTo;
	}

	public BigDecimal getEquivAmt() {
		return equivAmt;
	}

	public void setEquivAmt(BigDecimal equivAmt) {
		this.equivAmt = equivAmt;
	}

	public BigDecimal getNetAmt() {
		return netAmt;
	}

	public void setNetAmt(BigDecimal netAmt) {
		this.netAmt = netAmt;
	}

	public BigDecimal getAcptMode() {
		return acptMode;
	}

	public void setAcptMode(BigDecimal acptMode) {
		this.acptMode = acptMode;
	}

	public String getChckIndc() {
		return chckIndc;
	}

	public void setChckIndc(String chckIndc) {
		this.chckIndc = chckIndc;
	}

	public String getAcptRefNo() {
		return acptRefNo;
	}

	public void setAcptRefNo(String acptRefNo) {
		this.acptRefNo = acptRefNo;
	}

	public BigDecimal getAcptDocs() {
		return acptDocs;
	}

	public void setAcptDocs(BigDecimal acptDocs) {
		this.acptDocs = acptDocs;
	}

	public BigDecimal getAcptComm() {
		return acptComm;
	}

	public void setAcptComm(BigDecimal acptComm) {
		this.acptComm = acptComm;
	}

	public String getrLName() {
		return rLName;
	}

	public void setrLName(String rLName) {
		this.rLName = rLName;
	}

	public String getrFName() {
		return rFName;
	}

	public void setrFName(String rFName) {
		this.rFName = rFName;
	}

	public String getrMName() {
		return rMName;
	}

	public void setrMName(String rMName) {
		this.rMName = rMName;
	}

	public String getAtelrVald() {
		return atelrVald;
	}

	public void setAtelrVald(String atelrVald) {
		this.atelrVald = atelrVald;
	}

	public String getSerlNmbr() {
		return serlNmbr;
	}

	public void setSerlNmbr(String serlNmbr) {
		this.serlNmbr = serlNmbr;
	}

	public BigDecimal getChckAmnt() {
		return chckAmnt;
	}

	public void setChckAmnt(BigDecimal chckAmnt) {
		this.chckAmnt = chckAmnt;
	}

	public BigDecimal getSetlMode() {
		return setlMode;
	}

	public void setSetlMode(BigDecimal setlMode) {
		this.setlMode = setlMode;
	}

	public String getSetlRefNo() {
		return setlRefNo;
	}

	public void setSetlRefNo(String setlRefNo) {
		this.setlRefNo = setlRefNo;
	}

	public BigDecimal getSetlDocs() {
		return setlDocs;
	}

	public void setSetlDocs(BigDecimal setlDocs) {
		this.setlDocs = setlDocs;
	}

	public BigDecimal getSetlComm() {
		return setlComm;
	}

	public void setSetlComm(BigDecimal setlComm) {
		this.setlComm = setlComm;
	}

	public String getbLName() {
		return bLName;
	}

	public void setbLName(String bLName) {
		this.bLName = bLName;
	}

	public String getbFName() {
		return bFName;
	}

	public void setbFName(String bFName) {
		this.bFName = bFName;
	}

	public String getbMName() {
		return bMName;
	}

	public void setbMName(String bMName) {
		this.bMName = bMName;
	}

	public String getbBday() {
		return bBday;
	}

	public void setbBday(String bBday) {
		this.bBday = bBday;
	}

	public String getbAddr1() {
		return bAddr1;
	}

	public void setbAddr1(String bAddr1) {
		this.bAddr1 = bAddr1;
	}

	public String getbAddr2() {
		return bAddr2;
	}

	public void setbAddr2(String bAddr2) {
		this.bAddr2 = bAddr2;
	}

	public String getStelrVald() {
		return stelrVald;
	}

	public void setStelrVald(String stelrVald) {
		this.stelrVald = stelrVald;
	}

	public BigDecimal getAcptPost() {
		return acptPost;
	}

	public void setAcptPost(BigDecimal acptPost) {
		this.acptPost = acptPost;
	}

	public BigDecimal getSetlPost() {
		return setlPost;
	}

	public void setSetlPost(BigDecimal setlPost) {
		this.setlPost = setlPost;
	}

	public String getbTin() {
		return bTin;
	}

	public void setbTin(String bTin) {
		this.bTin = bTin;
	}

	@Override
	public String toString() {
		return "T0327 [id=" + id + ", tranIndc=" + tranIndc + ", refNo=" + refNo + ", cLName=" + cLName + ", cFName="
				+ cFName + ", cMName=" + cMName + ", cAddr1=" + cAddr1 + ", cAddr2=" + cAddr2 + ", tel=" + tel
				+ ", tin=" + tin + ", bday=" + bday + ", tranUnit=" + tranUnit + ", currFr=" + currFr + ", tranAmnt="
				+ tranAmnt + ", grntRate=" + grntRate + ", currTo=" + currTo + ", equivAmt=" + equivAmt + ", netAmt="
				+ netAmt + ", acptMode=" + acptMode + ", chckIndc=" + chckIndc + ", acptRefNo=" + acptRefNo
				+ ", acptDocs=" + acptDocs + ", acptComm=" + acptComm + ", rLName=" + rLName + ", rFName=" + rFName
				+ ", rMName=" + rMName + ", atelrVald=" + atelrVald + ", serlNmbr=" + serlNmbr + ", chckAmnt="
				+ chckAmnt + ", setlMode=" + setlMode + ", setlRefNo=" + setlRefNo + ", setlDocs=" + setlDocs
				+ ", setlComm=" + setlComm + ", bLName=" + bLName + ", bFName=" + bFName + ", bMName=" + bMName
				+ ", bBday=" + bBday + ", bAddr1=" + bAddr1 + ", bAddr2=" + bAddr2 + ", stelrVald=" + stelrVald
				+ ", acptPost=" + acptPost + ", setlPost=" + setlPost + ", bTin=" + bTin + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "TRANINDC":
this.setTranIndc(map.get(key));
break;
case "REFNO":
this.setRefNo(map.get(key));
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
case "CADDR1":
this.setcAddr1(map.get(key));
break;
case "CADDR2":
this.setcAddr2(map.get(key));
break;
case "TEL":
this.setTel(map.get(key));
break;
case "TIN":
this.setTin(map.get(key));
break;
case "BDAY":
this.setBday(map.get(key));
break;
case "TRANUNIT":
this.setTranUnit(map.get(key));
break;
case "CURRFR":
this.setCurrFr(map.get(key));
break;
case "TRANAMNT":
this.setTranAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "GRNTRATE":
this.setGrntRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "CURRTO":
this.setCurrTo(map.get(key));
break;
case "EQUIVAMT":
this.setEquivAmt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "NETAMT":
this.setNetAmt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "ACPTMODE":
this.setAcptMode(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "CHCKINDC":
this.setChckIndc(map.get(key));
break;
case "ACPTREFNO":
this.setAcptRefNo(map.get(key));
break;
case "ACPTDOCS":
this.setAcptDocs(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "ACPTCOMM":
this.setAcptComm(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "RLNAME":
this.setrLName(map.get(key));
break;
case "RFNAME":
this.setrFName(map.get(key));
break;
case "RMNAME":
this.setrMName(map.get(key));
break;
case "ATELRVALD":
this.setAtelrVald(map.get(key));
break;
case "SERLNMBR":
this.setSerlNmbr(map.get(key));
break;
case "CHCKAMNT":
this.setChckAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SETLMODE":
this.setSetlMode(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SETLREFNO":
this.setSetlRefNo(map.get(key));
break;
case "SETLDOCS":
this.setSetlDocs(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SETLCOMM":
this.setSetlComm(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "BLNAME":
this.setbLName(map.get(key));
break;
case "BFNAME":
this.setbFName(map.get(key));
break;
case "BMNAME":
this.setbMName(map.get(key));
break;
case "BBDAY":
this.setbBday(map.get(key));
break;
case "BADDR1":
this.setbAddr1(map.get(key));
break;
case "BADDR2":
this.setbAddr2(map.get(key));
break;
case "STELRVALD":
this.setStelrVald(map.get(key));
break;
case "ACPTPOST":
this.setAcptPost(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SETLPOST":
this.setSetlPost(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "BTIN":
this.setbTin(map.get(key));
break;}}}}