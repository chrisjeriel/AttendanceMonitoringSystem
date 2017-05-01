package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class DealRateBody   {
  
  private String trdrFi = null;
  private String tranFi = null;
  private String custIndc = null;
  private String tranIndc = null;
  private String currFr = null;
  private String currTo = null;
  private Integer acptMode = null;
  private Integer setlMode = null;
  private Integer tranAmnt = null;
  private Integer fvecTag = null;

  
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
    DealRateBody dealRateBody = (DealRateBody) o;
    return Objects.equals(trdrFi, dealRateBody.trdrFi) &&
        Objects.equals(tranFi, dealRateBody.tranFi) &&
        Objects.equals(custIndc, dealRateBody.custIndc) &&
        Objects.equals(tranIndc, dealRateBody.tranIndc) &&
        Objects.equals(currFr, dealRateBody.currFr) &&
        Objects.equals(currTo, dealRateBody.currTo) &&
        Objects.equals(acptMode, dealRateBody.acptMode) &&
        Objects.equals(setlMode, dealRateBody.setlMode) &&
        Objects.equals(tranAmnt, dealRateBody.tranAmnt) &&
        Objects.equals(fvecTag, dealRateBody.fvecTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, tranFi, custIndc, tranIndc, currFr, currTo, acptMode, setlMode, tranAmnt, fvecTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealRateBody {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    tranFi: ").append(toIndentedString(tranFi)).append("\n");
    sb.append("    custIndc: ").append(toIndentedString(custIndc)).append("\n");
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    currFr: ").append(toIndentedString(currFr)).append("\n");
    sb.append("    currTo: ").append(toIndentedString(currTo)).append("\n");
    sb.append("    acptMode: ").append(toIndentedString(acptMode)).append("\n");
    sb.append("    setlMode: ").append(toIndentedString(setlMode)).append("\n");
    sb.append("    tranAmnt: ").append(toIndentedString(tranAmnt)).append("\n");
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

