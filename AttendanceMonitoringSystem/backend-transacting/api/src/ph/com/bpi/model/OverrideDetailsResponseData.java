package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class OverrideDetailsResponseData   {
  
  private String tranDate = null;
  private String tranUnit = null;
  private String tranIndc = null;
  private String refNmbr = null;
  private String cLname = null;
  private String cFname = null;
  private String cMname = null;
  private String addr1 = null;
  private String addr2 = null;
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
  private Integer acptMode = null;
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
  private String bLname = null;
  private String bFname = null;
  private String bMname = null;
  private Date bBday = null;
  private String bAddr1 = null;
  private String bAddr2 = null;
  private String stelValid = null;
  private String inviCode = null;
  private String userid = null;
  private String termid = null;
  private String statRqst = null;
  private String rmrkBrch = null;
  private String rmrkTrdr = null;
  private Integer acptPost = null;
  private Integer setlPost = null;
  private Integer ovrdPtt = null;
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
  public Integer getAcptMode() {
    return acptMode;
  }
  public void setAcptMode(Integer acptMode) {
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
  @JsonProperty("stel_valid")
  public String getStelValid() {
    return stelValid;
  }
  public void setStelValid(String stelValid) {
    this.stelValid = stelValid;
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
  @JsonProperty("ovrd_ptt")
  public Integer getOvrdPtt() {
    return ovrdPtt;
  }
  public void setOvrdPtt(Integer ovrdPtt) {
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
    OverrideDetailsResponseData overrideDetailsResponseData = (OverrideDetailsResponseData) o;
    return Objects.equals(tranDate, overrideDetailsResponseData.tranDate) &&
        Objects.equals(tranUnit, overrideDetailsResponseData.tranUnit) &&
        Objects.equals(tranIndc, overrideDetailsResponseData.tranIndc) &&
        Objects.equals(refNmbr, overrideDetailsResponseData.refNmbr) &&
        Objects.equals(cLname, overrideDetailsResponseData.cLname) &&
        Objects.equals(cFname, overrideDetailsResponseData.cFname) &&
        Objects.equals(cMname, overrideDetailsResponseData.cMname) &&
        Objects.equals(addr1, overrideDetailsResponseData.addr1) &&
        Objects.equals(addr2, overrideDetailsResponseData.addr2) &&
        Objects.equals(telno, overrideDetailsResponseData.telno) &&
        Objects.equals(tin, overrideDetailsResponseData.tin) &&
        Objects.equals(bday, overrideDetailsResponseData.bday) &&
        Objects.equals(clntTag, overrideDetailsResponseData.clntTag) &&
        Objects.equals(corpTag, overrideDetailsResponseData.corpTag) &&
        Objects.equals(docuTag, overrideDetailsResponseData.docuTag) &&
        Objects.equals(mangUnit, overrideDetailsResponseData.mangUnit) &&
        Objects.equals(bookUnit, overrideDetailsResponseData.bookUnit) &&
        Objects.equals(currFr, overrideDetailsResponseData.currFr) &&
        Objects.equals(tranAmnt, overrideDetailsResponseData.tranAmnt) &&
        Objects.equals(dealRate, overrideDetailsResponseData.dealRate) &&
        Objects.equals(rqstRate, overrideDetailsResponseData.rqstRate) &&
        Objects.equals(grntRate, overrideDetailsResponseData.grntRate) &&
        Objects.equals(currTo, overrideDetailsResponseData.currTo) &&
        Objects.equals(equiAmnt, overrideDetailsResponseData.equiAmnt) &&
        Objects.equals(netAmnt, overrideDetailsResponseData.netAmnt) &&
        Objects.equals(acptMode, overrideDetailsResponseData.acptMode) &&
        Objects.equals(acptRefno, overrideDetailsResponseData.acptRefno) &&
        Objects.equals(achrgDed, overrideDetailsResponseData.achrgDed) &&
        Objects.equals(acptDocs, overrideDetailsResponseData.acptDocs) &&
        Objects.equals(acptComm, overrideDetailsResponseData.acptComm) &&
        Objects.equals(rLname, overrideDetailsResponseData.rLname) &&
        Objects.equals(rFname, overrideDetailsResponseData.rFname) &&
        Objects.equals(rMname, overrideDetailsResponseData.rMname) &&
        Objects.equals(atelValid, overrideDetailsResponseData.atelValid) &&
        Objects.equals(setlMode, overrideDetailsResponseData.setlMode) &&
        Objects.equals(setlRefno, overrideDetailsResponseData.setlRefno) &&
        Objects.equals(schrgDed, overrideDetailsResponseData.schrgDed) &&
        Objects.equals(setlDocs, overrideDetailsResponseData.setlDocs) &&
        Objects.equals(bLname, overrideDetailsResponseData.bLname) &&
        Objects.equals(bFname, overrideDetailsResponseData.bFname) &&
        Objects.equals(bMname, overrideDetailsResponseData.bMname) &&
        Objects.equals(bBday, overrideDetailsResponseData.bBday) &&
        Objects.equals(bAddr1, overrideDetailsResponseData.bAddr1) &&
        Objects.equals(bAddr2, overrideDetailsResponseData.bAddr2) &&
        Objects.equals(stelValid, overrideDetailsResponseData.stelValid) &&
        Objects.equals(inviCode, overrideDetailsResponseData.inviCode) &&
        Objects.equals(userid, overrideDetailsResponseData.userid) &&
        Objects.equals(termid, overrideDetailsResponseData.termid) &&
        Objects.equals(statRqst, overrideDetailsResponseData.statRqst) &&
        Objects.equals(rmrkBrch, overrideDetailsResponseData.rmrkBrch) &&
        Objects.equals(rmrkTrdr, overrideDetailsResponseData.rmrkTrdr) &&
        Objects.equals(acptPost, overrideDetailsResponseData.acptPost) &&
        Objects.equals(setlPost, overrideDetailsResponseData.setlPost) &&
        Objects.equals(ovrdPtt, overrideDetailsResponseData.ovrdPtt) &&
        Objects.equals(bTin, overrideDetailsResponseData.bTin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranDate, tranUnit, tranIndc, refNmbr, cLname, cFname, cMname, addr1, addr2, telno, tin, bday, clntTag, corpTag, docuTag, mangUnit, bookUnit, currFr, tranAmnt, dealRate, rqstRate, grntRate, currTo, equiAmnt, netAmnt, acptMode, acptRefno, achrgDed, acptDocs, acptComm, rLname, rFname, rMname, atelValid, setlMode, setlRefno, schrgDed, setlDocs, bLname, bFname, bMname, bBday, bAddr1, bAddr2, stelValid, inviCode, userid, termid, statRqst, rmrkBrch, rmrkTrdr, acptPost, setlPost, ovrdPtt, bTin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverrideDetailsResponseData {\n");
    
    sb.append("    tranDate: ").append(toIndentedString(tranDate)).append("\n");
    sb.append("    tranUnit: ").append(toIndentedString(tranUnit)).append("\n");
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
    sb.append("    atelValid: ").append(toIndentedString(atelValid)).append("\n");
    sb.append("    setlMode: ").append(toIndentedString(setlMode)).append("\n");
    sb.append("    setlRefno: ").append(toIndentedString(setlRefno)).append("\n");
    sb.append("    schrgDed: ").append(toIndentedString(schrgDed)).append("\n");
    sb.append("    setlDocs: ").append(toIndentedString(setlDocs)).append("\n");
    sb.append("    bLname: ").append(toIndentedString(bLname)).append("\n");
    sb.append("    bFname: ").append(toIndentedString(bFname)).append("\n");
    sb.append("    bMname: ").append(toIndentedString(bMname)).append("\n");
    sb.append("    bBday: ").append(toIndentedString(bBday)).append("\n");
    sb.append("    bAddr1: ").append(toIndentedString(bAddr1)).append("\n");
    sb.append("    bAddr2: ").append(toIndentedString(bAddr2)).append("\n");
    sb.append("    stelValid: ").append(toIndentedString(stelValid)).append("\n");
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

