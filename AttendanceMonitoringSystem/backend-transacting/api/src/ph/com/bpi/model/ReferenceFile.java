package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Reference File in Utility Screen
 **/

@ApiModel(description = "Reference File in Utility Screen")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ReferenceFile   {
  
  private String transactionCode = null;
  private String tag = null;
  private String status = null;
  private String date = null;
  private String time = null;
  private String description = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionCode")
  public String getTransactionCode() {
    return transactionCode;
  }
  public void setTransactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("time")
  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceFile referenceFile = (ReferenceFile) o;
    return Objects.equals(transactionCode, referenceFile.transactionCode) &&
        Objects.equals(tag, referenceFile.tag) &&
        Objects.equals(status, referenceFile.status) &&
        Objects.equals(date, referenceFile.date) &&
        Objects.equals(time, referenceFile.time) &&
        Objects.equals(description, referenceFile.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionCode, tag, status, date, time, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceFile {\n");
    
    sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

