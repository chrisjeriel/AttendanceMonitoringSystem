package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ph.com.bpi.model.AcceptanceMode;
import ph.com.bpi.model.SettlementMode;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class AcceptanceSettlementMode   {
  
  private Integer id = null;
  private AcceptanceMode acceptanceMode = null;
  private SettlementMode settlementMode = null;

  
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
  @JsonProperty("acceptanceMode")
  public AcceptanceMode getAcceptanceMode() {
    return acceptanceMode;
  }
  public void setAcceptanceMode(AcceptanceMode acceptanceMode) {
    this.acceptanceMode = acceptanceMode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("settlementMode")
  public SettlementMode getSettlementMode() {
    return settlementMode;
  }
  public void setSettlementMode(SettlementMode settlementMode) {
    this.settlementMode = settlementMode;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcceptanceSettlementMode acceptanceSettlementMode = (AcceptanceSettlementMode) o;
    return Objects.equals(id, acceptanceSettlementMode.id) &&
        Objects.equals(acceptanceMode, acceptanceSettlementMode.acceptanceMode) &&
        Objects.equals(settlementMode, acceptanceSettlementMode.settlementMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, acceptanceMode, settlementMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptanceSettlementMode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    acceptanceMode: ").append(toIndentedString(acceptanceMode)).append("\n");
    sb.append("    settlementMode: ").append(toIndentedString(settlementMode)).append("\n");
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

