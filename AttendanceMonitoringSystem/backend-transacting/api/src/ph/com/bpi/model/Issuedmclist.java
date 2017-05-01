package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class Issuedmclist   {
  
  private String trdrFi = null;
  private Integer runBal = null;
  private String refNmbr = null;
  private String mcSerno = null;
  private String cLname = null;
  private String cFname = null;
  private String cMname = null;
  private Integer phpAmt = null;

  
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
  @JsonProperty("run_bal")
  public Integer getRunBal() {
    return runBal;
  }
  public void setRunBal(Integer runBal) {
    this.runBal = runBal;
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
  @JsonProperty("mc_serno")
  public String getMcSerno() {
    return mcSerno;
  }
  public void setMcSerno(String mcSerno) {
    this.mcSerno = mcSerno;
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
  @JsonProperty("php_amt")
  public Integer getPhpAmt() {
    return phpAmt;
  }
  public void setPhpAmt(Integer phpAmt) {
    this.phpAmt = phpAmt;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Issuedmclist issuedmclist = (Issuedmclist) o;
    return Objects.equals(trdrFi, issuedmclist.trdrFi) &&
        Objects.equals(runBal, issuedmclist.runBal) &&
        Objects.equals(refNmbr, issuedmclist.refNmbr) &&
        Objects.equals(mcSerno, issuedmclist.mcSerno) &&
        Objects.equals(cLname, issuedmclist.cLname) &&
        Objects.equals(cFname, issuedmclist.cFname) &&
        Objects.equals(cMname, issuedmclist.cMname) &&
        Objects.equals(phpAmt, issuedmclist.phpAmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trdrFi, runBal, refNmbr, mcSerno, cLname, cFname, cMname, phpAmt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Issuedmclist {\n");
    
    sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
    sb.append("    runBal: ").append(toIndentedString(runBal)).append("\n");
    sb.append("    refNmbr: ").append(toIndentedString(refNmbr)).append("\n");
    sb.append("    mcSerno: ").append(toIndentedString(mcSerno)).append("\n");
    sb.append("    cLname: ").append(toIndentedString(cLname)).append("\n");
    sb.append("    cFname: ").append(toIndentedString(cFname)).append("\n");
    sb.append("    cMname: ").append(toIndentedString(cMname)).append("\n");
    sb.append("    phpAmt: ").append(toIndentedString(phpAmt)).append("\n");
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

