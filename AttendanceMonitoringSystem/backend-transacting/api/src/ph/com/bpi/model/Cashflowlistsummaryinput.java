package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Cashflowlistsummaryinput   {
  
  private String tranFi = null;
  private String tranUnit = null;
  private String currCode = null;
  private String proctag = null;

  
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
    Cashflowlistsummaryinput cashflowlistsummaryinput = (Cashflowlistsummaryinput) o;
    return Objects.equals(tranFi, cashflowlistsummaryinput.tranFi) &&
        Objects.equals(tranUnit, cashflowlistsummaryinput.tranUnit) &&
        Objects.equals(currCode, cashflowlistsummaryinput.currCode) &&
        Objects.equals(proctag, cashflowlistsummaryinput.proctag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranFi, tranUnit, currCode, proctag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cashflowlistsummaryinput {\n");
    
    sb.append("    tranFi: ").append(toIndentedString(tranFi)).append("\n");
    sb.append("    tranUnit: ").append(toIndentedString(tranUnit)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
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

