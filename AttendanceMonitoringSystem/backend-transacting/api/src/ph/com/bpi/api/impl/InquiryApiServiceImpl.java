package ph.com.bpi.api.impl;

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
public class InquiryApiServiceImpl extends InquiryApiService {
  
      @Override
      public Response inquiryAcceptedTravelersChecksGet(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response inquiryBulletinBoardTransactionTypeGet(String transactionType,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response inquiryClientHistoricalRecordGet(String transactionCategory,String lastName,String firstName,String middleName,String fullName,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response inquiryIncomeGet(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response inquiryManagersChecksTransactionTypeGet(String transactionType,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response inquiryRatesGet(String rateType,String transactionUnit,String currency,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
}
