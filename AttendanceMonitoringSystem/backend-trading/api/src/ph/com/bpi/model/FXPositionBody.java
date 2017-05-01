package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class FXPositionBody   {
  
  private String tradUnit = null;
  private String bank = null;
  private String listOpt = null;
  private String book = null;
  private String appl = null;
  private String fxUnit = null;
  private String tranUnit = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trad_unit")
  public String getTradUnit() {
    return tradUnit;
  }
  public void setTradUnit(String tradUnit) {
    this.tradUnit = tradUnit;
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
  @JsonProperty("list_opt")
  public String getListOpt() {
    return listOpt;
  }
  public void setListOpt(String listOpt) {
    this.listOpt = listOpt;
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
  @JsonProperty("appl")
  public String getAppl() {
    return appl;
  }
  public void setAppl(String appl) {
    this.appl = appl;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fx_unit")
  public String getFxUnit() {
    return fxUnit;
  }
  public void setFxUnit(String fxUnit) {
    this.fxUnit = fxUnit;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FXPositionBody fXPositionBody = (FXPositionBody) o;
    return Objects.equals(tradUnit, fXPositionBody.tradUnit) &&
        Objects.equals(bank, fXPositionBody.bank) &&
        Objects.equals(listOpt, fXPositionBody.listOpt) &&
        Objects.equals(book, fXPositionBody.book) &&
        Objects.equals(appl, fXPositionBody.appl) &&
        Objects.equals(fxUnit, fXPositionBody.fxUnit) &&
        Objects.equals(tranUnit, fXPositionBody.tranUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradUnit, bank, listOpt, book, appl, fxUnit, tranUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FXPositionBody {\n");
    
    sb.append("    tradUnit: ").append(toIndentedString(tradUnit)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    listOpt: ").append(toIndentedString(listOpt)).append("\n");
    sb.append("    book: ").append(toIndentedString(book)).append("\n");
    sb.append("    appl: ").append(toIndentedString(appl)).append("\n");
    sb.append("    fxUnit: ").append(toIndentedString(fxUnit)).append("\n");
    sb.append("    tranUnit: ").append(toIndentedString(tranUnit)).append("\n");
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

