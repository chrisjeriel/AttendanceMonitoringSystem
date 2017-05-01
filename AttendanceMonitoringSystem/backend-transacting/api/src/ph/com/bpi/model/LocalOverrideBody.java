package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class LocalOverrideBody   {
  
  private String useridO1 = null;
  private String pwordO1 = null;
  private String useridO2 = null;
  private String pwordO2 = null;
  private String gOffCode = null;
  private String gPassword = null;
  private String procTag = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userid_o1")
  public String getUseridO1() {
    return useridO1;
  }
  public void setUseridO1(String useridO1) {
    this.useridO1 = useridO1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pword_o1")
  public String getPwordO1() {
    return pwordO1;
  }
  public void setPwordO1(String pwordO1) {
    this.pwordO1 = pwordO1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userid_o2")
  public String getUseridO2() {
    return useridO2;
  }
  public void setUseridO2(String useridO2) {
    this.useridO2 = useridO2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pword_o2")
  public String getPwordO2() {
    return pwordO2;
  }
  public void setPwordO2(String pwordO2) {
    this.pwordO2 = pwordO2;
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

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gPassword")
  public String getGPassword() {
    return gPassword;
  }
  public void setGPassword(String gPassword) {
    this.gPassword = gPassword;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("procTag")
  public String getProcTag() {
    return procTag;
  }
  public void setProcTag(String procTag) {
    this.procTag = procTag;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalOverrideBody localOverrideBody = (LocalOverrideBody) o;
    return Objects.equals(useridO1, localOverrideBody.useridO1) &&
        Objects.equals(pwordO1, localOverrideBody.pwordO1) &&
        Objects.equals(useridO2, localOverrideBody.useridO2) &&
        Objects.equals(pwordO2, localOverrideBody.pwordO2) &&
        Objects.equals(gOffCode, localOverrideBody.gOffCode) &&
        Objects.equals(gPassword, localOverrideBody.gPassword) &&
        Objects.equals(procTag, localOverrideBody.procTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useridO1, pwordO1, useridO2, pwordO2, gOffCode, gPassword, procTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalOverrideBody {\n");
    
    sb.append("    useridO1: ").append(toIndentedString(useridO1)).append("\n");
    sb.append("    pwordO1: ").append(toIndentedString(pwordO1)).append("\n");
    sb.append("    useridO2: ").append(toIndentedString(useridO2)).append("\n");
    sb.append("    pwordO2: ").append(toIndentedString(pwordO2)).append("\n");
    sb.append("    gOffCode: ").append(toIndentedString(gOffCode)).append("\n");
    sb.append("    gPassword: ").append(toIndentedString(gPassword)).append("\n");
    sb.append("    procTag: ").append(toIndentedString(procTag)).append("\n");
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

