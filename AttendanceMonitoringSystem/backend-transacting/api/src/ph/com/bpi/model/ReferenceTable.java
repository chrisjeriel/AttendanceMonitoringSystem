package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ReferenceTable   {
  
  private Integer tableId = null;


  public enum StatusEnum {
    UPDATED("updated"),
    NOT_UPDATED("not updated");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;
  private String dateUpdated = null;
  private String tableDesc = null;

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("tableId")
  public Integer getTableId() {
    return tableId;
  }
  public void setTableId(Integer tableId) {
    this.tableId = tableId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("dateUpdated")
  public String getDateUpdated() {
    return dateUpdated;
  }
  public void setDateUpdated(String dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("tableDesc")
  public String getTableDesc() {
    return tableDesc;
  }
  public void setTableDesc(String tableDesc) {
    this.tableDesc = tableDesc;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceTable referenceTable = (ReferenceTable) o;
    return Objects.equals(tableId, referenceTable.tableId) &&
        Objects.equals(status, referenceTable.status) &&
        Objects.equals(dateUpdated, referenceTable.dateUpdated) &&
        Objects.equals(tableDesc, referenceTable.tableDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableId, status, dateUpdated, tableDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceTable {\n");
    
    sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    tableDesc: ").append(toIndentedString(tableDesc)).append("\n");
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

