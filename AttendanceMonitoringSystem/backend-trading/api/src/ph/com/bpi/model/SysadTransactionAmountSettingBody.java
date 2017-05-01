package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SysadTransactionAmountSettingBody   {
  
  private String trdrFi = null;
  private String currCode = null;
  private String minAmnt = null;
  private String pabvLim = null;
  private String sabvLim = null;

  
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
  @JsonProperty("min_amnt")
  public String getMinAmnt() {
    return minAmnt;
  }
  public void setMinAmnt(String minAmnt) {
    this.minAmnt = minAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pabv_lim")
  public String getPabvLim() {
    return pabvLim;
  }
  public void setPabvLim(String pabvLim) {
    this.pabvLim = pabvLim;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sabv_lim")
  public String getSabvLim() {
    return sabvLim;
  }
  public void setSabvLim(String sabvLim) {
    this.sabvLim = sabvLim;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SysadTransactionAmountSettingBody sysadTransactionAmountSettingBody = (SysadTransactionAmountSettingBody) o;
    return Objects.equals(trdrFi, sysadTransactionAmountSettingBody.trdrFi) &&
        Objects.equals(currCode, sysadTransactionAmountSettingBody.currCode) &&
        Objects.equals(minAmnt, sysadTransactionAmountSettingBody.minAmnt) &&
        Objects.equals(pabvLim, sysadTransactionAmountSettingBody.pabvLim) &&
        Objects.equals(sabvLim, sysadTransactionAmountSettingBody.sabvLim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, currCode, minAmnt, pabvLim, sabvLim);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SysadTransactionAmountSettingBody {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    minAmnt: ").append(toIndentedString(minAmnt)).append("\n");
    sb.append("    pabvLim: ").append(toIndentedString(pabvLim)).append("\n");
    sb.append("    sabvLim: ").append(toIndentedString(sabvLim)).append("\n");
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

