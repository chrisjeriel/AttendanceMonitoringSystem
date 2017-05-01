package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ComputedAmountsResponseData   {
  
  private Integer equiAmnt = null;
  private Integer acptDocs = null;
  private Integer acptComm = null;
  private Integer setlDocs = null;
  private Integer setlComm = null;
  private Integer acptPost = null;
  private Integer setlPost = null;
  private Integer netAmnt = null;
  private Integer tranTag = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("equi_amnt")
  public Integer getEquiAmnt() {
    return equiAmnt;
  }
  public void setEquiAmnt(Integer equiAmnt) {
    this.equiAmnt = equiAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acpt_docs")
  public Integer getAcptDocs() {
    return acptDocs;
  }
  public void setAcptDocs(Integer acptDocs) {
    this.acptDocs = acptDocs;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acpt_comm")
  public Integer getAcptComm() {
    return acptComm;
  }
  public void setAcptComm(Integer acptComm) {
    this.acptComm = acptComm;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("setl_docs")
  public Integer getSetlDocs() {
    return setlDocs;
  }
  public void setSetlDocs(Integer setlDocs) {
    this.setlDocs = setlDocs;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("setl_comm")
  public Integer getSetlComm() {
    return setlComm;
  }
  public void setSetlComm(Integer setlComm) {
    this.setlComm = setlComm;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acpt_post")
  public Integer getAcptPost() {
    return acptPost;
  }
  public void setAcptPost(Integer acptPost) {
    this.acptPost = acptPost;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("setl_post")
  public Integer getSetlPost() {
    return setlPost;
  }
  public void setSetlPost(Integer setlPost) {
    this.setlPost = setlPost;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("net_amnt")
  public Integer getNetAmnt() {
    return netAmnt;
  }
  public void setNetAmnt(Integer netAmnt) {
    this.netAmnt = netAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_tag")
  public Integer getTranTag() {
    return tranTag;
  }
  public void setTranTag(Integer tranTag) {
    this.tranTag = tranTag;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputedAmountsResponseData computedAmountsResponseData = (ComputedAmountsResponseData) o;
    return Objects.equals(equiAmnt, computedAmountsResponseData.equiAmnt) &&
        Objects.equals(acptDocs, computedAmountsResponseData.acptDocs) &&
        Objects.equals(acptComm, computedAmountsResponseData.acptComm) &&
        Objects.equals(setlDocs, computedAmountsResponseData.setlDocs) &&
        Objects.equals(setlComm, computedAmountsResponseData.setlComm) &&
        Objects.equals(acptPost, computedAmountsResponseData.acptPost) &&
        Objects.equals(setlPost, computedAmountsResponseData.setlPost) &&
        Objects.equals(netAmnt, computedAmountsResponseData.netAmnt) &&
        Objects.equals(tranTag, computedAmountsResponseData.tranTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equiAmnt, acptDocs, acptComm, setlDocs, setlComm, acptPost, setlPost, netAmnt, tranTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputedAmountsResponseData {\n");
    
    sb.append("    equiAmnt: ").append(toIndentedString(equiAmnt)).append("\n");
    sb.append("    acptDocs: ").append(toIndentedString(acptDocs)).append("\n");
    sb.append("    acptComm: ").append(toIndentedString(acptComm)).append("\n");
    sb.append("    setlDocs: ").append(toIndentedString(setlDocs)).append("\n");
    sb.append("    setlComm: ").append(toIndentedString(setlComm)).append("\n");
    sb.append("    acptPost: ").append(toIndentedString(acptPost)).append("\n");
    sb.append("    setlPost: ").append(toIndentedString(setlPost)).append("\n");
    sb.append("    netAmnt: ").append(toIndentedString(netAmnt)).append("\n");
    sb.append("    tranTag: ").append(toIndentedString(tranTag)).append("\n");
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

