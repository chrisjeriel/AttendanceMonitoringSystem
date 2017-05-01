package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class UserFileEncode   {
  
  private String tranFi = null;
  private String brchCode = null;
  private String userId = null;
  private String lname = null;
  private String fname = null;
  private String mname = null;
  private String userType = null;
  private String nbrchCode = null;

  
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
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lname")
  public String getLname() {
    return lname;
  }
  public void setLname(String lname) {
    this.lname = lname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fname")
  public String getFname() {
    return fname;
  }
  public void setFname(String fname) {
    this.fname = fname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mname")
  public String getMname() {
    return mname;
  }
  public void setMname(String mname) {
    this.mname = mname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("user_type")
  public String getUserType() {
    return userType;
  }
  public void setUserType(String userType) {
    this.userType = userType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nbrch_code")
  public String getNbrchCode() {
    return nbrchCode;
  }
  public void setNbrchCode(String nbrchCode) {
    this.nbrchCode = nbrchCode;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFileEncode userFileEncode = (UserFileEncode) o;
    return Objects.equals(tranFi, userFileEncode.tranFi) &&
        Objects.equals(brchCode, userFileEncode.brchCode) &&
        Objects.equals(userId, userFileEncode.userId) &&
        Objects.equals(lname, userFileEncode.lname) &&
        Objects.equals(fname, userFileEncode.fname) &&
        Objects.equals(mname, userFileEncode.mname) &&
        Objects.equals(userType, userFileEncode.userType) &&
        Objects.equals(nbrchCode, userFileEncode.nbrchCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranFi, brchCode, userId, lname, fname, mname, userType, nbrchCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFileEncode {\n");
    
    sb.append("    tranFi: ").append(toIndentedString(tranFi)).append("\n");
    sb.append("    brchCode: ").append(toIndentedString(brchCode)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    lname: ").append(toIndentedString(lname)).append("\n");
    sb.append("    fname: ").append(toIndentedString(fname)).append("\n");
    sb.append("    mname: ").append(toIndentedString(mname)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    nbrchCode: ").append(toIndentedString(nbrchCode)).append("\n");
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

