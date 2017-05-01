package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CheckDepositAccountBody   {
  
  private String trdrFi = null;
  private String tranIndc = null;
  private String currFr = null;
  private String currTo = null;
  private Integer acptAcct = null;
  private Integer acptMode = null;
  private Integer setlAcct = null;
  private Integer netAmnt = null;
  private Integer setlMode = null;

  
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
  @JsonProperty("acpt_acct")
  public Integer getAcptAcct() {
    return acptAcct;
  }
  public void setAcptAcct(Integer acptAcct) {
    this.acptAcct = acptAcct;
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
  @JsonProperty("setl_acct")
  public Integer getSetlAcct() {
    return setlAcct;
  }
  public void setSetlAcct(Integer setlAcct) {
    this.setlAcct = setlAcct;
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
  @JsonProperty("setl_mode")
  public Integer getSetlMode() {
    return setlMode;
  }
  public void setSetlMode(Integer setlMode) {
    this.setlMode = setlMode;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckDepositAccountBody checkDepositAccountBody = (CheckDepositAccountBody) o;
    return Objects.equals(trdrFi, checkDepositAccountBody.trdrFi) &&
        Objects.equals(tranIndc, checkDepositAccountBody.tranIndc) &&
        Objects.equals(currFr, checkDepositAccountBody.currFr) &&
        Objects.equals(currTo, checkDepositAccountBody.currTo) &&
        Objects.equals(acptAcct, checkDepositAccountBody.acptAcct) &&
        Objects.equals(acptMode, checkDepositAccountBody.acptMode) &&
        Objects.equals(setlAcct, checkDepositAccountBody.setlAcct) &&
        Objects.equals(netAmnt, checkDepositAccountBody.netAmnt) &&
        Objects.equals(setlMode, checkDepositAccountBody.setlMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, tranIndc, currFr, currTo, acptAcct, acptMode, setlAcct, netAmnt, setlMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckDepositAccountBody {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    currFr: ").append(toIndentedString(currFr)).append("\n");
    sb.append("    currTo: ").append(toIndentedString(currTo)).append("\n");
    sb.append("    acptAcct: ").append(toIndentedString(acptAcct)).append("\n");
    sb.append("    acptMode: ").append(toIndentedString(acptMode)).append("\n");
    sb.append("    setlAcct: ").append(toIndentedString(setlAcct)).append("\n");
    sb.append("    netAmnt: ").append(toIndentedString(netAmnt)).append("\n");
    sb.append("    setlMode: ").append(toIndentedString(setlMode)).append("\n");
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

