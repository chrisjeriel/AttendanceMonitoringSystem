package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Incomes   {
  
  private Integer regAmnt = null;
  private Integer fcdAmnt = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reg_amnt")
  public Integer getRegAmnt() {
    return regAmnt;
  }
  public void setRegAmnt(Integer regAmnt) {
    this.regAmnt = regAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fcd_amnt")
  public Integer getFcdAmnt() {
    return fcdAmnt;
  }
  public void setFcdAmnt(Integer fcdAmnt) {
    this.fcdAmnt = fcdAmnt;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Incomes incomes = (Incomes) o;
    return Objects.equals(regAmnt, incomes.regAmnt) &&
        Objects.equals(fcdAmnt, incomes.fcdAmnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regAmnt, fcdAmnt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Incomes {\n");
    
    sb.append("    regAmnt: ").append(toIndentedString(regAmnt)).append("\n");
    sb.append("    fcdAmnt: ").append(toIndentedString(fcdAmnt)).append("\n");
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

