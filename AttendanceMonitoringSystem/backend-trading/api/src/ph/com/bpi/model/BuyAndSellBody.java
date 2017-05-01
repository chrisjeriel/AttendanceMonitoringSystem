package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class BuyAndSellBody   {
  
  private String trdrFi = null;
  private String currCode = null;
  private String phpBid = null;
  private String phpOffr = null;
  private String newBid = null;
  private String newOffr = null;

  
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
  @JsonProperty("php_bid")
  public String getPhpBid() {
    return phpBid;
  }
  public void setPhpBid(String phpBid) {
    this.phpBid = phpBid;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("php_offr")
  public String getPhpOffr() {
    return phpOffr;
  }
  public void setPhpOffr(String phpOffr) {
    this.phpOffr = phpOffr;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("new_bid")
  public String getNewBid() {
    return newBid;
  }
  public void setNewBid(String newBid) {
    this.newBid = newBid;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("new_offr")
  public String getNewOffr() {
    return newOffr;
  }
  public void setNewOffr(String newOffr) {
    this.newOffr = newOffr;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyAndSellBody buyAndSellBody = (BuyAndSellBody) o;
    return Objects.equals(trdrFi, buyAndSellBody.trdrFi) &&
        Objects.equals(currCode, buyAndSellBody.currCode) &&
        Objects.equals(phpBid, buyAndSellBody.phpBid) &&
        Objects.equals(phpOffr, buyAndSellBody.phpOffr) &&
        Objects.equals(newBid, buyAndSellBody.newBid) &&
        Objects.equals(newOffr, buyAndSellBody.newOffr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, currCode, phpBid, phpOffr, newBid, newOffr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyAndSellBody {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    phpBid: ").append(toIndentedString(phpBid)).append("\n");
    sb.append("    phpOffr: ").append(toIndentedString(phpOffr)).append("\n");
    sb.append("    newBid: ").append(toIndentedString(newBid)).append("\n");
    sb.append("    newOffr: ").append(toIndentedString(newOffr)).append("\n");
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

