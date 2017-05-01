package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class CashFlowBody   {
  
  private String brchCode = null;
  private String flowIndc = null;
  private String currCode = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("brch_code")
  public String getBrchCode() {
    return brchCode;
  }
  public void setBrchCode(String brchCode) {
    this.brchCode = brchCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flow_indc")
  public String getFlowIndc() {
    return flowIndc;
  }
  public void setFlowIndc(String flowIndc) {
    this.flowIndc = flowIndc;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlowBody cashFlowBody = (CashFlowBody) o;
    return Objects.equals(brchCode, cashFlowBody.brchCode) &&
        Objects.equals(flowIndc, cashFlowBody.flowIndc) &&
        Objects.equals(currCode, cashFlowBody.currCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brchCode, flowIndc, currCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowBody {\n");
    
    sb.append("    brchCode: ").append(toIndentedString(brchCode)).append("\n");
    sb.append("    flowIndc: ").append(toIndentedString(flowIndc)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
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

