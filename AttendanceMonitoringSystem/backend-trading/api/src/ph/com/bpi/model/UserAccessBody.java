package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class UserAccessBody   {
  
  private String userType = null;
  private String tranFi = null;
  private String userAccs = null;

  
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
  @JsonProperty("user_accs")
  public String getUserAccs() {
    return userAccs;
  }
  public void setUserAccs(String userAccs) {
    this.userAccs = userAccs;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccessBody userAccessBody = (UserAccessBody) o;
    return Objects.equals(userType, userAccessBody.userType) &&
        Objects.equals(tranFi, userAccessBody.tranFi) &&
        Objects.equals(userAccs, userAccessBody.userAccs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userType, tranFi, userAccs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccessBody {\n");
    
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    tranFi: ").append(toIndentedString(tranFi)).append("\n");
    sb.append("    userAccs: ").append(toIndentedString(userAccs)).append("\n");
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

