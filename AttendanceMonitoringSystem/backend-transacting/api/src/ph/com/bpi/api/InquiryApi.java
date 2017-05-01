package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.InquiryApiService;
import ph.com.bpi.api.factories.InquiryApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.TravelersCheck;
import ph.com.bpi.model.ErrorModel;
import ph.com.bpi.model.TransactionSummary;
import ph.com.bpi.model.InlineResponse200;
import ph.com.bpi.model.ManagersCheck;
import ph.com.bpi.model.InlineResponse2001;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/inquiry")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the inquiry API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class InquiryApi  {
   private final InquiryApiService delegate = InquiryApiServiceFactory.getInquiryApi();

    @GET
    @Path("/acceptedTravelersChecks")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns a list of accepted traveler's checks", response = TravelersCheck.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of traveler's checks and their details", response = TravelersCheck.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = TravelersCheck.class, responseContainer = "List") })

    public Response inquiryAcceptedTravelersChecksGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.inquiryAcceptedTravelersChecksGet(securityContext);
    }
    @GET
    @Path("/bulletinBoard/{transactionType}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns a list of special/important messages", response = String.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of messages sorted by date, descending", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = String.class, responseContainer = "List") })

    public Response inquiryBulletinBoardTransactionTypeGet(@ApiParam(value = "",required=true, allowableValues="forex, btsu, tmu") @PathParam("transactionType") String transactionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.inquiryBulletinBoardTransactionTypeGet(transactionType,securityContext);
    }
    @GET
    @Path("/clientHistoricalRecord")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns a list of transactions done by specified client.", response = TransactionSummary.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of client's record for the past 20 days", response = TransactionSummary.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = TransactionSummary.class, responseContainer = "List") })

    public Response inquiryClientHistoricalRecordGet(@ApiParam(value = "Either Purchase or Sale",required=true, allowableValues="purchase, sale") @QueryParam("transactionCategory") String transactionCategory,@ApiParam(value = "") @QueryParam("lastName") String lastName,@ApiParam(value = "") @QueryParam("firstName") String firstName,@ApiParam(value = "") @QueryParam("middleName") String middleName,@ApiParam(value = "") @QueryParam("fullName") String fullName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.inquiryClientHistoricalRecordGet(transactionCategory,lastName,firstName,middleName,fullName,securityContext);
    }
    @GET
    @Path("/income")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Income inquiry for BTSU Trading Unit only", response = InlineResponse200.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The income for the day. The income will be computed as the difference in Reference Rate against the Grant Rate", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = InlineResponse200.class) })

    public Response inquiryIncomeGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.inquiryIncomeGet(securityContext);
    }
    @GET
    @Path("/managersChecks/{transactionType}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns a list of issued Manager's Checks (MC)", response = ManagersCheck.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of issued Manager's Checks (MC)", response = ManagersCheck.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ManagersCheck.class, responseContainer = "List") })

    public Response inquiryManagersChecksTransactionTypeGet(@ApiParam(value = "",required=true, allowableValues="forex, btsu, tmu") @PathParam("transactionType") String transactionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.inquiryManagersChecksTransactionTypeGet(transactionType,securityContext);
    }
    @GET
    @Path("/rates")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Rate Inquiry for FOREX and BTSU trading", response = InlineResponse2001.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Buying and Selling rates at the time of inquiry, the bases for purchase and sale transactions.", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = InlineResponse2001.class) })

    public Response inquiryRatesGet(@ApiParam(value = "",required=true) @QueryParam("rateType") String rateType,@ApiParam(value = "",required=true) @QueryParam("transactionUnit") String transactionUnit,@ApiParam(value = "Three-letter currency code (ex: PHP, USD)",required=true) @QueryParam("currency") String currency,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.inquiryRatesGet(rateType,transactionUnit,currency,securityContext);
    }
}
