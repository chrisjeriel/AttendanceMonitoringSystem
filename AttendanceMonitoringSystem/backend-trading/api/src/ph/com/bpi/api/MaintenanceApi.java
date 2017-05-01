package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.MaintenanceApiService;
import ph.com.bpi.api.factories.MaintenanceApiServiceFactory;

import io.swagger.annotations.ApiParam;

import java.util.*;

import ph.com.bpi.model.hibernate.T0208;
import ph.com.bpi.model.hibernate.T0211;
import ph.com.bpi.model.hibernate.T0214;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;



import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/maintenance")


@io.swagger.annotations.Api(description = "the maintenance API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class MaintenanceApi  {
   private final MaintenanceApiService delegate = MaintenanceApiServiceFactory.getMaintenanceApi();

    @PUT
    @Path("/acceptance-settlement/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceAcceptanceSettlementEncodePut(@ApiParam(value = "transacting unit body" ,required=true) AcceptanceSettlementBody acceptanceSettlementBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceAcceptanceSettlementEncodePut(acceptanceSettlementBody,securityContext);
    }
    @POST
    @Path("/acceptance-settlement/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = {  })

    public Response maintenanceAcceptanceSettlementEncodePost(@ApiParam(value = "transacting unit body" ,required=true) AcceptanceSettlementBody acceptanceSettlementBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceAcceptanceSettlementEncodePost(acceptanceSettlementBody,securityContext);
    }
    @GET
    @Path("/acceptance-settlement/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "get acceptance settlement list", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceAcceptanceSettlementListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceAcceptanceSettlementListGet(securityContext);
    }
    @POST
    @Path("/application-code/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = {  })

    public Response maintenanceApplicationCodeEncodePost(@ApiParam(value = "transacting unit body" ,required=true) List<ApplicationCodeBody> applicationCodeBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceApplicationCodeEncodePost(applicationCodeBody,securityContext);
    }
    @GET
    @Path("/application-code/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "get application list", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceApplicationCodeListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceApplicationCodeListGet(securityContext);
    }
    @GET
    @Path("/approving-authority-limit/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "get approving authority list", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceApprovingAuthorityLimitListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceApprovingAuthorityLimitListGet(securityContext);
    }

    @POST
    @Path("/approving-authority-limit/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceApprovingAuthorityLimitEncodePost(@ApiParam(value = "transacting unit body" ,required=true) List<ApprovingAuthorityBody> approvingAuthorityBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceApprovingAuthorityLimitEncodePost(approvingAuthorityBody,securityContext);
    }
    
    @GET
    @Path("/loa-signatories/list")
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "get list of signatories", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceLOASignatoriesListGet(@ApiParam(value = "",required=true) @QueryParam("trdrFi") String trdrFi, @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceLOASignatoriesListGet(trdrFi, securityContext);
    }

    @POST
    @Path("/loa-signatories/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceLOASignatoriesEncodePost( @ApiParam(value = "",required=true) @QueryParam("trdrFi")  String trdrFi,
    						@ApiParam(value = "transacting unit body" ,required=true) List<LoaSignatoriesBody> loaSignatoriesBody,
    													@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceLOASignatoriesEncodePost(trdrFi, loaSignatoriesBody,securityContext);
    }
    
    
    @GET
    @Path("/best-buy-sell")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "best buy sell get", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceBestBuySellGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceBestBuySellGet(trdrFi,currCode,securityContext);
    }
    @POST
    @Path("/best-buy-sell/process")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "buy and sell process", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceBestBuySellProcessPost(@ApiParam(value = "btsu body" ,required=true) BuyAndSellBody buyAndSellBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceBestBuySellProcessPost(buyAndSellBody,securityContext);
    }
    @GET
    @Path("/board-rate")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "maintenance board rate get", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceBoardRateGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("tran_id") String tranId,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceBoardRateGet(trdrFi,tranId,currCode,securityContext);
    }
    @POST
    @Path("/board-rate/process")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "board rate  process", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceBoardRateProcessPost(@ApiParam(value = "board rate process body" ,required=true) BoardRateProcess boardRateProcess,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceBoardRateProcessPost(boardRateProcess,securityContext);
    }
    @POST
    @Path("/btsu/accept")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "btsu accept", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceBtsuAcceptPost(@ApiParam(value = "btsu body" ,required=true) BtsuAcceptBody btsuAcceptBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceBtsuAcceptPost(btsuAcceptBody,securityContext);
    }
    @GET
    @Path("/btsu/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "btsu list", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceBtsuListGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceBtsuListGet(trdrFi,currCode,securityContext);
    }
    @POST
    @Path("/btsu/process")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "btsu process", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceBtsuProcessPost(@ApiParam(value = "btsu body" ,required=true) BtsuProcessBody btsuProcessBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceBtsuProcessPost(btsuProcessBody,securityContext);
    }
    @GET
    @Path("/bulletin-board")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "get bulletin board", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceBulletinBoardGet(@ApiParam(value = "",required=true) @QueryParam("trdrFi") String trdrFi,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceBulletinBoardGet(trdrFi, securityContext);
    }
    @POST
    @Path("/bulletin-board")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "post bulletin board", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = {  })

    public Response maintenanceBulletinBoardPost(@ApiParam(value = "",required=true) @QueryParam("trdrFi") String trdrFi,@ApiParam(value = "transacting unit body" ,required=true) @QueryParam("spclMsg") String spclMsg,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceBulletinBoardPost(trdrFi, spclMsg,securityContext);
    }
    @GET
    @Path("/buy-sell-st/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "buy sell list", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceBuySellStListGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceBuySellStListGet(trdrFi,currCode,securityContext);
    }
    @POST
    @Path("/buy-sell-st/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "btsu process", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceBuySellStUpdatePost(@ApiParam(value = "btsu body" ,required=true) List<T0208> buysellBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceBuySellStUpdatePost(buysellBody,securityContext);
    }
    @GET
    @Path("/otc-rate/rate")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "maintenance otc rate get", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceOtcRateRateGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("tran_id") String tranId,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceOtcRateRateGet(trdrFi,tranId,currCode,securityContext);
    }
    @POST
    @Path("/otc-rate/rate/process")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "otc rate  process", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceOtcRateRateProcessPost(@ApiParam(value = "otc rate process body" ,required=true) OtcRateBody otcRateBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceOtcRateRateProcessPost(otcRateBody,securityContext);
    }
    @GET
    @Path("/otc-rate/spread")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "otc rate spread", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceOtcRateSpreadGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("tran_id") String tranId,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceOtcRateSpreadGet(trdrFi,tranId,currCode,securityContext);
    }
    @POST
    @Path("/otc-rate/spread/process")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "otc rate spread process", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceOtcRateSpreadProcessPost(@ApiParam(value = "otc rate spread process body" ,required=true) OtcRateSpreadBody otcRateSpreadBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceOtcRateSpreadProcessPost(otcRateSpreadBody,securityContext);
    }
    @GET
    @Path("/preferred-client-rate")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "preferred-client-rate", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenancePreferredClientRateGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenancePreferredClientRateGet(trdrFi,currCode,securityContext);
    }
    @GET
    @Path("/ref-rate")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "maintenance ref rate get", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceRefRateGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceRefRateGet(trdrFi,currCode,securityContext);
    }
    @GET
    @Path("/ref-rate-php/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "ref rate usd list", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceRefRatePhpListGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceRefRatePhpListGet(trdrFi,currCode,securityContext);
    }
    @GET
    @Path("/ref-rate-usd/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "ref rate usd list", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceRefRateUsdListGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceRefRateUsdListGet(trdrFi,currCode,securityContext);
    }
    @POST
    @Path("/ref-rate/process")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "buy  process", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceRefRateProcessPost(@ApiParam(value = "ref rate process body" ,required=true) RefRateProcessBody refRateProcessBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceRefRateProcessPost(refRateProcessBody,securityContext);
    }
    @POST
    @Path("/ref-rate-php/process")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "ref rate usd process", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceRefRatePhpProcessPost(@ApiParam(value = "btsu body" ,required=true) List<T0214> refRateUsdProcessBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceRefRatePhpProcessPost(refRateUsdProcessBody,securityContext);
    }
    @PUT
    @Path("/valid-currencies/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceValidCurrenciesEncodePut(@ApiParam(value = "valid currecy encode body" ,required=true) ValidCurrecyEncodeBody validCurrencyEncode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceValidCurrenciesEncodePut(validCurrencyEncode,securityContext);
    }
    
    @DELETE
    @Path("/valid-currencies/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceValidCurrenciesEncodeDelete(@ApiParam(value = "valid currecy encode body" ,required=true) ValidCurrecyEncodeBody validCurrencyEncode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceValidCurrenciesEncodeDelete(validCurrencyEncode,securityContext);
    }
    @GET
    @Path("/spread")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "us-visa-fee", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceSpreadGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("spreads") String spreads,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceSpreadGet(trdrFi,spreads,securityContext);
    }
    @POST
    @Path("/spread/process")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "spreadProcessBody", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceSpreadProcessPost(@ApiParam(value = "spreadProcessBody" ,required=true) List<SpreadProcessBody> spreadProcessBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceSpreadProcessPost(spreadProcessBody,securityContext);
    }
    @GET
    @Path("/tiered-rate/rate")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "tiered rate spread", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceTieredRateRateGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("tran_id") String tranId,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@ApiParam(value = "",required=true) @QueryParam("tier_nmbr") String tierNmbr,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceTieredRateRateGet(trdrFi,tranId,currCode,tierNmbr,securityContext);
    }
    @GET
    @Path("/tiered-rate/sprd")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "tiered rate spread", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceTieredRateSprdGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("tran_id") String tranId,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@ApiParam(value = "",required=true) @QueryParam("tier_nmbr") String tierNmbr,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceTieredRateSprdGet(trdrFi,tranId,currCode,tierNmbr,securityContext);
    }
    @GET
    @Path("/trading-unit")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "get trading unit", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceTradingUnitGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceTradingUnitGet(trdrFi,securityContext);
    }
    @PUT
    @Path("/trading-unit/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceTradingUnitEncodePut(@ApiParam(value = "trading unit body" ,required=true) TradingUnitEncode tradingUnitBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceTradingUnitEncodePut(tradingUnitBody,securityContext);
    }
    @POST
    @Path("/trading-unit/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceTradingUnitEncodePost(@ApiParam(value = "trading unit body" ,required=true) TradingUnitEncode tradingUnitBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceTradingUnitEncodePost(tradingUnitBody,securityContext);
    }
    @DELETE
    @Path("/trading-unit/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceTradingUnitEncodeDelete(@ApiParam(value = "trading unit body" ,required=true) TradingUnitEncode tradingUnitBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceTradingUnitEncodeDelete(tradingUnitBody,securityContext);
    }
    @GET
    @Path("/trading-unit/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "get trading unit list", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceTradingUnitListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceTradingUnitListGet(securityContext);
    }
    @GET
    @Path("/transacting-unit")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "get transacting unit", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceTransactingUnitGet(@ApiParam(value = "",required=true) @QueryParam("tran_fi") String trdrFi,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceTransactingUnitGet(trdrFi,securityContext);
    }
    @POST
    @Path("/transacting-unit/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceTransactingUnitEncodePost(@ApiParam(value = "transacting unit body" ,required=true) TransactingUnitEncode transactingUnitBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceTransactingUnitEncodePost(transactingUnitBody,securityContext);
    }
    @DELETE
    @Path("/transacting-unit/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceTransactingUnitEncodeDelete(@ApiParam(value = "transacting unit body" ,required=true) TransactingUnitEncode transactingUnitBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceTransactingUnitEncodeDelete(transactingUnitBody,securityContext);
    }
    @GET
    @Path("/transacting-unit/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "get transacting unit list", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceTransactingUnitListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceTransactingUnitListGet(securityContext);
    }
    @GET
    @Path("/transaction-monitoring")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "transaction monitoring get", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceTransactionMonitoringGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceTransactionMonitoringGet(securityContext);
    }
    @POST
    @Path("/transaction-monitoring/process")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get transaction history of BP Accounts - BC13", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceTransactionMonitoringProcessPost(@ApiParam(value = "send transaction body" ,required=true) TransactionMonitoringBody transactionBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceTransactionMonitoringProcessPost(transactionBody,securityContext);
    }
    @GET
    @Path("/us-visa-fee")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "us-visa-fee", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceUsVisaFeeGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceUsVisaFeeGet(trdrFi,currCode,securityContext);
    }
    @POST
    @Path("/us-visa-fee/process")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "us visa fee process", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceUsVisaFeeProcessPost(@ApiParam(value = "usVisaFeeProcessBody" ,required=true) UsVisaFeeProcessBody usVisaFeeProcessBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceUsVisaFeeProcessPost(usVisaFeeProcessBody,securityContext);
    }
    @POST
    @Path("/tiered-rate/sprd/process")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "otc rate spread process", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceTieredRateSprdProcessPost(@ApiParam(value = "otc rate spread process body" ,required=true) TieredRateSprdBody tieredRateSprdBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceTieredRateSprdProcessPost(tieredRateSprdBody,securityContext);
    }
    @PUT
    @Path("/user-access/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceUserAccessEncodePut(@ApiParam(value = "user access body" ,required=true) UserAccessBody userAccessBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceUserAccessEncodePut(userAccessBody,securityContext);
    }
    @POST
    @Path("/user-access/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceUserAccessEncodePost(@ApiParam(value = "user access body" ,required=true) UserAccessBody userAccessBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceUserAccessEncodePost(userAccessBody,securityContext);
    }
    @DELETE
    @Path("/user-access/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceUserAccessEncodeDelete(@ApiParam(value = "user access body" ,required=true) UserAccessBody userAccessBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceUserAccessEncodeDelete(userAccessBody,securityContext);
    }
    @GET
    @Path("/user-access/load")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "get userfile", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceUserAccessLoadGet(@ApiParam(value = "",required=true) @QueryParam("tran_fi") String tranFi,@ApiParam(value = "",required=true) @QueryParam("brch_code") String brchCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceUserAccessLoadGet(tranFi,brchCode,securityContext);
    }
    @GET
    @Path("/user-file/{user_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "get userfile", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceUserFileGet(@ApiParam(value = "",required=true) @PathParam("user_id") String userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceUserFileGet(userId,securityContext);
    }
    @PUT
    @Path("/user-file/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceUserFileEncodePut(@ApiParam(value = "transacting unit body" ,required=true) UserFileEncode approvingAuthorityBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceUserFileEncodePut(approvingAuthorityBody,securityContext);
    }
    @POST
    @Path("/user-file/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceUserFileEncodePost(@ApiParam(value = "transacting unit body" ,required=true) UserFileEncode approvingAuthorityBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceUserFileEncodePost(approvingAuthorityBody,securityContext);
    }
    @DELETE
    @Path("/user-file/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceUserFileEncodeDelete(@ApiParam(value = "transacting unit body" ,required=true) UserFileEncode approvingAuthorityBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceUserFileEncodeDelete(approvingAuthorityBody,securityContext);
    }
    @GET
    @Path("/user-file/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "get userfile", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceUserFileListGet(@ApiParam(value = "",required=true) @QueryParam("tran_fi") String tranFi,@ApiParam(value = "",required=true) @QueryParam("brch_code") String brchCode,@ApiParam(value = "",required=true) @QueryParam("user_id") String userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceUserFileListGet(tranFi,brchCode,userId,securityContext);
    }
    @GET
    @Path("/user-list/print")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "get userfile", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceUserListPrintGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceUserListPrintGet(securityContext);
    }
    @POST
    @Path("/valid-currencies/encode")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "encode", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceValidCurrenciesEncodePost(@ApiParam(value = "valid currecy encode body" ,required=true) ValidCurrecyEncodeBody validCurrencyEncode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceValidCurrenciesEncodePost(validCurrencyEncode,securityContext);
    }
    @GET
    @Path("/valid-currencies/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "get valid currency list", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceValidCurrenciesListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceValidCurrenciesListGet(securityContext);
    }
    @POST
    @Path("/ref-rate-usd/process")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "ref rate usd process", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceRefRateUsdProcessPost(@ApiParam(value = "btsu body" ,required=true) List<T0211> refRateUsdProcessBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceRefRateUsdProcessPost(refRateUsdProcessBody,securityContext);
    }
    @GET
    @Path("/invisible-code")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "get valid currency list", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceInvisibleCodeListGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("invi_code") String inviCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceInvisibleCodeListGet(trdrFi, inviCode, securityContext);
    }
    @POST
    @Path("/invisible-code")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "ref rate usd process", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceInvisibleCodePost(@ApiParam(value = "" ,required=true) InvisibleCodeBody invisibleCodeBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceInvisibleCodePost(invisibleCodeBody,securityContext);
    }
    @DELETE
    @Path("/invisible-code")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "ref rate usd process", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response maintenanceInvisibleCodeDelete(@ApiParam(value = "" ,required=true) InvisibleCodeBody invisibleCodeBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.maintenanceInvisibleCodeDelete(invisibleCodeBody,securityContext);
    }
}
