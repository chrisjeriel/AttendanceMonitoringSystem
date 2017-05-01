package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Historicalrecordssummaryinput   {
  
  private String tranIndc = null;
  private String searchTag = null;
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
  @JsonProperty("search_tag")
  public String getSearchTag() {
    return searchTag;
  }
  public void setSearchTag(String searchTag) {
    this.searchTag = searchTag;
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
    Historicalrecordssummaryinput historicalrecordssummaryinput = (Historicalrecordssummaryinput) o;
    return Objects.equals(tranIndc, historicalrecordssummaryinput.tranIndc) &&
        Objects.equals(searchTag, historicalrecordssummaryinput.searchTag) &&
        Objects.equals(cLname, historicalrecordssummaryinput.cLname) &&
        Objects.equals(cFname, historicalrecordssummaryinput.cFname) &&
        Objects.equals(cMname, historicalrecordssummaryinput.cMname) &&
        Objects.equals(tranDate, historicalrecordssummaryinput.tranDate) &&
        Objects.equals(tranTime, historicalrecordssummaryinput.tranTime) &&
        Objects.equals(proctag, historicalrecordssummaryinput.proctag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranIndc, searchTag, cLname, cFname, cMname, tranDate, tranTime, proctag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Historicalrecordssummaryinput {\n");
    
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    searchTag: ").append(toIndentedString(searchTag)).append("\n");
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

