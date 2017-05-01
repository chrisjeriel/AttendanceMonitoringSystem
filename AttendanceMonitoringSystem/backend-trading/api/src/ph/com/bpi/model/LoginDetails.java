package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class LoginDetails   {
  
  private String glogdate = null;
  private String gofficecode = null;
  private String guserid = null;
  private String guserpass = null;
  private String xnewpass = null;
  private String gmfapplid = null;
  private String gmfregion = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("glogdate")
  public String getGlogdate() {
    return glogdate;
  }
  public void setGlogdate(String glogdate) {
    this.glogdate = glogdate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gofficecode")
  public String getGofficecode() {
    return gofficecode;
  }
  public void setGofficecode(String gofficecode) {
    this.gofficecode = gofficecode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gmfapplid")
  public String getGmfapplid() {
    return gmfapplid;
  }
  public void setGmfapplid(String gmfapplid) {
    this.gmfapplid = gmfapplid;
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

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("guserpass")
  public String getGuserpass() {
    return guserpass;
  }
  public void setGuserpass(String guserpass) {
    this.guserpass = guserpass;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("xnewpass")
  public String getXnewpass() {
    return xnewpass;
  }
  public void setXnewpass(String xnewpass) {
    this.xnewpass = xnewpass;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gmfregion")
  public String getGmfregion() {
    return gmfregion;
  }
  public void setGmfregion(String gmfregion) {
    this.gmfregion = gmfregion;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginDetails loginDetails = (LoginDetails) o;
    return Objects.equals(gmfapplid, loginDetails.gmfapplid) &&
        Objects.equals(guserid, loginDetails.guserid) &&
        Objects.equals(guserpass, loginDetails.guserpass) &&
        Objects.equals(xnewpass, loginDetails.xnewpass) &&
        Objects.equals(gmfregion, loginDetails.gmfregion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gmfapplid, guserid, guserpass, xnewpass, gmfregion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginDetails {\n");
    
    sb.append("    gmfapplid: ").append(toIndentedString(gmfapplid)).append("\n");
    sb.append("    guserid: ").append(toIndentedString(guserid)).append("\n");
    sb.append("    guserpass: ").append(toIndentedString(guserpass)).append("\n");
    sb.append("    xnewpass: ").append(toIndentedString(xnewpass)).append("\n");
    sb.append("    gmfregion: ").append(toIndentedString(gmfregion)).append("\n");
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

