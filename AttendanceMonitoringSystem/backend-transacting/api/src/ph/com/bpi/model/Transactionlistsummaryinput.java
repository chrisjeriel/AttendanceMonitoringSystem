package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Transactionlistsummaryinput   {
  
  private String trdrFi = null;
  private String tranIndc = null;
  private Integer refNmbr = null;
  private Integer rqstType = null;
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
  @JsonProperty("ref_nmbr")
  public Integer getRefNmbr() {
    return refNmbr;
  }
  public void setRefNmbr(Integer refNmbr) {
    this.refNmbr = refNmbr;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rqst_type")
  public Integer getRqstType() {
    return rqstType;
  }
  public void setRqstType(Integer rqstType) {
    this.rqstType = rqstType;
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
    Transactionlistsummaryinput transactionlistsummaryinput = (Transactionlistsummaryinput) o;
    return Objects.equals(trdrFi, transactionlistsummaryinput.trdrFi) &&
        Objects.equals(tranIndc, transactionlistsummaryinput.tranIndc) &&
        Objects.equals(refNmbr, transactionlistsummaryinput.refNmbr) &&
        Objects.equals(rqstType, transactionlistsummaryinput.rqstType) &&
        Objects.equals(proctag, transactionlistsummaryinput.proctag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, tranIndc, refNmbr, rqstType, proctag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transactionlistsummaryinput {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    refNmbr: ").append(toIndentedString(refNmbr)).append("\n");
    sb.append("    rqstType: ").append(toIndentedString(rqstType)).append("\n");
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

