package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class TradingUnitEncode   {
  
  private String trdrFi = null;
  private String trdrDesc = null;
  private String trdrPcc = null;
  private String forcUnld = null;
  private String tranFi = null;

  
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
  @JsonProperty("trdr_desc")
  public String getTrdrDesc() {
    return trdrDesc;
  }
  public void setTrdrDesc(String trdrDesc) {
    this.trdrDesc = trdrDesc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trdr_pcc")
  public String getTrdrPcc() {
    return trdrPcc;
  }
  public void setTrdrPcc(String trdrPcc) {
    this.trdrPcc = trdrPcc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("forc_unld")
  public String getForcUnld() {
    return forcUnld;
  }
  public void setForcUnld(String forcUnld) {
    this.forcUnld = forcUnld;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradingUnitEncode tradingUnitEncode = (TradingUnitEncode) o;
    return Objects.equals(trdrFi, tradingUnitEncode.trdrFi) &&
        Objects.equals(trdrDesc, tradingUnitEncode.trdrDesc) &&
        Objects.equals(trdrPcc, tradingUnitEncode.trdrPcc) &&
        Objects.equals(forcUnld, tradingUnitEncode.forcUnld) &&
        Objects.equals(tranFi, tradingUnitEncode.tranFi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, trdrDesc, trdrPcc, forcUnld, tranFi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradingUnitEncode {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    trdrDesc: ").append(toIndentedString(trdrDesc)).append("\n");
    sb.append("    trdrPcc: ").append(toIndentedString(trdrPcc)).append("\n");
    sb.append("    forcUnld: ").append(toIndentedString(forcUnld)).append("\n");
    sb.append("    tranFi: ").append(toIndentedString(tranFi)).append("\n");
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

