package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Cashflowdetailsinput   {
  
  private String tranFi = null;
  private String tranUnit = null;
  private String flowIndc = null;
  private String currCode = null;
  private Integer seqNo = null;
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

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("seq_no")
  public Integer getSeqNo() {
    return seqNo;
  }
  public void setSeqNo(Integer seqNo) {
    this.seqNo = seqNo;
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
    Cashflowdetailsinput cashflowdetailsinput = (Cashflowdetailsinput) o;
    return Objects.equals(tranFi, cashflowdetailsinput.tranFi) &&
        Objects.equals(tranUnit, cashflowdetailsinput.tranUnit) &&
        Objects.equals(flowIndc, cashflowdetailsinput.flowIndc) &&
        Objects.equals(currCode, cashflowdetailsinput.currCode) &&
        Objects.equals(seqNo, cashflowdetailsinput.seqNo) &&
        Objects.equals(proctag, cashflowdetailsinput.proctag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranFi, tranUnit, flowIndc, currCode, seqNo, proctag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cashflowdetailsinput {\n");
    
    sb.append("    tranFi: ").append(toIndentedString(tranFi)).append("\n");
    sb.append("    tranUnit: ").append(toIndentedString(tranUnit)).append("\n");
    sb.append("    flowIndc: ").append(toIndentedString(flowIndc)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    seqNo: ").append(toIndentedString(seqNo)).append("\n");
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

