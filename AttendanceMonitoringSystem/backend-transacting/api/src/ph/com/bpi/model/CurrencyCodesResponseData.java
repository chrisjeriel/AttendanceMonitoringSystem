package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CurrencyCodesResponseData   {
  
  private String currCode = null;
  private String currBpi = null;
  private String currCasa = null;
  private String currDesc = null;

  
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
  @JsonProperty("curr_bpi")
  public String getCurrBpi() {
    return currBpi;
  }
  public void setCurrBpi(String currBpi) {
    this.currBpi = currBpi;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("curr_casa")
  public String getCurrCasa() {
    return currCasa;
  }
  public void setCurrCasa(String currCasa) {
    this.currCasa = currCasa;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("curr_desc")
  public String getCurrDesc() {
    return currDesc;
  }
  public void setCurrDesc(String currDesc) {
    this.currDesc = currDesc;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyCodesResponseData currencyCodesResponseData = (CurrencyCodesResponseData) o;
    return Objects.equals(currCode, currencyCodesResponseData.currCode) &&
        Objects.equals(currBpi, currencyCodesResponseData.currBpi) &&
        Objects.equals(currCasa, currencyCodesResponseData.currCasa) &&
        Objects.equals(currDesc, currencyCodesResponseData.currDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currCode, currBpi, currCasa, currDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyCodesResponseData {\n");
    
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    currBpi: ").append(toIndentedString(currBpi)).append("\n");
    sb.append("    currCasa: ").append(toIndentedString(currCasa)).append("\n");
    sb.append("    currDesc: ").append(toIndentedString(currDesc)).append("\n");
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

