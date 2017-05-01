package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class InlineResponse200   {
  
  private Float fcdAmount = null;
  private Float regularAmount = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fcdAmount")
  public Float getFcdAmount() {
    return fcdAmount;
  }
  public void setFcdAmount(Float fcdAmount) {
    this.fcdAmount = fcdAmount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("regularAmount")
  public Float getRegularAmount() {
    return regularAmount;
  }
  public void setRegularAmount(Float regularAmount) {
    this.regularAmount = regularAmount;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(fcdAmount, inlineResponse200.fcdAmount) &&
        Objects.equals(regularAmount, inlineResponse200.regularAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fcdAmount, regularAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    fcdAmount: ").append(toIndentedString(fcdAmount)).append("\n");
    sb.append("    regularAmount: ").append(toIndentedString(regularAmount)).append("\n");
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

