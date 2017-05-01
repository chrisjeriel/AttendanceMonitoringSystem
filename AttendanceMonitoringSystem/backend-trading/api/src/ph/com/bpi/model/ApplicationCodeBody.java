package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class ApplicationCodeBody   {
  
  private String applCod = null;
  private String applDes = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appl_cod")
  public String getApplCod() {
    return applCod;
  }
  public void setApplCod(String applCod) {
    this.applCod = applCod;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appl_des")
  public String getApplDes() {
    return applDes;
  }
  public void setApplDes(String applDes) {
    this.applDes = applDes;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationCodeBody applicationCodeBody = (ApplicationCodeBody) o;
    return Objects.equals(applCod, applicationCodeBody.applCod) &&
        Objects.equals(applDes, applicationCodeBody.applDes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applCod, applDes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationCodeBody {\n");
    
    sb.append("    applCod: ").append(toIndentedString(applCod)).append("\n");
    sb.append("    applDes: ").append(toIndentedString(applDes)).append("\n");
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

