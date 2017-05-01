package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;



/**
 * Initial Logon Body.
 **/

/**
 * Initial Logon Body.
 */
@ApiModel(description = "Initial Logon Body.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-14T12:08:43.318+08:00")
public class LogonBody   {
  private Date transactionDate = null;

  private String officeCode = null;

  private String userId = null;

  private String password = null;

  private Boolean changePassword = null;

  private String newPassword = null;

  public LogonBody transactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * Transaction Date. Format (mm/dd/yyyy).
   * @return transactionDate
  **/
  @ApiModelProperty(value = "Transaction Date. Format (mm/dd/yyyy).")
  public Date getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }

  public LogonBody officeCode(String officeCode) {
    this.officeCode = officeCode;
    return this;
  }

   /**
   * Office Code.
   * @return officeCode
  **/
  @ApiModelProperty(value = "Office Code.")
  public String getOfficeCode() {
    return officeCode;
  }

  public void setOfficeCode(String officeCode) {
    this.officeCode = officeCode;
  }

  public LogonBody userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User ID.
   * @return userId
  **/
  @ApiModelProperty(value = "User ID.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public LogonBody password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password.
   * @return password
  **/
  @ApiModelProperty(value = "Password.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LogonBody changePassword(Boolean changePassword) {
    this.changePassword = changePassword;
    return this;
  }

   /**
   * Change password?
   * @return changePassword
  **/
  @ApiModelProperty(value = "Change password?")
  public Boolean getChangePassword() {
    return changePassword;
  }

  public void setChangePassword(Boolean changePassword) {
    this.changePassword = changePassword;
  }

  public LogonBody newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

   /**
   * New password.
   * @return newPassword
  **/
  @ApiModelProperty(value = "New password.")
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogonBody logonBody = (LogonBody) o;
    return Objects.equals(this.transactionDate, logonBody.transactionDate) &&
        Objects.equals(this.officeCode, logonBody.officeCode) &&
        Objects.equals(this.userId, logonBody.userId) &&
        Objects.equals(this.password, logonBody.password) &&
        Objects.equals(this.changePassword, logonBody.changePassword) &&
        Objects.equals(this.newPassword, logonBody.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionDate, officeCode, userId, password, changePassword, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogonBody {\n");
    
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    officeCode: ").append(toIndentedString(officeCode)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    changePassword: ").append(toIndentedString(changePassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

