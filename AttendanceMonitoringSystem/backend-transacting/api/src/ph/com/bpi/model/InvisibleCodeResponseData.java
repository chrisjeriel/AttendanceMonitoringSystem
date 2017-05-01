package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class InvisibleCodeResponseData   {
  
  private String trdrFi = null;
  private String inviCode = null;
  private String tranCode = null;
  private String formNmbr = null;
  private String inviDesc = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trdr_fi")
  public String getTrdrFi() {
    return trdrFi;
  }
  public void setTrdrFi(String trdrFi) {
    this.trdrFi = trdrFi;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("invi_code")
  public String getInviCode() {
    return inviCode;
  }
  public void setInviCode(String inviCode) {
    this.inviCode = inviCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tran_code")
  public String getTranCode() {
    return tranCode;
  }
  public void setTranCode(String tranCode) {
    this.tranCode = tranCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("form_nmbr")
  public String getFormNmbr() {
    return formNmbr;
  }
  public void setFormNmbr(String formNmbr) {
    this.formNmbr = formNmbr;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("invi_desc")
  public String getInviDesc() {
    return inviDesc;
  }
  public void setInviDesc(String inviDesc) {
    this.inviDesc = inviDesc;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvisibleCodeResponseData invisibleCodeResponseData = (InvisibleCodeResponseData) o;
    return Objects.equals(trdrFi, invisibleCodeResponseData.trdrFi) &&
        Objects.equals(inviCode, invisibleCodeResponseData.inviCode) &&
        Objects.equals(tranCode, invisibleCodeResponseData.tranCode) &&
        Objects.equals(formNmbr, invisibleCodeResponseData.formNmbr) &&
        Objects.equals(inviDesc, invisibleCodeResponseData.inviDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, inviCode, tranCode, formNmbr, inviDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvisibleCodeResponseData {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    inviCode: ").append(toIndentedString(inviCode)).append("\n");
    sb.append("    tranCode: ").append(toIndentedString(tranCode)).append("\n");
    sb.append("    formNmbr: ").append(toIndentedString(formNmbr)).append("\n");
    sb.append("    inviDesc: ").append(toIndentedString(inviDesc)).append("\n");
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

