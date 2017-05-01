package ph.com.bpi.api;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;


import ph.com.bpi.model.ObjectResponse;
import java.util.*;
import ph.com.bpi.model.AuthorizationBody;
import ph.com.bpi.model.AuthorizationSpecialRateBody;
import ph.com.bpi.model.AuthorizationTraderOverrideBody;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public abstract class AuthorizationApiService {
  
      public abstract Response authorizationPurchaseTransactionTypePost(String transactionType,String trdrFi,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response authorizationPurchaseTransactionTypeRefNoPost(String trdrFi, String transactionType, String refNo,
  			String brchCode, String currCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response authorizationSaleCancelTransPost(String refNmbr,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response authorizationSaleTransactionTypePost(String transactionType,String trdrFi,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response authorizationSaleTransactionTypeRefNoPost(String trdrFi, String transactionType, String refNo,
    			String brchCode, String currCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response authorizationSpecialRatePost(AuthorizationSpecialRateBody authorizationSpecialRate,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response authorizationTraderOverridePost(AuthorizationTraderOverrideBody authorizationTraderOverride,SecurityContext securityContext)
      throws NotFoundException;
  
}
