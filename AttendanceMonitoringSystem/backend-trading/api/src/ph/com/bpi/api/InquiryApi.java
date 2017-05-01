package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.InquiryApiService;
import ph.com.bpi.api.factories.InquiryApiServiceFactory;

import io.swagger.annotations.ApiParam;



import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;



import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/inquiry")


@io.swagger.annotations.Api(description = "the inquiry API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class InquiryApi  {
   private final InquiryApiService delegate = InquiryApiServiceFactory.getInquiryApi();

    @GET
    @Path("/purchase")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Inquiry - Purchase by Transaction Type", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response inquiryPurchaseTransactionTypePost(@ApiParam(value = "transaction type",required=true) @QueryParam("tran_type") String transactionType,@ApiParam(value = "trdr_fi",required=true) @QueryParam("trdr_fi") String trdrFi,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.inquiryPurchaseTransactionTypePost(transactionType,trdrFi,securityContext);
    }
    @GET
    @Path("/purchase/ref")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Inquiry - Purchase by Transaction Type & Reference Number", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response inquiryPurchaseTransactionTypeRefNoPost(@ApiParam(value = "transaction type",required=true) @QueryParam("tran_type") String transactionType,@ApiParam(value = "reference number",required=true) @QueryParam("ref_no") String refNo,@ApiParam(value = "trdr_fi",required=true) @QueryParam("trdr_fi") String trdrFi,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.inquiryPurchaseTransactionTypeRefNoPost(transactionType,refNo,trdrFi,securityContext);
    }
    @GET
    @Path("/sale")
  
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Inquiry - Sale by Transaction Type", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response inquirySaleTransactionTypePost(@ApiParam(value = "transaction type",required=true) @QueryParam("tran_type") String transactionType,@ApiParam(value = "trdr_fi",required=true) @QueryParam("trdr_fi") String trdrFi,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.inquirySaleTransactionTypePost(transactionType,trdrFi,securityContext);
    }
    @GET
    @Path("/sale/ref")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Inquiry - Sale by Transaction Type & Reference Number", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response inquirySaleTransactionTypeRefNoPost(@ApiParam(value = "transaction type",required=true) @QueryParam("tran_type") String transactionType,@ApiParam(value = "reference number",required=true) @QueryParam("ref_no") String refNo,@ApiParam(value = "trdr_fi",required=true) @QueryParam("trdr_fi") String trdrFi,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.inquirySaleTransactionTypeRefNoPost(transactionType,refNo,trdrFi,securityContext);
    }
}
