package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.CashFlowApiService;
import ph.com.bpi.api.factories.CashFlowApiServiceFactory;

import io.swagger.annotations.ApiParam;


import ph.com.bpi.model.CashFlowBody;
import java.util.*;
import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;



import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/cash-flow")


@io.swagger.annotations.Api(description = "the cash-flow API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class CashFlowApi  {
   private final CashFlowApiService delegate = CashFlowApiServiceFactory.getCashFlowApi();

    @POST
    @Path("/detail")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Cash Flow - Detail", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response cashFlowDetailPost(@ApiParam(value = "cash flow parameter object" ,required=true) CashFlowBody cashFlowDetail,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cashFlowDetailPost(cashFlowDetail,securityContext);
    }
    @GET
    @Path("/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Cash Flow - List", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response cashFlowListPost(@ApiParam(value = "branch code",required=true) @QueryParam("brch_code") String brchCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cashFlowListPost(brchCode,securityContext);
    }
}
