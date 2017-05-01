package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ManagersCheck   {
  
  private String referenceNo = null;
  private String mcSerialNo = null;
  private Float phpAmount = null;
  private String lastName = null;
  private String firstName = null;
  private String middleName = null;

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("referenceNo")
  public String getReferenceNo() {
    return referenceNo;
  }
  public void setReferenceNo(String referenceNo) {
    this.referenceNo = referenceNo;
  }

  
  /**
   * Manager's Check Serial Number
   **/
  
  @ApiModelProperty(required = true, value = "Manager's Check Serial Number")
  @JsonProperty("mcSerialNo")
  public String getMcSerialNo() {
    return mcSerialNo;
  }
  public void setMcSerialNo(String mcSerialNo) {
    this.mcSerialNo = mcSerialNo;
  }

  
  /**
   * Amount in Philippine Peso (PHP)
   **/
  
  @ApiModelProperty(required = true, value = "Amount in Philippine Peso (PHP)")
  @JsonProperty("phpAmount")
  public Float getPhpAmount() {
    return phpAmount;
  }
  public void setPhpAmount(Float phpAmount) {
    this.phpAmount = phpAmount;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
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
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagersCheck managersCheck = (ManagersCheck) o;
    return Objects.equals(referenceNo, managersCheck.referenceNo) &&
        Objects.equals(mcSerialNo, managersCheck.mcSerialNo) &&
        Objects.equals(phpAmount, managersCheck.phpAmount) &&
        Objects.equals(lastName, managersCheck.lastName) &&
        Objects.equals(firstName, managersCheck.firstName) &&
        Objects.equals(middleName, managersCheck.middleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceNo, mcSerialNo, phpAmount, lastName, firstName, middleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagersCheck {\n");
    
    sb.append("    referenceNo: ").append(toIndentedString(referenceNo)).append("\n");
    sb.append("    mcSerialNo: ").append(toIndentedString(mcSerialNo)).append("\n");
    sb.append("    phpAmount: ").append(toIndentedString(phpAmount)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
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

