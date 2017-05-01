package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class CutoffTimeRegularSquaringBody   {
  
  private String trdrFi = null;
  private String scutTime = null;

  
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
  @JsonProperty("cut_time2")
  public String getScutTime() {
    return scutTime;
  }
  public void setScutTime(String scutTime) {
    this.scutTime = scutTime;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CutoffTimeRegularSquaringBody cutoffTimeRegularSquaringBody = (CutoffTimeRegularSquaringBody) o;
    return Objects.equals(trdrFi, cutoffTimeRegularSquaringBody.trdrFi) &&
        Objects.equals(scutTime, cutoffTimeRegularSquaringBody.scutTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, scutTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CutoffTimeRegularSquaringBody {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    scutTime: ").append(toIndentedString(scutTime)).append("\n");
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

