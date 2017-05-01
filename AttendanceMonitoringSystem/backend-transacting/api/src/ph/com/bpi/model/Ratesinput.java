package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Ratesinput   {
  
  private String trdrFi = null;
  private Integer rateType = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trdr_fi")
  public String getTrdrFi() {
    return trdrFi;
  }
  public void setTrdrFi(String trdrFi) {
    this.trdrFi = trdrFi;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rate_type")
  public Integer getRateType() {
    return rateType;
  }
  public void setRateType(Integer rateType) {
    this.rateType = rateType;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ratesinput ratesinput = (Ratesinput) o;
    return Objects.equals(trdrFi, ratesinput.trdrFi) &&
        Objects.equals(rateType, ratesinput.rateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, rateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ratesinput {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
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

