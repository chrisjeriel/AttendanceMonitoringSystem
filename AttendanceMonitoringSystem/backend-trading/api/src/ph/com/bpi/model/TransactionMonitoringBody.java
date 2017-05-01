package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class TransactionMonitoringBody   {
  
  private String ptrckIndc = null;
  private String ptrckDays = null;
  private String ptrckAmnt = null;
  private String strckIndc = null;
  private String strckDays = null;
  private String strckAmnt = null;

  
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
    TransactionMonitoringBody transactionMonitoringBody = (TransactionMonitoringBody) o;
    return Objects.equals(ptrckIndc, transactionMonitoringBody.ptrckIndc) &&
        Objects.equals(ptrckDays, transactionMonitoringBody.ptrckDays) &&
        Objects.equals(ptrckAmnt, transactionMonitoringBody.ptrckAmnt) &&
        Objects.equals(strckIndc, transactionMonitoringBody.strckIndc) &&
        Objects.equals(strckDays, transactionMonitoringBody.strckDays) &&
        Objects.equals(strckAmnt, transactionMonitoringBody.strckAmnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ptrckIndc, ptrckDays, ptrckAmnt, strckIndc, strckDays, strckAmnt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionMonitoringBody {\n");
    
    sb.append("    ptrckIndc: ").append(toIndentedString(ptrckIndc)).append("\n");
    sb.append("    ptrckDays: ").append(toIndentedString(ptrckDays)).append("\n");
    sb.append("    ptrckAmnt: ").append(toIndentedString(ptrckAmnt)).append("\n");
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

