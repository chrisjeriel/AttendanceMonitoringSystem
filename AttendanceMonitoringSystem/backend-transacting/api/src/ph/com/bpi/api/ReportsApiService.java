package ph.com.bpi.api;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;

 

import ph.com.bpi.model.ErrorModel;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public abstract class ReportsApiService {
  
      public abstract Response reportsAcceptedTCsTransactionTypeGet(String transactionType,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response reportsDailySummaryTransactionTypeCategoryGet(String transactionType,String category,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response reportsErrorCorrectedTransactionTypeCategoryGet(String transactionType,String category,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response reportsIssuedMCsTransactionTypeGet(String transactionType,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response reportsPrintErrorCorrectedTransactionTypeCategoryGet(String transactionType,String category,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response reportsPrintIssuedMCsTransactionTypeGet(String transactionType,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response reportsPrintacceptedTCsTransactionTypeGet(String transactionType,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response reportsPrintdailySummaryTransactionTypeCategoryGet(String transactionType,String category,SecurityContext securityContext)
      throws NotFoundException;
  
}
