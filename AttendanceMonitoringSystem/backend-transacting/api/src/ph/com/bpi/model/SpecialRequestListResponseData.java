package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class SpecialRequestListResponseData   {
  
  private String tranTrdr = null;
  private String tranIndc = null;
  private String refNmbr = null;
  private String cLname = null;
  private String cFname = null;
  private String cMname = null;
  private String addr1 = null;
  private String addr2 = null;
  private Integer acptMode = null;
  private String currFr = null;
  private Integer tranAmnt = null;
  private Integer setlMode = null;
  private String currTo = null;
  private Integer equiAmnt = null;
  private Integer grntRate = null;
  private String statRqst = null;
  private String brchCode = null;
  private Integer rqstRate = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_trdr")
  public String getTranTrdr() {
    return tranTrdr;
  }
  public void setTranTrdr(String tranTrdr) {
    this.tranTrdr = tranTrdr;
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
  @JsonProperty("brch_code")
  public String getBrchCode() {
    return brchCode;
  }
  public void setBrchCode(String brchCode) {
    this.brchCode = brchCode;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialRequestListResponseData specialRequestListResponseData = (SpecialRequestListResponseData) o;
    return Objects.equals(tranTrdr, specialRequestListResponseData.tranTrdr) &&
        Objects.equals(tranIndc, specialRequestListResponseData.tranIndc) &&
        Objects.equals(refNmbr, specialRequestListResponseData.refNmbr) &&
        Objects.equals(cLname, specialRequestListResponseData.cLname) &&
        Objects.equals(cFname, specialRequestListResponseData.cFname) &&
        Objects.equals(cMname, specialRequestListResponseData.cMname) &&
        Objects.equals(addr1, specialRequestListResponseData.addr1) &&
        Objects.equals(addr2, specialRequestListResponseData.addr2) &&
        Objects.equals(acptMode, specialRequestListResponseData.acptMode) &&
        Objects.equals(currFr, specialRequestListResponseData.currFr) &&
        Objects.equals(tranAmnt, specialRequestListResponseData.tranAmnt) &&
        Objects.equals(setlMode, specialRequestListResponseData.setlMode) &&
        Objects.equals(currTo, specialRequestListResponseData.currTo) &&
        Objects.equals(equiAmnt, specialRequestListResponseData.equiAmnt) &&
        Objects.equals(grntRate, specialRequestListResponseData.grntRate) &&
        Objects.equals(statRqst, specialRequestListResponseData.statRqst) &&
        Objects.equals(brchCode, specialRequestListResponseData.brchCode) &&
        Objects.equals(rqstRate, specialRequestListResponseData.rqstRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranTrdr, tranIndc, refNmbr, cLname, cFname, cMname, addr1, addr2, acptMode, currFr, tranAmnt, setlMode, currTo, equiAmnt, grntRate, statRqst, brchCode, rqstRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialRequestListResponseData {\n");
    
    sb.append("    tranTrdr: ").append(toIndentedString(tranTrdr)).append("\n");
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    refNmbr: ").append(toIndentedString(refNmbr)).append("\n");
    sb.append("    cLname: ").append(toIndentedString(cLname)).append("\n");
    sb.append("    cFname: ").append(toIndentedString(cFname)).append("\n");
    sb.append("    cMname: ").append(toIndentedString(cMname)).append("\n");
    sb.append("    addr1: ").append(toIndentedString(addr1)).append("\n");
    sb.append("    addr2: ").append(toIndentedString(addr2)).append("\n");
    sb.append("    acptMode: ").append(toIndentedString(acptMode)).append("\n");
    sb.append("    currFr: ").append(toIndentedString(currFr)).append("\n");
    sb.append("    tranAmnt: ").append(toIndentedString(tranAmnt)).append("\n");
    sb.append("    setlMode: ").append(toIndentedString(setlMode)).append("\n");
    sb.append("    currTo: ").append(toIndentedString(currTo)).append("\n");
    sb.append("    equiAmnt: ").append(toIndentedString(equiAmnt)).append("\n");
    sb.append("    grntRate: ").append(toIndentedString(grntRate)).append("\n");
    sb.append("    statRqst: ").append(toIndentedString(statRqst)).append("\n");
    sb.append("    brchCode: ").append(toIndentedString(brchCode)).append("\n");
    sb.append("    rqstRate: ").append(toIndentedString(rqstRate)).append("\n");
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

