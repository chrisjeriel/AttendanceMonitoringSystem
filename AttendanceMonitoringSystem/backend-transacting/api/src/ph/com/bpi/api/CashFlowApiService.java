package ph.com.bpi.api;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;

 

import ph.com.bpi.model.Failed;
import ph.com.bpi.model.Cashflowdetails;
import ph.com.bpi.model.Cashflowsummary;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public abstract class CashFlowApiService {
  
      public abstract Response cashFlowDetailsGet(String tranFi,String tranUnit,String flowIndc,String currCode,String seqNo,String proctag,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response cashFlowDetailsSummaryGet(String tranFi,String tranUnit,String currCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response cashFlowListSummaryGet(String tranFi,String tranUnit,String currCode,String proctag,SecurityContext securityContext)
      throws NotFoundException;

    public abstract Response cashFlowUpdatePost(String tranFi,String tranUnit,String currCode,String amount,String tag,SecurityContext securityContext) throws NotFoundException;
  
}
