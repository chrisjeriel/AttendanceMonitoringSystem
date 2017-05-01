package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * System will automatically provide all the charges applicable based on the amount defined by the Trading Unit.
 **/

@ApiModel(description = "System will automatically provide all the charges applicable based on the amount defined by the Trading Unit.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class EquivalentAmtResult   {
  
  private Float grossEquivalentAmt = null;
  private Float tcPostage = null;
  private Float docStamp = null;
  private Float commission = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("grossEquivalentAmt")
  public Float getGrossEquivalentAmt() {
    return grossEquivalentAmt;
  }
  public void setGrossEquivalentAmt(Float grossEquivalentAmt) {
    this.grossEquivalentAmt = grossEquivalentAmt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tcPostage")
  public Float getTcPostage() {
    return tcPostage;
  }
  public void setTcPostage(Float tcPostage) {
    this.tcPostage = tcPostage;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("docStamp")
  public Float getDocStamp() {
    return docStamp;
  }
  public void setDocStamp(Float docStamp) {
    this.docStamp = docStamp;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("commission")
  public Float getCommission() {
    return commission;
  }
  public void setCommission(Float commission) {
    this.commission = commission;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquivalentAmtResult equivalentAmtResult = (EquivalentAmtResult) o;
    return Objects.equals(grossEquivalentAmt, equivalentAmtResult.grossEquivalentAmt) &&
        Objects.equals(tcPostage, equivalentAmtResult.tcPostage) &&
        Objects.equals(docStamp, equivalentAmtResult.docStamp) &&
        Objects.equals(commission, equivalentAmtResult.commission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grossEquivalentAmt, tcPostage, docStamp, commission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquivalentAmtResult {\n");
    
    sb.append("    grossEquivalentAmt: ").append(toIndentedString(grossEquivalentAmt)).append("\n");
    sb.append("    tcPostage: ").append(toIndentedString(tcPostage)).append("\n");
    sb.append("    docStamp: ").append(toIndentedString(docStamp)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
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

