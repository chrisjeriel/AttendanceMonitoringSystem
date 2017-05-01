package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class UsVisaFeeProcessBody   {
  
  private String trdrFi = null;
  private String currCode = null;
  private String exchRate = null;
  private String usdAmnt = null;
  private String phpEquiv = null;
  private String nexchRate = null;
  private String nusdAmnt = null;

  
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
  @JsonProperty("exch_rate")
  public String getExchRate() {
    return exchRate;
  }
  public void setExchRate(String exchRate) {
    this.exchRate = exchRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("usd_amnt")
  public String getUsdAmnt() {
    return usdAmnt;
  }
  public void setUsdAmnt(String usdAmnt) {
    this.usdAmnt = usdAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("php_equiv")
  public String getPhpEquiv() {
    return phpEquiv;
  }
  public void setPhpEquiv(String phpEquiv) {
    this.phpEquiv = phpEquiv;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nexch_rate")
  public String getNexchRate() {
    return nexchRate;
  }
  public void setNexchRate(String nexchRate) {
    this.nexchRate = nexchRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nusd_amnt")
  public String getNusdAmnt() {
    return nusdAmnt;
  }
  public void setNusdAmnt(String nusdAmnt) {
    this.nusdAmnt = nusdAmnt;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsVisaFeeProcessBody usVisaFeeProcessBody = (UsVisaFeeProcessBody) o;
    return Objects.equals(trdrFi, usVisaFeeProcessBody.trdrFi) &&
        Objects.equals(currCode, usVisaFeeProcessBody.currCode) &&
        Objects.equals(exchRate, usVisaFeeProcessBody.exchRate) &&
        Objects.equals(usdAmnt, usVisaFeeProcessBody.usdAmnt) &&
        Objects.equals(phpEquiv, usVisaFeeProcessBody.phpEquiv) &&
        Objects.equals(nexchRate, usVisaFeeProcessBody.nexchRate) &&
        Objects.equals(nusdAmnt, usVisaFeeProcessBody.nusdAmnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, currCode, exchRate, usdAmnt, phpEquiv, nexchRate, nusdAmnt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsVisaFeeProcessBody {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    exchRate: ").append(toIndentedString(exchRate)).append("\n");
    sb.append("    usdAmnt: ").append(toIndentedString(usdAmnt)).append("\n");
    sb.append("    phpEquiv: ").append(toIndentedString(phpEquiv)).append("\n");
    sb.append("    nexchRate: ").append(toIndentedString(nexchRate)).append("\n");
    sb.append("    nusdAmnt: ").append(toIndentedString(nusdAmnt)).append("\n");
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

