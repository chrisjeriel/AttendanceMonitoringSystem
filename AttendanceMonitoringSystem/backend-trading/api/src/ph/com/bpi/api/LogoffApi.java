package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.LogoffApiService;
import ph.com.bpi.api.factories.LogoffApiServiceFactory;

import io.swagger.annotations.ApiParam;



import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;



import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/logoff")


@io.swagger.annotations.Api(description = "the logoff API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class LogoffApi  {
   private final LogoffApiService delegate = LogoffApiServiceFactory.getLogoffApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "send host api", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = ObjectResponse.class) })

    public Response logoffGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.logoffGet(securityContext);
    }
}
