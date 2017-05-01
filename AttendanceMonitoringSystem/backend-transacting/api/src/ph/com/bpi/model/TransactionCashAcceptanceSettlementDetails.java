package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class TransactionCashAcceptanceSettlementDetails   {
  
  private String tranDate = null;
  private String tranUnit = null;
  private String trdrFi = null;
  private String tranIndc = null;
  private String refNmbr = null;
  private String cLname = null;
  private String cFname = null;
  private String cMname = null;
  private String addr1 = null;
  private String addr2 = null;
  private String telno = null;
  private String tin = null;
  private String bday = null;
  private String clntTag = null;
  private String corpTag = null;
  private String docuTag = null;
  private String mangUnit = null;
  private String bookUnit = null;
  private String currFr = null;
  private String tranAmnt = null;
  private String dealRate = null;
  private String rqstRate = null;
  private String grntRate = null;
  private String currTo = null;
  private String equiAmnt = null;
  private String netAmnt = null;
  private String acptMode = null;
  private String acptRefno = null;
  private String achrgDed = null;
  private String acptDocs = null;
  private String acptComm = null;
  private String rLname = null;
  private String rFname = null;
  private String rMname = null;
  private String atelVald = null;
  private String setlMode = null;
  private String setlRefno = null;
  private String schrgDed = null;
  private String setlDocs = null;
  private String setlComm = null;
  private String bLname = null;
  private String bFname = null;
  private String bMname = null;
  private String bBday = null;
  private String bAddr1 = null;
  private String bAddr2 = null;
  private String stelVald = null;
  private String inviCode = null;
  private String userid = null;
  private String termid = null;
  private String statRqst = null;
  private String rmrkBrch = null;
  private String rmrkTrdr = null;
  private String acptPost = null;
  private String setlPost = null;
  private String ovrdPtt = null;
  private String bTin = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_date")
  public String getTranDate() {
    return tranDate;
  }
  public void setTranDate(String tranDate) {
    this.tranDate = tranDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_unit")
  public String getTranUnit() {
    return tranUnit;
  }
  public void setTranUnit(String tranUnit) {
    this.tranUnit = tranUnit;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trdr_fi")
  public String getTrdrFi() {
    return trdrFi;
  }
  public void setTrdrFi(String trdrFi) {
    this.trdrFi = trdrFi;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_indc")
  public String getTranIndc() {
    return tranIndc;
  }
  public void setTranIndc(String tranIndc) {
    this.tranIndc = tranIndc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ref_nmbr")
  public String getRefNmbr() {
    return refNmbr;
  }
  public void setRefNmbr(String refNmbr) {
    this.refNmbr = refNmbr;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("c_lname")
  public String getCLname() {
    return cLname;
  }
  public void setCLname(String cLname) {
    this.cLname = cLname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("c_fname")
  public String getCFname() {
    return cFname;
  }
  public void setCFname(String cFname) {
    this.cFname = cFname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("c_mname")
  public String getCMname() {
    return cMname;
  }
  public void setCMname(String cMname) {
    this.cMname = cMname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("addr1")
  public String getAddr1() {
    return addr1;
  }
  public void setAddr1(String addr1) {
    this.addr1 = addr1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("addr2")
  public String getAddr2() {
    return addr2;
  }
  public void setAddr2(String addr2) {
    this.addr2 = addr2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("telno")
  public String getTelno() {
    return telno;
  }
  public void setTelno(String telno) {
    this.telno = telno;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tin")
  public String getTin() {
    return tin;
  }
  public void setTin(String tin) {
    this.tin = tin;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bday")
  public String getBday() {
    return bday;
  }
  public void setBday(String bday) {
    this.bday = bday;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("clnt_tag")
  public String getClntTag() {
    return clntTag;
  }
  public void setClntTag(String clntTag) {
    this.clntTag = clntTag;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("corp_tag")
  public String getCorpTag() {
    return corpTag;
  }
  public void setCorpTag(String corpTag) {
    this.corpTag = corpTag;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("docu_tag")
  public String getDocuTag() {
    return docuTag;
  }
  public void setDocuTag(String docuTag) {
    this.docuTag = docuTag;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mang_unit")
  public String getMangUnit() {
    return mangUnit;
  }
  public void setMangUnit(String mangUnit) {
    this.mangUnit = mangUnit;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("book_unit")
  public String getBookUnit() {
    return bookUnit;
  }
  public void setBookUnit(String bookUnit) {
    this.bookUnit = bookUnit;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("curr_fr")
  public String getCurrFr() {
    return currFr;
  }
  public void setCurrFr(String currFr) {
    this.currFr = currFr;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_amnt")
  public String getTranAmnt() {
    return tranAmnt;
  }
  public void setTranAmnt(String tranAmnt) {
    this.tranAmnt = tranAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deal_rate")
  public String getDealRate() {
    return dealRate;
  }
  public void setDealRate(String dealRate) {
    this.dealRate = dealRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rqst_rate")
  public String getRqstRate() {
    return rqstRate;
  }
  public void setRqstRate(String rqstRate) {
    this.rqstRate = rqstRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("grnt_rate")
  public String getGrntRate() {
    return grntRate;
  }
  public void setGrntRate(String grntRate) {
    this.grntRate = grntRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("curr_to")
  public String getCurrTo() {
    return currTo;
  }
  public void setCurrTo(String currTo) {
    this.currTo = currTo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("equi_amnt")
  public String getEquiAmnt() {
    return equiAmnt;
  }
  public void setEquiAmnt(String equiAmnt) {
    this.equiAmnt = equiAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("net_amnt")
  public String getNetAmnt() {
    return netAmnt;
  }
  public void setNetAmnt(String netAmnt) {
    this.netAmnt = netAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acpt_mode")
  public String getAcptMode() {
    return acptMode;
  }
  public void setAcptMode(String acptMode) {
    this.acptMode = acptMode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acpt_refno")
  public String getAcptRefno() {
    return acptRefno;
  }
  public void setAcptRefno(String acptRefno) {
    this.acptRefno = acptRefno;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("achrg_ded")
  public String getAchrgDed() {
    return achrgDed;
  }
  public void setAchrgDed(String achrgDed) {
    this.achrgDed = achrgDed;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acpt_docs")
  public String getAcptDocs() {
    return acptDocs;
  }
  public void setAcptDocs(String acptDocs) {
    this.acptDocs = acptDocs;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acpt_comm")
  public String getAcptComm() {
    return acptComm;
  }
  public void setAcptComm(String acptComm) {
    this.acptComm = acptComm;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("r_lname")
  public String getRLname() {
    return rLname;
  }
  public void setRLname(String rLname) {
    this.rLname = rLname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("r_fname")
  public String getRFname() {
    return rFname;
  }
  public void setRFname(String rFname) {
    this.rFname = rFname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("r_mname")
  public String getRMname() {
    return rMname;
  }
  public void setRMname(String rMname) {
    this.rMname = rMname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("atel_vald")
  public String getAtelVald() {
    return atelVald;
  }
  public void setAtelVald(String atelVald) {
    this.atelVald = atelVald;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("setl_mode")
  public String getSetlMode() {
    return setlMode;
  }
  public void setSetlMode(String setlMode) {
    this.setlMode = setlMode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("setl_refno")
  public String getSetlRefno() {
    return setlRefno;
  }
  public void setSetlRefno(String setlRefno) {
    this.setlRefno = setlRefno;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("schrg_ded")
  public String getSchrgDed() {
    return schrgDed;
  }
  public void setSchrgDed(String schrgDed) {
    this.schrgDed = schrgDed;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("setl_docs")
  public String getSetlDocs() {
    return setlDocs;
  }
  public void setSetlDocs(String setlDocs) {
    this.setlDocs = setlDocs;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("setl_comm")
  public String getSetlComm() {
    return setlComm;
  }
  public void setSetlComm(String setlComm) {
    this.setlComm = setlComm;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("b_lname")
  public String getBLname() {
    return bLname;
  }
  public void setBLname(String bLname) {
    this.bLname = bLname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("b_fname")
  public String getBFname() {
    return bFname;
  }
  public void setBFname(String bFname) {
    this.bFname = bFname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("b_mname")
  public String getBMname() {
    return bMname;
  }
  public void setBMname(String bMname) {
    this.bMname = bMname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("b_bday")
  public String getBBday() {
    return bBday;
  }
  public void setBBday(String bBday) {
    this.bBday = bBday;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("b_addr1")
  public String getBAddr1() {
    return bAddr1;
  }
  public void setBAddr1(String bAddr1) {
    this.bAddr1 = bAddr1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("b_addr2")
  public String getBAddr2() {
    return bAddr2;
  }
  public void setBAddr2(String bAddr2) {
    this.bAddr2 = bAddr2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stel_vald")
  public String getStelVald() {
    return stelVald;
  }
  public void setStelVald(String stelVald) {
    this.stelVald = stelVald;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("invi_code")
  public String getInviCode() {
    return inviCode;
  }
  public void setInviCode(String inviCode) {
    this.inviCode = inviCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userid")
  public String getUserid() {
    return userid;
  }
  public void setUserid(String userid) {
    this.userid = userid;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("termid")
  public String getTermid() {
    return termid;
  }
  public void setTermid(String termid) {
    this.termid = termid;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stat_rqst")
  public String getStatRqst() {
    return statRqst;
  }
  public void setStatRqst(String statRqst) {
    this.statRqst = statRqst;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rmrk_brch")
  public String getRmrkBrch() {
    return rmrkBrch;
  }
  public void setRmrkBrch(String rmrkBrch) {
    this.rmrkBrch = rmrkBrch;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rmrk_trdr")
  public String getRmrkTrdr() {
    return rmrkTrdr;
  }
  public void setRmrkTrdr(String rmrkTrdr) {
    this.rmrkTrdr = rmrkTrdr;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acpt_post")
  public String getAcptPost() {
    return acptPost;
  }
  public void setAcptPost(String acptPost) {
    this.acptPost = acptPost;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("setl_post")
  public String getSetlPost() {
    return setlPost;
  }
  public void setSetlPost(String setlPost) {
    this.setlPost = setlPost;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ovrd_ptt")
  public String getOvrdPtt() {
    return ovrdPtt;
  }
  public void setOvrdPtt(String ovrdPtt) {
    this.ovrdPtt = ovrdPtt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("b_tin")
  public String getBTin() {
    return bTin;
  }
  public void setBTin(String bTin) {
    this.bTin = bTin;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionCashAcceptanceSettlementDetails transactionCashAcceptanceSettlementDetails = (TransactionCashAcceptanceSettlementDetails) o;
    return Objects.equals(tranDate, transactionCashAcceptanceSettlementDetails.tranDate) &&
        Objects.equals(tranUnit, transactionCashAcceptanceSettlementDetails.tranUnit) &&
        Objects.equals(trdrFi, transactionCashAcceptanceSettlementDetails.trdrFi) &&
        Objects.equals(tranIndc, transactionCashAcceptanceSettlementDetails.tranIndc) &&
        Objects.equals(refNmbr, transactionCashAcceptanceSettlementDetails.refNmbr) &&
        Objects.equals(cLname, transactionCashAcceptanceSettlementDetails.cLname) &&
        Objects.equals(cFname, transactionCashAcceptanceSettlementDetails.cFname) &&
        Objects.equals(cMname, transactionCashAcceptanceSettlementDetails.cMname) &&
        Objects.equals(addr1, transactionCashAcceptanceSettlementDetails.addr1) &&
        Objects.equals(addr2, transactionCashAcceptanceSettlementDetails.addr2) &&
        Objects.equals(telno, transactionCashAcceptanceSettlementDetails.telno) &&
        Objects.equals(tin, transactionCashAcceptanceSettlementDetails.tin) &&
        Objects.equals(bday, transactionCashAcceptanceSettlementDetails.bday) &&
        Objects.equals(clntTag, transactionCashAcceptanceSettlementDetails.clntTag) &&
        Objects.equals(corpTag, transactionCashAcceptanceSettlementDetails.corpTag) &&
        Objects.equals(docuTag, transactionCashAcceptanceSettlementDetails.docuTag) &&
        Objects.equals(mangUnit, transactionCashAcceptanceSettlementDetails.mangUnit) &&
        Objects.equals(bookUnit, transactionCashAcceptanceSettlementDetails.bookUnit) &&
        Objects.equals(currFr, transactionCashAcceptanceSettlementDetails.currFr) &&
        Objects.equals(tranAmnt, transactionCashAcceptanceSettlementDetails.tranAmnt) &&
        Objects.equals(dealRate, transactionCashAcceptanceSettlementDetails.dealRate) &&
        Objects.equals(rqstRate, transactionCashAcceptanceSettlementDetails.rqstRate) &&
        Objects.equals(grntRate, transactionCashAcceptanceSettlementDetails.grntRate) &&
        Objects.equals(currTo, transactionCashAcceptanceSettlementDetails.currTo) &&
        Objects.equals(equiAmnt, transactionCashAcceptanceSettlementDetails.equiAmnt) &&
        Objects.equals(netAmnt, transactionCashAcceptanceSettlementDetails.netAmnt) &&
        Objects.equals(acptMode, transactionCashAcceptanceSettlementDetails.acptMode) &&
        Objects.equals(acptRefno, transactionCashAcceptanceSettlementDetails.acptRefno) &&
        Objects.equals(achrgDed, transactionCashAcceptanceSettlementDetails.achrgDed) &&
        Objects.equals(acptDocs, transactionCashAcceptanceSettlementDetails.acptDocs) &&
        Objects.equals(acptComm, transactionCashAcceptanceSettlementDetails.acptComm) &&
        Objects.equals(rLname, transactionCashAcceptanceSettlementDetails.rLname) &&
        Objects.equals(rFname, transactionCashAcceptanceSettlementDetails.rFname) &&
        Objects.equals(rMname, transactionCashAcceptanceSettlementDetails.rMname) &&
        Objects.equals(atelVald, transactionCashAcceptanceSettlementDetails.atelVald) &&
        Objects.equals(setlMode, transactionCashAcceptanceSettlementDetails.setlMode) &&
        Objects.equals(setlRefno, transactionCashAcceptanceSettlementDetails.setlRefno) &&
        Objects.equals(schrgDed, transactionCashAcceptanceSettlementDetails.schrgDed) &&
        Objects.equals(setlDocs, transactionCashAcceptanceSettlementDetails.setlDocs) &&
        Objects.equals(setlComm, transactionCashAcceptanceSettlementDetails.setlComm) &&
        Objects.equals(bLname, transactionCashAcceptanceSettlementDetails.bLname) &&
        Objects.equals(bFname, transactionCashAcceptanceSettlementDetails.bFname) &&
        Objects.equals(bMname, transactionCashAcceptanceSettlementDetails.bMname) &&
        Objects.equals(bBday, transactionCashAcceptanceSettlementDetails.bBday) &&
        Objects.equals(bAddr1, transactionCashAcceptanceSettlementDetails.bAddr1) &&
        Objects.equals(bAddr2, transactionCashAcceptanceSettlementDetails.bAddr2) &&
        Objects.equals(stelVald, transactionCashAcceptanceSettlementDetails.stelVald) &&
        Objects.equals(inviCode, transactionCashAcceptanceSettlementDetails.inviCode) &&
        Objects.equals(userid, transactionCashAcceptanceSettlementDetails.userid) &&
        Objects.equals(termid, transactionCashAcceptanceSettlementDetails.termid) &&
        Objects.equals(statRqst, transactionCashAcceptanceSettlementDetails.statRqst) &&
        Objects.equals(rmrkBrch, transactionCashAcceptanceSettlementDetails.rmrkBrch) &&
        Objects.equals(rmrkTrdr, transactionCashAcceptanceSettlementDetails.rmrkTrdr) &&
        Objects.equals(acptPost, transactionCashAcceptanceSettlementDetails.acptPost) &&
        Objects.equals(setlPost, transactionCashAcceptanceSettlementDetails.setlPost) &&
        Objects.equals(ovrdPtt, transactionCashAcceptanceSettlementDetails.ovrdPtt) &&
        Objects.equals(bTin, transactionCashAcceptanceSettlementDetails.bTin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranDate, tranUnit, trdrFi, tranIndc, refNmbr, cLname, cFname, cMname, addr1, addr2, telno, tin, bday, clntTag, corpTag, docuTag, mangUnit, bookUnit, currFr, tranAmnt, dealRate, rqstRate, grntRate, currTo, equiAmnt, netAmnt, acptMode, acptRefno, achrgDed, acptDocs, acptComm, rLname, rFname, rMname, atelVald, setlMode, setlRefno, schrgDed, setlDocs, setlComm, bLname, bFname, bMname, bBday, bAddr1, bAddr2, stelVald, inviCode, userid, termid, statRqst, rmrkBrch, rmrkTrdr, acptPost, setlPost, ovrdPtt, bTin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCashAcceptanceSettlementDetails {\n");
    
    sb.append("    tranDate: ").append(toIndentedString(tranDate)).append("\n");
    sb.append("    tranUnit: ").append(toIndentedString(tranUnit)).append("\n");
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    refNmbr: ").append(toIndentedString(refNmbr)).append("\n");
    sb.append("    cLname: ").append(toIndentedString(cLname)).append("\n");
    sb.append("    cFname: ").append(toIndentedString(cFname)).append("\n");
    sb.append("    cMname: ").append(toIndentedString(cMname)).append("\n");
    sb.append("    addr1: ").append(toIndentedString(addr1)).append("\n");
    sb.append("    addr2: ").append(toIndentedString(addr2)).append("\n");
    sb.append("    telno: ").append(toIndentedString(telno)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    bday: ").append(toIndentedString(bday)).append("\n");
    sb.append("    clntTag: ").append(toIndentedString(clntTag)).append("\n");
    sb.append("    corpTag: ").append(toIndentedString(corpTag)).append("\n");
    sb.append("    docuTag: ").append(toIndentedString(docuTag)).append("\n");
    sb.append("    mangUnit: ").append(toIndentedString(mangUnit)).append("\n");
    sb.append("    bookUnit: ").append(toIndentedString(bookUnit)).append("\n");
    sb.append("    currFr: ").append(toIndentedString(currFr)).append("\n");
    sb.append("    tranAmnt: ").append(toIndentedString(tranAmnt)).append("\n");
    sb.append("    dealRate: ").append(toIndentedString(dealRate)).append("\n");
    sb.append("    rqstRate: ").append(toIndentedString(rqstRate)).append("\n");
    sb.append("    grntRate: ").append(toIndentedString(grntRate)).append("\n");
    sb.append("    currTo: ").append(toIndentedString(currTo)).append("\n");
    sb.append("    equiAmnt: ").append(toIndentedString(equiAmnt)).append("\n");
    sb.append("    netAmnt: ").append(toIndentedString(netAmnt)).append("\n");
    sb.append("    acptMode: ").append(toIndentedString(acptMode)).append("\n");
    sb.append("    acptRefno: ").append(toIndentedString(acptRefno)).append("\n");
    sb.append("    achrgDed: ").append(toIndentedString(achrgDed)).append("\n");
    sb.append("    acptDocs: ").append(toIndentedString(acptDocs)).append("\n");
    sb.append("    acptComm: ").append(toIndentedString(acptComm)).append("\n");
    sb.append("    rLname: ").append(toIndentedString(rLname)).append("\n");
    sb.append("    rFname: ").append(toIndentedString(rFname)).append("\n");
    sb.append("    rMname: ").append(toIndentedString(rMname)).append("\n");
    sb.append("    atelVald: ").append(toIndentedString(atelVald)).append("\n");
    sb.append("    setlMode: ").append(toIndentedString(setlMode)).append("\n");
    sb.append("    setlRefno: ").append(toIndentedString(setlRefno)).append("\n");
    sb.append("    schrgDed: ").append(toIndentedString(schrgDed)).append("\n");
    sb.append("    setlDocs: ").append(toIndentedString(setlDocs)).append("\n");
    sb.append("    setlComm: ").append(toIndentedString(setlComm)).append("\n");
    sb.append("    bLname: ").append(toIndentedString(bLname)).append("\n");
    sb.append("    bFname: ").append(toIndentedString(bFname)).append("\n");
    sb.append("    bMname: ").append(toIndentedString(bMname)).append("\n");
    sb.append("    bBday: ").append(toIndentedString(bBday)).append("\n");
    sb.append("    bAddr1: ").append(toIndentedString(bAddr1)).append("\n");
    sb.append("    bAddr2: ").append(toIndentedString(bAddr2)).append("\n");
    sb.append("    stelVald: ").append(toIndentedString(stelVald)).append("\n");
    sb.append("    inviCode: ").append(toIndentedString(inviCode)).append("\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    termid: ").append(toIndentedString(termid)).append("\n");
    sb.append("    statRqst: ").append(toIndentedString(statRqst)).append("\n");
    sb.append("    rmrkBrch: ").append(toIndentedString(rmrkBrch)).append("\n");
    sb.append("    rmrkTrdr: ").append(toIndentedString(rmrkTrdr)).append("\n");
    sb.append("    acptPost: ").append(toIndentedString(acptPost)).append("\n");
    sb.append("    setlPost: ").append(toIndentedString(setlPost)).append("\n");
    sb.append("    ovrdPtt: ").append(toIndentedString(ovrdPtt)).append("\n");
    sb.append("    bTin: ").append(toIndentedString(bTin)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

