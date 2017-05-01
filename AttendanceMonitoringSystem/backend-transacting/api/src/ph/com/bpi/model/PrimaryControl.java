package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class PrimaryControl   {
  
  private String bPICutOff = null;
  private String bPBCutOff = null;
  private String rateBprd = null;
  private String povrdIndc = null;
  private String ptrckIndc = null;
  private String ptrckDays = null;
  private String ptrckAmnt = null;
  private String sovrdIndc = null;
  private String strckIndc = null;
  private String strckDays = null;
  private String strckAmnt = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("BPICutOff")
  public String getBPICutOff() {
    return bPICutOff;
  }
  public void setBPICutOff(String bPICutOff) {
    this.bPICutOff = bPICutOff;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("BPBCutOff")
  public String getBPBCutOff() {
    return bPBCutOff;
  }
  public void setBPBCutOff(String bPBCutOff) {
    this.bPBCutOff = bPBCutOff;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rate_bprd")
  public String getRateBprd() {
    return rateBprd;
  }
  public void setRateBprd(String rateBprd) {
    this.rateBprd = rateBprd;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("povrd_indc")
  public String getPovrdIndc() {
    return povrdIndc;
  }
  public void setPovrdIndc(String povrdIndc) {
    this.povrdIndc = povrdIndc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ptrck_indc")
  public String getPtrckIndc() {
    return ptrckIndc;
  }
  public void setPtrckIndc(String ptrckIndc) {
    this.ptrckIndc = ptrckIndc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ptrck_days")
  public String getPtrckDays() {
    return ptrckDays;
  }
  public void setPtrckDays(String ptrckDays) {
    this.ptrckDays = ptrckDays;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ptrck_amnt")
  public String getPtrckAmnt() {
    return ptrckAmnt;
  }
  public void setPtrckAmnt(String ptrckAmnt) {
    this.ptrckAmnt = ptrckAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sovrd_indc")
  public String getSovrdIndc() {
    return sovrdIndc;
  }
  public void setSovrdIndc(String sovrdIndc) {
    this.sovrdIndc = sovrdIndc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("strck_indc")
  public String getStrckIndc() {
    return strckIndc;
  }
  public void setStrckIndc(String strckIndc) {
    this.strckIndc = strckIndc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("strck_days")
  public String getStrckDays() {
    return strckDays;
  }
  public void setStrckDays(String strckDays) {
    this.strckDays = strckDays;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("strck_amnt")
  public String getStrckAmnt() {
    return strckAmnt;
  }
  public void setStrckAmnt(String strckAmnt) {
    this.strckAmnt = strckAmnt;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrimaryControl primaryControl = (PrimaryControl) o;
    return Objects.equals(bPICutOff, primaryControl.bPICutOff) &&
        Objects.equals(bPBCutOff, primaryControl.bPBCutOff) &&
        Objects.equals(rateBprd, primaryControl.rateBprd) &&
        Objects.equals(povrdIndc, primaryControl.povrdIndc) &&
        Objects.equals(ptrckIndc, primaryControl.ptrckIndc) &&
        Objects.equals(ptrckDays, primaryControl.ptrckDays) &&
        Objects.equals(ptrckAmnt, primaryControl.ptrckAmnt) &&
        Objects.equals(sovrdIndc, primaryControl.sovrdIndc) &&
        Objects.equals(strckIndc, primaryControl.strckIndc) &&
        Objects.equals(strckDays, primaryControl.strckDays) &&
        Objects.equals(strckAmnt, primaryControl.strckAmnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bPICutOff, bPBCutOff, rateBprd, povrdIndc, ptrckIndc, ptrckDays, ptrckAmnt, sovrdIndc, strckIndc, strckDays, strckAmnt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrimaryControl {\n");
    
    sb.append("    bPICutOff: ").append(toIndentedString(bPICutOff)).append("\n");
    sb.append("    bPBCutOff: ").append(toIndentedString(bPBCutOff)).append("\n");
    sb.append("    rateBprd: ").append(toIndentedString(rateBprd)).append("\n");
    sb.append("    povrdIndc: ").append(toIndentedString(povrdIndc)).append("\n");
    sb.append("    ptrckIndc: ").append(toIndentedString(ptrckIndc)).append("\n");
    sb.append("    ptrckDays: ").append(toIndentedString(ptrckDays)).append("\n");
    sb.append("    ptrckAmnt: ").append(toIndentedString(ptrckAmnt)).append("\n");
    sb.append("    sovrdIndc: ").append(toIndentedString(sovrdIndc)).append("\n");
    sb.append("    strckIndc: ").append(toIndentedString(strckIndc)).append("\n");
    sb.append("    strckDays: ").append(toIndentedString(strckDays)).append("\n");
    sb.append("    strckAmnt: ").append(toIndentedString(strckAmnt)).append("\n");
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

