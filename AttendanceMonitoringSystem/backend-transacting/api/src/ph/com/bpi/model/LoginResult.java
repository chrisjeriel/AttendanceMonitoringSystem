package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class LoginResult   {
  
  private String userId = null;


  public enum AccountStatusEnum {
    EXPIRED("expired"),
    NEWACCOUNT("newaccount"),
    OK("ok");

    private String value;

    AccountStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private AccountStatusEnum accountStatus = null;
  private String officeCode = null;
  private String officeName = null;
  private String terminalCode = null;

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accountStatus")
  public AccountStatusEnum getAccountStatus() {
    return accountStatus;
  }
  public void setAccountStatus(AccountStatusEnum accountStatus) {
    this.accountStatus = accountStatus;
  }

  
  /**
   * Transacting branch code
   **/
  
  @ApiModelProperty(value = "Transacting branch code")
  @JsonProperty("officeCode")
  public String getOfficeCode() {
    return officeCode;
  }
  public void setOfficeCode(String officeCode) {
    this.officeCode = officeCode;
  }

  
  /**
   * Transacting branch name
   **/
  
  @ApiModelProperty(value = "Transacting branch name")
  @JsonProperty("officeName")
  public String getOfficeName() {
    return officeName;
  }
  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("terminalCode")
  public String getTerminalCode() {
    return terminalCode;
  }
  public void setTerminalCode(String terminalCode) {
    this.terminalCode = terminalCode;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginResult loginResult = (LoginResult) o;
    return Objects.equals(userId, loginResult.userId) &&
        Objects.equals(accountStatus, loginResult.accountStatus) &&
        Objects.equals(officeCode, loginResult.officeCode) &&
        Objects.equals(officeName, loginResult.officeName) &&
        Objects.equals(terminalCode, loginResult.terminalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, accountStatus, officeCode, officeName, terminalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginResult {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    officeCode: ").append(toIndentedString(officeCode)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    terminalCode: ").append(toIndentedString(terminalCode)).append("\n");
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

