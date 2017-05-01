package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class OverrideBody   {
  
  private String trdrFi = null;
  private String tranIndc = null;
  private Integer brchCode = null;
  private String currCode = null;
  private String refNmbr = null;
  private String listType = null;
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
  @JsonProperty("list_type")
  public String getListType() {
    return listType;
  }
  public void setListType(String listType) {
    this.listType = listType;
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
    OverrideBody overrideBody = (OverrideBody) o;
    return Objects.equals(trdrFi, overrideBody.trdrFi) &&
        Objects.equals(tranIndc, overrideBody.tranIndc) &&
        Objects.equals(brchCode, overrideBody.brchCode) &&
        Objects.equals(currCode, overrideBody.currCode) &&
        Objects.equals(refNmbr, overrideBody.refNmbr) &&
        Objects.equals(listType, overrideBody.listType) &&
        Objects.equals(proctag, overrideBody.proctag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, tranIndc, brchCode, currCode, refNmbr, listType, proctag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverrideBody {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    brchCode: ").append(toIndentedString(brchCode)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    refNmbr: ").append(toIndentedString(refNmbr)).append("\n");
    sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
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

