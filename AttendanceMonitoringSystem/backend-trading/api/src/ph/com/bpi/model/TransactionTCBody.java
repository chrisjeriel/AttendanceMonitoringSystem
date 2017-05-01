package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class TransactionTCBody   {
  
  private String listIndc = null;
  private String brchCode = null;
  private String trdrFi = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("list_indc")
  public String getListIndc() {
    return listIndc;
  }
  public void setListIndc(String listIndc) {
    this.listIndc = listIndc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("brch_code")
  public String getBrchCode() {
    return brchCode;
  }
  public void setBrchCode(String brchCode) {
    this.brchCode = brchCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trdr_fi")
  public String getTrdrFi() {
    return trdrFi;
  }
  public void setTrdrFi(String trdrFi) {
    this.trdrFi = trdrFi;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionTCBody transactionTCBody = (TransactionTCBody) o;
    return Objects.equals(listIndc, transactionTCBody.listIndc) &&
        Objects.equals(brchCode, transactionTCBody.brchCode) &&
        Objects.equals(trdrFi, transactionTCBody.trdrFi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listIndc, brchCode, trdrFi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionTCBody {\n");
    
    sb.append("    listIndc: ").append(toIndentedString(listIndc)).append("\n");
    sb.append("    brchCode: ").append(toIndentedString(brchCode)).append("\n");
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
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

