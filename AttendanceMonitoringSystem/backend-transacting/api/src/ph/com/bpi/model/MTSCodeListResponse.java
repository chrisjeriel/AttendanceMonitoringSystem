package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class MTSCodeListResponse   {
  
  private String trdrFi = null;
  private String modeIndc = null;
  private Integer modeCode = null;
  private String proctag = null;

  
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
  @JsonProperty("proctag")
  public String getProctag() {
    return proctag;
  }
  public void setProctag(String proctag) {
    this.proctag = proctag;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MTSCodeListResponse mTSCodeListResponse = (MTSCodeListResponse) o;
    return Objects.equals(trdrFi, mTSCodeListResponse.trdrFi) &&
        Objects.equals(modeIndc, mTSCodeListResponse.modeIndc) &&
        Objects.equals(modeCode, mTSCodeListResponse.modeCode) &&
        Objects.equals(proctag, mTSCodeListResponse.proctag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, modeIndc, modeCode, proctag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MTSCodeListResponse {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    modeIndc: ").append(toIndentedString(modeIndc)).append("\n");
    sb.append("    modeCode: ").append(toIndentedString(modeCode)).append("\n");
    sb.append("    proctag: ").append(toIndentedString(proctag)).append("\n");
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

