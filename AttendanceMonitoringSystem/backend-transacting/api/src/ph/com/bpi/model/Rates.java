package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Rates   {
  
  private Integer prchRate = null;
  private Integer saleRate = null;
  private String trdrFi = null;
  private String tranFi = null;
  private String currCode = null;
  private Integer tierNmbr = null;
  private Integer amntFrom = null;
  private Integer amntTo = null;
  private Integer usdAmnt = null;
  private Integer exchRate = null;
  private Integer phpEquiv = null;

  
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
  @JsonProperty("tier_nmbr")
  public Integer getTierNmbr() {
    return tierNmbr;
  }
  public void setTierNmbr(Integer tierNmbr) {
    this.tierNmbr = tierNmbr;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("amnt_from")
  public Integer getAmntFrom() {
    return amntFrom;
  }
  public void setAmntFrom(Integer amntFrom) {
    this.amntFrom = amntFrom;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("amnt_to")
  public Integer getAmntTo() {
    return amntTo;
  }
  public void setAmntTo(Integer amntTo) {
    this.amntTo = amntTo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("usd_amnt")
  public Integer getUsdAmnt() {
    return usdAmnt;
  }
  public void setUsdAmnt(Integer usdAmnt) {
    this.usdAmnt = usdAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("exch_rate")
  public Integer getExchRate() {
    return exchRate;
  }
  public void setExchRate(Integer exchRate) {
    this.exchRate = exchRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("php_equiv")
  public Integer getPhpEquiv() {
    return phpEquiv;
  }
  public void setPhpEquiv(Integer phpEquiv) {
    this.phpEquiv = phpEquiv;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rates rates = (Rates) o;
    return Objects.equals(prchRate, rates.prchRate) &&
        Objects.equals(saleRate, rates.saleRate) &&
        Objects.equals(trdrFi, rates.trdrFi) &&
        Objects.equals(tranFi, rates.tranFi) &&
        Objects.equals(currCode, rates.currCode) &&
        Objects.equals(tierNmbr, rates.tierNmbr) &&
        Objects.equals(amntFrom, rates.amntFrom) &&
        Objects.equals(amntTo, rates.amntTo) &&
        Objects.equals(usdAmnt, rates.usdAmnt) &&
        Objects.equals(exchRate, rates.exchRate) &&
        Objects.equals(phpEquiv, rates.phpEquiv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prchRate, saleRate, trdrFi, tranFi, currCode, tierNmbr, amntFrom, amntTo, usdAmnt, exchRate, phpEquiv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rates {\n");
    
    sb.append("    prchRate: ").append(toIndentedString(prchRate)).append("\n");
    sb.append("    saleRate: ").append(toIndentedString(saleRate)).append("\n");
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    tranFi: ").append(toIndentedString(tranFi)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    tierNmbr: ").append(toIndentedString(tierNmbr)).append("\n");
    sb.append("    amntFrom: ").append(toIndentedString(amntFrom)).append("\n");
    sb.append("    amntTo: ").append(toIndentedString(amntTo)).append("\n");
    sb.append("    usdAmnt: ").append(toIndentedString(usdAmnt)).append("\n");
    sb.append("    exchRate: ").append(toIndentedString(exchRate)).append("\n");
    sb.append("    phpEquiv: ").append(toIndentedString(phpEquiv)).append("\n");
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

