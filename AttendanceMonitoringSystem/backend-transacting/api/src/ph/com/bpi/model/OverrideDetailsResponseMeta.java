package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import ph.com.bpi.model.OverrideDetailsResponseData;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class OverrideDetailsResponseMeta   {
  
  private String code = null;
  private List<OverrideDetailsResponseData> data = new ArrayList<OverrideDetailsResponseData>();

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public List<OverrideDetailsResponseData> getData() {
    return data;
  }
  public void setData(List<OverrideDetailsResponseData> data) {
    this.data = data;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverrideDetailsResponseMeta overrideDetailsResponseMeta = (OverrideDetailsResponseMeta) o;
    return Objects.equals(code, overrideDetailsResponseMeta.code) &&
        Objects.equals(data, overrideDetailsResponseMeta.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverrideDetailsResponseMeta {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

