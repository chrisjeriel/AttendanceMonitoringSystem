package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class DealRate   {
  
  private Float dealRateAmount = null;

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("dealRateAmount")
  public Float getDealRateAmount() {
    return dealRateAmount;
  }
  public void setDealRateAmount(Float dealRateAmount) {
    this.dealRateAmount = dealRateAmount;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealRate dealRate = (DealRate) o;
    return Objects.equals(dealRateAmount, dealRate.dealRateAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealRateAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealRate {\n");
    
    sb.append("    dealRateAmount: ").append(toIndentedString(dealRateAmount)).append("\n");
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

