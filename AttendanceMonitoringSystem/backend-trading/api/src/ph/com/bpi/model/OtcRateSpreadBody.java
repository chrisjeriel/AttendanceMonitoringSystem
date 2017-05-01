package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class OtcRateSpreadBody   {
  
  private String trdrFi = null;
  private String tranFi = null;
  private String currCode = null;
  private String prchSprd = null;
  private String saleSprd = null;
  private String nprchSprd = null;
  private String nsaleSprd = null;

  
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
  @JsonProperty("prch_sprd")
  public String getPrchSprd() {
    return prchSprd;
  }
  public void setPrchSprd(String prchSprd) {
    this.prchSprd = prchSprd;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sale_sprd")
  public String getSaleSprd() {
    return saleSprd;
  }
  public void setSaleSprd(String saleSprd) {
    this.saleSprd = saleSprd;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nprch_sprd")
  public String getNprchSprd() {
    return nprchSprd;
  }
  public void setNprchSprd(String nprchSprd) {
    this.nprchSprd = nprchSprd;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nsale_sprd")
  public String getNsaleSprd() {
    return nsaleSprd;
  }
  public void setNsaleSprd(String nsaleSprd) {
    this.nsaleSprd = nsaleSprd;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtcRateSpreadBody otcRateSpreadBody = (OtcRateSpreadBody) o;
    return Objects.equals(trdrFi, otcRateSpreadBody.trdrFi) &&
        Objects.equals(tranFi, otcRateSpreadBody.tranFi) &&
        Objects.equals(currCode, otcRateSpreadBody.currCode) &&
        Objects.equals(prchSprd, otcRateSpreadBody.prchSprd) &&
        Objects.equals(saleSprd, otcRateSpreadBody.saleSprd) &&
        Objects.equals(nprchSprd, otcRateSpreadBody.nprchSprd) &&
        Objects.equals(nsaleSprd, otcRateSpreadBody.nsaleSprd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, tranFi, currCode, prchSprd, saleSprd, nprchSprd, nsaleSprd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtcRateSpreadBody {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    tranFi: ").append(toIndentedString(tranFi)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    prchSprd: ").append(toIndentedString(prchSprd)).append("\n");
    sb.append("    saleSprd: ").append(toIndentedString(saleSprd)).append("\n");
    sb.append("    nprchSprd: ").append(toIndentedString(nprchSprd)).append("\n");
    sb.append("    nsaleSprd: ").append(toIndentedString(nsaleSprd)).append("\n");
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

