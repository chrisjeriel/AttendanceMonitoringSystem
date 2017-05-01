package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class ApprovingAuthorityBody   {
  
  private String phpLmt = null;
  private String ovrdPtt = null;
  private String ofcr1Typ = null;
  private String ofcr2Typ = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("php_lmt")
  public String getPhpLmt() {
    return phpLmt;
  }
  public void setPhpLmt(String phpLmt) {
    this.phpLmt = phpLmt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ovrd_ptt")
  public String getOvrdPtt() {
    return ovrdPtt;
  }
  public void setOvrdPtt(String ovrdPtt) {
    this.ovrdPtt = ovrdPtt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ofcr1_typ")
  public String getOfcr1Typ() {
    return ofcr1Typ;
  }
  public void setOfcr1Typ(String ofcr1Typ) {
    this.ofcr1Typ = ofcr1Typ;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ofcr2_typ")
  public String getOfcr2Typ() {
    return ofcr2Typ;
  }
  public void setOfcr2Typ(String ofcr2Typ) {
    this.ofcr2Typ = ofcr2Typ;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovingAuthorityBody approvingAuthorityBody = (ApprovingAuthorityBody) o;
    return Objects.equals(phpLmt, approvingAuthorityBody.phpLmt) &&
        Objects.equals(ovrdPtt, approvingAuthorityBody.ovrdPtt) &&
        Objects.equals(ofcr1Typ, approvingAuthorityBody.ofcr1Typ) &&
        Objects.equals(ofcr2Typ, approvingAuthorityBody.ofcr2Typ);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phpLmt, ovrdPtt, ofcr1Typ, ofcr2Typ);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovingAuthorityBody {\n");
    
    sb.append("    phpLmt: ").append(toIndentedString(phpLmt)).append("\n");
    sb.append("    ovrdPtt: ").append(toIndentedString(ovrdPtt)).append("\n");
    sb.append("    ofcr1Typ: ").append(toIndentedString(ofcr1Typ)).append("\n");
    sb.append("    ofcr2Typ: ").append(toIndentedString(ofcr2Typ)).append("\n");
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

