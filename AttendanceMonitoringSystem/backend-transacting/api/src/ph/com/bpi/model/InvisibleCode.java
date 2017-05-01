package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class InvisibleCode   {
  
  private Integer id = null;


  public enum TransactionTypeEnum {
    FOREX("forex"),
    BTSU("btsu"),
    TMU("tmu");

    private String value;

    TransactionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TransactionTypeEnum transactionType = null;
  private Integer code = null;
  private String description = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionType")
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }
  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
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
    InvisibleCode invisibleCode = (InvisibleCode) o;
    return Objects.equals(id, invisibleCode.id) &&
        Objects.equals(transactionType, invisibleCode.transactionType) &&
        Objects.equals(code, invisibleCode.code) &&
        Objects.equals(description, invisibleCode.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transactionType, code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvisibleCode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

