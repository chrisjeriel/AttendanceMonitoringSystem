package ph.com.bpi.api;


import ph.com.bpi.api.AuthorizationApiService;
import ph.com.bpi.api.factories.AuthorizationApiServiceFactory;

import io.swagger.annotations.ApiParam;

import ph.com.bpi.model.ObjectResponse;

import ph.com.bpi.model.AuthorizationBody;
import ph.com.bpi.model.AuthorizationSpecialRateBody;
import ph.com.bpi.model.AuthorizationTraderOverrideBody;

import java.util.List;
import ph.com.bpi.api.NotFoundException;


import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/authorization")


@io.swagger.annotations.Api(description = "the authorization API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class AuthorizationApi  {
   private final AuthorizationApiService delegate = AuthorizationApiServiceFactory.getAuthorizationApi();

    @GET
    @Path("/purchase/{transactionType}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Authorization - Purchase by Transaction Type", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response authorizationPurchaseTransactionTypePost(@ApiParam(value = "transaction type",required=true) @PathParam("transactionType") String transactionType,@ApiParam(value = "trdr_fi",required=true) @QueryParam("trdr_fi") String trdrFi,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.authorizationPurchaseTransactionTypePost(transactionType,trdrFi,securityContext);
    }
    @GET
    @Path("/purchase/{transactionType}/{refNo}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Authorization - Purchase by Transaction Type & Reference Number", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response authorizationPurchaseTransactionTypeRefNoPost(@ApiParam(value = "TRDR FI",required=true) @QueryParam("trdrFi") String trdrFi,@ApiParam(value = "transaction type",required=true) @PathParam("transactionType") String transactionType,@ApiParam(value = "reference number",required=true) @PathParam("refNo") String refNo,
    		@ApiParam(value = "BRCH CODE",required=true) @QueryParam("brchCode") String brchCode,@ApiParam(value = "CURR CODE",required=true) @QueryParam("currCode") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.authorizationPurchaseTransactionTypeRefNoPost(trdrFi,transactionType,refNo,brchCode,currCode,securityContext);
    }
    @POST
    @Path("/cancel-trans")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Authorization - Sale - Cancel Transaction", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response authorizationSaleCancelTransPost(@ApiParam(value = "reference number",required=true) @QueryParam("ref_nmbr") String refNmbr,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.authorizationSaleCancelTransPost(refNmbr,securityContext);
    }
    @GET
    @Path("/sale/{transactionType}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Authorization - Sale by Transaction Type", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response authorizationSaleTransactionTypePost(@ApiParam(value = "transaction type",required=true) @PathParam("transactionType") String transactionType,@ApiParam(value = "trdr_fi",required=true) @QueryParam("trdr_fi") String trdrFi,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.authorizationSaleTransactionTypePost(transactionType,trdrFi,securityContext);
    }
    @GET
    @Path("/sale/{transactionType}/{refNo}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Authorization - Sale by Transaction Type & Reference Number", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response authorizationSaleTransactionTypeRefNoPost(@ApiParam(value = "TRDR FI",required=true) @QueryParam("trdrFi") String trdrFi,@ApiParam(value = "transaction type",required=true) @PathParam("transactionType") String transactionType,@ApiParam(value = "reference number",required=true) @PathParam("refNo") String refNo,
    		@ApiParam(value = "BRCH CODE",required=true) @QueryParam("brchCode") String brchCode,@ApiParam(value = "CURR CODE",required=true) @QueryParam("currCode") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.authorizationSaleTransactionTypeRefNoPost(trdrFi,transactionType,refNo,brchCode,currCode,securityContext);
    }
    @POST
    @Path("/special-rate")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Authorization - Special Rate", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response authorizationSpecialRatePost(@ApiParam(value = "authorization special rate parameter object" ,required=true) AuthorizationSpecialRateBody authorizationSpecialRate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.authorizationSpecialRatePost(authorizationSpecialRate,securityContext);
    }
    @POST
    @Path("/trader-override")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Authorization - Trader Override", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response authorizationTraderOverridePost(@ApiParam(value = "authorization trader override parameter object" ,required=true) AuthorizationTraderOverrideBody authorizationTraderOverride,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.authorizationTraderOverridePost(authorizationTraderOverride,securityContext);
    }
}
