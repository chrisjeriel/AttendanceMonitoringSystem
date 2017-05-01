package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SpecialSquaringListBody   {
  
  private String trdrFi = null;
  private String bank = null;
  private String book = null;
  private String tranIndc = null;
  private String refNo = null;
  private String listType = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trdrFi")
  public String getTrdrFi() {
    return trdrFi;
  }
  public void setTrdrFi(String trdrFi) {
    this.trdrFi = trdrFi;
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
  @JsonProperty("tranIndc")
  public String getTranIndc() {
    return tranIndc;
  }
  public void setTranIndc(String tranIndc) {
    this.tranIndc = tranIndc;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("refNo")
  public String getRefNo() {
    return refNo;
  }
  public void setRefNo(String refNo) {
    this.refNo = refNo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("listType")
  public String getListType() {
    return listType;
  }
  public void setListType(String listType) {
    this.listType = listType;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialSquaringListBody specialSquaringListBody = (SpecialSquaringListBody) o;
    return Objects.equals(trdrFi, specialSquaringListBody.trdrFi) &&
        Objects.equals(bank, specialSquaringListBody.bank) &&
        Objects.equals(book, specialSquaringListBody.book) &&
        Objects.equals(tranIndc, specialSquaringListBody.tranIndc) &&
        Objects.equals(refNo, specialSquaringListBody.refNo) &&
        Objects.equals(listType, specialSquaringListBody.listType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, bank, book, tranIndc, refNo, listType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialSquaringListBody {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    book: ").append(toIndentedString(book)).append("\n");
    sb.append("    tranIndc: ").append(toIndentedString(tranIndc)).append("\n");
    sb.append("    refNo: ").append(toIndentedString(refNo)).append("\n");
    sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
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

