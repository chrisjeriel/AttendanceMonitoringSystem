package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SysadBPIBFPSettlementBody   {
  
  private String trdrFi = null;
  private String tag = null;
  private String currCode = null;
  private String bpiAcct = null;
  private String bfbAcct = null;

  
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
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("curr_code")
  public String getCurrCode() {
    return currCode;
  }
  public void setCurrCode(String currCode) {
    this.currCode = currCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bpi_acct")
  public String getBpiAcct() {
    return bpiAcct;
  }
  public void setBpiAcct(String bpiAcct) {
    this.bpiAcct = bpiAcct;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bfb_acct")
  public String getBfbAcct() {
    return bfbAcct;
  }
  public void setBfbAcct(String bfbAcct) {
    this.bfbAcct = bfbAcct;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SysadBPIBFPSettlementBody sysadBPIBFPSettlementBody = (SysadBPIBFPSettlementBody) o;
    return Objects.equals(trdrFi, sysadBPIBFPSettlementBody.trdrFi) &&
        Objects.equals(tag, sysadBPIBFPSettlementBody.tag) &&
        Objects.equals(currCode, sysadBPIBFPSettlementBody.currCode) &&
        Objects.equals(bpiAcct, sysadBPIBFPSettlementBody.bpiAcct) &&
        Objects.equals(bfbAcct, sysadBPIBFPSettlementBody.bfbAcct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, tag, currCode, bpiAcct, bfbAcct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SysadBPIBFPSettlementBody {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    bpiAcct: ").append(toIndentedString(bpiAcct)).append("\n");
    sb.append("    bfbAcct: ").append(toIndentedString(bfbAcct)).append("\n");
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

