package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CurrencyPairModesResponseData   {
  
  private String trdrFi = null;
  private String tranFi = null;
  private Integer listIndc = null;
  private Integer listOptn = null;
  private String currFrom = null;
  private Integer acptMode = null;
  private String achrgInd = null;
  private String arectStat = null;
  private Integer setlMode = null;
  private String schrgInd = null;
  private Integer srectStat = null;
  private String proctag = null;

  
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
  @JsonProperty("list_indc")
  public Integer getListIndc() {
    return listIndc;
  }
  public void setListIndc(Integer listIndc) {
    this.listIndc = listIndc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("list_optn")
  public Integer getListOptn() {
    return listOptn;
  }
  public void setListOptn(Integer listOptn) {
    this.listOptn = listOptn;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("curr_from")
  public String getCurrFrom() {
    return currFrom;
  }
  public void setCurrFrom(String currFrom) {
    this.currFrom = currFrom;
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
  @JsonProperty("achrg_ind")
  public String getAchrgInd() {
    return achrgInd;
  }
  public void setAchrgInd(String achrgInd) {
    this.achrgInd = achrgInd;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("arect_stat")
  public String getArectStat() {
    return arectStat;
  }
  public void setArectStat(String arectStat) {
    this.arectStat = arectStat;
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
  @JsonProperty("schrg_ind")
  public String getSchrgInd() {
    return schrgInd;
  }
  public void setSchrgInd(String schrgInd) {
    this.schrgInd = schrgInd;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("srect_stat")
  public Integer getSrectStat() {
    return srectStat;
  }
  public void setSrectStat(Integer srectStat) {
    this.srectStat = srectStat;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("proctag")
  public String getProctag() {
    return proctag;
  }
  public void setProctag(String proctag) {
    this.proctag = proctag;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyPairModesResponseData currencyPairModesResponseData = (CurrencyPairModesResponseData) o;
    return Objects.equals(trdrFi, currencyPairModesResponseData.trdrFi) &&
        Objects.equals(tranFi, currencyPairModesResponseData.tranFi) &&
        Objects.equals(listIndc, currencyPairModesResponseData.listIndc) &&
        Objects.equals(listOptn, currencyPairModesResponseData.listOptn) &&
        Objects.equals(currFrom, currencyPairModesResponseData.currFrom) &&
        Objects.equals(acptMode, currencyPairModesResponseData.acptMode) &&
        Objects.equals(achrgInd, currencyPairModesResponseData.achrgInd) &&
        Objects.equals(arectStat, currencyPairModesResponseData.arectStat) &&
        Objects.equals(setlMode, currencyPairModesResponseData.setlMode) &&
        Objects.equals(schrgInd, currencyPairModesResponseData.schrgInd) &&
        Objects.equals(srectStat, currencyPairModesResponseData.srectStat) &&
        Objects.equals(proctag, currencyPairModesResponseData.proctag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, tranFi, listIndc, listOptn, currFrom, acptMode, achrgInd, arectStat, setlMode, schrgInd, srectStat, proctag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyPairModesResponseData {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    tranFi: ").append(toIndentedString(tranFi)).append("\n");
    sb.append("    listIndc: ").append(toIndentedString(listIndc)).append("\n");
    sb.append("    listOptn: ").append(toIndentedString(listOptn)).append("\n");
    sb.append("    currFrom: ").append(toIndentedString(currFrom)).append("\n");
    sb.append("    acptMode: ").append(toIndentedString(acptMode)).append("\n");
    sb.append("    achrgInd: ").append(toIndentedString(achrgInd)).append("\n");
    sb.append("    arectStat: ").append(toIndentedString(arectStat)).append("\n");
    sb.append("    setlMode: ").append(toIndentedString(setlMode)).append("\n");
    sb.append("    schrgInd: ").append(toIndentedString(schrgInd)).append("\n");
    sb.append("    srectStat: ").append(toIndentedString(srectStat)).append("\n");
    sb.append("    proctag: ").append(toIndentedString(proctag)).append("\n");
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

