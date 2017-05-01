package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class DailyListBody   {
  
  private String goffcode = null;
  private String trdrFi = null;
  private String tranIndc = null;
  private BigDecimal amntSw = null;
  private String rqstType = null;
  private String refNumber = null;
  private String currFr = null;
  private String currTo = null;
  private String proctag = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("goffcode")
  public String getGoffcode() {
    return goffcode;
  }
  public void setGoffcode(String goffcode) {
    this.goffcode = goffcode;
  }

  
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
  @JsonProperty("amnt_sw")
  public BigDecimal getAmntSw() {
    return amntSw;
  }
  public void setAmntSw(BigDecimal amntSw) {
    this.amntSw = amntSw;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rqst_type")
  public String getRqstType() {
    return rqstType;
  }
  public void setRqstType(String rqstType) {
    this.rqstType = rqstType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ref_number")
  public String getRefNumber() {
    return refNumber;
  }
  public void setRefNumber(String refNumber) {
    this.refNumber = refNumber;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("curr_fr")
  public String getCurrFr() {
    return currFr;
  }
  public void setCurrFr(String currFr) {
    this.currFr = currFr;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("curr_to")
  public String getCurrTo() {
    return currTo;
  }
  public void setCurrTo(String currTo) {
    this.currTo = currTo;
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
    DailyListBody dailyListBody = (DailyListBody) o;
    return Objects.equals(goffcode, dailyListBody.goffcode) &&
        Objects.equals(trdrFi, dailyListBody.trdrFi) &&
        Objects.equals(tranIndc, dailyListBody.tranIndc) &&
        Objects.equals(amntSw, dailyListBody.amntSw) &&
        Objects.equals(rqstType, dailyListBody.rqstType) &&
        Objects.equals(refNumber, dailyListBody.refNumber) &&
        Objects.equals(currFr, dailyListBody.currFr) &&
        Objects.equals(currTo, dailyListBody.currTo) &&
        Objects.equals(proctag, dailyListBody.proctag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goffcode, trdrFi, tranIndc, amntSw, rqstType, refNumber, currFr, currTo, proctag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyListBody {\n");
    
    sb.append("    goffcode: ").append(toIndentedString(goffcode)).append("\n");
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    amntSw: ").append(toIndentedString(amntSw)).append("\n");
    sb.append("    rqstType: ").append(toIndentedString(rqstType)).append("\n");
    sb.append("    refNumber: ").append(toIndentedString(refNumber)).append("\n");
    sb.append("    currFr: ").append(toIndentedString(currFr)).append("\n");
    sb.append("    currTo: ").append(toIndentedString(currTo)).append("\n");
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

