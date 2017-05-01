package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;



/**
 * A summary of transaction details. For complete details, use dataEntry object.
 **/

@ApiModel(description = "A summary of transaction details. For complete details, use dataEntry object.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class TransactionSummary   {
  
  private String referenceNo = null;
  private Date transactionDate = null;
  private String transactionUnit = null;
  private String status = null;
  private String currencyFrom = null;
  private String currencyTo = null;
  private Float transactionAmount = null;
  private Float grantRate = null;
  private String lastName = null;
  private String firstName = null;
  private String middleNAme = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("referenceNo")
  public String getReferenceNo() {
    return referenceNo;
  }
  public void setReferenceNo(String referenceNo) {
    this.referenceNo = referenceNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionDate")
  public Date getTransactionDate() {
    return transactionDate;
  }
  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }

  
  /**
   * Unit where transaction was performed
   **/
  
  @ApiModelProperty(value = "Unit where transaction was performed")
  @JsonProperty("transactionUnit")
  public String getTransactionUnit() {
    return transactionUnit;
  }
  public void setTransactionUnit(String transactionUnit) {
    this.transactionUnit = transactionUnit;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currencyFrom")
  public String getCurrencyFrom() {
    return currencyFrom;
  }
  public void setCurrencyFrom(String currencyFrom) {
    this.currencyFrom = currencyFrom;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currencyTo")
  public String getCurrencyTo() {
    return currencyTo;
  }
  public void setCurrencyTo(String currencyTo) {
    this.currencyTo = currencyTo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionAmount")
  public Float getTransactionAmount() {
    return transactionAmount;
  }
  public void setTransactionAmount(Float transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("grantRate")
  public Float getGrantRate() {
    return grantRate;
  }
  public void setGrantRate(Float grantRate) {
    this.grantRate = grantRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("middleNAme")
  public String getMiddleNAme() {
    return middleNAme;
  }
  public void setMiddleNAme(String middleNAme) {
    this.middleNAme = middleNAme;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSummary transactionSummary = (TransactionSummary) o;
    return Objects.equals(referenceNo, transactionSummary.referenceNo) &&
        Objects.equals(transactionDate, transactionSummary.transactionDate) &&
        Objects.equals(transactionUnit, transactionSummary.transactionUnit) &&
        Objects.equals(status, transactionSummary.status) &&
        Objects.equals(currencyFrom, transactionSummary.currencyFrom) &&
        Objects.equals(currencyTo, transactionSummary.currencyTo) &&
        Objects.equals(transactionAmount, transactionSummary.transactionAmount) &&
        Objects.equals(grantRate, transactionSummary.grantRate) &&
        Objects.equals(lastName, transactionSummary.lastName) &&
        Objects.equals(firstName, transactionSummary.firstName) &&
        Objects.equals(middleNAme, transactionSummary.middleNAme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceNo, transactionDate, transactionUnit, status, currencyFrom, currencyTo, transactionAmount, grantRate, lastName, firstName, middleNAme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSummary {\n");
    
    sb.append("    referenceNo: ").append(toIndentedString(referenceNo)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    transactionUnit: ").append(toIndentedString(transactionUnit)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currencyFrom: ").append(toIndentedString(currencyFrom)).append("\n");
    sb.append("    currencyTo: ").append(toIndentedString(currencyTo)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    grantRate: ").append(toIndentedString(grantRate)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleNAme: ").append(toIndentedString(middleNAme)).append("\n");
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

