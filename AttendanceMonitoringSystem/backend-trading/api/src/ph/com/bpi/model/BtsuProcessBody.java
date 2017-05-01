package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import ph.com.bpi.model.hibernate.T0205;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class BtsuProcessBody   {
  
  private String currCode = null;
  private String usdBid = null;
  private String usdOffr = null;
  private List<T0205> t0205s = new ArrayList<T0205>();

  
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
  @JsonProperty("usd_bid")
  public String getUsdBid() {
    return usdBid;
  }
  public void setUsdBid(String usdBid) {
    this.usdBid = usdBid;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("usd_offr")
  public String getUsdOffr() {
    return usdOffr;
  }
  public void setUsdOffr(String usdOffr) {
    this.usdOffr = usdOffr;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("T0205s")
  public List<T0205> getT0205s() {
    return t0205s;
  }
  public void setT0205s(List<T0205> t0205s) {
    this.t0205s = t0205s;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BtsuProcessBody btsuProcessBody = (BtsuProcessBody) o;
    return Objects.equals(currCode, btsuProcessBody.currCode) &&
        Objects.equals(usdBid, btsuProcessBody.usdBid) &&
        Objects.equals(usdOffr, btsuProcessBody.usdOffr) &&
        Objects.equals(t0205s, btsuProcessBody.t0205s);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currCode, usdBid, usdOffr, t0205s);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BtsuProcessBody {\n");
    
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    usdBid: ").append(toIndentedString(usdBid)).append("\n");
    sb.append("    usdOffr: ").append(toIndentedString(usdOffr)).append("\n");
    sb.append("    t0205s: ").append(toIndentedString(t0205s)).append("\n");
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

