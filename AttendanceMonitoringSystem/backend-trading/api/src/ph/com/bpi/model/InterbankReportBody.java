package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class InterbankReportBody   {
  
  private String refNmbr = null;
  private String tranIndtr = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("refNmbr")
  public String getRefNmbr() {
    return refNmbr;
  }
  public void setRefNmbr(String refNmbr) {
    this.refNmbr = refNmbr;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tranIndtr")
  public String getTranIndtr() {
    return tranIndtr;
  }
  public void setTranIndtr(String tranIndtr) {
    this.tranIndtr = tranIndtr;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterbankReportBody interbankReportBody = (InterbankReportBody) o;
    return Objects.equals(refNmbr, interbankReportBody.refNmbr) &&
        Objects.equals(tranIndtr, interbankReportBody.tranIndtr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refNmbr, tranIndtr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterbankReportBody {\n");
    
    sb.append("    refNmbr: ").append(toIndentedString(refNmbr)).append("\n");
    sb.append("    tranIndtr: ").append(toIndentedString(tranIndtr)).append("\n");
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

