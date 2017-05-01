package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Currency   {
  
  private Integer id = null;
  private String currencyCode = null;

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * Three-letter currency code (example: PHP, USD, AUD)
   **/
  
  @ApiModelProperty(required = true, value = "Three-letter currency code (example: PHP, USD, AUD)")
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Currency currency = (Currency) o;
    return Objects.equals(id, currency.id) &&
        Objects.equals(currencyCode, currency.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, currencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currency {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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

