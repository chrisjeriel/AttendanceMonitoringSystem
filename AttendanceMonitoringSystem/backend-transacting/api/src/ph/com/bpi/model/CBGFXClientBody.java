package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CBGFXClientBody   {
  
  private String tranIndc = null;
  private Integer rqstCode = null;
  private String cLname = null;
  private String cFname = null;
  private String cMname = null;
  private String proctag = null;

  
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
  @JsonProperty("rqst_code")
  public Integer getRqstCode() {
    return rqstCode;
  }
  public void setRqstCode(Integer rqstCode) {
    this.rqstCode = rqstCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("c_lname")
  public String getCLname() {
    return cLname;
  }
  public void setCLname(String cLname) {
    this.cLname = cLname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("c_fname")
  public String getCFname() {
    return cFname;
  }
  public void setCFname(String cFname) {
    this.cFname = cFname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("c_mname")
  public String getCMname() {
    return cMname;
  }
  public void setCMname(String cMname) {
    this.cMname = cMname;
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
    CBGFXClientBody cBGFXClientBody = (CBGFXClientBody) o;
    return Objects.equals(tranIndc, cBGFXClientBody.tranIndc) &&
        Objects.equals(rqstCode, cBGFXClientBody.rqstCode) &&
        Objects.equals(cLname, cBGFXClientBody.cLname) &&
        Objects.equals(cFname, cBGFXClientBody.cFname) &&
        Objects.equals(cMname, cBGFXClientBody.cMname) &&
        Objects.equals(proctag, cBGFXClientBody.proctag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranIndc, rqstCode, cLname, cFname, cMname, proctag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CBGFXClientBody {\n");
    
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    rqstCode: ").append(toIndentedString(rqstCode)).append("\n");
    sb.append("    cLname: ").append(toIndentedString(cLname)).append("\n");
    sb.append("    cFname: ").append(toIndentedString(cFname)).append("\n");
    sb.append("    cMname: ").append(toIndentedString(cMname)).append("\n");
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

