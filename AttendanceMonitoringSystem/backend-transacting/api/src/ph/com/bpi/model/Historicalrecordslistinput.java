package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Historicalrecordslistinput   {
  
  private String tranIndc = null;
  private String cLname = null;
  private String cFname = null;
  private String cMname = null;
  private Date tranDate = null;
  private String tranTime = null;
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
  @JsonProperty("tran_date")
  public Date getTranDate() {
    return tranDate;
  }
  public void setTranDate(Date tranDate) {
    this.tranDate = tranDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_time")
  public String getTranTime() {
    return tranTime;
  }
  public void setTranTime(String tranTime) {
    this.tranTime = tranTime;
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
    Historicalrecordslistinput historicalrecordslistinput = (Historicalrecordslistinput) o;
    return Objects.equals(tranIndc, historicalrecordslistinput.tranIndc) &&
        Objects.equals(cLname, historicalrecordslistinput.cLname) &&
        Objects.equals(cFname, historicalrecordslistinput.cFname) &&
        Objects.equals(cMname, historicalrecordslistinput.cMname) &&
        Objects.equals(tranDate, historicalrecordslistinput.tranDate) &&
        Objects.equals(tranTime, historicalrecordslistinput.tranTime) &&
        Objects.equals(proctag, historicalrecordslistinput.proctag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranIndc, cLname, cFname, cMname, tranDate, tranTime, proctag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Historicalrecordslistinput {\n");
    
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    cLname: ").append(toIndentedString(cLname)).append("\n");
    sb.append("    cFname: ").append(toIndentedString(cFname)).append("\n");
    sb.append("    cMname: ").append(toIndentedString(cMname)).append("\n");
    sb.append("    tranDate: ").append(toIndentedString(tranDate)).append("\n");
    sb.append("    tranTime: ").append(toIndentedString(tranTime)).append("\n");
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

