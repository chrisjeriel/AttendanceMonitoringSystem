package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SpecialSquaringApproveBody   {
  
  private String dealWith = null;
  private String refNo = null;
  private String trsyGrnt = null;
  private String trsyEqvl = null;
  private String trsyRate = null;
  private String trsyRmrk = null;
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
  @JsonProperty("trsyGrnt")
  public String getTrsyGrnt() {
    return trsyGrnt;
  }
  public void setTrsyGrnt(String trsyGrnt) {
    this.trsyGrnt = trsyGrnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trsyEqvl")
  public String getTrsyEqvl() {
    return trsyEqvl;
  }
  public void setTrsyEqvl(String trsyEqvl) {
    this.trsyEqvl = trsyEqvl;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trsyRate")
  public String getTrsyRate() {
    return trsyRate;
  }
  public void setTrsyRate(String trsyRate) {
    this.trsyRate = trsyRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trsyRmrk")
  public String getTrsyRmrk() {
    return trsyRmrk;
  }
  public void setTrsyRmrk(String trsyRmrk) {
    this.trsyRmrk = trsyRmrk;
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
    SpecialSquaringApproveBody specialSquaringApproveBody = (SpecialSquaringApproveBody) o;
    return Objects.equals(dealWith, specialSquaringApproveBody.dealWith) &&
        Objects.equals(refNo, specialSquaringApproveBody.refNo) &&
        Objects.equals(trsyGrnt, specialSquaringApproveBody.trsyGrnt) &&
        Objects.equals(trsyEqvl, specialSquaringApproveBody.trsyEqvl) &&
        Objects.equals(trsyRate, specialSquaringApproveBody.trsyRate) &&
        Objects.equals(trsyRmrk, specialSquaringApproveBody.trsyRmrk) &&
        Objects.equals(gOffCode, specialSquaringApproveBody.gOffCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealWith, refNo, trsyGrnt, trsyEqvl, trsyRate, trsyRmrk, gOffCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialSquaringApproveBody {\n");
    
    sb.append("    dealWith: ").append(toIndentedString(dealWith)).append("\n");
    sb.append("    refNo: ").append(toIndentedString(refNo)).append("\n");
    sb.append("    trsyGrnt: ").append(toIndentedString(trsyGrnt)).append("\n");
    sb.append("    trsyEqvl: ").append(toIndentedString(trsyEqvl)).append("\n");
    sb.append("    trsyRate: ").append(toIndentedString(trsyRate)).append("\n");
    sb.append("    trsyRmrk: ").append(toIndentedString(trsyRmrk)).append("\n");
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

