package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ph.com.bpi.model.APIResponseMeta;



/**
 * Extra information about the response.
 **/

/**
 * Extra information about the response.
 */
@ApiModel(description = "Extra information about the response.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-14T13:58:17.342+08:00")
public class APIResponse   {
  private Object data = null;

  private APIResponseMeta meta = null;

  public APIResponse data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Response data.
   * @return data
  **/
  @ApiModelProperty(value = "Response data.")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public APIResponse meta(APIResponseMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")
  public APIResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(APIResponseMeta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIResponse _aPIResponse = (APIResponse) o;
    return Objects.equals(this.data, _aPIResponse.data) &&
        Objects.equals(this.meta, _aPIResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAPIResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

