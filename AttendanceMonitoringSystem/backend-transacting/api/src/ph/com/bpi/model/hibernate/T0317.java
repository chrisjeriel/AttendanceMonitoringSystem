package ph.com.bpi.model.hibernate;

import ph.com.bpi.model.TModelBase;
import java.util.HashMap;

import java.math.BigDecimal;

 public class T0317 extends TModelBase {

	private int id;
	private String tranDate;
	private String brchCode;
	private String trdrFi;
	private String tranIndc;
	private String refNmbr;
	private String cLName;
	private String cFName;
	private String cMName;
	private String cAddr1;
	private String cAddr2;
	private String telNo;
	private String tin;
	private String bday;
	private String clntTag;
	private String corpTag;
	private String docuTag;
	private String mangUnit;
	private String bookUnit;
	private String currFr;
	private BigDecimal tranAmnt;
	private BigDecimal dealRate;
	private BigDecimal rqstRate;
	private BigDecimal grntRate;
	private String currTo;
	private BigDecimal equiAmnt;
	private BigDecimal netAmnt;
	private BigDecimal acptMode;
	private String acptRefNo;
	private String achrgDed;
	private BigDecimal acptDocs;
	private BigDecimal acptComm;
	private String rLName;
	private String rFName;
	private String rMName;
	private String atelVald;
	private BigDecimal setlMode;
	private String setlRefNo;
	private String schrgDed;
	private BigDecimal setlDocs;
	private BigDecimal setlComm;
	private String bLName;
	private String bFName;
	private String bMName;
	private String bBday;
	private String bAddr1;
	private String bAddr2;
	private String stelVald;
	private String inviCode;
	private String userId;
	private String termId;
	private String statRqst;
	private String rmrkBrch;
	private String rmrkTrdr;
	private BigDecimal acptPost;
	private BigDecimal setlPost;
	private BigDecimal ovrdPtt;
	private String bTin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public String getBrchCode() {
		return brchCode;
	}

	public void setBrchCode(String brchCode) {
		this.brchCode = brchCode;
	}

	public String getTrdrFi() {
		return trdrFi;
	}

	public void setTrdrFi(String trdrFi) {
		this.trdrFi = trdrFi;
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

	public String getClntTag() {
		return clntTag;
	}

	public void setClntTag(String clntTag) {
		this.clntTag = clntTag;
	}

	public String getCorpTag() {
		return corpTag;
	}

	public void setCorpTag(String corpTag) {
		this.corpTag = corpTag;
	}

	public String getDocuTag() {
		return docuTag;
	}

	public void setDocuTag(String docuTag) {
		this.docuTag = docuTag;
	}

	public String getMangUnit() {
		return mangUnit;
	}

	public void setMangUnit(String mangUnit) {
		this.mangUnit = mangUnit;
	}

	public String getBookUnit() {
		return bookUnit;
	}

	public void setBookUnit(String bookUnit) {
		this.bookUnit = bookUnit;
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

	public BigDecimal getDealRate() {
		return dealRate;
	}

	public void setDealRate(BigDecimal dealRate) {
		this.dealRate = dealRate;
	}

	public BigDecimal getRqstRate() {
		return rqstRate;
	}

	public void setRqstRate(BigDecimal rqstRate) {
		this.rqstRate = rqstRate;
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

	public BigDecimal getEquiAmnt() {
		return equiAmnt;
	}

	public void setEquiAmnt(BigDecimal equiAmnt) {
		this.equiAmnt = equiAmnt;
	}

	public BigDecimal getNetAmnt() {
		return netAmnt;
	}

	public void setNetAmnt(BigDecimal netAmnt) {
		this.netAmnt = netAmnt;
	}

	public BigDecimal getAcptMode() {
		return acptMode;
	}

	public void setAcptMode(BigDecimal acptMode) {
		this.acptMode = acptMode;
	}

	public String getAcptRefNo() {
		return acptRefNo;
	}

	public void setAcptRefNo(String acptRefNo) {
		this.acptRefNo = acptRefNo;
	}

	public String getAchrgDed() {
		return achrgDed;
	}

	public void setAchrgDed(String achrgDed) {
		this.achrgDed = achrgDed;
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

	public String getAtelVald() {
		return atelVald;
	}

	public void setAtelVald(String atelVald) {
		this.atelVald = atelVald;
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

	public String getSchrgDed() {
		return schrgDed;
	}

	public void setSchrgDed(String schrgDed) {
		this.schrgDed = schrgDed;
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

	public String getStelVald() {
		return stelVald;
	}

	public void setStelVald(String stelVald) {
		this.stelVald = stelVald;
	}

	public String getInviCode() {
		return inviCode;
	}

	public void setInviCode(String inviCode) {
		this.inviCode = inviCode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	public String getStatRqst() {
		return statRqst;
	}

	public void setStatRqst(String statRqst) {
		this.statRqst = statRqst;
	}

	public String getRmrkBrch() {
		return rmrkBrch;
	}

	public void setRmrkBrch(String rmrkBrch) {
		this.rmrkBrch = rmrkBrch;
	}

	public String getRmrkTrdr() {
		return rmrkTrdr;
	}

	public void setRmrkTrdr(String rmrkTrdr) {
		this.rmrkTrdr = rmrkTrdr;
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

	public BigDecimal getOvrdPtt() {
		return ovrdPtt;
	}

	public void setOvrdPtt(BigDecimal ovrdPtt) {
		this.ovrdPtt = ovrdPtt;
	}

	public String getbTin() {
		return bTin;
	}

	public void setbTin(String bTin) {
		this.bTin = bTin;
	}

	@Override
	public String toString() {
		return "T0317 [id=" + id + ", tranDate=" + tranDate + ", brchCode=" + brchCode + ", trdrFi=" + trdrFi
				+ ", tranIndc=" + tranIndc + ", refNmbr=" + refNmbr + ", cLName=" + cLName + ", cFName=" + cFName
				+ ", cMName=" + cMName + ", cAddr1=" + cAddr1 + ", cAddr2=" + cAddr2 + ", telNo=" + telNo + ", tin="
				+ tin + ", bday=" + bday + ", clntTag=" + clntTag + ", corpTag=" + corpTag + ", docuTag=" + docuTag
				+ ", mangUnit=" + mangUnit + ", bookUnit=" + bookUnit + ", currFr=" + currFr + ", tranAmnt=" + tranAmnt
				+ ", dealRate=" + dealRate + ", rqstRate=" + rqstRate + ", grntRate=" + grntRate + ", currTo=" + currTo
				+ ", equiAmnt=" + equiAmnt + ", netAmnt=" + netAmnt + ", acptMode=" + acptMode + ", acptRefNo="
				+ acptRefNo + ", achrgDed=" + achrgDed + ", acptDocs=" + acptDocs + ", acptComm=" + acptComm
				+ ", rLName=" + rLName + ", rFName=" + rFName + ", rMName=" + rMName + ", atelVald=" + atelVald
				+ ", setlMode=" + setlMode + ", setlRefNo=" + setlRefNo + ", schrgDed=" + schrgDed + ", setlDocs="
				+ setlDocs + ", setlComm=" + setlComm + ", bLName=" + bLName + ", bFName=" + bFName + ", bMName="
				+ bMName + ", bBday=" + bBday + ", bAddr1=" + bAddr1 + ", bAddr2=" + bAddr2 + ", stelVald=" + stelVald
				+ ", inviCode=" + inviCode + ", userId=" + userId + ", termId=" + termId + ", statRqst=" + statRqst
				+ ", rmrkBrch=" + rmrkBrch + ", rmrkTrdr=" + rmrkTrdr + ", acptPost=" + acptPost + ", setlPost="
				+ setlPost + ", ovrdPtt=" + ovrdPtt + ", bTin=" + bTin + "]";
	

}
@Override
public void parse(HashMap<String, String> map){

		for(String key: map.keySet()){
			switch(key.replaceAll("_","")){
case "TRANDATE":
this.setTranDate(map.get(key));
break;
case "BRCHCODE":
this.setBrchCode(map.get(key));
break;
case "TRDRFI":
this.setTrdrFi(map.get(key));
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
case "CADDR1":
this.setcAddr1(map.get(key));
break;
case "CADDR2":
this.setcAddr2(map.get(key));
break;
case "TELNO":
this.setTelNo(map.get(key));
break;
case "TIN":
this.setTin(map.get(key));
break;
case "BDAY":
this.setBday(map.get(key));
break;
case "CLNTTAG":
this.setClntTag(map.get(key));
break;
case "CORPTAG":
this.setCorpTag(map.get(key));
break;
case "DOCUTAG":
this.setDocuTag(map.get(key));
break;
case "MANGUNIT":
this.setMangUnit(map.get(key));
break;
case "BOOKUNIT":
this.setBookUnit(map.get(key));
break;
case "CURRFR":
this.setCurrFr(map.get(key));
break;
case "TRANAMNT":
this.setTranAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "DEALRATE":
this.setDealRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "RQSTRATE":
this.setRqstRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "GRNTRATE":
this.setGrntRate(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "CURRTO":
this.setCurrTo(map.get(key));
break;
case "EQUIAMNT":
this.setEquiAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "NETAMNT":
this.setNetAmnt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "ACPTMODE":
this.setAcptMode(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "ACPTREFNO":
this.setAcptRefNo(map.get(key));
break;
case "ACHRGDED":
this.setAchrgDed(map.get(key));
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
case "ATELVALD":
this.setAtelVald(map.get(key));
break;
case "SETLMODE":
this.setSetlMode(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SETLREFNO":
this.setSetlRefNo(map.get(key));
break;
case "SCHRGDED":
this.setSchrgDed(map.get(key));
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
case "STELVALD":
this.setStelVald(map.get(key));
break;
case "INVICODE":
this.setInviCode(map.get(key));
break;
case "USERID":
this.setUserId(map.get(key));
break;
case "TERMID":
this.setTermId(map.get(key));
break;
case "STATRQST":
this.setStatRqst(map.get(key));
break;
case "RMRKBRCH":
this.setRmrkBrch(map.get(key));
break;
case "RMRKTRDR":
this.setRmrkTrdr(map.get(key));
break;
case "ACPTPOST":
this.setAcptPost(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "SETLPOST":
this.setSetlPost(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "OVRDPTT":
this.setOvrdPtt(BigDecimal.valueOf(Long.valueOf(map.get(key))));
break;
case "BTIN":
this.setbTin(map.get(key));
break;}}}}