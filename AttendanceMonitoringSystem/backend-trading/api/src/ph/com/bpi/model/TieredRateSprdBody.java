package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import ph.com.bpi.model.hibernate.T0227;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class TieredRateSprdBody   {
  
  private String trdrFi = null;
  private String currCode = null;
  private List<T0227> t0227s = new ArrayList<T0227>();

  
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
  @JsonProperty("T0227s")
  public List<T0227> getT0227s() {
    return t0227s;
  }
  public void setT0227s(List<T0227> t0227s) {
    this.t0227s = t0227s;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TieredRateSprdBody tieredRateSprdBody = (TieredRateSprdBody) o;
    return Objects.equals(trdrFi, tieredRateSprdBody.trdrFi) &&
        Objects.equals(currCode, tieredRateSprdBody.currCode) &&
        Objects.equals(t0227s, tieredRateSprdBody.t0227s);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, currCode, t0227s);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TieredRateSprdBody {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    t0277s: ").append(toIndentedString(t0227s)).append("\n");
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

