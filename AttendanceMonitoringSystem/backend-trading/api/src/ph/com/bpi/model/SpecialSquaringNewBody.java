package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SpecialSquaringNewBody   {
  
  private String dealWith = null;
  private String bank = null;
  private String book = null;
  private String tranType = null;
  private String currPair = null;
  private String tranAmt = null;
  private String equivalentAmnt = null;
  private String acptMode = null;
  private String setlMode = null;
  private String grantRate = null;
  private String inviCode = null;
  private String btsuRemarks = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dealWith")
  public String getDealWith() {
    return dealWith;
  }
  public void setDealWith(String dealWith) {
    this.dealWith = dealWith;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bank")
  public String getBank() {
    return bank;
  }
  public void setBank(String bank) {
    this.bank = bank;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("book")
  public String getBook() {
    return book;
  }
  public void setBook(String book) {
    this.book = book;
  }

  
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
  @JsonProperty("currPair")
  public String getCurrPair() {
    return currPair;
  }
  public void setCurrPair(String currPair) {
    this.currPair = currPair;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tranAmt")
  public String getTranAmt() {
    return tranAmt;
  }
  public void setTranAmt(String tranAmt) {
    this.tranAmt = tranAmt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("equivalentAmnt")
  public String getEquivalentAmnt() {
    return equivalentAmnt;
  }
  public void setEquivalentAmnt(String equivalentAmnt) {
    this.equivalentAmnt = equivalentAmnt;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acptMode")
  public String getAcptMode() {
    return acptMode;
  }
  public void setAcptMode(String acptMode) {
    this.acptMode = acptMode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("setlMode")
  public String getSetlMode() {
    return setlMode;
  }
  public void setSetlMode(String setlMode) {
    this.setlMode = setlMode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("grantRate")
  public String getGrantRate() {
    return grantRate;
  }
  public void setGrantRate(String grantRate) {
    this.grantRate = grantRate;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("inviCode")
  public String getInviCode() {
    return inviCode;
  }
  public void setInviCode(String inviCode) {
    this.inviCode = inviCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("btsuRemarks")
  public String getBtsuRemarks() {
    return btsuRemarks;
  }
  public void setBtsuRemarks(String btsuRemarks) {
    this.btsuRemarks = btsuRemarks;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialSquaringNewBody specialSquaringNewBody = (SpecialSquaringNewBody) o;
    return Objects.equals(dealWith, specialSquaringNewBody.dealWith) &&
        Objects.equals(bank, specialSquaringNewBody.bank) &&
        Objects.equals(book, specialSquaringNewBody.book) &&
        Objects.equals(tranType, specialSquaringNewBody.tranType) &&
        Objects.equals(currPair, specialSquaringNewBody.currPair) &&
        Objects.equals(tranAmt, specialSquaringNewBody.tranAmt) &&
        Objects.equals(equivalentAmnt, specialSquaringNewBody.equivalentAmnt) &&
        Objects.equals(acptMode, specialSquaringNewBody.acptMode) &&
        Objects.equals(setlMode, specialSquaringNewBody.setlMode) &&
        Objects.equals(grantRate, specialSquaringNewBody.grantRate) &&
        Objects.equals(inviCode, specialSquaringNewBody.inviCode) &&
        Objects.equals(btsuRemarks, specialSquaringNewBody.btsuRemarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealWith, bank, book, tranType, currPair, tranAmt, equivalentAmnt, acptMode, setlMode, grantRate, inviCode, btsuRemarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialSquaringNewBody {\n");
    
    sb.append("    dealWith: ").append(toIndentedString(dealWith)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    book: ").append(toIndentedString(book)).append("\n");
    sb.append("    tranType: ").append(toIndentedString(tranType)).append("\n");
    sb.append("    currPair: ").append(toIndentedString(currPair)).append("\n");
    sb.append("    tranAmt: ").append(toIndentedString(tranAmt)).append("\n");
    sb.append("    equivalentAmnt: ").append(toIndentedString(equivalentAmnt)).append("\n");
    sb.append("    acptMode: ").append(toIndentedString(acptMode)).append("\n");
    sb.append("    setlMode: ").append(toIndentedString(setlMode)).append("\n");
    sb.append("    grantRate: ").append(toIndentedString(grantRate)).append("\n");
    sb.append("    inviCode: ").append(toIndentedString(inviCode)).append("\n");
    sb.append("    btsuRemarks: ").append(toIndentedString(btsuRemarks)).append("\n");
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

