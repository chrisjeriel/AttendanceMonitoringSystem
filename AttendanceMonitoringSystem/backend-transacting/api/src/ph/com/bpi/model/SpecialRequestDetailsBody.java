package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class SpecialRequestDetailsBody   {
  
  private String trdrFi = null;
  private String tranIndc = null;
  private Integer brchCode = null;
  private String currCode = null;
  private Integer refNumber = null;
  private Integer inqyType = null;

  
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
  @JsonProperty("brch_code")
  public Integer getBrchCode() {
    return brchCode;
  }
  public void setBrchCode(Integer brchCode) {
    this.brchCode = brchCode;
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
  @JsonProperty("ref_number")
  public Integer getRefNumber() {
    return refNumber;
  }
  public void setRefNumber(Integer refNumber) {
    this.refNumber = refNumber;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("inqy_type")
  public Integer getInqyType() {
    return inqyType;
  }
  public void setInqyType(Integer inqyType) {
    this.inqyType = inqyType;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialRequestDetailsBody specialRequestDetailsBody = (SpecialRequestDetailsBody) o;
    return Objects.equals(trdrFi, specialRequestDetailsBody.trdrFi) &&
        Objects.equals(tranIndc, specialRequestDetailsBody.tranIndc) &&
        Objects.equals(brchCode, specialRequestDetailsBody.brchCode) &&
        Objects.equals(currCode, specialRequestDetailsBody.currCode) &&
        Objects.equals(refNumber, specialRequestDetailsBody.refNumber) &&
        Objects.equals(inqyType, specialRequestDetailsBody.inqyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, tranIndc, brchCode, currCode, refNumber, inqyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialRequestDetailsBody {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    brchCode: ").append(toIndentedString(brchCode)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    refNumber: ").append(toIndentedString(refNumber)).append("\n");
    sb.append("    inqyType: ").append(toIndentedString(inqyType)).append("\n");
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

