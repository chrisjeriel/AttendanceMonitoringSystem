package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ResponseMeta   {
  
  private Integer code = null;
  private String errorType = null;
  private String errorMessage = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorType")
  public String getErrorType() {
    return errorType;
  }
  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseMeta responseMeta = (ResponseMeta) o;
    return Objects.equals(code, responseMeta.code) &&
        Objects.equals(errorType, responseMeta.errorType) &&
        Objects.equals(errorMessage, responseMeta.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, errorType, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseMeta {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

