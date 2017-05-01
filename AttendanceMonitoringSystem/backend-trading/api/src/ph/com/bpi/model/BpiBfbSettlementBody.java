package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-29T14:17:39.144+08:00")
public class BpiBfbSettlementBody   {
  
  private String trdrFi = null;
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
    BpiBfbSettlementBody bpiBfbSettlementBody = (BpiBfbSettlementBody) o;
    return Objects.equals(trdrFi, bpiBfbSettlementBody.trdrFi) &&
        Objects.equals(currCode, bpiBfbSettlementBody.currCode) &&
        Objects.equals(bpiAcct, bpiBfbSettlementBody.bpiAcct) &&
        Objects.equals(bfbAcct, bpiBfbSettlementBody.bfbAcct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, currCode, bpiAcct, bfbAcct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BpiBfbSettlementBody {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
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

