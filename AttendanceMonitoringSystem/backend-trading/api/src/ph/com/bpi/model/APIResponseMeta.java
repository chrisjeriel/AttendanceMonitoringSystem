package ph.com.bpi.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Extra information about the response.
 **/

/**
 * Extra information about the response.
 */
@ApiModel(description = "Extra information about the response.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-14T13:58:17.342+08:00")
public class APIResponseMeta   {
  private Integer code = null;

  private String errorType = null;

  private String errorMessage = null;

  public APIResponseMeta code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Response Code.
   * @return code
  **/
  @ApiModelProperty(value = "Response Code.")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public APIResponseMeta errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

   /**
   * Error type.
   * @return errorType
  **/
  @ApiModelProperty(value = "Error type.")
  public String getErrorType() {
    return errorType;
  }

  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  public APIResponseMeta errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error message.
   * @return errorMessage
  **/
  @ApiModelProperty(value = "Error message.")
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
    APIResponseMeta aPIResponseMeta = (APIResponseMeta) o;
    return Objects.equals(this.code, aPIResponseMeta.code) &&
        Objects.equals(this.errorType, aPIResponseMeta.errorType) &&
        Objects.equals(this.errorMessage, aPIResponseMeta.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, errorType, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIResponseMeta {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

