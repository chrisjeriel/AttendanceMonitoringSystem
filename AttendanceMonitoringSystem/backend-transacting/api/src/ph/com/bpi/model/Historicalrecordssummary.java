package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Historicalrecordssummary   {
  
  private String tranIndc = null;
  private String cLname = null;
  private String cFname = null;
  private String cMname = null;
  private Integer accmAmnt = null;
  private Integer accmAmnt2 = null;

  
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
  @JsonProperty("accm_amnt")
  public Integer getAccmAmnt() {
    return accmAmnt;
  }
  public void setAccmAmnt(Integer accmAmnt) {
    this.accmAmnt = accmAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accm_amnt2")
  public Integer getAccmAmnt2() {
    return accmAmnt2;
  }
  public void setAccmAmnt2(Integer accmAmnt2) {
    this.accmAmnt2 = accmAmnt2;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Historicalrecordssummary historicalrecordssummary = (Historicalrecordssummary) o;
    return Objects.equals(tranIndc, historicalrecordssummary.tranIndc) &&
        Objects.equals(cLname, historicalrecordssummary.cLname) &&
        Objects.equals(cFname, historicalrecordssummary.cFname) &&
        Objects.equals(cMname, historicalrecordssummary.cMname) &&
        Objects.equals(accmAmnt, historicalrecordssummary.accmAmnt) &&
        Objects.equals(accmAmnt2, historicalrecordssummary.accmAmnt2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranIndc, cLname, cFname, cMname, accmAmnt, accmAmnt2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Historicalrecordssummary {\n");
    
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    cLname: ").append(toIndentedString(cLname)).append("\n");
    sb.append("    cFname: ").append(toIndentedString(cFname)).append("\n");
    sb.append("    cMname: ").append(toIndentedString(cMname)).append("\n");
    sb.append("    accmAmnt: ").append(toIndentedString(accmAmnt)).append("\n");
    sb.append("    accmAmnt2: ").append(toIndentedString(accmAmnt2)).append("\n");
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

