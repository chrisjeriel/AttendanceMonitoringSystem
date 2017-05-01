package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;




/**
 * MetaResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-01T15:13:18.774+08:00")
public class MetaResponse   {
  private BigDecimal code = null;

  private String errorType = null;

  private String errorMessage = null;

  public MetaResponse code(BigDecimal code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCode() {
    return code;
  }

  public void setCode(BigDecimal code) {
    this.code = code;
  }

  public MetaResponse errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

   /**
   * Get errorType
   * @return errorType
  **/
  @ApiModelProperty(value = "")
  public String getErrorType() {
    return errorType;
  }

  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  public MetaResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(value = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaResponse metaResponse = (MetaResponse) o;
    return Objects.equals(this.code, metaResponse.code) &&
        Objects.equals(this.errorType, metaResponse.errorType) &&
        Objects.equals(this.errorMessage, metaResponse.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, errorType, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaResponse {\n");
    
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

