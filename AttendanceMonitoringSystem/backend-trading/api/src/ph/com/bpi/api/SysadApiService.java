package ph.com.bpi.api;

import ph.com.bpi.model.*;

import ph.com.bpi.model.CutoffTimeErrorCheckBody;
import ph.com.bpi.model.CutoffTimeRegularSquaringBody;
import ph.com.bpi.model.SysadDocStampsBody;
import ph.com.bpi.model.SysadInterdayPositionLimitsBody;
import ph.com.bpi.model.SysadTransactionAmountSettingBody;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public abstract class SysadApiService {
  
	  public abstract Response sysadCutoffTimeOverrideCheckGet(String trdrFi,SecurityContext securityContext)
		      throws NotFoundException;
	
      public abstract Response sysadCutoffTimeOverrideCheckPost(CutoffTimeErrorCheckBody cutoffTimeErrorCheck,SecurityContext securityContext)
      throws NotFoundException;
    	  
      public abstract Response sysadBpiBfbSettlementGet(String trdrFi, String currCode, SecurityContext securityContext)
    	      throws NotFoundException;
    	  
      public abstract Response sysadBpiBfbSettlementPut(BpiBfbSettlementBody bpiBfbSettlementBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sysadBpiBfbSettlementPost(BpiBfbSettlementBody bpiBfbSettlementBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sysadBpiBfbSettlementDelete(BpiBfbSettlementBody bpiBfbSettlementBody,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sysadDocStampPostageCommissionGet(String modeCode,String trdrFi,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sysadDocStampPostageCommissionPut(DocStampPostageCommissionBody docStampPostageCommissionBody,SecurityContext securityContext)
      throws NotFoundException;
    	  
      public abstract Response sysadCutoffTimeRegularSquaringGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sysadCutoffTimeRegularSquaringPost(CutoffTimeRegularSquaringBody cutoffTimeRegularSquaring,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sysadCutoffTimeRegularSquaringPatch(CutoffTimeRegularSquaringBody cutoffTimeRegularSquaring,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sysadCutoffTimeRegularSquaringDelete(CutoffTimeRegularSquaringBody cutoffTimeRegularSquaring,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sysadDocStampPostageCommissionPost(List<SysadDocStampsBody> sysadDocStamps,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sysadIntradayPositionLimitsGet(SecurityContext securityContext)
    	      throws NotFoundException;
      
      public abstract Response sysadIntradayPositionLimitsPost(SysadInterdayPositionLimitsBody sysadInterdayPositionLimits,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sysadIntradayPositionLimitsDelete(SysadInterdayPositionLimitsBody sysadInterdayPositionLimits,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sysadIntradayPositionLimitsPatch(SysadInterdayPositionLimitsBody sysadInterdayPositionLimits,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sysadTransactionAmountSettingsGet(String trdrFi, String currCode, SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sysadTransactionAmountSettingsPatch(SysadTransactionAmountSettingBody sysadTransactionAmountSetting,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response sysadTransactionAmountSettingsAllGet(SecurityContext securityContext)
      throws NotFoundException;
  
}
