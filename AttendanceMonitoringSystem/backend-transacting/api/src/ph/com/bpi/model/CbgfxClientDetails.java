package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Short description of a CBG-FX Client
 **/

@ApiModel(description = "Short description of a CBG-FX Client")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CbgfxClientDetails   {
  
  private String lastname = null;
  private String firstname = null;
  private String middleName = null;
  private Float accumulatedAmount = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastname")
  public String getLastname() {
    return lastname;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("firstname")
  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
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

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accumulatedAmount")
  public Float getAccumulatedAmount() {
    return accumulatedAmount;
  }
  public void setAccumulatedAmount(Float accumulatedAmount) {
    this.accumulatedAmount = accumulatedAmount;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CbgfxClientDetails cbgfxClientDetails = (CbgfxClientDetails) o;
    return Objects.equals(lastname, cbgfxClientDetails.lastname) &&
        Objects.equals(firstname, cbgfxClientDetails.firstname) &&
        Objects.equals(middleName, cbgfxClientDetails.middleName) &&
        Objects.equals(accumulatedAmount, cbgfxClientDetails.accumulatedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastname, firstname, middleName, accumulatedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CbgfxClientDetails {\n");
    
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    accumulatedAmount: ").append(toIndentedString(accumulatedAmount)).append("\n");
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

