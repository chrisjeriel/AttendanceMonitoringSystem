package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SysadInterdayPositionLimitsBody   {
  
  private String trdrFi = null;
  private String intrLimit = null;
  
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
  @JsonProperty("intr_limit")
  public String getIntrLimit() {
    return intrLimit;
  }
  public void setIntrLimit(String intrLimit) {
    this.intrLimit = intrLimit;
  }

  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SysadInterdayPositionLimitsBody sysadInterdayPositionLimitsBody = (SysadInterdayPositionLimitsBody) o;
    return Objects.equals(trdrFi, sysadInterdayPositionLimitsBody.trdrFi) &&
        Objects.equals(intrLimit, sysadInterdayPositionLimitsBody.intrLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, intrLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SysadInterdayPositionLimitsBody {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    intrLimit: ").append(toIndentedString(intrLimit)).append("\n");
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

