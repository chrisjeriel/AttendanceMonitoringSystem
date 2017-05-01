package ph.com.bpi.api;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;

import java.util.*;

import ph.com.bpi.model.hibernate.T0208;
import ph.com.bpi.model.hibernate.T0211;
import ph.com.bpi.model.hibernate.T0214;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;



import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public abstract class MaintenanceApiService {
  
      public abstract Response maintenanceAcceptanceSettlementEncodePut(AcceptanceSettlementBody acceptanceSettlementBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceAcceptanceSettlementEncodePost(AcceptanceSettlementBody acceptanceSettlementBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceAcceptanceSettlementListGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceApplicationCodeEncodePost(List<ApplicationCodeBody> applicationCodeBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceApplicationCodeListGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceLOASignatoriesListGet(String trdrFi, SecurityContext securityContext)
      throws NotFoundException;
      
      public abstract Response maintenanceLOASignatoriesEncodePost(String trdrFi, List<LoaSignatoriesBody> loaSignatoriesBody, SecurityContext securityContext)
      throws NotFoundException;
  
  
      public abstract Response maintenanceApprovingAuthorityLimitListGet(SecurityContext securityContext)
      throws NotFoundException;
      
      public abstract Response maintenanceBestBuySellGet(String trdrFi,String currCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceBestBuySellProcessPost(BuyAndSellBody buyAndSellBody,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response maintenanceTieredRateSprdProcessPost(TieredRateSprdBody tieredRateSprdBody,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response maintenanceBoardRateGet(String trdrFi,String tranId,String currCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceBoardRateProcessPost(BoardRateProcess boardRateProcess,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceBtsuAcceptPost(BtsuAcceptBody btsuAcceptBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceBtsuListGet(String trdrFi,String currCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceBtsuProcessPost(BtsuProcessBody btsuProcessBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceBulletinBoardGet(String trdrFi, SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceBulletinBoardPost(String trdrFi, String spclMsg,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceBuySellStListGet(String trdrFi,String currCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceBuySellStUpdatePost(List<T0208> buysellBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceOtcRateRateGet(String trdrFi,String tranId,String currCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceOtcRateRateProcessPost(OtcRateBody otcRateBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceOtcRateSpreadGet(String trdrFi,String tranId,String currCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceOtcRateSpreadProcessPost(OtcRateSpreadBody otcRateSpreadBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenancePreferredClientRateGet(String trdrFi,String currCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceRefRateGet(String trdrFi,String currCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceRefRatePhpListGet(String trdrFi,String currCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceRefRateUsdListGet(String trdrFi,String currCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceRefRateProcessPost(RefRateProcessBody refRateProcessBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceSpreadGet(String trdrFi,String spreads,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceSpreadProcessPost(List<SpreadProcessBody> spreadProcessBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceTieredRateRateGet(String trdrFi,String tranId,String currCode,String tierNmbr,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceTieredRateSprdGet(String trdrFi,String tranId,String currCode,String tierNmbr,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceTradingUnitGet(String trdrFi,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceTradingUnitEncodePut(TradingUnitEncode tradingUnitBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceTradingUnitEncodePost(TradingUnitEncode tradingUnitBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceTradingUnitEncodeDelete(TradingUnitEncode tradingUnitBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceTradingUnitListGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceTransactingUnitGet(String trdrFi,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceTransactingUnitEncodePost(TransactingUnitEncode transactingUnitBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceTransactingUnitEncodeDelete(TransactingUnitEncode transactingUnitBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceTransactingUnitListGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceTransactionMonitoringGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceTransactionMonitoringProcessPost(TransactionMonitoringBody transactionBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceUsVisaFeeGet(String trdrFi,String currCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceUsVisaFeeProcessPost(UsVisaFeeProcessBody usVisaFeeProcessBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceUserAccessEncodePut(UserAccessBody userAccessBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceUserAccessEncodePost(UserAccessBody userAccessBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceUserAccessEncodeDelete(UserAccessBody userAccessBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceUserAccessLoadGet(String tranFi,String brchCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceUserFileGet(String userId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response maintenanceValidCurrenciesEncodePut(ValidCurrecyEncodeBody validCurrencyEncode,SecurityContext securityContext)
    	      throws NotFoundException;
    	  
      
      public abstract Response maintenanceApprovingAuthorityLimitEncodePost(List<ApprovingAuthorityBody> approvingAuthorityBody,SecurityContext securityContext)
      throws NotFoundException;
    	  
    	      public abstract Response maintenanceValidCurrenciesEncodeDelete(ValidCurrecyEncodeBody validCurrencyEncode,SecurityContext securityContext)
    	      throws NotFoundException;
      public abstract Response maintenanceUserFileEncodePut(UserFileEncode approvingAuthorityBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceUserFileEncodePost(UserFileEncode approvingAuthorityBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceUserFileEncodeDelete(UserFileEncode approvingAuthorityBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceUserFileListGet(String tranFi,String brchCode,String userId,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceUserListPrintGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceValidCurrenciesEncodePost(ValidCurrecyEncodeBody validCurrencyEncode,SecurityContext securityContext)
      throws NotFoundException;

      public abstract Response maintenanceRefRatePhpProcessPost(List<T0214> refRateUsdProcessBody,SecurityContext securityContext)
      throws NotFoundException;
      
      public abstract Response maintenanceValidCurrenciesListGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceRefRateUsdProcessPost(List<T0211> refRateUsdProcessBody,SecurityContext securityContext)
      throws NotFoundException;
      
      public abstract Response maintenanceInvisibleCodeListGet(String trdrFi, String inviCode, SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceInvisibleCodePost(InvisibleCodeBody invisibleCodeBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response maintenanceInvisibleCodeDelete(InvisibleCodeBody invisibleCodeBody,SecurityContext securityContext)
      throws NotFoundException;
  
}
