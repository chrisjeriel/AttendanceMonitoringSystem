package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class InlineResponse2001   {
  
  private Float sellingRate = null;
  private Float buyingRate = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sellingRate")
  public Float getSellingRate() {
    return sellingRate;
  }
  public void setSellingRate(Float sellingRate) {
    this.sellingRate = sellingRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("buyingRate")
  public Float getBuyingRate() {
    return buyingRate;
  }
  public void setBuyingRate(Float buyingRate) {
    this.buyingRate = buyingRate;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(sellingRate, inlineResponse2001.sellingRate) &&
        Objects.equals(buyingRate, inlineResponse2001.buyingRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellingRate, buyingRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    sellingRate: ").append(toIndentedString(sellingRate)).append("\n");
    sb.append("    buyingRate: ").append(toIndentedString(buyingRate)).append("\n");
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

