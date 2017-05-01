package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T11:46:02.187+08:00")
public class Acceptedtclist   {
  
  private String refNmbr = null;
  private Integer totlAmt = null;
  private String tranUnit = null;
  private String currCode = null;
  private Integer tcSerno = null;
  private Integer tcAmt = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ref_nmbr")
  public String getRefNmbr() {
    return refNmbr;
  }
  public void setRefNmbr(String refNmbr) {
    this.refNmbr = refNmbr;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totl_amt")
  public Integer getTotlAmt() {
    return totlAmt;
  }
  public void setTotlAmt(Integer totlAmt) {
    this.totlAmt = totlAmt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_unit")
  public String getTranUnit() {
    return tranUnit;
  }
  public void setTranUnit(String tranUnit) {
    this.tranUnit = tranUnit;
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
  @JsonProperty("tc_serno")
  public Integer getTcSerno() {
    return tcSerno;
  }
  public void setTcSerno(Integer tcSerno) {
    this.tcSerno = tcSerno;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tc_amt")
  public Integer getTcAmt() {
    return tcAmt;
  }
  public void setTcAmt(Integer tcAmt) {
    this.tcAmt = tcAmt;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Acceptedtclist acceptedtclist = (Acceptedtclist) o;
    return Objects.equals(refNmbr, acceptedtclist.refNmbr) &&
        Objects.equals(totlAmt, acceptedtclist.totlAmt) &&
        Objects.equals(tranUnit, acceptedtclist.tranUnit) &&
        Objects.equals(currCode, acceptedtclist.currCode) &&
        Objects.equals(tcSerno, acceptedtclist.tcSerno) &&
        Objects.equals(tcAmt, acceptedtclist.tcAmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refNmbr, totlAmt, tranUnit, currCode, tcSerno, tcAmt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Acceptedtclist {\n");
    
    sb.append("    refNmbr: ").append(toIndentedString(refNmbr)).append("\n");
    sb.append("    totlAmt: ").append(toIndentedString(totlAmt)).append("\n");
    sb.append("    tranUnit: ").append(toIndentedString(tranUnit)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    tcSerno: ").append(toIndentedString(tcSerno)).append("\n");
    sb.append("    tcAmt: ").append(toIndentedString(tcAmt)).append("\n");
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

