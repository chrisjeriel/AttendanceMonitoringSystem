package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Historicalrecordslist   {
  
  private String tranIndc = null;
  private String cLname = null;
  private String cFname = null;
  private String cMname = null;
  private Date bday = null;
  private String tin = null;
  private String cAddr1 = null;
  private String cAddr2 = null;
  private String telno = null;
  private Date tranDate = null;
  private String tranUnit = null;
  private String refNmbr = null;
  private String currFr = null;
  private String currTo = null;
  private Integer tranAmnt = null;
  private Integer usdAmnt = null;
  private String tranTime = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_indc")
  public String getTranIndc() {
    return tranIndc;
  }
  public void setTranIndc(String tranIndc) {
    this.tranIndc = tranIndc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("c_lname")
  public String getCLname() {
    return cLname;
  }
  public void setCLname(String cLname) {
    this.cLname = cLname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("c_fname")
  public String getCFname() {
    return cFname;
  }
  public void setCFname(String cFname) {
    this.cFname = cFname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("c_mname")
  public String getCMname() {
    return cMname;
  }
  public void setCMname(String cMname) {
    this.cMname = cMname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bday")
  public Date getBday() {
    return bday;
  }
  public void setBday(Date bday) {
    this.bday = bday;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tin")
  public String getTin() {
    return tin;
  }
  public void setTin(String tin) {
    this.tin = tin;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("c_addr1")
  public String getCAddr1() {
    return cAddr1;
  }
  public void setCAddr1(String cAddr1) {
    this.cAddr1 = cAddr1;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("c_addr2")
  public String getCAddr2() {
    return cAddr2;
  }
  public void setCAddr2(String cAddr2) {
    this.cAddr2 = cAddr2;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("telno")
  public String getTelno() {
    return telno;
  }
  public void setTelno(String telno) {
    this.telno = telno;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_date")
  public Date getTranDate() {
    return tranDate;
  }
  public void setTranDate(Date tranDate) {
    this.tranDate = tranDate;
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
  @JsonProperty("ref_nmbr")
  public String getRefNmbr() {
    return refNmbr;
  }
  public void setRefNmbr(String refNmbr) {
    this.refNmbr = refNmbr;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("curr_fr")
  public String getCurrFr() {
    return currFr;
  }
  public void setCurrFr(String currFr) {
    this.currFr = currFr;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("curr_to")
  public String getCurrTo() {
    return currTo;
  }
  public void setCurrTo(String currTo) {
    this.currTo = currTo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_amnt")
  public Integer getTranAmnt() {
    return tranAmnt;
  }
  public void setTranAmnt(Integer tranAmnt) {
    this.tranAmnt = tranAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("usd_amnt")
  public Integer getUsdAmnt() {
    return usdAmnt;
  }
  public void setUsdAmnt(Integer usdAmnt) {
    this.usdAmnt = usdAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_time")
  public String getTranTime() {
    return tranTime;
  }
  public void setTranTime(String tranTime) {
    this.tranTime = tranTime;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Historicalrecordslist historicalrecordslist = (Historicalrecordslist) o;
    return Objects.equals(tranIndc, historicalrecordslist.tranIndc) &&
        Objects.equals(cLname, historicalrecordslist.cLname) &&
        Objects.equals(cFname, historicalrecordslist.cFname) &&
        Objects.equals(cMname, historicalrecordslist.cMname) &&
        Objects.equals(bday, historicalrecordslist.bday) &&
        Objects.equals(tin, historicalrecordslist.tin) &&
        Objects.equals(cAddr1, historicalrecordslist.cAddr1) &&
        Objects.equals(cAddr2, historicalrecordslist.cAddr2) &&
        Objects.equals(telno, historicalrecordslist.telno) &&
        Objects.equals(tranDate, historicalrecordslist.tranDate) &&
        Objects.equals(tranUnit, historicalrecordslist.tranUnit) &&
        Objects.equals(refNmbr, historicalrecordslist.refNmbr) &&
        Objects.equals(currFr, historicalrecordslist.currFr) &&
        Objects.equals(currTo, historicalrecordslist.currTo) &&
        Objects.equals(tranAmnt, historicalrecordslist.tranAmnt) &&
        Objects.equals(usdAmnt, historicalrecordslist.usdAmnt) &&
        Objects.equals(tranTime, historicalrecordslist.tranTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranIndc, cLname, cFname, cMname, bday, tin, cAddr1, cAddr2, telno, tranDate, tranUnit, refNmbr, currFr, currTo, tranAmnt, usdAmnt, tranTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Historicalrecordslist {\n");
    
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    cLname: ").append(toIndentedString(cLname)).append("\n");
    sb.append("    cFname: ").append(toIndentedString(cFname)).append("\n");
    sb.append("    cMname: ").append(toIndentedString(cMname)).append("\n");
    sb.append("    bday: ").append(toIndentedString(bday)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    cAddr1: ").append(toIndentedString(cAddr1)).append("\n");
    sb.append("    cAddr2: ").append(toIndentedString(cAddr2)).append("\n");
    sb.append("    telno: ").append(toIndentedString(telno)).append("\n");
    sb.append("    tranDate: ").append(toIndentedString(tranDate)).append("\n");
    sb.append("    tranUnit: ").append(toIndentedString(tranUnit)).append("\n");
    sb.append("    refNmbr: ").append(toIndentedString(refNmbr)).append("\n");
    sb.append("    currFr: ").append(toIndentedString(currFr)).append("\n");
    sb.append("    currTo: ").append(toIndentedString(currTo)).append("\n");
    sb.append("    tranAmnt: ").append(toIndentedString(tranAmnt)).append("\n");
    sb.append("    usdAmnt: ").append(toIndentedString(usdAmnt)).append("\n");
    sb.append("    tranTime: ").append(toIndentedString(tranTime)).append("\n");
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

