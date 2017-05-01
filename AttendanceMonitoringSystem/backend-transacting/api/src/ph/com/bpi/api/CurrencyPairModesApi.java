package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.CurrencyPairModesApiService;
import ph.com.bpi.api.factories.CurrencyPairModesApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.CurrencyPairModesBody;
import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/currency-pair-modes")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the currency-pair-modes API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CurrencyPairModesApi  {
   private final CurrencyPairModesApiService delegate = CurrencyPairModesApiServiceFactory.getCurrencyPairModesApi();

    @GET
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Currency Pair Modes", notes = "List of currency pair and acceptance/settlement modes and filters valid acceptance/settle mode combination for selected currency pair", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response currencyPairModesListGet(@ApiParam(value = "The currency" ,required=true) CurrencyPairModesBody currencyPairModesBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.currencyPairModesListGet(currencyPairModesBody,securityContext);
    }
}
