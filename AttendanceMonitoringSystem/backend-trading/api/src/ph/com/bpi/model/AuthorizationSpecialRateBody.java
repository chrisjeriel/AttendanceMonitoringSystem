package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class AuthorizationSpecialRateBody   {
  
  private String trdrFi = null;
  private String refNmbr = null;
  private String grntStat = null;
  private String grntRate = null;
  private String rmrkTrdr = null;
  private String guserid = null;

  
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
  @JsonProperty("grnt_stat")
  public String getGrntStat() {
    return grntStat;
  }
  public void setGrntStat(String grntStat) {
    this.grntStat = grntStat;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("grnt_rate")
  public String getGrntRate() {
    return grntRate;
  }
  public void setGrntRate(String grntRate) {
    this.grntRate = grntRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rmrk_trdr")
  public String getRmrkTrdr() {
    return rmrkTrdr;
  }
  public void setRmrkTrdr(String rmrkTrdr) {
    this.rmrkTrdr = rmrkTrdr;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("guserid")
  public String getGuserid() {
    return guserid;
  }
  public void setGuserid(String guserid) {
    this.guserid = guserid;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationSpecialRateBody authorizationSpecialRateBody = (AuthorizationSpecialRateBody) o;
    return Objects.equals(trdrFi, authorizationSpecialRateBody.trdrFi) &&
        Objects.equals(refNmbr, authorizationSpecialRateBody.refNmbr) &&
        Objects.equals(grntStat, authorizationSpecialRateBody.grntStat) &&
        Objects.equals(grntRate, authorizationSpecialRateBody.grntRate) &&
        Objects.equals(rmrkTrdr, authorizationSpecialRateBody.rmrkTrdr) &&
        Objects.equals(guserid, authorizationSpecialRateBody.guserid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, refNmbr, grntStat, grntRate, rmrkTrdr, guserid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationSpecialRateBody {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    refNmbr: ").append(toIndentedString(refNmbr)).append("\n");
    sb.append("    grntStat: ").append(toIndentedString(grntStat)).append("\n");
    sb.append("    grntRate: ").append(toIndentedString(grntRate)).append("\n");
    sb.append("    rmrkTrdr: ").append(toIndentedString(rmrkTrdr)).append("\n");
    sb.append("    guserid: ").append(toIndentedString(guserid)).append("\n");
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

