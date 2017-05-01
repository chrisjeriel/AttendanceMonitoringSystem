package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class MTSCodeGetResponseData   {
  
  private String trdrFi = null;
  private String modeIndc = null;
  private Integer modeCode = null;
  private String mtsCode = null;
  private String mtsDesc = null;

  
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

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mode_indc")
  public String getModeIndc() {
    return modeIndc;
  }
  public void setModeIndc(String modeIndc) {
    this.modeIndc = modeIndc;
  }

  
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
  @JsonProperty("mts_code")
  public String getMtsCode() {
    return mtsCode;
  }
  public void setMtsCode(String mtsCode) {
    this.mtsCode = mtsCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mts_desc")
  public String getMtsDesc() {
    return mtsDesc;
  }
  public void setMtsDesc(String mtsDesc) {
    this.mtsDesc = mtsDesc;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MTSCodeGetResponseData mTSCodeGetResponseData = (MTSCodeGetResponseData) o;
    return Objects.equals(trdrFi, mTSCodeGetResponseData.trdrFi) &&
        Objects.equals(modeIndc, mTSCodeGetResponseData.modeIndc) &&
        Objects.equals(modeCode, mTSCodeGetResponseData.modeCode) &&
        Objects.equals(mtsCode, mTSCodeGetResponseData.mtsCode) &&
        Objects.equals(mtsDesc, mTSCodeGetResponseData.mtsDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, modeIndc, modeCode, mtsCode, mtsDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MTSCodeGetResponseData {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    modeIndc: ").append(toIndentedString(modeIndc)).append("\n");
    sb.append("    modeCode: ").append(toIndentedString(modeCode)).append("\n");
    sb.append("    mtsCode: ").append(toIndentedString(mtsCode)).append("\n");
    sb.append("    mtsDesc: ").append(toIndentedString(mtsDesc)).append("\n");
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

