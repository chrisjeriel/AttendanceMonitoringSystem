package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ComputedAmountsBody   {
  
  private String chkdtl1 = null;
  private String chkdtl2 = null;
  private String trdrFi = null;
  private String tranFi = null;
  private String tranIndc = null;
  private String custIndc = null;
  private Integer acptAmnt = null;
  private String currFr = null;
  private Integer acptMode = null;
  private String acptChckIndc = null;
  private String achrgDed = null;
  private Integer setlAmnt = null;
  private String currTo = null;
  private Integer setlMode = null;
  private String setlChckIndc = null;
  private String schrgDed = null;
  private String rateIndc = null;
  private Integer dealRate = null;
  private Integer rqstRate = null;
  private String cLname = null;
  private String cFname = null;
  private String cMname = null;
  private String docuTag = null;
  private Integer fvecTag = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("chkdtl1")
  public String getChkdtl1() {
    return chkdtl1;
  }
  public void setChkdtl1(String chkdtl1) {
    this.chkdtl1 = chkdtl1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("chkdtl2")
  public String getChkdtl2() {
    return chkdtl2;
  }
  public void setChkdtl2(String chkdtl2) {
    this.chkdtl2 = chkdtl2;
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
  @JsonProperty("tran_fi")
  public String getTranFi() {
    return tranFi;
  }
  public void setTranFi(String tranFi) {
    this.tranFi = tranFi;
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
  @JsonProperty("acpt_chck_indc")
  public String getAcptChckIndc() {
    return acptChckIndc;
  }
  public void setAcptChckIndc(String acptChckIndc) {
    this.acptChckIndc = acptChckIndc;
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
  @JsonProperty("rate_indc")
  public String getRateIndc() {
    return rateIndc;
  }
  public void setRateIndc(String rateIndc) {
    this.rateIndc = rateIndc;
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
    ComputedAmountsBody computedAmountsBody = (ComputedAmountsBody) o;
    return Objects.equals(chkdtl1, computedAmountsBody.chkdtl1) &&
        Objects.equals(chkdtl2, computedAmountsBody.chkdtl2) &&
        Objects.equals(trdrFi, computedAmountsBody.trdrFi) &&
        Objects.equals(tranFi, computedAmountsBody.tranFi) &&
        Objects.equals(tranIndc, computedAmountsBody.tranIndc) &&
        Objects.equals(custIndc, computedAmountsBody.custIndc) &&
        Objects.equals(acptAmnt, computedAmountsBody.acptAmnt) &&
        Objects.equals(currFr, computedAmountsBody.currFr) &&
        Objects.equals(acptMode, computedAmountsBody.acptMode) &&
        Objects.equals(acptChckIndc, computedAmountsBody.acptChckIndc) &&
        Objects.equals(achrgDed, computedAmountsBody.achrgDed) &&
        Objects.equals(setlAmnt, computedAmountsBody.setlAmnt) &&
        Objects.equals(currTo, computedAmountsBody.currTo) &&
        Objects.equals(setlMode, computedAmountsBody.setlMode) &&
        Objects.equals(setlChckIndc, computedAmountsBody.setlChckIndc) &&
        Objects.equals(schrgDed, computedAmountsBody.schrgDed) &&
        Objects.equals(rateIndc, computedAmountsBody.rateIndc) &&
        Objects.equals(dealRate, computedAmountsBody.dealRate) &&
        Objects.equals(rqstRate, computedAmountsBody.rqstRate) &&
        Objects.equals(cLname, computedAmountsBody.cLname) &&
        Objects.equals(cFname, computedAmountsBody.cFname) &&
        Objects.equals(cMname, computedAmountsBody.cMname) &&
        Objects.equals(docuTag, computedAmountsBody.docuTag) &&
        Objects.equals(fvecTag, computedAmountsBody.fvecTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chkdtl1, chkdtl2, trdrFi, tranFi, tranIndc, custIndc, acptAmnt, currFr, acptMode, acptChckIndc, achrgDed, setlAmnt, currTo, setlMode, setlChckIndc, schrgDed, rateIndc, dealRate, rqstRate, cLname, cFname, cMname, docuTag, fvecTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputedAmountsBody {\n");
    
    sb.append("    chkdtl1: ").append(toIndentedString(chkdtl1)).append("\n");
    sb.append("    chkdtl2: ").append(toIndentedString(chkdtl2)).append("\n");
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    tranFi: ").append(toIndentedString(tranFi)).append("\n");
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    custIndc: ").append(toIndentedString(custIndc)).append("\n");
    sb.append("    acptAmnt: ").append(toIndentedString(acptAmnt)).append("\n");
    sb.append("    currFr: ").append(toIndentedString(currFr)).append("\n");
    sb.append("    acptMode: ").append(toIndentedString(acptMode)).append("\n");
    sb.append("    acptChckIndc: ").append(toIndentedString(acptChckIndc)).append("\n");
    sb.append("    achrgDed: ").append(toIndentedString(achrgDed)).append("\n");
    sb.append("    setlAmnt: ").append(toIndentedString(setlAmnt)).append("\n");
    sb.append("    currTo: ").append(toIndentedString(currTo)).append("\n");
    sb.append("    setlMode: ").append(toIndentedString(setlMode)).append("\n");
    sb.append("    setlChckIndc: ").append(toIndentedString(setlChckIndc)).append("\n");
    sb.append("    schrgDed: ").append(toIndentedString(schrgDed)).append("\n");
    sb.append("    rateIndc: ").append(toIndentedString(rateIndc)).append("\n");
    sb.append("    dealRate: ").append(toIndentedString(dealRate)).append("\n");
    sb.append("    rqstRate: ").append(toIndentedString(rqstRate)).append("\n");
    sb.append("    cLname: ").append(toIndentedString(cLname)).append("\n");
    sb.append("    cFname: ").append(toIndentedString(cFname)).append("\n");
    sb.append("    cMname: ").append(toIndentedString(cMname)).append("\n");
    sb.append("    docuTag: ").append(toIndentedString(docuTag)).append("\n");
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

