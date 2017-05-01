package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-25T12:50:45.946+08:00")
public class TransactingUnitEncode   {
  
  private String tranFi = null;
  private String tranDesc = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_fi")
  public String getTranFi() {
    return tranFi;
  }
  public void setTranFi(String tranFi) {
    this.tranFi = tranFi;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_desc")
  public String getTranDesc() {
    return tranDesc;
  }
  public void setTranDesc(String tranDesc) {
    this.tranDesc = tranDesc;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactingUnitEncode transactingUnitEncode = (TransactingUnitEncode) o;
    return Objects.equals(tranFi, transactingUnitEncode.tranFi) &&
        Objects.equals(tranDesc, transactingUnitEncode.tranDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranFi, tranDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactingUnitEncode {\n");
    
    sb.append("    tranFi: ").append(toIndentedString(tranFi)).append("\n");
    sb.append("    tranDesc: ").append(toIndentedString(tranDesc)).append("\n");
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

