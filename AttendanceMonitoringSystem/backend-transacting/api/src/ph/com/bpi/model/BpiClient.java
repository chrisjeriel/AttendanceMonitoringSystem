package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Short details of BPI/BFB account
 **/

@ApiModel(description = "Short details of BPI/BFB account")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class BpiClient   {
  
  private String accountNumber = null;
  private String currency = null;
  private String shortName = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shortName")
  public String getShortName() {
    return shortName;
  }
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BpiClient bpiClient = (BpiClient) o;
    return Objects.equals(accountNumber, bpiClient.accountNumber) &&
        Objects.equals(currency, bpiClient.currency) &&
        Objects.equals(shortName, bpiClient.shortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, currency, shortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BpiClient {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
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

