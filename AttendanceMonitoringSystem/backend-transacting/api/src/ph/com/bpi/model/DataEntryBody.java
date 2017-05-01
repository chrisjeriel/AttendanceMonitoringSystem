package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class DataEntryBody   {
  
  private String tranIndc = null;
  private String trdrFi = null;
  private String cLname = null;
  private String cFname = null;
  private String cMname = null;
  private String cAddr1 = null;
  private String cAddr2 = null;
  private String telno = null;
  private String tin = null;
  private Date bday = null;
  private String custIndc = null;
  private String corpTag = null;
  private String docuTag = null;
  private String gOffCode = null;
  private String bookUnit = null;
  private String mangUnit = null;
  private Integer dealRate = null;
  private Integer rqstRate = null;
  private Integer grntRate = null;
  private Integer netAmnt = null;
  private Integer acptAmnt = null;
  private String currFr = null;
  private Integer acptMode = null;
  private String acptCheckIndc = null;
  private Boolean chkdtl1 = null;
  private String acptRefno = null;
  private String achrgDed = null;
  private Integer acptDocs = null;
  private Integer acptComm = null;
  private Integer acptPost = null;
  private String rLname = null;
  private String rFname = null;
  private String rMname = null;
  private Integer setlAmnt = null;
  private String currTo = null;
  private Integer setlMode = null;
  private String setlChckIndc = null;
  private Boolean chkdtl2 = null;
  private String setlRefno = null;
  private String schrgDed = null;
  private Integer setlDocs = null;
  private Integer setlComm = null;
  private Integer setlPost = null;
  private String bLname = null;
  private String bFname = null;
  private String bMname = null;
  private Date bBday = null;
  private String bAddr1 = null;
  private String bAddr2 = null;
  private String bTin = null;
  private String inviCode = null;
  private String guserid = null;
  private String rmrkBrch = null;
  private Integer overdId1 = null;
  private Integer overdId2 = null;
  private Integer overdPtt = null;
  private Integer beneTag = null;
  private Integer tranTag = null;
  private Integer fvecTag = null;

  
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
  @JsonProperty("cust_indc")
  public String getCustIndc() {
    return custIndc;
  }
  public void setCustIndc(String custIndc) {
    this.custIndc = custIndc;
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
  @JsonProperty("gOffCode")
  public String getGOffCode() {
    return gOffCode;
  }
  public void setGOffCode(String gOffCode) {
    this.gOffCode = gOffCode;
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
  @JsonProperty("acpt_amnt")
  public Integer getAcptAmnt() {
    return acptAmnt;
  }
  public void setAcptAmnt(Integer acptAmnt) {
    this.acptAmnt = acptAmnt;
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
  @JsonProperty("acpt_check_indc")
  public String getAcptCheckIndc() {
    return acptCheckIndc;
  }
  public void setAcptCheckIndc(String acptCheckIndc) {
    this.acptCheckIndc = acptCheckIndc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("chkdtl1")
  public Boolean getChkdtl1() {
    return chkdtl1;
  }
  public void setChkdtl1(Boolean chkdtl1) {
    this.chkdtl1 = chkdtl1;
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
  @JsonProperty("setl_amnt")
  public Integer getSetlAmnt() {
    return setlAmnt;
  }
  public void setSetlAmnt(Integer setlAmnt) {
    this.setlAmnt = setlAmnt;
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
  @JsonProperty("setl_chck_indc")
  public String getSetlChckIndc() {
    return setlChckIndc;
  }
  public void setSetlChckIndc(String setlChckIndc) {
    this.setlChckIndc = setlChckIndc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("chkdtl2")
  public Boolean getChkdtl2() {
    return chkdtl2;
  }
  public void setChkdtl2(Boolean chkdtl2) {
    this.chkdtl2 = chkdtl2;
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
  @JsonProperty("b_tin")
  public String getBTin() {
    return bTin;
  }
  public void setBTin(String bTin) {
    this.bTin = bTin;
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
  @JsonProperty("guserid")
  public String getGuserid() {
    return guserid;
  }
  public void setGuserid(String guserid) {
    this.guserid = guserid;
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
  @JsonProperty("overd_id1")
  public Integer getOverdId1() {
    return overdId1;
  }
  public void setOverdId1(Integer overdId1) {
    this.overdId1 = overdId1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("overd_id2")
  public Integer getOverdId2() {
    return overdId2;
  }
  public void setOverdId2(Integer overdId2) {
    this.overdId2 = overdId2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("overd_ptt")
  public Integer getOverdPtt() {
    return overdPtt;
  }
  public void setOverdPtt(Integer overdPtt) {
    this.overdPtt = overdPtt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bene_tag")
  public Integer getBeneTag() {
    return beneTag;
  }
  public void setBeneTag(Integer beneTag) {
    this.beneTag = beneTag;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_tag")
  public Integer getTranTag() {
    return tranTag;
  }
  public void setTranTag(Integer tranTag) {
    this.tranTag = tranTag;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fvec_tag")
  public Integer getFvecTag() {
    return fvecTag;
  }
  public void setFvecTag(Integer fvecTag) {
    this.fvecTag = fvecTag;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataEntryBody dataEntryBody = (DataEntryBody) o;
    return Objects.equals(tranIndc, dataEntryBody.tranIndc) &&
        Objects.equals(trdrFi, dataEntryBody.trdrFi) &&
        Objects.equals(cLname, dataEntryBody.cLname) &&
        Objects.equals(cFname, dataEntryBody.cFname) &&
        Objects.equals(cMname, dataEntryBody.cMname) &&
        Objects.equals(cAddr1, dataEntryBody.cAddr1) &&
        Objects.equals(cAddr2, dataEntryBody.cAddr2) &&
        Objects.equals(telno, dataEntryBody.telno) &&
        Objects.equals(tin, dataEntryBody.tin) &&
        Objects.equals(bday, dataEntryBody.bday) &&
        Objects.equals(custIndc, dataEntryBody.custIndc) &&
        Objects.equals(corpTag, dataEntryBody.corpTag) &&
        Objects.equals(docuTag, dataEntryBody.docuTag) &&
        Objects.equals(gOffCode, dataEntryBody.gOffCode) &&
        Objects.equals(bookUnit, dataEntryBody.bookUnit) &&
        Objects.equals(mangUnit, dataEntryBody.mangUnit) &&
        Objects.equals(dealRate, dataEntryBody.dealRate) &&
        Objects.equals(rqstRate, dataEntryBody.rqstRate) &&
        Objects.equals(grntRate, dataEntryBody.grntRate) &&
        Objects.equals(netAmnt, dataEntryBody.netAmnt) &&
        Objects.equals(acptAmnt, dataEntryBody.acptAmnt) &&
        Objects.equals(currFr, dataEntryBody.currFr) &&
        Objects.equals(acptMode, dataEntryBody.acptMode) &&
        Objects.equals(acptCheckIndc, dataEntryBody.acptCheckIndc) &&
        Objects.equals(chkdtl1, dataEntryBody.chkdtl1) &&
        Objects.equals(acptRefno, dataEntryBody.acptRefno) &&
        Objects.equals(achrgDed, dataEntryBody.achrgDed) &&
        Objects.equals(acptDocs, dataEntryBody.acptDocs) &&
        Objects.equals(acptComm, dataEntryBody.acptComm) &&
        Objects.equals(acptPost, dataEntryBody.acptPost) &&
        Objects.equals(rLname, dataEntryBody.rLname) &&
        Objects.equals(rFname, dataEntryBody.rFname) &&
        Objects.equals(rMname, dataEntryBody.rMname) &&
        Objects.equals(setlAmnt, dataEntryBody.setlAmnt) &&
        Objects.equals(currTo, dataEntryBody.currTo) &&
        Objects.equals(setlMode, dataEntryBody.setlMode) &&
        Objects.equals(setlChckIndc, dataEntryBody.setlChckIndc) &&
        Objects.equals(chkdtl2, dataEntryBody.chkdtl2) &&
        Objects.equals(setlRefno, dataEntryBody.setlRefno) &&
        Objects.equals(schrgDed, dataEntryBody.schrgDed) &&
        Objects.equals(setlDocs, dataEntryBody.setlDocs) &&
        Objects.equals(setlComm, dataEntryBody.setlComm) &&
        Objects.equals(setlPost, dataEntryBody.setlPost) &&
        Objects.equals(bLname, dataEntryBody.bLname) &&
        Objects.equals(bFname, dataEntryBody.bFname) &&
        Objects.equals(bMname, dataEntryBody.bMname) &&
        Objects.equals(bBday, dataEntryBody.bBday) &&
        Objects.equals(bAddr1, dataEntryBody.bAddr1) &&
        Objects.equals(bAddr2, dataEntryBody.bAddr2) &&
        Objects.equals(bTin, dataEntryBody.bTin) &&
        Objects.equals(inviCode, dataEntryBody.inviCode) &&
        Objects.equals(guserid, dataEntryBody.guserid) &&
        Objects.equals(rmrkBrch, dataEntryBody.rmrkBrch) &&
        Objects.equals(overdId1, dataEntryBody.overdId1) &&
        Objects.equals(overdId2, dataEntryBody.overdId2) &&
        Objects.equals(overdPtt, dataEntryBody.overdPtt) &&
        Objects.equals(beneTag, dataEntryBody.beneTag) &&
        Objects.equals(tranTag, dataEntryBody.tranTag) &&
        Objects.equals(fvecTag, dataEntryBody.fvecTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranIndc, trdrFi, cLname, cFname, cMname, cAddr1, cAddr2, telno, tin, bday, custIndc, corpTag, docuTag, gOffCode, bookUnit, mangUnit, dealRate, rqstRate, grntRate, netAmnt, acptAmnt, currFr, acptMode, acptCheckIndc, chkdtl1, acptRefno, achrgDed, acptDocs, acptComm, acptPost, rLname, rFname, rMname, setlAmnt, currTo, setlMode, setlChckIndc, chkdtl2, setlRefno, schrgDed, setlDocs, setlComm, setlPost, bLname, bFname, bMname, bBday, bAddr1, bAddr2, bTin, inviCode, guserid, rmrkBrch, overdId1, overdId2, overdPtt, beneTag, tranTag, fvecTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataEntryBody {\n");
    
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    cLname: ").append(toIndentedString(cLname)).append("\n");
    sb.append("    cFname: ").append(toIndentedString(cFname)).append("\n");
    sb.append("    cMname: ").append(toIndentedString(cMname)).append("\n");
    sb.append("    cAddr1: ").append(toIndentedString(cAddr1)).append("\n");
    sb.append("    cAddr2: ").append(toIndentedString(cAddr2)).append("\n");
    sb.append("    telno: ").append(toIndentedString(telno)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    bday: ").append(toIndentedString(bday)).append("\n");
    sb.append("    custIndc: ").append(toIndentedString(custIndc)).append("\n");
    sb.append("    corpTag: ").append(toIndentedString(corpTag)).append("\n");
    sb.append("    docuTag: ").append(toIndentedString(docuTag)).append("\n");
    sb.append("    gOffCode: ").append(toIndentedString(gOffCode)).append("\n");
    sb.append("    bookUnit: ").append(toIndentedString(bookUnit)).append("\n");
    sb.append("    mangUnit: ").append(toIndentedString(mangUnit)).append("\n");
    sb.append("    dealRate: ").append(toIndentedString(dealRate)).append("\n");
    sb.append("    rqstRate: ").append(toIndentedString(rqstRate)).append("\n");
    sb.append("    grntRate: ").append(toIndentedString(grntRate)).append("\n");
    sb.append("    netAmnt: ").append(toIndentedString(netAmnt)).append("\n");
    sb.append("    acptAmnt: ").append(toIndentedString(acptAmnt)).append("\n");
    sb.append("    currFr: ").append(toIndentedString(currFr)).append("\n");
    sb.append("    acptMode: ").append(toIndentedString(acptMode)).append("\n");
    sb.append("    acptCheckIndc: ").append(toIndentedString(acptCheckIndc)).append("\n");
    sb.append("    chkdtl1: ").append(toIndentedString(chkdtl1)).append("\n");
    sb.append("    acptRefno: ").append(toIndentedString(acptRefno)).append("\n");
    sb.append("    achrgDed: ").append(toIndentedString(achrgDed)).append("\n");
    sb.append("    acptDocs: ").append(toIndentedString(acptDocs)).append("\n");
    sb.append("    acptComm: ").append(toIndentedString(acptComm)).append("\n");
    sb.append("    acptPost: ").append(toIndentedString(acptPost)).append("\n");
    sb.append("    rLname: ").append(toIndentedString(rLname)).append("\n");
    sb.append("    rFname: ").append(toIndentedString(rFname)).append("\n");
    sb.append("    rMname: ").append(toIndentedString(rMname)).append("\n");
    sb.append("    setlAmnt: ").append(toIndentedString(setlAmnt)).append("\n");
    sb.append("    currTo: ").append(toIndentedString(currTo)).append("\n");
    sb.append("    setlMode: ").append(toIndentedString(setlMode)).append("\n");
    sb.append("    setlChckIndc: ").append(toIndentedString(setlChckIndc)).append("\n");
    sb.append("    chkdtl2: ").append(toIndentedString(chkdtl2)).append("\n");
    sb.append("    setlRefno: ").append(toIndentedString(setlRefno)).append("\n");
    sb.append("    schrgDed: ").append(toIndentedString(schrgDed)).append("\n");
    sb.append("    setlDocs: ").append(toIndentedString(setlDocs)).append("\n");
    sb.append("    setlComm: ").append(toIndentedString(setlComm)).append("\n");
    sb.append("    setlPost: ").append(toIndentedString(setlPost)).append("\n");
    sb.append("    bLname: ").append(toIndentedString(bLname)).append("\n");
    sb.append("    bFname: ").append(toIndentedString(bFname)).append("\n");
    sb.append("    bMname: ").append(toIndentedString(bMname)).append("\n");
    sb.append("    bBday: ").append(toIndentedString(bBday)).append("\n");
    sb.append("    bAddr1: ").append(toIndentedString(bAddr1)).append("\n");
    sb.append("    bAddr2: ").append(toIndentedString(bAddr2)).append("\n");
    sb.append("    bTin: ").append(toIndentedString(bTin)).append("\n");
    sb.append("    inviCode: ").append(toIndentedString(inviCode)).append("\n");
    sb.append("    guserid: ").append(toIndentedString(guserid)).append("\n");
    sb.append("    rmrkBrch: ").append(toIndentedString(rmrkBrch)).append("\n");
    sb.append("    overdId1: ").append(toIndentedString(overdId1)).append("\n");
    sb.append("    overdId2: ").append(toIndentedString(overdId2)).append("\n");
    sb.append("    overdPtt: ").append(toIndentedString(overdPtt)).append("\n");
    sb.append("    beneTag: ").append(toIndentedString(beneTag)).append("\n");
    sb.append("    tranTag: ").append(toIndentedString(tranTag)).append("\n");
    sb.append("    fvecTag: ").append(toIndentedString(fvecTag)).append("\n");
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

