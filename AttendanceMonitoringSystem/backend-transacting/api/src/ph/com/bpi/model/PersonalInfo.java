package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class PersonalInfo   {
  
  private String firstName = null;
  private String middleName = null;
  private String lastName = null;
  private String addressLine1 = null;
  private String addressLine2 = null;
  private String contactNo = null;
  private Date birthDate = null;
  private String tin = null;

  
  /**
   * Client First Name. Max 20 alphanumeric characters
   **/
  
  @ApiModelProperty(value = "Client First Name. Max 20 alphanumeric characters")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * Client Middle Name. Middle Initials are not allowed. Max 20 alphanumeric characters
   **/
  
  @ApiModelProperty(value = "Client Middle Name. Middle Initials are not allowed. Max 20 alphanumeric characters")
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  
  /**
   * Client Last Name. Max 10 alphanumeric Characters
   **/
  
  @ApiModelProperty(value = "Client Last Name. Max 10 alphanumeric Characters")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * Address Line 1. Max 60 alphanumeric characters.
   **/
  
  @ApiModelProperty(value = "Address Line 1. Max 60 alphanumeric characters.")
  @JsonProperty("addressLine1")
  public String getAddressLine1() {
    return addressLine1;
  }
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  
  /**
   * Address Line 2. Max 60 alphanumeric characters.
   **/
  
  @ApiModelProperty(value = "Address Line 2. Max 60 alphanumeric characters.")
  @JsonProperty("addressLine2")
  public String getAddressLine2() {
    return addressLine2;
  }
  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  
  /**
   * Telephone (7 chars) or mobile number (11 chars)
   **/
  
  @ApiModelProperty(value = "Telephone (7 chars) or mobile number (11 chars)")
  @JsonProperty("contactNo")
  public String getContactNo() {
    return contactNo;
  }
  public void setContactNo(String contactNo) {
    this.contactNo = contactNo;
  }

  
  /**
   * Client birthdate in MM/DD/YYYY format
   **/
  
  @ApiModelProperty(value = "Client birthdate in MM/DD/YYYY format")
  @JsonProperty("birthDate")
  public Date getBirthDate() {
    return birthDate;
  }
  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  
  /**
   * TIN Number in ###-###-### format
   **/
  
  @ApiModelProperty(value = "TIN Number in ###-###-### format")
  @JsonProperty("tin")
  public String getTin() {
    return tin;
  }
  public void setTin(String tin) {
    this.tin = tin;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalInfo personalInfo = (PersonalInfo) o;
    return Objects.equals(firstName, personalInfo.firstName) &&
        Objects.equals(middleName, personalInfo.middleName) &&
        Objects.equals(lastName, personalInfo.lastName) &&
        Objects.equals(addressLine1, personalInfo.addressLine1) &&
        Objects.equals(addressLine2, personalInfo.addressLine2) &&
        Objects.equals(contactNo, personalInfo.contactNo) &&
        Objects.equals(birthDate, personalInfo.birthDate) &&
        Objects.equals(tin, personalInfo.tin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName, addressLine1, addressLine2, contactNo, birthDate, tin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalInfo {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
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

