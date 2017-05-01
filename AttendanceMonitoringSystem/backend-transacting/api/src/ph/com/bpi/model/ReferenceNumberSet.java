package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Temporary and Permanent Reference number for the transaction
 **/

@ApiModel(description = "Temporary and Permanent Reference number for the transaction")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ReferenceNumberSet   {
  
  private String temporaryRefNo = null;
  private String permanentRefNo = null;

  
  /**
   * Transaction's old reference code. Empty if not applicable.
   **/
  
  @ApiModelProperty(value = "Transaction's old reference code. Empty if not applicable.")
  @JsonProperty("temporaryRefNo")
  public String getTemporaryRefNo() {
    return temporaryRefNo;
  }
  public void setTemporaryRefNo(String temporaryRefNo) {
    this.temporaryRefNo = temporaryRefNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("permanentRefNo")
  public String getPermanentRefNo() {
    return permanentRefNo;
  }
  public void setPermanentRefNo(String permanentRefNo) {
    this.permanentRefNo = permanentRefNo;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceNumberSet referenceNumberSet = (ReferenceNumberSet) o;
    return Objects.equals(temporaryRefNo, referenceNumberSet.temporaryRefNo) &&
        Objects.equals(permanentRefNo, referenceNumberSet.permanentRefNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(temporaryRefNo, permanentRefNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceNumberSet {\n");
    
    sb.append("    temporaryRefNo: ").append(toIndentedString(temporaryRefNo)).append("\n");
    sb.append("    permanentRefNo: ").append(toIndentedString(permanentRefNo)).append("\n");
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

