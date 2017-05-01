package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SendHostBody   {
  
  private String message1 = null;
  private String frMon = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message1")
  public String getMessage1() {
    return message1;
  }
  public void setMessage1(String message1) {
    this.message1 = message1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fr_mon")
  public String getFrMon() {
    return frMon;
  }
  public void setFrMon(String frMon) {
    this.frMon = frMon;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendHostBody sendHostBody = (SendHostBody) o;
    return Objects.equals(message1, sendHostBody.message1) &&
        Objects.equals(frMon, sendHostBody.frMon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message1, frMon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendHostBody {\n");
    
    sb.append("    message1: ").append(toIndentedString(message1)).append("\n");
    sb.append("    frMon: ").append(toIndentedString(frMon)).append("\n");
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

