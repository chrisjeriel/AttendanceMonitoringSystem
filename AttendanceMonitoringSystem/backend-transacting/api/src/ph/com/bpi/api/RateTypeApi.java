package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.RateTypeApiService;
import ph.com.bpi.api.factories.RateTypeApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.Failed;
import ph.com.bpi.model.Ratelist;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/rate-type")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the rate-type API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class RateTypeApi  {
   private final RateTypeApiService delegate = RateTypeApiServiceFactory.getRateTypeApi();

    @GET
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns list of rate types based on Trader", response = Ratelist.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Ratelist.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Ratelist.class, responseContainer = "List") })

    public Response rateTypeListGet(@ApiParam(value = "Traders",required=true) @QueryParam("trdr_fi") String trdrFi,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.rateTypeListGet(trdrFi,securityContext);
    }
}
