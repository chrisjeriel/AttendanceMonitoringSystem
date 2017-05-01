package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T11:46:02.187+08:00")
public class Acceptedtclistinput   {
  
  private Integer listIndc = null;
  private String trdrFi = null;
  private String tranUnit = null;
  private String refNmbr = null;
  private String proctag = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("list_indc")
  public Integer getListIndc() {
    return listIndc;
  }
  public void setListIndc(Integer listIndc) {
    this.listIndc = listIndc;
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
  @JsonProperty("tran_unit")
  public String getTranUnit() {
    return tranUnit;
  }
  public void setTranUnit(String tranUnit) {
    this.tranUnit = tranUnit;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ref_nmbr")
  public String getRefNmbr() {
    return refNmbr;
  }
  public void setRefNmbr(String refNmbr) {
    this.refNmbr = refNmbr;
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
    Acceptedtclistinput acceptedtclistinput = (Acceptedtclistinput) o;
    return Objects.equals(listIndc, acceptedtclistinput.listIndc) &&
        Objects.equals(trdrFi, acceptedtclistinput.trdrFi) &&
        Objects.equals(tranUnit, acceptedtclistinput.tranUnit) &&
        Objects.equals(refNmbr, acceptedtclistinput.refNmbr) &&
        Objects.equals(proctag, acceptedtclistinput.proctag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listIndc, trdrFi, tranUnit, refNmbr, proctag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Acceptedtclistinput {\n");
    
    sb.append("    listIndc: ").append(toIndentedString(listIndc)).append("\n");
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    tranUnit: ").append(toIndentedString(tranUnit)).append("\n");
    sb.append("    refNmbr: ").append(toIndentedString(refNmbr)).append("\n");
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

