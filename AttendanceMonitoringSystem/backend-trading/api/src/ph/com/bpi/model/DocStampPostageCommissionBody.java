package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-29T14:17:39.144+08:00")
public class DocStampPostageCommissionBody   {
  
  private String trdrFi = null;
  private String modeCode = null;
  private String adocPerc = null;
  private String adocAmnt = null;
  private String adocIndc = null;
  private String acomPerc = null;
  private String acomAmnt = null;
  private String acomIndc = null;
  private String sdocPerc = null;
  private String sdocAmnt = null;
  private String sdocIndc = null;
  private String scomPerc = null;
  private String scomAmnt = null;
  private String scomIndc = null;
  private String tcPost = null;
  
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
  @JsonProperty("adoc_indc")
  public String getAdocIndc() {
    return adocIndc;
  }
  public void setAdocIndc(String adocIndc) {
    this.adocIndc = adocIndc;
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
  @JsonProperty("adoc_amnt")
  public String getAdocAmnt() {
    return adocAmnt;
  }
  public void setAdocAmnt(String adocAmnt) {
    this.adocAmnt = adocAmnt;
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
  @JsonProperty("acom_amnt")
  public String getAcomAmnt() {
    return acomAmnt;
  }
  public void setAcomAmnt(String acomAmnt) {
    this.acomAmnt = acomAmnt;
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
  @JsonProperty("sdoc_amnt")
  public String getSdocAmnt() {
    return sdocAmnt;
  }
  public void setSdocAmnt(String sdocAmnt) {
    this.sdocAmnt = sdocAmnt;
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
  @JsonProperty("sdoc_indc")
  public String getSdocIndc() {
    return sdocIndc;
  }
  public void setSdocIndc(String sdocIndc) {
    this.sdocIndc = sdocIndc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scom_perc")
  public String getScomPerc() {
    return scomPerc;
  }
  public void setScomPerc(String scomPerc) {
    this.scomPerc = scomPerc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tc_post")
  public String getTcPost() {
    return tcPost;
  }
  public void setTcPost(String tcPost) {
    this.tcPost = tcPost;
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
  @JsonProperty("scom_amnt")
  public String getScomAmnt() {
    return scomAmnt;
  }
  public void setScomAmnt(String scomAmnt) {
    this.scomAmnt = scomAmnt;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocStampPostageCommissionBody docStampPostageCommissionBody = (DocStampPostageCommissionBody) o;
    return Objects.equals(modeCode, docStampPostageCommissionBody.modeCode) &&
        Objects.equals(adocPerc, docStampPostageCommissionBody.adocPerc) &&
        Objects.equals(adocAmnt, docStampPostageCommissionBody.adocAmnt) &&
        Objects.equals(acomPerc, docStampPostageCommissionBody.acomPerc) &&
        Objects.equals(acomAmnt, docStampPostageCommissionBody.acomAmnt) &&
        Objects.equals(sdocPerc, docStampPostageCommissionBody.sdocPerc) &&
        Objects.equals(sdocAmnt, docStampPostageCommissionBody.sdocAmnt) &&
        Objects.equals(acomIndc, docStampPostageCommissionBody.acomIndc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modeCode, adocPerc, adocAmnt, acomPerc, acomAmnt, sdocPerc, sdocAmnt, acomIndc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocStampPostageCommissionBody {\n");
    
    sb.append("    modeCode: ").append(toIndentedString(modeCode)).append("\n");
    sb.append("    adocPerc: ").append(toIndentedString(adocPerc)).append("\n");
    sb.append("    adocAmnt: ").append(toIndentedString(adocAmnt)).append("\n");
    sb.append("    acomPerc: ").append(toIndentedString(acomPerc)).append("\n");
    sb.append("    acomAmnt: ").append(toIndentedString(acomAmnt)).append("\n");
    sb.append("    sdocPerc: ").append(toIndentedString(sdocPerc)).append("\n");
    sb.append("    sdocAmnt: ").append(toIndentedString(sdocAmnt)).append("\n");
    sb.append("    acomIndc: ").append(toIndentedString(acomIndc)).append("\n");
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

