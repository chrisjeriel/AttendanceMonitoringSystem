package ph.com.bpi.api;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;

 

import ph.com.bpi.model.Failed;
import ph.com.bpi.model.Acceptedtclist;
import ph.com.bpi.model.Tclistprint;
import ph.com.bpi.model.Tclistprintinput;
import ph.com.bpi.model.BpiClient;
import ph.com.bpi.model.ErrorModel;
import ph.com.bpi.model.EquivalentAmtResult;
import ph.com.bpi.model.DataEntry;
import ph.com.bpi.model.ReferenceNumberSet;
import ph.com.bpi.model.TransactionCashAcceptanceSettlementDetails;
import ph.com.bpi.model.TransactionCashAcceptanceSettlementListItems;
import ph.com.bpi.model.InlineResponse2002;
import ph.com.bpi.model.CBGFXClientBody;
import ph.com.bpi.model.ObjectResponse;
import ph.com.bpi.model.CbgfxClientDetails;
import ph.com.bpi.model.CheckDepositAccountBody;
import ph.com.bpi.model.ComputedAmountsBody;
import ph.com.bpi.model.CurrencyCombination;
import ph.com.bpi.model.DailyDetailsBody;
import ph.com.bpi.model.DailyListBody;
import ph.com.bpi.model.Transactionlistsummary;
import ph.com.bpi.model.DataEntryBody;
import ph.com.bpi.model.DealRateBody;
import ph.com.bpi.model.DealRate;
import ph.com.bpi.model.InvisibleCode;
import ph.com.bpi.model.Issuedmclist;
import ph.com.bpi.model.TransactionSummary;
import ph.com.bpi.model.LocalOverrideBody;
import ph.com.bpi.model.MtsCode;
import ph.com.bpi.model.OverrideBody;
import ph.com.bpi.model.AcceptanceSettlementMode;
import ph.com.bpi.model.SpecialRequestDetailsBody;
import ph.com.bpi.model.SpecialRequestUpdateBody;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public abstract class TransactionApiService {
  
      public abstract Response transactionAcceptedTcListGet(String listIndc,Integer trdrFi,String tranUnit,String refNmbr,String proctag,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionAcceptedTcListPrintGet(Tclistprintinput tclistprintinput,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionBpiClientAccountNumberGet(String accountNumber,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionBtsuGetEquivalentAmtGet(Float requestRate,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionBtsuPurchaseDataEntryPost(DataEntry dataEntry,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionBtsuSaleDataEntryPost(DataEntry dataEntry,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionBtsuSaleOverridePost(DataEntry dataEntry,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionCashAcceptanceOrSettlementDetailsGet(String trdrFi,String tranIndc,String brchCode,String currCode,String refNmbr,String inqyType,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionCashAcceptanceOrSettlementListGet(String trdrFi,String tranIndc,String brchCode,String currCode,String refNmbr,String listType,String proctag,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionCashAcceptanceOrSettlementUpdatePost(String refNmbr,String atelVald,String stelVald,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionCbgfxClientSearchGet(CBGFXClientBody cBGFXClientBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionCbgfxClientSearchPost(String surname,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionCheckDepositAccountGet(CheckDepositAccountBody checkDepositAccount,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionClientAccountNumberIsPhpGet(Integer clntAcct,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionClientAccountNumberValidateGet(Integer clntAcct,Integer currAcct,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionComputedAmountsGet(ComputedAmountsBody computedAmountsBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionCurrencyCombinationsGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionCurrencyCombinationsGet_1(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionDailyDetailsPost(DailyDetailsBody dailyDetailsBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionDailyListGet(DailyListBody dailyListBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionDailyListSummaryGet(String tranIndc,Integer trdrFi,String refNmbr,Integer rqstType,String proctag,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionDataEntryPost(DataEntryBody dataEntryBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionDealRateGet(DealRateBody dealRateBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionDealRateGet_2(String fromCurrency,String toCurrency,String mode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionForexPurchaseDataEntryPost(DataEntry dataEntryForm,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionForexPurchaseFinalUpdatePost(DataEntry dataEntryForm,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionForexSaleCashAcceptancePost(DataEntry dataEntryForm,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionForexSaleDataEntryPost(DataEntry dataEntryForm,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionForexSaleOverridePost(DataEntry dataEntryForm,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionInvisibleCodesListGet(String transactionType,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionIssuedMcListGet(Integer trdrFi,String tranUnit,String mcSerno,String proctag,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionListGet(String transactionType,String referenceNo,Boolean isCorrected,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionLocalOverridePost(LocalOverrideBody localOverride,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionMcSettlementDetailsGet(String trdrFi,String tranIndc,String brchCode,String currCode,String refNmbr,String inqyType,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionMcSettlementListGet(String trdrFi,String tranIndc,String brchCode,String currCode,String refNmbr,String listType,String proctag,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionMcSettlementUpdatePost(String refNmbr,String mcNmbr,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionMcSettlementPost(String referenceNo,String mcNumber,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionMtsCodesMtsTypeGet(String mtsType,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionOrDetailsGet(String refNmbr,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionOverrideDetailsGet(OverrideBody overrideBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionOverrideListGet(OverrideBody overrideBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionOverrideUpdatePost(String refNmbr,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionPrintAdviceReferenceNoPost(String referenceNo,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionSettlementCodesGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionSpecialRequestDetailsGet(SpecialRequestDetailsBody specialRequestDetailsBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionSpecialRequestListGet(SpecialRequestDetailsBody specialRequestDetailsBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionSpecialRequestUpdatePost(SpecialRequestUpdateBody specialRequestUpdateBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionTellerValidationReferenceNoPost(String referenceNo,String acceptanceValidationCode,String settlementValidationCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionTmuPurchaseDataEntryPost(DataEntry tmuForm,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionTmuSaleDataEntryPost(DataEntry tmuForm,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionTmuSaleSpecialRequestPost(DataEntry tmuForm,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response transactionReferenceNoGet(String referenceNo,SecurityContext securityContext)
      throws NotFoundException;
  
}
