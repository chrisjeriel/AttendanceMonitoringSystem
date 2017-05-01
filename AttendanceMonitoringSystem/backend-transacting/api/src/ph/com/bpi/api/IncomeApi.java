package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.IncomeApiService;
import ph.com.bpi.api.factories.IncomeApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.Failed;
import ph.com.bpi.model.Incomes;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/income")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the income API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class IncomeApi  {
   private final IncomeApiService delegate = IncomeApiServiceFactory.getIncomeApi();

    @GET
    @Path("/get")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns income based on Trader", response = Incomes.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Incomes.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Incomes.class, responseContainer = "List") })

    public Response incomeGetGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.incomeGetGet(trdrFi,securityContext);
    }
}
