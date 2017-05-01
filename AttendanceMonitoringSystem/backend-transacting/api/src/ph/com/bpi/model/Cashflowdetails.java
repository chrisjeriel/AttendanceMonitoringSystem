package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Cashflowdetails   {
  
  private String tranFi = null;
  private String tranUnit = null;
  private String currCode = null;
  private Integer seqNo = null;
  private Integer amount = null;
  private String userId = null;
  private String termId = null;
  private Integer timeStmp = null;

  
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
  @JsonProperty("seq_no")
  public Integer getSeqNo() {
    return seqNo;
  }
  public void setSeqNo(Integer seqNo) {
    this.seqNo = seqNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("amount")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("term_id")
  public String getTermId() {
    return termId;
  }
  public void setTermId(String termId) {
    this.termId = termId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("time_stmp")
  public Integer getTimeStmp() {
    return timeStmp;
  }
  public void setTimeStmp(Integer timeStmp) {
    this.timeStmp = timeStmp;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cashflowdetails cashflowdetails = (Cashflowdetails) o;
    return Objects.equals(tranFi, cashflowdetails.tranFi) &&
        Objects.equals(tranUnit, cashflowdetails.tranUnit) &&
        Objects.equals(currCode, cashflowdetails.currCode) &&
        Objects.equals(seqNo, cashflowdetails.seqNo) &&
        Objects.equals(amount, cashflowdetails.amount) &&
        Objects.equals(userId, cashflowdetails.userId) &&
        Objects.equals(termId, cashflowdetails.termId) &&
        Objects.equals(timeStmp, cashflowdetails.timeStmp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranFi, tranUnit, currCode, seqNo, amount, userId, termId, timeStmp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cashflowdetails {\n");
    
    sb.append("    tranFi: ").append(toIndentedString(tranFi)).append("\n");
    sb.append("    tranUnit: ").append(toIndentedString(tranUnit)).append("\n");
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    seqNo: ").append(toIndentedString(seqNo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    termId: ").append(toIndentedString(termId)).append("\n");
    sb.append("    timeStmp: ").append(toIndentedString(timeStmp)).append("\n");
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

