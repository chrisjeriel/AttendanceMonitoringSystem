package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class BoardRateProcess   {
  
  private String trdrFi = null;
  private String currCode = null;
  private String prchRate = null;
  private String saleRate = null;
  private String nprchRate = null;
  private String nsaleRate = null;

  
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
  @JsonProperty("prch_rate")
  public String getPrchRate() {
    return prchRate;
  }
  public void setPrchRate(String prchRate) {
    this.prchRate = prchRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sale_rate")
  public String getSaleRate() {
    return saleRate;
  }
  public void setSaleRate(String saleRate) {
    this.saleRate = saleRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nprch_rate")
  public String getNprchRate() {
    return nprchRate;
  }
  public void setNprchRate(String nprchRate) {
    this.nprchRate = nprchRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nsale_rate")
  public String getNsaleRate() {
    return nsaleRate;
  }
  public void setNsaleRate(String nsaleRate) {
    this.nsaleRate = nsaleRate;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardRateProcess boardRateProcess = (BoardRateProcess) o;
    return Objects.equals(trdrFi, boardRateProcess.trdrFi) &&
        Objects.equals(currCode, boardRateProcess.currCode) &&
        Objects.equals(prchRate, boardRateProcess.prchRate) &&
        Objects.equals(saleRate, boardRateProcess.saleRate) &&
        Objects.equals(nprchRate, boardRateProcess.nprchRate) &&
        Objects.equals(nsaleRate, boardRateProcess.nsaleRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, currCode, prchRate, saleRate, nprchRate, nsaleRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardRateProcess {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    prchRate: ").append(toIndentedString(prchRate)).append("\n");
    sb.append("    saleRate: ").append(toIndentedString(saleRate)).append("\n");
    sb.append("    nprchRate: ").append(toIndentedString(nprchRate)).append("\n");
    sb.append("    nsaleRate: ").append(toIndentedString(nsaleRate)).append("\n");
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

