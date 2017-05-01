package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class TravelersCheck   {
  
  private Integer id = null;
  private String referenceNo = null;
  private String checkNo = null;
  private Float checkAmount = null;
  private String refNo = null;
  private String currency = null;
  private String totalAmount = null;

  
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
   * Transaction reference number (optional)
   **/
  
  @ApiModelProperty(value = "Transaction reference number (optional)")
  @JsonProperty("referenceNo")
  public String getReferenceNo() {
    return referenceNo;
  }
  public void setReferenceNo(String referenceNo) {
    this.referenceNo = referenceNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("checkNo")
  public String getCheckNo() {
    return checkNo;
  }
  public void setCheckNo(String checkNo) {
    this.checkNo = checkNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("checkAmount")
  public Float getCheckAmount() {
    return checkAmount;
  }
  public void setCheckAmount(Float checkAmount) {
    this.checkAmount = checkAmount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("refNo")
  public String getRefNo() {
    return refNo;
  }
  public void setRefNo(String refNo) {
    this.refNo = refNo;
  }

  
  /**
   * Three-letter currency code (ex: PHP, USD)
   **/
  
  @ApiModelProperty(value = "Three-letter currency code (ex: PHP, USD)")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   * Also equal to checkAmount (for verification)
   **/
  
  @ApiModelProperty(value = "Also equal to checkAmount (for verification)")
  @JsonProperty("totalAmount")
  public String getTotalAmount() {
    return totalAmount;
  }
  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelersCheck travelersCheck = (TravelersCheck) o;
    return Objects.equals(id, travelersCheck.id) &&
        Objects.equals(referenceNo, travelersCheck.referenceNo) &&
        Objects.equals(checkNo, travelersCheck.checkNo) &&
        Objects.equals(checkAmount, travelersCheck.checkAmount) &&
        Objects.equals(refNo, travelersCheck.refNo) &&
        Objects.equals(currency, travelersCheck.currency) &&
        Objects.equals(totalAmount, travelersCheck.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, referenceNo, checkNo, checkAmount, refNo, currency, totalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelersCheck {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceNo: ").append(toIndentedString(referenceNo)).append("\n");
    sb.append("    checkNo: ").append(toIndentedString(checkNo)).append("\n");
    sb.append("    checkAmount: ").append(toIndentedString(checkAmount)).append("\n");
    sb.append("    refNo: ").append(toIndentedString(refNo)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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

