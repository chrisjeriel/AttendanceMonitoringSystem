package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Printer   {
  
  private Integer printerId = null;
  private String hardwareId = null;
  private String printerName = null;
  private String controlCode = null;
  private Boolean isDefaultPrinter = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("printerId")
  public Integer getPrinterId() {
    return printerId;
  }
  public void setPrinterId(Integer printerId) {
    this.printerId = printerId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hardwareId")
  public String getHardwareId() {
    return hardwareId;
  }
  public void setHardwareId(String hardwareId) {
    this.hardwareId = hardwareId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("printerName")
  public String getPrinterName() {
    return printerName;
  }
  public void setPrinterName(String printerName) {
    this.printerName = printerName;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("controlCode")
  public String getControlCode() {
    return controlCode;
  }
  public void setControlCode(String controlCode) {
    this.controlCode = controlCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("isDefaultPrinter")
  public Boolean getIsDefaultPrinter() {
    return isDefaultPrinter;
  }
  public void setIsDefaultPrinter(Boolean isDefaultPrinter) {
    this.isDefaultPrinter = isDefaultPrinter;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Printer printer = (Printer) o;
    return Objects.equals(printerId, printer.printerId) &&
        Objects.equals(hardwareId, printer.hardwareId) &&
        Objects.equals(printerName, printer.printerName) &&
        Objects.equals(controlCode, printer.controlCode) &&
        Objects.equals(isDefaultPrinter, printer.isDefaultPrinter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(printerId, hardwareId, printerName, controlCode, isDefaultPrinter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Printer {\n");
    
    sb.append("    printerId: ").append(toIndentedString(printerId)).append("\n");
    sb.append("    hardwareId: ").append(toIndentedString(hardwareId)).append("\n");
    sb.append("    printerName: ").append(toIndentedString(printerName)).append("\n");
    sb.append("    controlCode: ").append(toIndentedString(controlCode)).append("\n");
    sb.append("    isDefaultPrinter: ").append(toIndentedString(isDefaultPrinter)).append("\n");
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

