package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SpecialSquaringFinalBody   {
  
  private String dealWith = null;
  private String refNo = null;
  private String grntStat = null;
  private String gOffCode = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dealWith")
  public String getDealWith() {
    return dealWith;
  }
  public void setDealWith(String dealWith) {
    this.dealWith = dealWith;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("refNo")
  public String getRefNo() {
    return refNo;
  }
  public void setRefNo(String refNo) {
    this.refNo = refNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("grntStat")
  public String getGrntStat() {
    return grntStat;
  }
  public void setGrntStat(String grntStat) {
    this.grntStat = grntStat;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gOffCode")
  public String getGOffCode() {
    return gOffCode;
  }
  public void setGOffCode(String gOffCode) {
    this.gOffCode = gOffCode;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialSquaringFinalBody specialSquaringFinalBody = (SpecialSquaringFinalBody) o;
    return Objects.equals(dealWith, specialSquaringFinalBody.dealWith) &&
        Objects.equals(refNo, specialSquaringFinalBody.refNo) &&
        Objects.equals(grntStat, specialSquaringFinalBody.grntStat) &&
        Objects.equals(gOffCode, specialSquaringFinalBody.gOffCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealWith, refNo, grntStat, gOffCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialSquaringFinalBody {\n");
    
    sb.append("    dealWith: ").append(toIndentedString(dealWith)).append("\n");
    sb.append("    refNo: ").append(toIndentedString(refNo)).append("\n");
    sb.append("    grntStat: ").append(toIndentedString(grntStat)).append("\n");
    sb.append("    gOffCode: ").append(toIndentedString(gOffCode)).append("\n");
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

