package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Clienthistory   {
  
  private String cLname = null;
  private String cFname = null;
  private String cMname = null;
  private String cAddr1 = null;
  private String cAddr2 = null;
  private Date bday = null;
  private String tel = null;
  private String tin = null;

  
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
  @JsonProperty("c_addr1")
  public String getCAddr1() {
    return cAddr1;
  }
  public void setCAddr1(String cAddr1) {
    this.cAddr1 = cAddr1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("c_addr2")
  public String getCAddr2() {
    return cAddr2;
  }
  public void setCAddr2(String cAddr2) {
    this.cAddr2 = cAddr2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bday")
  public Date getBday() {
    return bday;
  }
  public void setBday(Date bday) {
    this.bday = bday;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tel")
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tin")
  public String getTin() {
    return tin;
  }
  public void setTin(String tin) {
    this.tin = tin;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Clienthistory clienthistory = (Clienthistory) o;
    return Objects.equals(cLname, clienthistory.cLname) &&
        Objects.equals(cFname, clienthistory.cFname) &&
        Objects.equals(cMname, clienthistory.cMname) &&
        Objects.equals(cAddr1, clienthistory.cAddr1) &&
        Objects.equals(cAddr2, clienthistory.cAddr2) &&
        Objects.equals(bday, clienthistory.bday) &&
        Objects.equals(tel, clienthistory.tel) &&
        Objects.equals(tin, clienthistory.tin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cLname, cFname, cMname, cAddr1, cAddr2, bday, tel, tin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clienthistory {\n");
    
    sb.append("    cLname: ").append(toIndentedString(cLname)).append("\n");
    sb.append("    cFname: ").append(toIndentedString(cFname)).append("\n");
    sb.append("    cMname: ").append(toIndentedString(cMname)).append("\n");
    sb.append("    cAddr1: ").append(toIndentedString(cAddr1)).append("\n");
    sb.append("    cAddr2: ").append(toIndentedString(cAddr2)).append("\n");
    sb.append("    bday: ").append(toIndentedString(bday)).append("\n");
    sb.append("    tel: ").append(toIndentedString(tel)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
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

