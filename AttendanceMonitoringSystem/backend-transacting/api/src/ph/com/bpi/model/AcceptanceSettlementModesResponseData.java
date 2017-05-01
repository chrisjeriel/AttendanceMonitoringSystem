package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class AcceptanceSettlementModesResponseData   {
  
  private Integer modeCode = null;
  private String modeDesc = null;
  private Integer mcroTag = null;
  private String actvTag = null;
  private String phpTag = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mode_code")
  public Integer getModeCode() {
    return modeCode;
  }
  public void setModeCode(Integer modeCode) {
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
  public Integer getMcroTag() {
    return mcroTag;
  }
  public void setMcroTag(Integer mcroTag) {
    this.mcroTag = mcroTag;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("actv_tag")
  public String getActvTag() {
    return actvTag;
  }
  public void setActvTag(String actvTag) {
    this.actvTag = actvTag;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("php_tag")
  public String getPhpTag() {
    return phpTag;
  }
  public void setPhpTag(String phpTag) {
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
    AcceptanceSettlementModesResponseData acceptanceSettlementModesResponseData = (AcceptanceSettlementModesResponseData) o;
    return Objects.equals(modeCode, acceptanceSettlementModesResponseData.modeCode) &&
        Objects.equals(modeDesc, acceptanceSettlementModesResponseData.modeDesc) &&
        Objects.equals(mcroTag, acceptanceSettlementModesResponseData.mcroTag) &&
        Objects.equals(actvTag, acceptanceSettlementModesResponseData.actvTag) &&
        Objects.equals(phpTag, acceptanceSettlementModesResponseData.phpTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modeCode, modeDesc, mcroTag, actvTag, phpTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptanceSettlementModesResponseData {\n");
    
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

