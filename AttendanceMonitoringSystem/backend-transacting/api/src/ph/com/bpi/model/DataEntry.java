package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import ph.com.bpi.model.CommonDataForm;
import ph.com.bpi.model.TravelersCheck;



/**
 * Form for transactions. For BTSU transactions, travelersChecks are required
 **/

@ApiModel(description = "Form for transactions. For BTSU transactions, travelersChecks are required")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class DataEntry   {
  
  private CommonDataForm commonData = null;
  private List<TravelersCheck> travelersChecks = new ArrayList<TravelersCheck>();

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("commonData")
  public CommonDataForm getCommonData() {
    return commonData;
  }
  public void setCommonData(CommonDataForm commonData) {
    this.commonData = commonData;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("travelersChecks")
  public List<TravelersCheck> getTravelersChecks() {
    return travelersChecks;
  }
  public void setTravelersChecks(List<TravelersCheck> travelersChecks) {
    this.travelersChecks = travelersChecks;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataEntry dataEntry = (DataEntry) o;
    return Objects.equals(commonData, dataEntry.commonData) &&
        Objects.equals(travelersChecks, dataEntry.travelersChecks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonData, travelersChecks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataEntry {\n");
    
    sb.append("    commonData: ").append(toIndentedString(commonData)).append("\n");
    sb.append("    travelersChecks: ").append(toIndentedString(travelersChecks)).append("\n");
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

