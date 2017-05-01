package ph.com.bpi.api;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;

 

import ph.com.bpi.model.TravelersCheck;
import ph.com.bpi.model.ErrorModel;
import ph.com.bpi.model.TransactionSummary;
import ph.com.bpi.model.InlineResponse200;
import ph.com.bpi.model.ManagersCheck;
import ph.com.bpi.model.InlineResponse2001;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public abstract class InquiryApiService {
  
      public abstract Response inquiryAcceptedTravelersChecksGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response inquiryBulletinBoardTransactionTypeGet(String transactionType,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response inquiryClientHistoricalRecordGet(String transactionCategory,String lastName,String firstName,String middleName,String fullName,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response inquiryIncomeGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response inquiryManagersChecksTransactionTypeGet(String transactionType,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response inquiryRatesGet(String rateType,String transactionUnit,String currency,SecurityContext securityContext)
      throws NotFoundException;
  
}
