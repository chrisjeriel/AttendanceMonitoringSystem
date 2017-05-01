package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.AppDetailsApiService;
import ph.com.bpi.api.factories.AppDetailsApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.ErrorModel;
import ph.com.bpi.model.AppDetails;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/appDetails")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the appDetails API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class AppDetailsApi  {
   private final AppDetailsApiService delegate = AppDetailsApiServiceFactory.getAppDetailsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get application details", response = AppDetails.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Login response", response = AppDetails.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = AppDetails.class) })

    public Response appDetailsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.appDetailsGet(securityContext);
    }
}
