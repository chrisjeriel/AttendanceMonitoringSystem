package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class CutoffTimeErrorCheckBody   {
  
  private String trdrFi = null;
  private String cutTime1 = null;
  private String cutTime2 = null;
  private String rateVprd = null;
  private String povrdInc = null;
  private String sovrdInc = null;

  
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
  @JsonProperty("cut_time1")
  public String getCutTime1() {
    return cutTime1;
  }
  public void setCutTime1(String cutTime1) {
    this.cutTime1 = cutTime1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cut_time2")
  public String getCutTime2() {
    return cutTime2;
  }
  public void setCutTime2(String cutTime2) {
    this.cutTime2 = cutTime2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rate_vprd")
  public String getRateVprd() {
    return rateVprd;
  }
  public void setRateVprd(String rateVprd) {
    this.rateVprd = rateVprd;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("povrd_inc")
  public String getPovrdInc() {
    return povrdInc;
  }
  public void setPovrdInc(String povrdInc) {
    this.povrdInc = povrdInc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sovrd_inc")
  public String getSovrdInc() {
    return sovrdInc;
  }
  public void setSovrdInc(String sovrdInc) {
    this.sovrdInc = sovrdInc;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CutoffTimeErrorCheckBody cutoffTimeErrorCheckBody = (CutoffTimeErrorCheckBody) o;
    return Objects.equals(cutTime1, cutoffTimeErrorCheckBody.cutTime1) &&
        Objects.equals(cutTime2, cutoffTimeErrorCheckBody.cutTime2) &&
        Objects.equals(rateVprd, cutoffTimeErrorCheckBody.rateVprd) &&
        Objects.equals(povrdInc, cutoffTimeErrorCheckBody.povrdInc) &&
        Objects.equals(sovrdInc, cutoffTimeErrorCheckBody.sovrdInc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cutTime1, cutTime2, rateVprd, povrdInc, sovrdInc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CutoffTimeErrorCheckBody {\n");
    
    sb.append("    cutTime1: ").append(toIndentedString(cutTime1)).append("\n");
    sb.append("    cutTime2: ").append(toIndentedString(cutTime2)).append("\n");
    sb.append("    rateVprd: ").append(toIndentedString(rateVprd)).append("\n");
    sb.append("    povrdInc: ").append(toIndentedString(povrdInc)).append("\n");
    sb.append("    sovrdInc: ").append(toIndentedString(sovrdInc)).append("\n");
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

