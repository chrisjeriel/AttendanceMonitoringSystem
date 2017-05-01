package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ph.com.bpi.model.Currency;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CurrencyCombination   {
  
  private Integer id = null;
  private Currency fromCurrency = null;
  private Currency toCurrency = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fromCurrency")
  public Currency getFromCurrency() {
    return fromCurrency;
  }
  public void setFromCurrency(Currency fromCurrency) {
    this.fromCurrency = fromCurrency;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("toCurrency")
  public Currency getToCurrency() {
    return toCurrency;
  }
  public void setToCurrency(Currency toCurrency) {
    this.toCurrency = toCurrency;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyCombination currencyCombination = (CurrencyCombination) o;
    return Objects.equals(id, currencyCombination.id) &&
        Objects.equals(fromCurrency, currencyCombination.fromCurrency) &&
        Objects.equals(toCurrency, currencyCombination.toCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fromCurrency, toCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyCombination {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fromCurrency: ").append(toIndentedString(fromCurrency)).append("\n");
    sb.append("    toCurrency: ").append(toIndentedString(toCurrency)).append("\n");
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

