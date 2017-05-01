package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class TransactionORDetailsResponseData   {
  
  private String tranIndc = null;
  private String refNmbr = null;
  private String cLname = null;
  private String cFname = null;
  private String cMname = null;
  private String cAddr1 = null;
  private String cAddr2 = null;
  private String tel = null;
  private String tin = null;
  private String currFr = null;
  private Integer tranAmnt = null;
  private Integer grntRate = null;
  private String currTo = null;
  private Integer equiAmnt = null;
  private Integer netAmnt = null;
  private Integer acptMode = null;
  private String checkIndc = null;
  private String acptRefno = null;
  private Integer acptDocs = null;
  private Integer acptComm = null;
  private String rLname = null;
  private String rFname = null;
  private String rMname = null;
  private String atelrVald = null;
  private Integer serlNmbr = null;
  private Integer chckAmnt = null;
  private Integer setlMode = null;
  private String setlRefno = null;
  private Integer setlDocs = null;
  private Integer setlComm = null;
  private String bLname = null;
  private String bFname = null;
  private String bMname = null;
  private Date bBday = null;
  private String bAddr1 = null;
  private String bAddr2 = null;
  private String stelrVald = null;
  private Integer acptPost = null;
  private Integer setlPost = null;
  private String bTin = null;

  
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
  @JsonProperty("tel")
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
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
  @JsonProperty("check_indc")
  public String getCheckIndc() {
    return checkIndc;
  }
  public void setCheckIndc(String checkIndc) {
    this.checkIndc = checkIndc;
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
  @JsonProperty("atelr_vald")
  public String getAtelrVald() {
    return atelrVald;
  }
  public void setAtelrVald(String atelrVald) {
    this.atelrVald = atelrVald;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serl_nmbr")
  public Integer getSerlNmbr() {
    return serlNmbr;
  }
  public void setSerlNmbr(Integer serlNmbr) {
    this.serlNmbr = serlNmbr;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("chck_amnt")
  public Integer getChckAmnt() {
    return chckAmnt;
  }
  public void setChckAmnt(Integer chckAmnt) {
    this.chckAmnt = chckAmnt;
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
  @JsonProperty("stelr_vald")
  public String getStelrVald() {
    return stelrVald;
  }
  public void setStelrVald(String stelrVald) {
    this.stelrVald = stelrVald;
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
    TransactionORDetailsResponseData transactionORDetailsResponseData = (TransactionORDetailsResponseData) o;
    return Objects.equals(tranIndc, transactionORDetailsResponseData.tranIndc) &&
        Objects.equals(refNmbr, transactionORDetailsResponseData.refNmbr) &&
        Objects.equals(cLname, transactionORDetailsResponseData.cLname) &&
        Objects.equals(cFname, transactionORDetailsResponseData.cFname) &&
        Objects.equals(cMname, transactionORDetailsResponseData.cMname) &&
        Objects.equals(cAddr1, transactionORDetailsResponseData.cAddr1) &&
        Objects.equals(cAddr2, transactionORDetailsResponseData.cAddr2) &&
        Objects.equals(tel, transactionORDetailsResponseData.tel) &&
        Objects.equals(tin, transactionORDetailsResponseData.tin) &&
        Objects.equals(currFr, transactionORDetailsResponseData.currFr) &&
        Objects.equals(tranAmnt, transactionORDetailsResponseData.tranAmnt) &&
        Objects.equals(grntRate, transactionORDetailsResponseData.grntRate) &&
        Objects.equals(currTo, transactionORDetailsResponseData.currTo) &&
        Objects.equals(equiAmnt, transactionORDetailsResponseData.equiAmnt) &&
        Objects.equals(netAmnt, transactionORDetailsResponseData.netAmnt) &&
        Objects.equals(acptMode, transactionORDetailsResponseData.acptMode) &&
        Objects.equals(checkIndc, transactionORDetailsResponseData.checkIndc) &&
        Objects.equals(acptRefno, transactionORDetailsResponseData.acptRefno) &&
        Objects.equals(acptDocs, transactionORDetailsResponseData.acptDocs) &&
        Objects.equals(acptComm, transactionORDetailsResponseData.acptComm) &&
        Objects.equals(rLname, transactionORDetailsResponseData.rLname) &&
        Objects.equals(rFname, transactionORDetailsResponseData.rFname) &&
        Objects.equals(rMname, transactionORDetailsResponseData.rMname) &&
        Objects.equals(atelrVald, transactionORDetailsResponseData.atelrVald) &&
        Objects.equals(serlNmbr, transactionORDetailsResponseData.serlNmbr) &&
        Objects.equals(chckAmnt, transactionORDetailsResponseData.chckAmnt) &&
        Objects.equals(setlMode, transactionORDetailsResponseData.setlMode) &&
        Objects.equals(setlRefno, transactionORDetailsResponseData.setlRefno) &&
        Objects.equals(setlDocs, transactionORDetailsResponseData.setlDocs) &&
        Objects.equals(setlComm, transactionORDetailsResponseData.setlComm) &&
        Objects.equals(bLname, transactionORDetailsResponseData.bLname) &&
        Objects.equals(bFname, transactionORDetailsResponseData.bFname) &&
        Objects.equals(bMname, transactionORDetailsResponseData.bMname) &&
        Objects.equals(bBday, transactionORDetailsResponseData.bBday) &&
        Objects.equals(bAddr1, transactionORDetailsResponseData.bAddr1) &&
        Objects.equals(bAddr2, transactionORDetailsResponseData.bAddr2) &&
        Objects.equals(stelrVald, transactionORDetailsResponseData.stelrVald) &&
        Objects.equals(acptPost, transactionORDetailsResponseData.acptPost) &&
        Objects.equals(setlPost, transactionORDetailsResponseData.setlPost) &&
        Objects.equals(bTin, transactionORDetailsResponseData.bTin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranIndc, refNmbr, cLname, cFname, cMname, cAddr1, cAddr2, tel, tin, currFr, tranAmnt, grntRate, currTo, equiAmnt, netAmnt, acptMode, checkIndc, acptRefno, acptDocs, acptComm, rLname, rFname, rMname, atelrVald, serlNmbr, chckAmnt, setlMode, setlRefno, setlDocs, setlComm, bLname, bFname, bMname, bBday, bAddr1, bAddr2, stelrVald, acptPost, setlPost, bTin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionORDetailsResponseData {\n");
    
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    refNmbr: ").append(toIndentedString(refNmbr)).append("\n");
    sb.append("    cLname: ").append(toIndentedString(cLname)).append("\n");
    sb.append("    cFname: ").append(toIndentedString(cFname)).append("\n");
    sb.append("    cMname: ").append(toIndentedString(cMname)).append("\n");
    sb.append("    cAddr1: ").append(toIndentedString(cAddr1)).append("\n");
    sb.append("    cAddr2: ").append(toIndentedString(cAddr2)).append("\n");
    sb.append("    tel: ").append(toIndentedString(tel)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    currFr: ").append(toIndentedString(currFr)).append("\n");
    sb.append("    tranAmnt: ").append(toIndentedString(tranAmnt)).append("\n");
    sb.append("    grntRate: ").append(toIndentedString(grntRate)).append("\n");
    sb.append("    currTo: ").append(toIndentedString(currTo)).append("\n");
    sb.append("    equiAmnt: ").append(toIndentedString(equiAmnt)).append("\n");
    sb.append("    netAmnt: ").append(toIndentedString(netAmnt)).append("\n");
    sb.append("    acptMode: ").append(toIndentedString(acptMode)).append("\n");
    sb.append("    checkIndc: ").append(toIndentedString(checkIndc)).append("\n");
    sb.append("    acptRefno: ").append(toIndentedString(acptRefno)).append("\n");
    sb.append("    acptDocs: ").append(toIndentedString(acptDocs)).append("\n");
    sb.append("    acptComm: ").append(toIndentedString(acptComm)).append("\n");
    sb.append("    rLname: ").append(toIndentedString(rLname)).append("\n");
    sb.append("    rFname: ").append(toIndentedString(rFname)).append("\n");
    sb.append("    rMname: ").append(toIndentedString(rMname)).append("\n");
    sb.append("    atelrVald: ").append(toIndentedString(atelrVald)).append("\n");
    sb.append("    serlNmbr: ").append(toIndentedString(serlNmbr)).append("\n");
    sb.append("    chckAmnt: ").append(toIndentedString(chckAmnt)).append("\n");
    sb.append("    setlMode: ").append(toIndentedString(setlMode)).append("\n");
    sb.append("    setlRefno: ").append(toIndentedString(setlRefno)).append("\n");
    sb.append("    setlDocs: ").append(toIndentedString(setlDocs)).append("\n");
    sb.append("    setlComm: ").append(toIndentedString(setlComm)).append("\n");
    sb.append("    bLname: ").append(toIndentedString(bLname)).append("\n");
    sb.append("    bFname: ").append(toIndentedString(bFname)).append("\n");
    sb.append("    bMname: ").append(toIndentedString(bMname)).append("\n");
    sb.append("    bBday: ").append(toIndentedString(bBday)).append("\n");
    sb.append("    bAddr1: ").append(toIndentedString(bAddr1)).append("\n");
    sb.append("    bAddr2: ").append(toIndentedString(bAddr2)).append("\n");
    sb.append("    stelrVald: ").append(toIndentedString(stelrVald)).append("\n");
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

