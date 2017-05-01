package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CheckDepositAccountResponseData   {
  
  private String tranIndc = null;
  private Integer acptStat = null;
  private Integer setlStat = null;
  private String acptName = null;
  private String setlName = null;
  private Integer acptClen = null;

  
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
  @JsonProperty("acpt_stat")
  public Integer getAcptStat() {
    return acptStat;
  }
  public void setAcptStat(Integer acptStat) {
    this.acptStat = acptStat;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("setl_stat")
  public Integer getSetlStat() {
    return setlStat;
  }
  public void setSetlStat(Integer setlStat) {
    this.setlStat = setlStat;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acpt_name")
  public String getAcptName() {
    return acptName;
  }
  public void setAcptName(String acptName) {
    this.acptName = acptName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("setl_name")
  public String getSetlName() {
    return setlName;
  }
  public void setSetlName(String setlName) {
    this.setlName = setlName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acpt_clen")
  public Integer getAcptClen() {
    return acptClen;
  }
  public void setAcptClen(Integer acptClen) {
    this.acptClen = acptClen;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckDepositAccountResponseData checkDepositAccountResponseData = (CheckDepositAccountResponseData) o;
    return Objects.equals(tranIndc, checkDepositAccountResponseData.tranIndc) &&
        Objects.equals(acptStat, checkDepositAccountResponseData.acptStat) &&
        Objects.equals(setlStat, checkDepositAccountResponseData.setlStat) &&
        Objects.equals(acptName, checkDepositAccountResponseData.acptName) &&
        Objects.equals(setlName, checkDepositAccountResponseData.setlName) &&
        Objects.equals(acptClen, checkDepositAccountResponseData.acptClen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranIndc, acptStat, setlStat, acptName, setlName, acptClen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckDepositAccountResponseData {\n");
    
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    acptStat: ").append(toIndentedString(acptStat)).append("\n");
    sb.append("    setlStat: ").append(toIndentedString(setlStat)).append("\n");
    sb.append("    acptName: ").append(toIndentedString(acptName)).append("\n");
    sb.append("    setlName: ").append(toIndentedString(setlName)).append("\n");
    sb.append("    acptClen: ").append(toIndentedString(acptClen)).append("\n");
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

