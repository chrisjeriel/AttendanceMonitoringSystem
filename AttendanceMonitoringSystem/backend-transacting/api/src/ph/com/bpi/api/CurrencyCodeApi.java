package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.CurrencyCodeApiService;
import ph.com.bpi.api.factories.CurrencyCodeApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/currency-code")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the currency-code API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CurrencyCodeApi  {
   private final CurrencyCodeApiService delegate = CurrencyCodeApiServiceFactory.getCurrencyCodeApi();

    @GET
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Currency code list", notes = "List of Currency Code", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response currencyCodeListGet(@ApiParam(value = "Currency code",required=true) @QueryParam("curr_code") String currCode,@ApiParam(value = "Procedure tag",required=true) @QueryParam("proctag") Integer proctag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.currencyCodeListGet(currCode,proctag,securityContext);
    }
}
