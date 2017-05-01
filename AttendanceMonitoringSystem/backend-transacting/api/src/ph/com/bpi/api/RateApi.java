package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.RateApiService;
import ph.com.bpi.api.factories.RateApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.Rates;
import ph.com.bpi.model.Failed;
import ph.com.bpi.model.Otclist;
import ph.com.bpi.model.Tierrates;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/rate")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the rate API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class RateApi  {
   private final RateApiService delegate = RateApiServiceFactory.getRateApi();

    @GET
    @Path("/inquiry")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns inquired rate based on Trader and Rate type", response = Rates.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Rates.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Rates.class, responseContainer = "List") })

    public Response rateInquiryGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") Integer trdrFi,@ApiParam(value = "",required=true) @QueryParam("rate_type") Integer rateType,@ApiParam(value = "",required=false) @QueryParam("w_curr") Integer wCurr,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.rateInquiryGet(trdrFi,rateType,wCurr,securityContext);
    }
    @GET
    @Path("/otc/get")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get/Inquire OTC", response = Otclist.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Otclist.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Otclist.class, responseContainer = "List") })

    public Response rateOtcGetGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("tran_fi") String tranFi,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.rateOtcGetGet(trdrFi,tranFi,currCode,securityContext);
    }
    @GET
    @Path("/otc/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "List of OTC", response = Otclist.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Otclist.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Otclist.class, responseContainer = "List") })

    public Response rateOtcListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.rateOtcListGet(securityContext);
    }
    @GET
    @Path("/tier/get")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get/Inquire Thirds Buying and Selling Rates", response = Tierrates.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Tierrates.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Tierrates.class, responseContainer = "List") })

    public Response rateTierGetGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("tran_fi") String tranFi,@ApiParam(value = "",required=true) @QueryParam("curr_code") String currCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.rateTierGetGet(trdrFi,tranFi,currCode,securityContext);
    }
    @GET
    @Path("/tier/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "List of Thirds Buying and Selling Rates", response = Tierrates.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Tierrates.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Tierrates.class, responseContainer = "List") })

    public Response rateTierListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.rateTierListGet(securityContext);
    }
}
