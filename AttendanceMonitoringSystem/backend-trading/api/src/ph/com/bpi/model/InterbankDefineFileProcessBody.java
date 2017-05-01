package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class InterbankDefineFileProcessBody   {
  
  private String bankCode = null;
  private String cntrPrty = null;
  private String bankName = null;
  private String address1 = null;
  private String address2 = null;
  private String cntcPrsn = null;
  private String recvAcct = null;
  private String othrInst = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bankCode")
  public String getBankCode() {
    return bankCode;
  }
  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
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
    InterbankDefineFileProcessBody interbankDefineFileProcessBody = (InterbankDefineFileProcessBody) o;
    return Objects.equals(bankCode, interbankDefineFileProcessBody.bankCode) &&
        Objects.equals(cntrPrty, interbankDefineFileProcessBody.cntrPrty) &&
        Objects.equals(bankName, interbankDefineFileProcessBody.bankName) &&
        Objects.equals(address1, interbankDefineFileProcessBody.address1) &&
        Objects.equals(address2, interbankDefineFileProcessBody.address2) &&
        Objects.equals(cntcPrsn, interbankDefineFileProcessBody.cntcPrsn) &&
        Objects.equals(recvAcct, interbankDefineFileProcessBody.recvAcct) &&
        Objects.equals(othrInst, interbankDefineFileProcessBody.othrInst);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankCode, cntrPrty, bankName, address1, address2, cntcPrsn, recvAcct, othrInst);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterbankDefineFileProcessBody {\n");
    
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    cntrPrty: ").append(toIndentedString(cntrPrty)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    cntcPrsn: ").append(toIndentedString(cntcPrsn)).append("\n");
    sb.append("    recvAcct: ").append(toIndentedString(recvAcct)).append("\n");
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

