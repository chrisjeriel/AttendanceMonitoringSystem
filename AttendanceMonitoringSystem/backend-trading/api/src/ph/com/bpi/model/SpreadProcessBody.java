package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SpreadProcessBody   {
  
  private String seqnNo = null;
  private String spreads = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("seqn_no")
  public String getSeqnNo() {
    return seqnNo;
  }
  public void setSeqnNo(String seqnNo) {
    this.seqnNo = seqnNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("spreads")
  public String getSpreads() {
    return spreads;
  }
  public void setSpreads(String spreads) {
    this.spreads = spreads;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpreadProcessBody spreadProcessBody = (SpreadProcessBody) o;
    return Objects.equals(seqnNo, spreadProcessBody.seqnNo) &&
        Objects.equals(spreads, spreadProcessBody.spreads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seqnNo, spreads);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpreadProcessBody {\n");
    
    sb.append("    seqnNo: ").append(toIndentedString(seqnNo)).append("\n");
    sb.append("    spreads: ").append(toIndentedString(spreads)).append("\n");
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

