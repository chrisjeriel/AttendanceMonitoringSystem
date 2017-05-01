package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.CashFlowApiService;
import ph.com.bpi.api.factories.CashFlowApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.Failed;
import ph.com.bpi.model.Cashflowdetails;
import ph.com.bpi.model.Cashflowsummary;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/cash-flow")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the cash-flow API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CashFlowApi  {
   private final CashFlowApiService delegate = CashFlowApiServiceFactory.getCashFlowApi();

    @GET
    @Path("/details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns cashflow details", response = Cashflowdetails.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Cashflowdetails.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Cashflowdetails.class, responseContainer = "List") })

    public Response cashFlowDetailsGet(@ApiParam(value = "",required=true) @QueryParam("tran_fi") String tranFi,@ApiParam(value = "",required=true) @QueryParam("tran_unit") String tranUnit,@ApiParam(value = "",required=true) @QueryParam("flow_indc") String flowIndc,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@ApiParam(value = "",required=true) @QueryParam("seq_no") String seqNo,@ApiParam(value = "",required=true) @QueryParam("proctag") String proctag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cashFlowDetailsGet(tranFi,tranUnit,flowIndc,currCode,seqNo,proctag,securityContext);
    }
    @GET
    @Path("/details-summary")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns cashflow details summary", response = Cashflowsummary.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Cashflowsummary.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Cashflowsummary.class, responseContainer = "List") })

    public Response cashFlowDetailsSummaryGet(@ApiParam(value = "",required=true) @QueryParam("tran_fi") String tranFi,@ApiParam(value = "",required=true) @QueryParam("tran_unit") String tranUnit,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cashFlowDetailsSummaryGet(tranFi,tranUnit,currCode,securityContext);
    }
    @GET
    @Path("/list-summary")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns list summary of cash flow", response = Cashflowsummary.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Cashflowsummary.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Cashflowsummary.class, responseContainer = "List") })

    public Response cashFlowListSummaryGet(@ApiParam(value = "",required=true) @QueryParam("tran_fi") String tranFi,@ApiParam(value = "",required=true) @QueryParam("tran_unit") String tranUnit,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@ApiParam(value = "",required=true) @QueryParam("proctag") String proctag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cashFlowListSummaryGet(tranFi,tranUnit,currCode,proctag,securityContext);
    }
    @POST
    @Path("/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Cash flow", notes = "Update Cash flow", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })
    public Response cashFlowUpdatePost(@ApiParam(value = "",required=true) @QueryParam("tran_fi") String tranFi
,@ApiParam(value = "",required=true) @QueryParam("tran_unit") String tranUnit
,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode
,@ApiParam(value = "",required=true) @QueryParam("amount") String amount
,@ApiParam(value = "",required=true) @QueryParam("tag") String tag
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cashFlowUpdatePost(tranFi,tranUnit,currCode,amount,tag,securityContext);
    }
}
