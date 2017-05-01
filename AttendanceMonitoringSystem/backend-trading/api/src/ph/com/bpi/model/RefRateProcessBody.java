package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class RefRateProcessBody   {
  
  private String trdrFi = null;
  private String currCode = null;
  private String refrRate = null;
  private String nefrRate = null;

  
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
  @JsonProperty("curr_code")
  public String getCurrCode() {
    return currCode;
  }
  public void setCurrCode(String currCode) {
    this.currCode = currCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("refr_rate")
  public String getRefrRate() {
    return refrRate;
  }
  public void setRefrRate(String refrRate) {
    this.refrRate = refrRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nefr_rate")
  public String getNefrRate() {
    return nefrRate;
  }
  public void setNefrRate(String nefrRate) {
    this.nefrRate = nefrRate;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefRateProcessBody refRateProcessBody = (RefRateProcessBody) o;
    return Objects.equals(trdrFi, refRateProcessBody.trdrFi) &&
        Objects.equals(currCode, refRateProcessBody.currCode) &&
        Objects.equals(refrRate, refRateProcessBody.refrRate) &&
        Objects.equals(nefrRate, refRateProcessBody.nefrRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, currCode, refrRate, nefrRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefRateProcessBody {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    refrRate: ").append(toIndentedString(refrRate)).append("\n");
    sb.append("    nefrRate: ").append(toIndentedString(nefrRate)).append("\n");
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

