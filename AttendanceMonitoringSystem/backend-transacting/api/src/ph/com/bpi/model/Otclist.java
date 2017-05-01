package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Otclist   {
  
  private String trdrFi = null;
  private String tranFi = null;
  private String currCode = null;
  private Integer prchRate = null;
  private Integer saleRate = null;

  
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
  @JsonProperty("tran_fi")
  public String getTranFi() {
    return tranFi;
  }
  public void setTranFi(String tranFi) {
    this.tranFi = tranFi;
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
  public Integer getPrchRate() {
    return prchRate;
  }
  public void setPrchRate(Integer prchRate) {
    this.prchRate = prchRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sale_rate")
  public Integer getSaleRate() {
    return saleRate;
  }
  public void setSaleRate(Integer saleRate) {
    this.saleRate = saleRate;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Otclist otclist = (Otclist) o;
    return Objects.equals(trdrFi, otclist.trdrFi) &&
        Objects.equals(tranFi, otclist.tranFi) &&
        Objects.equals(currCode, otclist.currCode) &&
        Objects.equals(prchRate, otclist.prchRate) &&
        Objects.equals(saleRate, otclist.saleRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, tranFi, currCode, prchRate, saleRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Otclist {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    tranFi: ").append(toIndentedString(tranFi)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    prchRate: ").append(toIndentedString(prchRate)).append("\n");
    sb.append("    saleRate: ").append(toIndentedString(saleRate)).append("\n");
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

