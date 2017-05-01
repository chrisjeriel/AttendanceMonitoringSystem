package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.SysadApiService;
import ph.com.bpi.api.factories.SysadApiServiceFactory;

import io.swagger.annotations.ApiParam;

import ph.com.bpi.model.ObjectResponse;
import ph.com.bpi.model.CutoffTimeErrorCheckBody;
import ph.com.bpi.model.CutoffTimeRegularSquaringBody;
import ph.com.bpi.model.SysadDocStampsBody;
import ph.com.bpi.model.SysadInterdayPositionLimitsBody;
import ph.com.bpi.model.SysadTransactionAmountSettingBody;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/sysad")


@io.swagger.annotations.Api(description = "the sysad API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SysadApi  {
   private final SysadApiService delegate = SysadApiServiceFactory.getSysadApi();

    @GET
    @Path("/cutoff-time/override-check")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Cut-off Time and Override Check - SPP", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadCutoffTimeOverrideCheckGet(@ApiParam(value = "TRDR FI",required=true) @QueryParam("trdrFi") String trdrFi,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadCutoffTimeOverrideCheckGet(trdrFi,securityContext);
    }
    @POST
    @Path("/cutoff-time/override-check")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Cut-off Time and Override Check - SPP", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadCutoffTimeOverrideCheckPost(@ApiParam(value = "parameter object" ,required=true) CutoffTimeErrorCheckBody cutoffTimeErrorCheck,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadCutoffTimeOverrideCheckPost(cutoffTimeErrorCheck,securityContext);
    }
    @GET
    @Path("/cutoff-time/regular-squaring")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Cut-off Time for Regular Squaring - View", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadCutoffTimeRegularSquaringGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadCutoffTimeRegularSquaringGet(securityContext);
    }
    @POST
    @Path("/cutoff-time/regular-squaring")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Cut-off Time for Regular Squaring - View", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadCutoffTimeRegularSquaringPost(@ApiParam(value = "parameter object" ,required=true) CutoffTimeRegularSquaringBody cutoffTimeRegularSquaring,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadCutoffTimeRegularSquaringPost(cutoffTimeRegularSquaring,securityContext);
    }
    @PUT
    @Path("/cutoff-time/regular-squaring")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Cut-off Time for Regular Squaring - View", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadCutoffTimeRegularSquaringPatch(@ApiParam(value = "parameter object" ,required=true) CutoffTimeRegularSquaringBody cutoffTimeRegularSquaring,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadCutoffTimeRegularSquaringPatch(cutoffTimeRegularSquaring,securityContext);
    }
    @DELETE
    @Path("/cutoff-time/regular-squaring")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Cut-off Time for Regular Squaring - View", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadCutoffTimeRegularSquaringDelete(@ApiParam(value = "parameter object" ,required=true) CutoffTimeRegularSquaringBody cutoffTimeRegularSquaring,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadCutoffTimeRegularSquaringDelete(cutoffTimeRegularSquaring,securityContext);
    }
    @POST
    @Path("/doc-stamp-postage-commission")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Doc Stamps, Postage and Commissions - SPP", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadDocStampPostageCommissionPost(@ApiParam(value = "parameter object" ,required=true) List<SysadDocStampsBody> sysadDocStamps,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadDocStampPostageCommissionPost(sysadDocStamps,securityContext);
    }
    @GET
    @Path("/intraday-position-limits")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Intraday Position Limits - List", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadIntradayPositionLimitsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadIntradayPositionLimitsGet(securityContext);
    }
    @POST
    @Path("/intraday-position-limits")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Intraday Position Limits - Update", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadIntradayPositionLimitsPost(@ApiParam(value = "parameter object" ,required=true) SysadInterdayPositionLimitsBody sysadInterdayPositionLimits,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadIntradayPositionLimitsPost(sysadInterdayPositionLimits,securityContext);
    }
    @DELETE
    @Path("/intraday-position-limits")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Intraday Position Limits - Update", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadIntradayPositionLimitsDelete(@ApiParam(value = "parameter object" ,required=true) SysadInterdayPositionLimitsBody sysadInterdayPositionLimits,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadIntradayPositionLimitsDelete(sysadInterdayPositionLimits,securityContext);
    }
    @PUT
    @Path("/intraday-position-limits")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Intraday Position Limits - Update", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadIntradayPositionLimitsPatch(@ApiParam(value = "parameter object" ,required=true) SysadInterdayPositionLimitsBody sysadInterdayPositionLimits,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadIntradayPositionLimitsPatch(sysadInterdayPositionLimits,securityContext);
    }

    
    @GET
    @Path("/transaction-amount-settings")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Transaction Amount Setting - SPP", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadTransactionAmountSettingsGet(@ApiParam(value = "trdr fi",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "CURR CODE",required=true) @QueryParam("curr_code") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadTransactionAmountSettingsGet(trdrFi, currCode, securityContext);
    }
    @PUT
    @Path("/transaction-amount-settings")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Transaction Amount Setting - SPP", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadTransactionAmountSettingsPatch(@ApiParam(value = "parameter object" ,required=true) SysadTransactionAmountSettingBody sysadTransactionAmountSetting,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadTransactionAmountSettingsPatch(sysadTransactionAmountSetting,securityContext);
    }
    @GET
    @Path("/transaction-amount-settings/all")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Transaction Amount Setting - SPP", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadTransactionAmountSettingsAllGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadTransactionAmountSettingsAllGet(securityContext);
    }
    @GET
    @Path("/bpi-bfb-settlement")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "BPI BFB SETTLEMENT", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadBpiBfbSettlementGet(@ApiParam(value = "trdr fi",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "CURR CODE",required=true) @QueryParam("curr_code") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadBpiBfbSettlementGet(trdrFi, currCode, securityContext);
    }
    @PUT
    @Path("/bpi-bfb-settlement")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "BPI BFB SETTLEMENT", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadBpiBfbSettlementPut(@ApiParam(value = "MODE CODE" ,required=true) BpiBfbSettlementBody bpiBfbSettlementBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadBpiBfbSettlementPut(bpiBfbSettlementBody,securityContext);
    }
    @POST
    @Path("/bpi-bfb-settlement")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "BPI BFB SETTLEMENT", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadBpiBfbSettlementPost(@ApiParam(value = "MODE CODE" ,required=true) BpiBfbSettlementBody bpiBfbSettlementBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadBpiBfbSettlementPost(bpiBfbSettlementBody,securityContext);
    }
    @DELETE
    @Path("/bpi-bfb-settlement")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "BPI BFB SETTLEMENT", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadBpiBfbSettlementDelete(@ApiParam(value = "MODE CODE" ,required=true) BpiBfbSettlementBody bpiBfbSettlementBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysadBpiBfbSettlementDelete(bpiBfbSettlementBody,securityContext);
    }
    @GET
    @Path("/doc-stamp-postage-commission")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get doc stamp postage commission", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadDocStampPostageCommissionGet(@ApiParam(value = "MODE CODE",required=true) @QueryParam("mode_code") String modeCode,@ApiParam(value = "trdr_fi",required=true) @QueryParam("trdr_fi") String trdrFi,@Context SecurityContext securityContext)
    throws NotFoundException {
    	System.out.println("GETGETGETGETGETGETGETGETGETGETGET");
        return delegate.sysadDocStampPostageCommissionGet(modeCode,trdrFi,securityContext);
    }
    @PUT
    @Path("/doc-stamp-postage-commission")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get doc stamp postage commission", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response sysadDocStampPostageCommissionPut(@ApiParam(value = "MODE CODE" ,required=true) DocStampPostageCommissionBody docStampPostageCommissionBody,@Context SecurityContext securityContext)
    throws NotFoundException {
    	System.out.println("PUT PUT pUTP PUT PUT PUT PUT PUT");
        return delegate.sysadDocStampPostageCommissionPut(docStampPostageCommissionBody,securityContext);
    }
}
