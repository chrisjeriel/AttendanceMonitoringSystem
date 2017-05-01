package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Logon response.
 **/

/**
 * Logon response.
 */
@ApiModel(description = "Logon response.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-14T13:58:17.342+08:00")
public class LogonResponse   {
  private Boolean success = null;

  public LogonResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Logon status.
   * @return success
  **/
  @ApiModelProperty(value = "Logon status.")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogonResponse logonResponse = (LogonResponse) o;
    return Objects.equals(this.success, logonResponse.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogonResponse {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

