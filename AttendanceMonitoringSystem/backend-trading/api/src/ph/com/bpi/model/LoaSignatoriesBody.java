package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class LoaSignatoriesBody   {
  
  private String lastName = null;
  private String middleName = null;
  private String firstName = null;

  
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
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName =middleName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("firstName")
  public String getfirstName() {
    return firstName;
  }
  public void setfirstName(String firstName) {
    this.firstName = firstName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoaSignatoriesBody LoaSignatoriesBody = (LoaSignatoriesBody) o;
    return Objects.equals(lastName, LoaSignatoriesBody.lastName) &&
        Objects.equals(middleName, LoaSignatoriesBody.lastName) &&
        Objects.equals(firstName, LoaSignatoriesBody.firstName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastName, middleName, firstName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoaSignatoriesBody {\n");
    
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
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

