package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Tierrates   {
  
  private String trdrFi = null;
  private String tranFi = null;
  private String currCode = null;
  private Integer tierNmbr = null;
  private Integer amntFrom = null;
  private Integer amntTo = null;
  private Integer prchRate = null;
  private Integer saleRate = null;
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
    Tierrates tierrates = (Tierrates) o;
    return Objects.equals(trdrFi, tierrates.trdrFi) &&
        Objects.equals(tranFi, tierrates.tranFi) &&
        Objects.equals(currCode, tierrates.currCode) &&
        Objects.equals(tierNmbr, tierrates.tierNmbr) &&
        Objects.equals(amntFrom, tierrates.amntFrom) &&
        Objects.equals(amntTo, tierrates.amntTo) &&
        Objects.equals(prchRate, tierrates.prchRate) &&
        Objects.equals(saleRate, tierrates.saleRate) &&
        Objects.equals(proctag, tierrates.proctag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, tranFi, currCode, tierNmbr, amntFrom, amntTo, prchRate, saleRate, proctag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tierrates {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    tranFi: ").append(toIndentedString(tranFi)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    tierNmbr: ").append(toIndentedString(tierNmbr)).append("\n");
    sb.append("    amntFrom: ").append(toIndentedString(amntFrom)).append("\n");
    sb.append("    amntTo: ").append(toIndentedString(amntTo)).append("\n");
    sb.append("    prchRate: ").append(toIndentedString(prchRate)).append("\n");
    sb.append("    saleRate: ").append(toIndentedString(saleRate)).append("\n");
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

