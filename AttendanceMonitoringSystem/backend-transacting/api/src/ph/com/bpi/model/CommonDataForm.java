package ph.com.bpi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ph.com.bpi.model.BpiClient;
import ph.com.bpi.model.InvisibleCode;
import ph.com.bpi.model.PersonalInfo;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CommonDataForm   {
  
  private String referenceNo = null;


  public enum TransactionTypeEnum {
    FOREX_PURHCASE("forex_purhcase"),
    FOREX_SALE("forex_sale"),
    BTSU_PURCHASE("btsu_purchase"),
    BTSU_SALE("btsu_sale"),
    TMU_PURCHASE("tmu_purchase"),
    TMU_SALE("tmu_sale");

    private String value;

    TransactionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TransactionTypeEnum transactionType = null;
  private Long dataEntryId = null;
  private Boolean isCorporate = null;
  private String managingUnit = null;
  private Boolean isBpiClient = null;
  private BpiClient bpiClientDetails = null;
  private PersonalInfo clientInfo = null;
  private Boolean clientWithDocuments = null;
  private String transAmtCurrency = null;
  private Float transactionAmt = null;
  private String equivCurrency = null;
  private Float equivAmount = null;
  private Integer acceptanceMode = null;
  private String acceptanceReference = null;
  private Float acceptanceDocStamp = null;
  private String acceptanceCommission = null;
  private Float tcPostage = null;
  private Float dealRate = null;
  private Float requestRate = null;
  private Float netAmount = null;
  private String settlementReference = null;
  private Float settlementDocStamp = null;
  private String settlementCommission = null;
  private Boolean isCorporateBeneficiary = null;
  private PersonalInfo beneficiaryInfo = null;
  private InvisibleCode invisibleCode = null;
  private String specialMessage = null;
  private String acceptanceValidation = null;
  private String settlementValidation = null;

  
  /**
   * Transaction Reference Number
   **/
  
  @ApiModelProperty(value = "Transaction Reference Number")
  @JsonProperty("referenceNo")
  public String getReferenceNo() {
    return referenceNo;
  }
  public void setReferenceNo(String referenceNo) {
    this.referenceNo = referenceNo;
  }

  
  /**
   * Transaction Type
   **/
  
  @ApiModelProperty(value = "Transaction Type")
  @JsonProperty("transactionType")
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }
  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }

  
  /**
   * Data entry ID
   **/
  
  @ApiModelProperty(value = "Data entry ID")
  @JsonProperty("dataEntryId")
  public Long getDataEntryId() {
    return dataEntryId;
  }
  public void setDataEntryId(Long dataEntryId) {
    this.dataEntryId = dataEntryId;
  }

  
  /**
   * True if Corporate, False if Individual
   **/
  
  @ApiModelProperty(value = "True if Corporate, False if Individual")
  @JsonProperty("isCorporate")
  public Boolean getIsCorporate() {
    return isCorporate;
  }
  public void setIsCorporate(Boolean isCorporate) {
    this.isCorporate = isCorporate;
  }

  
  /**
   * Note: Managing Unit and Booking Unit is the same
   **/
  
  @ApiModelProperty(value = "Note: Managing Unit and Booking Unit is the same")
  @JsonProperty("managingUnit")
  public String getManagingUnit() {
    return managingUnit;
  }
  public void setManagingUnit(String managingUnit) {
    this.managingUnit = managingUnit;
  }

  
  /**
   * If client is walk-in, this is false. If set true, then bpiClientDetails is required.
   **/
  
  @ApiModelProperty(value = "If client is walk-in, this is false. If set true, then bpiClientDetails is required.")
  @JsonProperty("isBpiClient")
  public Boolean getIsBpiClient() {
    return isBpiClient;
  }
  public void setIsBpiClient(Boolean isBpiClient) {
    this.isBpiClient = isBpiClient;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bpiClientDetails")
  public BpiClient getBpiClientDetails() {
    return bpiClientDetails;
  }
  public void setBpiClientDetails(BpiClient bpiClientDetails) {
    this.bpiClientDetails = bpiClientDetails;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("clientInfo")
  public PersonalInfo getClientInfo() {
    return clientInfo;
  }
  public void setClientInfo(PersonalInfo clientInfo) {
    this.clientInfo = clientInfo;
  }

  
  /**
   * Client with documents?
   **/
  
  @ApiModelProperty(value = "Client with documents?")
  @JsonProperty("clientWithDocuments")
  public Boolean getClientWithDocuments() {
    return clientWithDocuments;
  }
  public void setClientWithDocuments(Boolean clientWithDocuments) {
    this.clientWithDocuments = clientWithDocuments;
  }

  
  /**
   * Transaction's initial currency (ex: AUD, USD, PHP). Determined by currency combinations.
   **/
  
  @ApiModelProperty(value = "Transaction's initial currency (ex: AUD, USD, PHP). Determined by currency combinations.")
  @JsonProperty("transAmtCurrency")
  public String getTransAmtCurrency() {
    return transAmtCurrency;
  }
  public void setTransAmtCurrency(String transAmtCurrency) {
    this.transAmtCurrency = transAmtCurrency;
  }

  
  /**
   * fx amount to be purhcased
   **/
  
  @ApiModelProperty(value = "fx amount to be purhcased")
  @JsonProperty("transactionAmt")
  public Float getTransactionAmt() {
    return transactionAmt;
  }
  public void setTransactionAmt(Float transactionAmt) {
    this.transactionAmt = transactionAmt;
  }

  
  /**
   * Transaction amount converted to other currency (ex: AUD, USD, PHP). Determined by currency combinations.
   **/
  
  @ApiModelProperty(value = "Transaction amount converted to other currency (ex: AUD, USD, PHP). Determined by currency combinations.")
  @JsonProperty("equivCurrency")
  public String getEquivCurrency() {
    return equivCurrency;
  }
  public void setEquivCurrency(String equivCurrency) {
    this.equivCurrency = equivCurrency;
  }

  
  /**
   * fx amount to be purhcased. System will automatically compute the equivalent amoutn based on the transacation amount and requested rate.
   **/
  
  @ApiModelProperty(value = "fx amount to be purhcased. System will automatically compute the equivalent amoutn based on the transacation amount and requested rate.")
  @JsonProperty("equivAmount")
  public Float getEquivAmount() {
    return equivAmount;
  }
  public void setEquivAmount(Float equivAmount) {
    this.equivAmount = equivAmount;
  }

  
  /**
   * Lol nakalimutan ko na to (for verification)
   **/
  
  @ApiModelProperty(value = "Lol nakalimutan ko na to (for verification)")
  @JsonProperty("acceptanceMode")
  public Integer getAcceptanceMode() {
    return acceptanceMode;
  }
  public void setAcceptanceMode(Integer acceptanceMode) {
    this.acceptanceMode = acceptanceMode;
  }

  
  /**
   * Acceptance Reference code
   **/
  
  @ApiModelProperty(value = "Acceptance Reference code")
  @JsonProperty("acceptanceReference")
  public String getAcceptanceReference() {
    return acceptanceReference;
  }
  public void setAcceptanceReference(String acceptanceReference) {
    this.acceptanceReference = acceptanceReference;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acceptanceDocStamp")
  public Float getAcceptanceDocStamp() {
    return acceptanceDocStamp;
  }
  public void setAcceptanceDocStamp(Float acceptanceDocStamp) {
    this.acceptanceDocStamp = acceptanceDocStamp;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("acceptanceCommission")
  public String getAcceptanceCommission() {
    return acceptanceCommission;
  }
  public void setAcceptanceCommission(String acceptanceCommission) {
    this.acceptanceCommission = acceptanceCommission;
  }

  
  /**
   * Traveler's Check Postage (?)
   **/
  
  @ApiModelProperty(value = "Traveler's Check Postage (?)")
  @JsonProperty("tcPostage")
  public Float getTcPostage() {
    return tcPostage;
  }
  public void setTcPostage(Float tcPostage) {
    this.tcPostage = tcPostage;
  }

  
  /**
   * Deal Rate
   **/
  
  @ApiModelProperty(value = "Deal Rate")
  @JsonProperty("dealRate")
  public Float getDealRate() {
    return dealRate;
  }
  public void setDealRate(Float dealRate) {
    this.dealRate = dealRate;
  }

  
  /**
   * Request Rate or Board Rate. Should be equal to Deal Rate
   **/
  
  @ApiModelProperty(value = "Request Rate or Board Rate. Should be equal to Deal Rate")
  @JsonProperty("requestRate")
  public Float getRequestRate() {
    return requestRate;
  }
  public void setRequestRate(Float requestRate) {
    this.requestRate = requestRate;
  }

  
  /**
   * Net Amount
   **/
  
  @ApiModelProperty(value = "Net Amount")
  @JsonProperty("netAmount")
  public Float getNetAmount() {
    return netAmount;
  }
  public void setNetAmount(Float netAmount) {
    this.netAmount = netAmount;
  }

  
  /**
   * Settlement reference Code
   **/
  
  @ApiModelProperty(value = "Settlement reference Code")
  @JsonProperty("settlementReference")
  public String getSettlementReference() {
    return settlementReference;
  }
  public void setSettlementReference(String settlementReference) {
    this.settlementReference = settlementReference;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("settlementDocStamp")
  public Float getSettlementDocStamp() {
    return settlementDocStamp;
  }
  public void setSettlementDocStamp(Float settlementDocStamp) {
    this.settlementDocStamp = settlementDocStamp;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("settlementCommission")
  public String getSettlementCommission() {
    return settlementCommission;
  }
  public void setSettlementCommission(String settlementCommission) {
    this.settlementCommission = settlementCommission;
  }

  
  /**
   * Value is false if beneficiary is individual
   **/
  
  @ApiModelProperty(value = "Value is false if beneficiary is individual")
  @JsonProperty("isCorporateBeneficiary")
  public Boolean getIsCorporateBeneficiary() {
    return isCorporateBeneficiary;
  }
  public void setIsCorporateBeneficiary(Boolean isCorporateBeneficiary) {
    this.isCorporateBeneficiary = isCorporateBeneficiary;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("beneficiaryInfo")
  public PersonalInfo getBeneficiaryInfo() {
    return beneficiaryInfo;
  }
  public void setBeneficiaryInfo(PersonalInfo beneficiaryInfo) {
    this.beneficiaryInfo = beneficiaryInfo;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("invisibleCode")
  public InvisibleCode getInvisibleCode() {
    return invisibleCode;
  }
  public void setInvisibleCode(InvisibleCode invisibleCode) {
    this.invisibleCode = invisibleCode;
  }

  
  /**
   * For Special rate, this is a mandatory field
   **/
  
  @ApiModelProperty(value = "For Special rate, this is a mandatory field")
  @JsonProperty("specialMessage")
  public String getSpecialMessage() {
    return specialMessage;
  }
  public void setSpecialMessage(String specialMessage) {
    this.specialMessage = specialMessage;
  }

  
  /**
   * Teller's acceptance validation
   **/
  
  @ApiModelProperty(value = "Teller's acceptance validation")
  @JsonProperty("acceptanceValidation")
  public String getAcceptanceValidation() {
    return acceptanceValidation;
  }
  public void setAcceptanceValidation(String acceptanceValidation) {
    this.acceptanceValidation = acceptanceValidation;
  }

  
  /**
   * Teller's settlement validation
   **/
  
  @ApiModelProperty(value = "Teller's settlement validation")
  @JsonProperty("settlementValidation")
  public String getSettlementValidation() {
    return settlementValidation;
  }
  public void setSettlementValidation(String settlementValidation) {
    this.settlementValidation = settlementValidation;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonDataForm commonDataForm = (CommonDataForm) o;
    return Objects.equals(referenceNo, commonDataForm.referenceNo) &&
        Objects.equals(transactionType, commonDataForm.transactionType) &&
        Objects.equals(dataEntryId, commonDataForm.dataEntryId) &&
        Objects.equals(isCorporate, commonDataForm.isCorporate) &&
        Objects.equals(managingUnit, commonDataForm.managingUnit) &&
        Objects.equals(isBpiClient, commonDataForm.isBpiClient) &&
        Objects.equals(bpiClientDetails, commonDataForm.bpiClientDetails) &&
        Objects.equals(clientInfo, commonDataForm.clientInfo) &&
        Objects.equals(clientWithDocuments, commonDataForm.clientWithDocuments) &&
        Objects.equals(transAmtCurrency, commonDataForm.transAmtCurrency) &&
        Objects.equals(transactionAmt, commonDataForm.transactionAmt) &&
        Objects.equals(equivCurrency, commonDataForm.equivCurrency) &&
        Objects.equals(equivAmount, commonDataForm.equivAmount) &&
        Objects.equals(acceptanceMode, commonDataForm.acceptanceMode) &&
        Objects.equals(acceptanceReference, commonDataForm.acceptanceReference) &&
        Objects.equals(acceptanceDocStamp, commonDataForm.acceptanceDocStamp) &&
        Objects.equals(acceptanceCommission, commonDataForm.acceptanceCommission) &&
        Objects.equals(tcPostage, commonDataForm.tcPostage) &&
        Objects.equals(dealRate, commonDataForm.dealRate) &&
        Objects.equals(requestRate, commonDataForm.requestRate) &&
        Objects.equals(netAmount, commonDataForm.netAmount) &&
        Objects.equals(settlementReference, commonDataForm.settlementReference) &&
        Objects.equals(settlementDocStamp, commonDataForm.settlementDocStamp) &&
        Objects.equals(settlementCommission, commonDataForm.settlementCommission) &&
        Objects.equals(isCorporateBeneficiary, commonDataForm.isCorporateBeneficiary) &&
        Objects.equals(beneficiaryInfo, commonDataForm.beneficiaryInfo) &&
        Objects.equals(invisibleCode, commonDataForm.invisibleCode) &&
        Objects.equals(specialMessage, commonDataForm.specialMessage) &&
        Objects.equals(acceptanceValidation, commonDataForm.acceptanceValidation) &&
        Objects.equals(settlementValidation, commonDataForm.settlementValidation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceNo, transactionType, dataEntryId, isCorporate, managingUnit, isBpiClient, bpiClientDetails, clientInfo, clientWithDocuments, transAmtCurrency, transactionAmt, equivCurrency, equivAmount, acceptanceMode, acceptanceReference, acceptanceDocStamp, acceptanceCommission, tcPostage, dealRate, requestRate, netAmount, settlementReference, settlementDocStamp, settlementCommission, isCorporateBeneficiary, beneficiaryInfo, invisibleCode, specialMessage, acceptanceValidation, settlementValidation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonDataForm {\n");
    
    sb.append("    referenceNo: ").append(toIndentedString(referenceNo)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    dataEntryId: ").append(toIndentedString(dataEntryId)).append("\n");
    sb.append("    isCorporate: ").append(toIndentedString(isCorporate)).append("\n");
    sb.append("    managingUnit: ").append(toIndentedString(managingUnit)).append("\n");
    sb.append("    isBpiClient: ").append(toIndentedString(isBpiClient)).append("\n");
    sb.append("    bpiClientDetails: ").append(toIndentedString(bpiClientDetails)).append("\n");
    sb.append("    clientInfo: ").append(toIndentedString(clientInfo)).append("\n");
    sb.append("    clientWithDocuments: ").append(toIndentedString(clientWithDocuments)).append("\n");
    sb.append("    transAmtCurrency: ").append(toIndentedString(transAmtCurrency)).append("\n");
    sb.append("    transactionAmt: ").append(toIndentedString(transactionAmt)).append("\n");
    sb.append("    equivCurrency: ").append(toIndentedString(equivCurrency)).append("\n");
    sb.append("    equivAmount: ").append(toIndentedString(equivAmount)).append("\n");
    sb.append("    acceptanceMode: ").append(toIndentedString(acceptanceMode)).append("\n");
    sb.append("    acceptanceReference: ").append(toIndentedString(acceptanceReference)).append("\n");
    sb.append("    acceptanceDocStamp: ").append(toIndentedString(acceptanceDocStamp)).append("\n");
    sb.append("    acceptanceCommission: ").append(toIndentedString(acceptanceCommission)).append("\n");
    sb.append("    tcPostage: ").append(toIndentedString(tcPostage)).append("\n");
    sb.append("    dealRate: ").append(toIndentedString(dealRate)).append("\n");
    sb.append("    requestRate: ").append(toIndentedString(requestRate)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    settlementReference: ").append(toIndentedString(settlementReference)).append("\n");
    sb.append("    settlementDocStamp: ").append(toIndentedString(settlementDocStamp)).append("\n");
    sb.append("    settlementCommission: ").append(toIndentedString(settlementCommission)).append("\n");
    sb.append("    isCorporateBeneficiary: ").append(toIndentedString(isCorporateBeneficiary)).append("\n");
    sb.append("    beneficiaryInfo: ").append(toIndentedString(beneficiaryInfo)).append("\n");
    sb.append("    invisibleCode: ").append(toIndentedString(invisibleCode)).append("\n");
    sb.append("    specialMessage: ").append(toIndentedString(specialMessage)).append("\n");
    sb.append("    acceptanceValidation: ").append(toIndentedString(acceptanceValidation)).append("\n");
    sb.append("    settlementValidation: ").append(toIndentedString(settlementValidation)).append("\n");
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

