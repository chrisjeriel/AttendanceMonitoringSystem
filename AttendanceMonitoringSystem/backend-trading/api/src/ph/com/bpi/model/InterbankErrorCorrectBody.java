package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class InterbankErrorCorrectBody   {
  
  private String gLogDate = null;
  private String refNmbr = null;
  private String tranIndtr = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gLogDate")
  public String getGLogDate() {
    return gLogDate;
  }
  public void setGLogDate(String gLogDate) {
    this.gLogDate = gLogDate;
  }

  
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
    InterbankErrorCorrectBody interbankErrorCorrectBody = (InterbankErrorCorrectBody) o;
    return Objects.equals(gLogDate, interbankErrorCorrectBody.gLogDate) &&
        Objects.equals(refNmbr, interbankErrorCorrectBody.refNmbr) &&
        Objects.equals(tranIndtr, interbankErrorCorrectBody.tranIndtr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gLogDate, refNmbr, tranIndtr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterbankErrorCorrectBody {\n");
    
    sb.append("    gLogDate: ").append(toIndentedString(gLogDate)).append("\n");
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

