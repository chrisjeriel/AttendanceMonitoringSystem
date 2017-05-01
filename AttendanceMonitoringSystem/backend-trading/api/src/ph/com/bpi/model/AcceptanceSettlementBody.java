package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class AcceptanceSettlementBody   {
  
  private String modeCode = null;
  private String modeDesc = null;
  private String mcroTag = null;
  private Boolean actvTag = null;
  private Boolean phpTag = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mode_code")
  public String getModeCode() {
    return modeCode;
  }
  public void setModeCode(String modeCode) {
    this.modeCode = modeCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mode_desc")
  public String getModeDesc() {
    return modeDesc;
  }
  public void setModeDesc(String modeDesc) {
    this.modeDesc = modeDesc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mcro_tag")
  public String getMcroTag() {
    return mcroTag;
  }
  public void setMcroTag(String mcroTag) {
    this.mcroTag = mcroTag;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("actv_tag")
  public Boolean getActvTag() {
    return actvTag;
  }
  public void setActvTag(Boolean actvTag) {
    this.actvTag = actvTag;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("php_tag")
  public Boolean getPhpTag() {
    return phpTag;
  }
  public void setPhpTag(Boolean phpTag) {
    this.phpTag = phpTag;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcceptanceSettlementBody acceptanceSettlementBody = (AcceptanceSettlementBody) o;
    return Objects.equals(modeCode, acceptanceSettlementBody.modeCode) &&
        Objects.equals(modeDesc, acceptanceSettlementBody.modeDesc) &&
        Objects.equals(mcroTag, acceptanceSettlementBody.mcroTag) &&
        Objects.equals(actvTag, acceptanceSettlementBody.actvTag) &&
        Objects.equals(phpTag, acceptanceSettlementBody.phpTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modeCode, modeDesc, mcroTag, actvTag, phpTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptanceSettlementBody {\n");
    
    sb.append("    modeCode: ").append(toIndentedString(modeCode)).append("\n");
    sb.append("    modeDesc: ").append(toIndentedString(modeDesc)).append("\n");
    sb.append("    mcroTag: ").append(toIndentedString(mcroTag)).append("\n");
    sb.append("    actvTag: ").append(toIndentedString(actvTag)).append("\n");
    sb.append("    phpTag: ").append(toIndentedString(phpTag)).append("\n");
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

