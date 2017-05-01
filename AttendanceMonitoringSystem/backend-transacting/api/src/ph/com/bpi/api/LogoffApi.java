package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.LogoffApiService;
import ph.com.bpi.api.factories.LogoffApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;


import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/logoff")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the logoff API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-08T16:20:30.216+08:00")
public class LogoffApi  {
   private final LogoffApiService delegate = LogoffApiServiceFactory.getLogoffApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Log off", notes = "CBG-FX (Transacting) Logoff from M/F", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })
    public Response logoffPost(@ApiParam(value = "Current user office code",required=true) @QueryParam("goffcode") String goffcode
,@ApiParam(value = "Current user ID",required=true) @QueryParam("guserid") String guserid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.logoffPost(goffcode,guserid,securityContext);
    }
}
