package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class DailyDetailsResponseData   {
  
  private String tranDate = null;
  private String tranUnit = null;
  private String trdrFi = null;
  private String tranIndc = null;
  private String refNmbr = null;
  private String cLname = null;
  private String cFname = null;
  private String cMname = null;
  private String cAddr1 = null;
  private String cAddr2 = null;
  private String telno = null;
  private String tin = null;
  private Date bday = null;
  private String clntTag = null;
  private String corpTag = null;
  private String docuTag = null;
  private String mangUnit = null;
  private String bookUnit = null;
  private String currFr = null;
  private Integer tranAmnt = null;
  private Integer dealRate = null;
  private Integer rqstRate = null;
  private Integer grntRate = null;
  private String currTo = null;
  private Integer equiAmnt = null;
  private Integer netAmnt = null;
  private String acptMode = null;
  private String acptRefno = null;
  private String achrgDed = null;
  private Integer acptDocs = null;
  private Integer acptComm = null;
  private String rLname = null;
  private String rFname = null;
  private String rMname = null;
  private String atelValid = null;
  private Integer setlMode = null;
  private String setlRefno = null;
  private String schrgDed = null;
  private Integer setlDocs = null;
  private Integer setlComm = null;
  private String bLname = null;
  private String bFname = null;
  private String bMname = null;
  private Date bBday = null;
  private String bAddr1 = null;
  private String bAddr2 = null;
  private String stelVald = null;
  private String inviCode = null;
  private String userid = null;
  private String termId = null;
  private String statRqst = null;
  private String rmrkBrch = null;
  private String rmrkTrdr = null;
  private Integer acptPost = null;
  private Integer setlPost = null;
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
  @JsonProperty("c_addr1")
  public String getCAddr1() {
    return cAddr1;
  }
  public void setCAddr1(String cAddr1) {
    this.cAddr1 = cAddr1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("c_addr2")
  public String getCAddr2() {
    return cAddr2;
  }
  public void setCAddr2(String cAddr2) {
    this.cAddr2 = cAddr2;
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
  public Date getBday() {
    return bday;
  }
  public void setBday(Date bday) {
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
  public Integer getTranAmnt() {
    return tranAmnt;
  }
  public void setTranAmnt(Integer tranAmnt) {
    this.tranAmnt = tranAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deal_rate")
  public Integer getDealRate() {
    return dealRate;
  }
  public void setDealRate(Integer dealRate) {
    this.dealRate = dealRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rqst_rate")
  public Integer getRqstRate() {
    return rqstRate;
  }
  public void setRqstRate(Integer rqstRate) {
    this.rqstRate = rqstRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("grnt_rate")
  public Integer getGrntRate() {
    return grntRate;
  }
  public void setGrntRate(Integer grntRate) {
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
  public Integer getEquiAmnt() {
    return equiAmnt;
  }
  public void setEquiAmnt(Integer equiAmnt) {
    this.equiAmnt = equiAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("net_amnt")
  public Integer getNetAmnt() {
    return netAmnt;
  }
  public void setNetAmnt(Integer netAmnt) {
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
  public Integer getAcptDocs() {
    return acptDocs;
  }
  public void setAcptDocs(Integer acptDocs) {
    this.acptDocs = acptDocs;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acpt_comm")
  public Integer getAcptComm() {
    return acptComm;
  }
  public void setAcptComm(Integer acptComm) {
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
  @JsonProperty("atel_valid")
  public String getAtelValid() {
    return atelValid;
  }
  public void setAtelValid(String atelValid) {
    this.atelValid = atelValid;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("setl_mode")
  public Integer getSetlMode() {
    return setlMode;
  }
  public void setSetlMode(Integer setlMode) {
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
  public Integer getSetlDocs() {
    return setlDocs;
  }
  public void setSetlDocs(Integer setlDocs) {
    this.setlDocs = setlDocs;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("setl_comm")
  public Integer getSetlComm() {
    return setlComm;
  }
  public void setSetlComm(Integer setlComm) {
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
  public Date getBBday() {
    return bBday;
  }
  public void setBBday(Date bBday) {
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
  @JsonProperty("term_id")
  public String getTermId() {
    return termId;
  }
  public void setTermId(String termId) {
    this.termId = termId;
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
  public Integer getAcptPost() {
    return acptPost;
  }
  public void setAcptPost(Integer acptPost) {
    this.acptPost = acptPost;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("setl_post")
  public Integer getSetlPost() {
    return setlPost;
  }
  public void setSetlPost(Integer setlPost) {
    this.setlPost = setlPost;
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
    DailyDetailsResponseData dailyDetailsResponseData = (DailyDetailsResponseData) o;
    return Objects.equals(tranDate, dailyDetailsResponseData.tranDate) &&
        Objects.equals(tranUnit, dailyDetailsResponseData.tranUnit) &&
        Objects.equals(trdrFi, dailyDetailsResponseData.trdrFi) &&
        Objects.equals(tranIndc, dailyDetailsResponseData.tranIndc) &&
        Objects.equals(refNmbr, dailyDetailsResponseData.refNmbr) &&
        Objects.equals(cLname, dailyDetailsResponseData.cLname) &&
        Objects.equals(cFname, dailyDetailsResponseData.cFname) &&
        Objects.equals(cMname, dailyDetailsResponseData.cMname) &&
        Objects.equals(cAddr1, dailyDetailsResponseData.cAddr1) &&
        Objects.equals(cAddr2, dailyDetailsResponseData.cAddr2) &&
        Objects.equals(telno, dailyDetailsResponseData.telno) &&
        Objects.equals(tin, dailyDetailsResponseData.tin) &&
        Objects.equals(bday, dailyDetailsResponseData.bday) &&
        Objects.equals(clntTag, dailyDetailsResponseData.clntTag) &&
        Objects.equals(corpTag, dailyDetailsResponseData.corpTag) &&
        Objects.equals(docuTag, dailyDetailsResponseData.docuTag) &&
        Objects.equals(mangUnit, dailyDetailsResponseData.mangUnit) &&
        Objects.equals(bookUnit, dailyDetailsResponseData.bookUnit) &&
        Objects.equals(currFr, dailyDetailsResponseData.currFr) &&
        Objects.equals(tranAmnt, dailyDetailsResponseData.tranAmnt) &&
        Objects.equals(dealRate, dailyDetailsResponseData.dealRate) &&
        Objects.equals(rqstRate, dailyDetailsResponseData.rqstRate) &&
        Objects.equals(grntRate, dailyDetailsResponseData.grntRate) &&
        Objects.equals(currTo, dailyDetailsResponseData.currTo) &&
        Objects.equals(equiAmnt, dailyDetailsResponseData.equiAmnt) &&
        Objects.equals(netAmnt, dailyDetailsResponseData.netAmnt) &&
        Objects.equals(acptMode, dailyDetailsResponseData.acptMode) &&
        Objects.equals(acptRefno, dailyDetailsResponseData.acptRefno) &&
        Objects.equals(achrgDed, dailyDetailsResponseData.achrgDed) &&
        Objects.equals(acptDocs, dailyDetailsResponseData.acptDocs) &&
        Objects.equals(acptComm, dailyDetailsResponseData.acptComm) &&
        Objects.equals(rLname, dailyDetailsResponseData.rLname) &&
        Objects.equals(rFname, dailyDetailsResponseData.rFname) &&
        Objects.equals(rMname, dailyDetailsResponseData.rMname) &&
        Objects.equals(atelValid, dailyDetailsResponseData.atelValid) &&
        Objects.equals(setlMode, dailyDetailsResponseData.setlMode) &&
        Objects.equals(setlRefno, dailyDetailsResponseData.setlRefno) &&
        Objects.equals(schrgDed, dailyDetailsResponseData.schrgDed) &&
        Objects.equals(setlDocs, dailyDetailsResponseData.setlDocs) &&
        Objects.equals(setlComm, dailyDetailsResponseData.setlComm) &&
        Objects.equals(bLname, dailyDetailsResponseData.bLname) &&
        Objects.equals(bFname, dailyDetailsResponseData.bFname) &&
        Objects.equals(bMname, dailyDetailsResponseData.bMname) &&
        Objects.equals(bBday, dailyDetailsResponseData.bBday) &&
        Objects.equals(bAddr1, dailyDetailsResponseData.bAddr1) &&
        Objects.equals(bAddr2, dailyDetailsResponseData.bAddr2) &&
        Objects.equals(stelVald, dailyDetailsResponseData.stelVald) &&
        Objects.equals(inviCode, dailyDetailsResponseData.inviCode) &&
        Objects.equals(userid, dailyDetailsResponseData.userid) &&
        Objects.equals(termId, dailyDetailsResponseData.termId) &&
        Objects.equals(statRqst, dailyDetailsResponseData.statRqst) &&
        Objects.equals(rmrkBrch, dailyDetailsResponseData.rmrkBrch) &&
        Objects.equals(rmrkTrdr, dailyDetailsResponseData.rmrkTrdr) &&
        Objects.equals(acptPost, dailyDetailsResponseData.acptPost) &&
        Objects.equals(setlPost, dailyDetailsResponseData.setlPost) &&
        Objects.equals(bTin, dailyDetailsResponseData.bTin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranDate, tranUnit, trdrFi, tranIndc, refNmbr, cLname, cFname, cMname, cAddr1, cAddr2, telno, tin, bday, clntTag, corpTag, docuTag, mangUnit, bookUnit, currFr, tranAmnt, dealRate, rqstRate, grntRate, currTo, equiAmnt, netAmnt, acptMode, acptRefno, achrgDed, acptDocs, acptComm, rLname, rFname, rMname, atelValid, setlMode, setlRefno, schrgDed, setlDocs, setlComm, bLname, bFname, bMname, bBday, bAddr1, bAddr2, stelVald, inviCode, userid, termId, statRqst, rmrkBrch, rmrkTrdr, acptPost, setlPost, bTin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyDetailsResponseData {\n");
    
    sb.append("    tranDate: ").append(toIndentedString(tranDate)).append("\n");
    sb.append("    tranUnit: ").append(toIndentedString(tranUnit)).append("\n");
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    refNmbr: ").append(toIndentedString(refNmbr)).append("\n");
    sb.append("    cLname: ").append(toIndentedString(cLname)).append("\n");
    sb.append("    cFname: ").append(toIndentedString(cFname)).append("\n");
    sb.append("    cMname: ").append(toIndentedString(cMname)).append("\n");
    sb.append("    cAddr1: ").append(toIndentedString(cAddr1)).append("\n");
    sb.append("    cAddr2: ").append(toIndentedString(cAddr2)).append("\n");
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
    sb.append("    atelValid: ").append(toIndentedString(atelValid)).append("\n");
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
    sb.append("    termId: ").append(toIndentedString(termId)).append("\n");
    sb.append("    statRqst: ").append(toIndentedString(statRqst)).append("\n");
    sb.append("    rmrkBrch: ").append(toIndentedString(rmrkBrch)).append("\n");
    sb.append("    rmrkTrdr: ").append(toIndentedString(rmrkTrdr)).append("\n");
    sb.append("    acptPost: ").append(toIndentedString(acptPost)).append("\n");
    sb.append("    setlPost: ").append(toIndentedString(setlPost)).append("\n");
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

