package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Change password response
 **/

@ApiModel(description = "Change password response")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CpResponse   {
  
  private String userId = null;
  private Boolean success = null;
  private String errmsg = null;

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * change password operation result
   **/
  
  @ApiModelProperty(required = true, value = "change password operation result")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  
  /**
   * description of error / system message from mainframe
   **/
  
  @ApiModelProperty(value = "description of error / system message from mainframe")
  @JsonProperty("errmsg")
  public String getErrmsg() {
    return errmsg;
  }
  public void setErrmsg(String errmsg) {
    this.errmsg = errmsg;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CpResponse cpResponse = (CpResponse) o;
    return Objects.equals(userId, cpResponse.userId) &&
        Objects.equals(success, cpResponse.success) &&
        Objects.equals(errmsg, cpResponse.errmsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, success, errmsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CpResponse {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    errmsg: ").append(toIndentedString(errmsg)).append("\n");
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

