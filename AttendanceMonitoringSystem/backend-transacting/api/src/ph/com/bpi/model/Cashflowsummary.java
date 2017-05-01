package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Cashflowsummary   {
  
  private String tranFi = null;
  private String tranUnit = null;
  private String currCode = null;
  private Integer mIflow = null;
  private Integer tIflow = null;
  private Integer mOflow = null;
  private Integer tOflow = null;
  private Integer runnBaln = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_fi")
  public String getTranFi() {
    return tranFi;
  }
  public void setTranFi(String tranFi) {
    this.tranFi = tranFi;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_unit")
  public String getTranUnit() {
    return tranUnit;
  }
  public void setTranUnit(String tranUnit) {
    this.tranUnit = tranUnit;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("curr_code")
  public String getCurrCode() {
    return currCode;
  }
  public void setCurrCode(String currCode) {
    this.currCode = currCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("m_iflow")
  public Integer getMIflow() {
    return mIflow;
  }
  public void setMIflow(Integer mIflow) {
    this.mIflow = mIflow;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("t_iflow")
  public Integer getTIflow() {
    return tIflow;
  }
  public void setTIflow(Integer tIflow) {
    this.tIflow = tIflow;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("m_oflow")
  public Integer getMOflow() {
    return mOflow;
  }
  public void setMOflow(Integer mOflow) {
    this.mOflow = mOflow;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("t_oflow")
  public Integer getTOflow() {
    return tOflow;
  }
  public void setTOflow(Integer tOflow) {
    this.tOflow = tOflow;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("runn_baln")
  public Integer getRunnBaln() {
    return runnBaln;
  }
  public void setRunnBaln(Integer runnBaln) {
    this.runnBaln = runnBaln;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cashflowsummary cashflowsummary = (Cashflowsummary) o;
    return Objects.equals(tranFi, cashflowsummary.tranFi) &&
        Objects.equals(tranUnit, cashflowsummary.tranUnit) &&
        Objects.equals(currCode, cashflowsummary.currCode) &&
        Objects.equals(mIflow, cashflowsummary.mIflow) &&
        Objects.equals(tIflow, cashflowsummary.tIflow) &&
        Objects.equals(mOflow, cashflowsummary.mOflow) &&
        Objects.equals(tOflow, cashflowsummary.tOflow) &&
        Objects.equals(runnBaln, cashflowsummary.runnBaln);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranFi, tranUnit, currCode, mIflow, tIflow, mOflow, tOflow, runnBaln);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cashflowsummary {\n");
    
    sb.append("    tranFi: ").append(toIndentedString(tranFi)).append("\n");
    sb.append("    tranUnit: ").append(toIndentedString(tranUnit)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    mIflow: ").append(toIndentedString(mIflow)).append("\n");
    sb.append("    tIflow: ").append(toIndentedString(tIflow)).append("\n");
    sb.append("    mOflow: ").append(toIndentedString(mOflow)).append("\n");
    sb.append("    tOflow: ").append(toIndentedString(tOflow)).append("\n");
    sb.append("    runnBaln: ").append(toIndentedString(runnBaln)).append("\n");
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

