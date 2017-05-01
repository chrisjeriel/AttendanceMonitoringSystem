package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class InterbankDataEntryBody   {
  
  private String tranType = null;
  private String cntcPrsn = null;
  private String cntrPrty = null;
  private String address1 = null;
  private String address2 = null;
  private String tranAmnt = null;
  private String exchRate = null;
  private String eqvtAmnt = null;
  private String valDate = null;
  private String recvAcct = null;
  private String remarks = null;
  private String bankName = null;
  private String othrInst = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tranType")
  public String getTranType() {
    return tranType;
  }
  public void setTranType(String tranType) {
    this.tranType = tranType;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cntcPrsn")
  public String getCntcPrsn() {
    return cntcPrsn;
  }
  public void setCntcPrsn(String cntcPrsn) {
    this.cntcPrsn = cntcPrsn;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cntrPrty")
  public String getCntrPrty() {
    return cntrPrty;
  }
  public void setCntrPrty(String cntrPrty) {
    this.cntrPrty = cntrPrty;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("address1")
  public String getAddress1() {
    return address1;
  }
  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("address2")
  public String getAddress2() {
    return address2;
  }
  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tranAmnt")
  public String getTranAmnt() {
    return tranAmnt;
  }
  public void setTranAmnt(String tranAmnt) {
    this.tranAmnt = tranAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("exchRate")
  public String getExchRate() {
    return exchRate;
  }
  public void setExchRate(String exchRate) {
    this.exchRate = exchRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eqvtAmnt")
  public String getEqvtAmnt() {
    return eqvtAmnt;
  }
  public void setEqvtAmnt(String eqvtAmnt) {
    this.eqvtAmnt = eqvtAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valDate")
  public String getValDate() {
    return valDate;
  }
  public void setValDate(String valDate) {
    this.valDate = valDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recvAcct")
  public String getRecvAcct() {
    return recvAcct;
  }
  public void setRecvAcct(String recvAcct) {
    this.recvAcct = recvAcct;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("remarks")
  public String getRemarks() {
    return remarks;
  }
  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bankName")
  public String getBankName() {
    return bankName;
  }
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("othrInst")
  public String getOthrInst() {
    return othrInst;
  }
  public void setOthrInst(String othrInst) {
    this.othrInst = othrInst;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterbankDataEntryBody interbankDataEntryBody = (InterbankDataEntryBody) o;
    return Objects.equals(tranType, interbankDataEntryBody.tranType) &&
        Objects.equals(cntcPrsn, interbankDataEntryBody.cntcPrsn) &&
        Objects.equals(cntrPrty, interbankDataEntryBody.cntrPrty) &&
        Objects.equals(address1, interbankDataEntryBody.address1) &&
        Objects.equals(address2, interbankDataEntryBody.address2) &&
        Objects.equals(tranAmnt, interbankDataEntryBody.tranAmnt) &&
        Objects.equals(exchRate, interbankDataEntryBody.exchRate) &&
        Objects.equals(eqvtAmnt, interbankDataEntryBody.eqvtAmnt) &&
        Objects.equals(valDate, interbankDataEntryBody.valDate) &&
        Objects.equals(recvAcct, interbankDataEntryBody.recvAcct) &&
        Objects.equals(remarks, interbankDataEntryBody.remarks) &&
        Objects.equals(bankName, interbankDataEntryBody.bankName) &&
        Objects.equals(othrInst, interbankDataEntryBody.othrInst);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranType, cntcPrsn, cntrPrty, address1, address2, tranAmnt, exchRate, eqvtAmnt, valDate, recvAcct, remarks, bankName, othrInst);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterbankDataEntryBody {\n");
    
    sb.append("    tranType: ").append(toIndentedString(tranType)).append("\n");
    sb.append("    cntcPrsn: ").append(toIndentedString(cntcPrsn)).append("\n");
    sb.append("    cntrPrty: ").append(toIndentedString(cntrPrty)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    tranAmnt: ").append(toIndentedString(tranAmnt)).append("\n");
    sb.append("    exchRate: ").append(toIndentedString(exchRate)).append("\n");
    sb.append("    eqvtAmnt: ").append(toIndentedString(eqvtAmnt)).append("\n");
    sb.append("    valDate: ").append(toIndentedString(valDate)).append("\n");
    sb.append("    recvAcct: ").append(toIndentedString(recvAcct)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    othrInst: ").append(toIndentedString(othrInst)).append("\n");
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

