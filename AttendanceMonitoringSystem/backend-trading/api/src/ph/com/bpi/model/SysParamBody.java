package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * SysParamBody
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class SysParamBody   {
  private String sysName = null;

  private String version = null;

  private String mfRegion = null;

  private String mfApplid = null;

  private String tranId = null;

  private String prevDate = null;

  private String traderFi = null;

  private String rateOvrd = null;

  private String tranOvrd = null;

  private String lockRate = null;

  private String sysTest = null;

  private String sysOffc = null;

  private String valdUser = null;

  private String retDays = null;

  private String sysTimer = null;

  private String sysAlarm01 = null;

  private String sysAlarm02 = null;

  public SysParamBody sysName(String sysName) {
    this.sysName = sysName;
    return this;
  }

   /**
   * System Name.
   * @return sysName
  **/
  @ApiModelProperty(value = "System Name.")
  public String getSysName() {
    return sysName;
  }

  public void setSysName(String sysName) {
    this.sysName = sysName;
  }

  public SysParamBody version(String version) {
    this.version = version;
    return this;
  }

   /**
   * System version.
   * @return version
  **/
  @ApiModelProperty(value = "System version.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public SysParamBody mfRegion(String mfRegion) {
    this.mfRegion = mfRegion;
    return this;
  }

   /**
   * MFRegion.
   * @return mfRegion
  **/
  @ApiModelProperty(value = "MFRegion.")
  public String getMfRegion() {
    return mfRegion;
  }

  public void setMfRegion(String mfRegion) {
    this.mfRegion = mfRegion;
  }

  public SysParamBody mfApplid(String mfApplid) {
    this.mfApplid = mfApplid;
    return this;
  }

   /**
   * MFApplid.
   * @return mfApplid
  **/
  @ApiModelProperty(value = "MFApplid.")
  public String getMfApplid() {
    return mfApplid;
  }

  public void setMfApplid(String mfApplid) {
    this.mfApplid = mfApplid;
  }

  public SysParamBody tranId(String tranId) {
    this.tranId = tranId;
    return this;
  }

   /**
   * TRANID.
   * @return tranId
  **/
  @ApiModelProperty(value = "TRANID.")
  public String getTranId() {
    return tranId;
  }

  public void setTranId(String tranId) {
    this.tranId = tranId;
  }

  public SysParamBody prevDate(String prevDate) {
    this.prevDate = prevDate;
    return this;
  }

   /**
   * PREVDATE.
   * @return prevDate
  **/
  @ApiModelProperty(value = "PREVDATE.")
  public String getPrevDate() {
    return prevDate;
  }

  public void setPrevDate(String prevDate) {
    this.prevDate = prevDate;
  }

  public SysParamBody traderFi(String traderFi) {
    this.traderFi = traderFi;
    return this;
  }

   /**
   * TRADERFI.
   * @return traderFi
  **/
  @ApiModelProperty(value = "TRADERFI.")
  public String getTraderFi() {
    return traderFi;
  }

  public void setTraderFi(String traderFi) {
    this.traderFi = traderFi;
  }

  public SysParamBody rateOvrd(String rateOvrd) {
    this.rateOvrd = rateOvrd;
    return this;
  }

   /**
   * RATE_OVRD.
   * @return rateOvrd
  **/
  @ApiModelProperty(value = "RATE_OVRD.")
  public String getRateOvrd() {
    return rateOvrd;
  }

  public void setRateOvrd(String rateOvrd) {
    this.rateOvrd = rateOvrd;
  }

  public SysParamBody tranOvrd(String tranOvrd) {
    this.tranOvrd = tranOvrd;
    return this;
  }

   /**
   * TRAN_OVRD.
   * @return tranOvrd
  **/
  @ApiModelProperty(value = "TRAN_OVRD.")
  public String getTranOvrd() {
    return tranOvrd;
  }

  public void setTranOvrd(String tranOvrd) {
    this.tranOvrd = tranOvrd;
  }

  public SysParamBody lockRate(String lockRate) {
    this.lockRate = lockRate;
    return this;
  }

   /**
   * LOCK_RATE
   * @return lockRate
  **/
  @ApiModelProperty(value = "LOCK_RATE")
  public String getLockRate() {
    return lockRate;
  }

  public void setLockRate(String lockRate) {
    this.lockRate = lockRate;
  }

  public SysParamBody sysTest(String sysTest) {
    this.sysTest = sysTest;
    return this;
  }

   /**
   * SYSTEST.
   * @return sysTest
  **/
  @ApiModelProperty(value = "SYSTEST.")
  public String getSysTest() {
    return sysTest;
  }

  public void setSysTest(String sysTest) {
    this.sysTest = sysTest;
  }

  public SysParamBody sysOffc(String sysOffc) {
    this.sysOffc = sysOffc;
    return this;
  }

   /**
   * SYSOFFC.
   * @return sysOffc
  **/
  @ApiModelProperty(value = "SYSOFFC.")
  public String getSysOffc() {
    return sysOffc;
  }

  public void setSysOffc(String sysOffc) {
    this.sysOffc = sysOffc;
  }

  public SysParamBody valdUser(String valdUser) {
    this.valdUser = valdUser;
    return this;
  }

   /**
   * VALD_USR.
   * @return valdUser
  **/
  @ApiModelProperty(value = "VALD_USR.")
  public String getValdUser() {
    return valdUser;
  }

  public void setValdUser(String valdUser) {
    this.valdUser = valdUser;
  }

  public SysParamBody retDays(String retDays) {
    this.retDays = retDays;
    return this;
  }

   /**
   * RETDAYS.
   * @return retDays
  **/
  @ApiModelProperty(value = "RETDAYS.")
  public String getRetDays() {
    return retDays;
  }

  public void setRetDays(String retDays) {
    this.retDays = retDays;
  }

  public SysParamBody sysTimer(String sysTimer) {
    this.sysTimer = sysTimer;
    return this;
  }

   /**
   * SYSTIMER.
   * @return sysTimer
  **/
  @ApiModelProperty(value = "SYSTIMER.")
  public String getSysTimer() {
    return sysTimer;
  }

  public void setSysTimer(String sysTimer) {
    this.sysTimer = sysTimer;
  }

  public SysParamBody sysAlarm01(String sysAlarm01) {
    this.sysAlarm01 = sysAlarm01;
    return this;
  }

   /**
   * SYSALARM01.
   * @return sysAlarm01
  **/
  @ApiModelProperty(value = "SYSALARM01.")
  public String getSysAlarm01() {
    return sysAlarm01;
  }

  public void setSysAlarm01(String sysAlarm01) {
    this.sysAlarm01 = sysAlarm01;
  }

  public SysParamBody sysAlarm02(String sysAlarm02) {
    this.sysAlarm02 = sysAlarm02;
    return this;
  }

   /**
   * SYSALARM02.
   * @return sysAlarm02
  **/
  @ApiModelProperty(value = "SYSALARM02.")
  public String getSysAlarm02() {
    return sysAlarm02;
  }

  public void setSysAlarm02(String sysAlarm02) {
    this.sysAlarm02 = sysAlarm02;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SysParamBody sysParamBody = (SysParamBody) o;
    return Objects.equals(this.sysName, sysParamBody.sysName) &&
        Objects.equals(this.version, sysParamBody.version) &&
        Objects.equals(this.mfRegion, sysParamBody.mfRegion) &&
        Objects.equals(this.mfApplid, sysParamBody.mfApplid) &&
        Objects.equals(this.tranId, sysParamBody.tranId) &&
        Objects.equals(this.prevDate, sysParamBody.prevDate) &&
        Objects.equals(this.traderFi, sysParamBody.traderFi) &&
        Objects.equals(this.rateOvrd, sysParamBody.rateOvrd) &&
        Objects.equals(this.tranOvrd, sysParamBody.tranOvrd) &&
        Objects.equals(this.lockRate, sysParamBody.lockRate) &&
        Objects.equals(this.sysTest, sysParamBody.sysTest) &&
        Objects.equals(this.sysOffc, sysParamBody.sysOffc) &&
        Objects.equals(this.valdUser, sysParamBody.valdUser) &&
        Objects.equals(this.retDays, sysParamBody.retDays) &&
        Objects.equals(this.sysTimer, sysParamBody.sysTimer) &&
        Objects.equals(this.sysAlarm01, sysParamBody.sysAlarm01) &&
        Objects.equals(this.sysAlarm02, sysParamBody.sysAlarm02);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sysName, version, mfRegion, mfApplid, tranId, prevDate, traderFi, rateOvrd, tranOvrd, lockRate, sysTest, sysOffc, valdUser, retDays, sysTimer, sysAlarm01, sysAlarm02);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SysParamBody {\n");
    
    sb.append("    sysName: ").append(toIndentedString(sysName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    mfRegion: ").append(toIndentedString(mfRegion)).append("\n");
    sb.append("    mfApplid: ").append(toIndentedString(mfApplid)).append("\n");
    sb.append("    tranId: ").append(toIndentedString(tranId)).append("\n");
    sb.append("    prevDate: ").append(toIndentedString(prevDate)).append("\n");
    sb.append("    traderFi: ").append(toIndentedString(traderFi)).append("\n");
    sb.append("    rateOvrd: ").append(toIndentedString(rateOvrd)).append("\n");
    sb.append("    tranOvrd: ").append(toIndentedString(tranOvrd)).append("\n");
    sb.append("    lockRate: ").append(toIndentedString(lockRate)).append("\n");
    sb.append("    sysTest: ").append(toIndentedString(sysTest)).append("\n");
    sb.append("    sysOffc: ").append(toIndentedString(sysOffc)).append("\n");
    sb.append("    valdUser: ").append(toIndentedString(valdUser)).append("\n");
    sb.append("    retDays: ").append(toIndentedString(retDays)).append("\n");
    sb.append("    sysTimer: ").append(toIndentedString(sysTimer)).append("\n");
    sb.append("    sysAlarm01: ").append(toIndentedString(sysAlarm01)).append("\n");
    sb.append("    sysAlarm02: ").append(toIndentedString(sysAlarm02)).append("\n");
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

