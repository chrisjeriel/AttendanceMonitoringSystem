package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class SpecialRequestUpdateBody   {
  
  private String refNmbr = null;
  private Integer ovrdId1 = null;
  private Integer ovrdId2 = null;

  
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
  @JsonProperty("ovrd_id1")
  public Integer getOvrdId1() {
    return ovrdId1;
  }
  public void setOvrdId1(Integer ovrdId1) {
    this.ovrdId1 = ovrdId1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ovrd_id2")
  public Integer getOvrdId2() {
    return ovrdId2;
  }
  public void setOvrdId2(Integer ovrdId2) {
    this.ovrdId2 = ovrdId2;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialRequestUpdateBody specialRequestUpdateBody = (SpecialRequestUpdateBody) o;
    return Objects.equals(refNmbr, specialRequestUpdateBody.refNmbr) &&
        Objects.equals(ovrdId1, specialRequestUpdateBody.ovrdId1) &&
        Objects.equals(ovrdId2, specialRequestUpdateBody.ovrdId2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refNmbr, ovrdId1, ovrdId2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialRequestUpdateBody {\n");
    
    sb.append("    refNmbr: ").append(toIndentedString(refNmbr)).append("\n");
    sb.append("    ovrdId1: ").append(toIndentedString(ovrdId1)).append("\n");
    sb.append("    ovrdId2: ").append(toIndentedString(ovrdId2)).append("\n");
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

