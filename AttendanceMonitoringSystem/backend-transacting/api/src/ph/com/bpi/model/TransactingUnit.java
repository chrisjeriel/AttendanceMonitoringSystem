package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class TransactingUnit   {
  
  private String tranFi = null;
  private String tranDesc = null;
  private String trdrTag = null;

  
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

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trdr_tag")
  public String getTrdrTag() {
    return trdrTag;
  }
  public void setTrdrTag(String trdrTag) {
    this.trdrTag = trdrTag;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactingUnit transactingUnit = (TransactingUnit) o;
    return Objects.equals(tranFi, transactingUnit.tranFi) &&
        Objects.equals(tranDesc, transactingUnit.tranDesc) &&
        Objects.equals(trdrTag, transactingUnit.trdrTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranFi, tranDesc, trdrTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactingUnit {\n");
    
    sb.append("    tranFi: ").append(toIndentedString(tranFi)).append("\n");
    sb.append("    tranDesc: ").append(toIndentedString(tranDesc)).append("\n");
    sb.append("    trdrTag: ").append(toIndentedString(trdrTag)).append("\n");
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

