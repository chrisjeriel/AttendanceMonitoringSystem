package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SysadDocStampsBody   {
  
  private String modeCode = null;
  private String trancCode = null;
  private String adocPerc = null;
  private String adocAmmt = null;
  private String acomPerc = null;
  private String acomAmmt = null;
  private String sdocPerc = null;
  private String sdocAmmt = null;
  private String acomIndc = null;
  private String adomIndc = null;
  private String scomIndc = null;
  private String sdomIndc = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mode_code")
  public String getModeCode() {
    return modeCode;
  }
  public void setModeCode(String modeCode) {
    this.modeCode = modeCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tranc_code")
  public String getTrancCode() {
    return trancCode;
  }
  public void setTrancCode(String trancCode) {
    this.trancCode = trancCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("adoc_perc")
  public String getAdocPerc() {
    return adocPerc;
  }
  public void setAdocPerc(String adocPerc) {
    this.adocPerc = adocPerc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("adoc_ammt")
  public String getAdocAmmt() {
    return adocAmmt;
  }
  public void setAdocAmmt(String adocAmmt) {
    this.adocAmmt = adocAmmt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acom_perc")
  public String getAcomPerc() {
    return acomPerc;
  }
  public void setAcomPerc(String acomPerc) {
    this.acomPerc = acomPerc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acom_ammt")
  public String getAcomAmmt() {
    return acomAmmt;
  }
  public void setAcomAmmt(String acomAmmt) {
    this.acomAmmt = acomAmmt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sdoc_perc")
  public String getSdocPerc() {
    return sdocPerc;
  }
  public void setSdocPerc(String sdocPerc) {
    this.sdocPerc = sdocPerc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sdoc_ammt")
  public String getSdocAmmt() {
    return sdocAmmt;
  }
  public void setSdocAmmt(String sdocAmmt) {
    this.sdocAmmt = sdocAmmt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acom_indc")
  public String getAcomIndc() {
    return acomIndc;
  }
  public void setAcomIndc(String acomIndc) {
    this.acomIndc = acomIndc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("adom_indc")
  public String getAdomIndc() {
    return adomIndc;
  }
  public void setAdomIndc(String adomIndc) {
    this.adomIndc = adomIndc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scom_indc")
  public String getScomIndc() {
    return scomIndc;
  }
  public void setScomIndc(String scomIndc) {
    this.scomIndc = scomIndc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sdom_indc")
  public String getSdomIndc() {
    return sdomIndc;
  }
  public void setSdomIndc(String sdomIndc) {
    this.sdomIndc = sdomIndc;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SysadDocStampsBody sysadDocStampsBody = (SysadDocStampsBody) o;
    return Objects.equals(modeCode, sysadDocStampsBody.modeCode) &&
        Objects.equals(trancCode, sysadDocStampsBody.trancCode) &&
        Objects.equals(adocPerc, sysadDocStampsBody.adocPerc) &&
        Objects.equals(adocAmmt, sysadDocStampsBody.adocAmmt) &&
        Objects.equals(acomPerc, sysadDocStampsBody.acomPerc) &&
        Objects.equals(acomAmmt, sysadDocStampsBody.acomAmmt) &&
        Objects.equals(sdocPerc, sysadDocStampsBody.sdocPerc) &&
        Objects.equals(sdocAmmt, sysadDocStampsBody.sdocAmmt) &&
        Objects.equals(acomIndc, sysadDocStampsBody.acomIndc) &&
        Objects.equals(adomIndc, sysadDocStampsBody.adomIndc) &&
        Objects.equals(scomIndc, sysadDocStampsBody.scomIndc) &&
        Objects.equals(sdomIndc, sysadDocStampsBody.sdomIndc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modeCode, trancCode, adocPerc, adocAmmt, acomPerc, acomAmmt, sdocPerc, sdocAmmt, acomIndc, adomIndc, scomIndc, sdomIndc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SysadDocStampsBody {\n");
    
    sb.append("    modeCode: ").append(toIndentedString(modeCode)).append("\n");
    sb.append("    trancCode: ").append(toIndentedString(trancCode)).append("\n");
    sb.append("    adocPerc: ").append(toIndentedString(adocPerc)).append("\n");
    sb.append("    adocAmmt: ").append(toIndentedString(adocAmmt)).append("\n");
    sb.append("    acomPerc: ").append(toIndentedString(acomPerc)).append("\n");
    sb.append("    acomAmmt: ").append(toIndentedString(acomAmmt)).append("\n");
    sb.append("    sdocPerc: ").append(toIndentedString(sdocPerc)).append("\n");
    sb.append("    sdocAmmt: ").append(toIndentedString(sdocAmmt)).append("\n");
    sb.append("    acomIndc: ").append(toIndentedString(acomIndc)).append("\n");
    sb.append("    adomIndc: ").append(toIndentedString(adomIndc)).append("\n");
    sb.append("    scomIndc: ").append(toIndentedString(scomIndc)).append("\n");
    sb.append("    sdomIndc: ").append(toIndentedString(sdomIndc)).append("\n");
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

