package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SpecialSquaringComputeBody   {
  
  private String dealWith = null;
  private String gTranfi = null;
  private String tranType = null;
  private String acptAmt = null;
  private String currPair = null;
  private String acptMode = null;
  private String setlAmt = null;
  private String setlMode = null;
  private String grantRate = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dealWith")
  public String getDealWith() {
    return dealWith;
  }
  public void setDealWith(String dealWith) {
    this.dealWith = dealWith;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gTranfi")
  public String getGTranfi() {
    return gTranfi;
  }
  public void setGTranfi(String gTranfi) {
    this.gTranfi = gTranfi;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tranType")
  public String getTranType() {
    return tranType;
  }
  public void setTranType(String tranType) {
    this.tranType = tranType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acptAmt")
  public String getAcptAmt() {
    return acptAmt;
  }
  public void setAcptAmt(String acptAmt) {
    this.acptAmt = acptAmt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currPair")
  public String getCurrPair() {
    return currPair;
  }
  public void setCurrPair(String currPair) {
    this.currPair = currPair;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acptMode")
  public String getAcptMode() {
    return acptMode;
  }
  public void setAcptMode(String acptMode) {
    this.acptMode = acptMode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("setlAmt")
  public String getSetlAmt() {
    return setlAmt;
  }
  public void setSetlAmt(String setlAmt) {
    this.setlAmt = setlAmt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("setlMode")
  public String getSetlMode() {
    return setlMode;
  }
  public void setSetlMode(String setlMode) {
    this.setlMode = setlMode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("grantRate")
  public String getGrantRate() {
    return grantRate;
  }
  public void setGrantRate(String grantRate) {
    this.grantRate = grantRate;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialSquaringComputeBody specialSquaringComputeBody = (SpecialSquaringComputeBody) o;
    return Objects.equals(dealWith, specialSquaringComputeBody.dealWith) &&
        Objects.equals(gTranfi, specialSquaringComputeBody.gTranfi) &&
        Objects.equals(tranType, specialSquaringComputeBody.tranType) &&
        Objects.equals(acptAmt, specialSquaringComputeBody.acptAmt) &&
        Objects.equals(currPair, specialSquaringComputeBody.currPair) &&
        Objects.equals(acptMode, specialSquaringComputeBody.acptMode) &&
        Objects.equals(setlAmt, specialSquaringComputeBody.setlAmt) &&
        Objects.equals(setlMode, specialSquaringComputeBody.setlMode) &&
        Objects.equals(grantRate, specialSquaringComputeBody.grantRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealWith, gTranfi, tranType, acptAmt, currPair, acptMode, setlAmt, setlMode, grantRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialSquaringComputeBody {\n");
    
    sb.append("    dealWith: ").append(toIndentedString(dealWith)).append("\n");
    sb.append("    gTranfi: ").append(toIndentedString(gTranfi)).append("\n");
    sb.append("    tranType: ").append(toIndentedString(tranType)).append("\n");
    sb.append("    acptAmt: ").append(toIndentedString(acptAmt)).append("\n");
    sb.append("    currPair: ").append(toIndentedString(currPair)).append("\n");
    sb.append("    acptMode: ").append(toIndentedString(acptMode)).append("\n");
    sb.append("    setlAmt: ").append(toIndentedString(setlAmt)).append("\n");
    sb.append("    setlMode: ").append(toIndentedString(setlMode)).append("\n");
    sb.append("    grantRate: ").append(toIndentedString(grantRate)).append("\n");
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

