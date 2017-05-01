package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class AppDetails   {
  
  private String appVersion = null;
  private String dateCompiled = null;

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("appVersion")
  public String getAppVersion() {
    return appVersion;
  }
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("dateCompiled")
  public String getDateCompiled() {
    return dateCompiled;
  }
  public void setDateCompiled(String dateCompiled) {
    this.dateCompiled = dateCompiled;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppDetails appDetails = (AppDetails) o;
    return Objects.equals(appVersion, appDetails.appVersion) &&
        Objects.equals(dateCompiled, appDetails.dateCompiled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appVersion, dateCompiled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppDetails {\n");
    
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    dateCompiled: ").append(toIndentedString(dateCompiled)).append("\n");
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

