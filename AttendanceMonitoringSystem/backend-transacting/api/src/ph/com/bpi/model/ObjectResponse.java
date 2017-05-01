package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ph.com.bpi.model.ResponseMeta;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ObjectResponse   {
  
  private Object data = null;
  private ResponseMeta meta = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("meta")
  public ResponseMeta getMeta() {
    return meta;
  }
  public void setMeta(ResponseMeta meta) {
    this.meta = meta;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectResponse objectResponse = (ObjectResponse) o;
    return Objects.equals(data, objectResponse.data) &&
        Objects.equals(meta, objectResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

