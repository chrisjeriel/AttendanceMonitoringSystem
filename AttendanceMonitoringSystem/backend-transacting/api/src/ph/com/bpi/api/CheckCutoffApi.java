package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.CheckCutoffApiService;
import ph.com.bpi.api.factories.CheckCutoffApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.CutOff;
import ph.com.bpi.model.ErrorModel;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/check-cutoff")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the check-cutoff API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CheckCutoffApi  {
   private final CheckCutoffApiService delegate = CheckCutoffApiServiceFactory.getCheckCutoffApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Checks if exceeds cutoff", response = CutOff.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "if the trdr_fi and bank is in cutoff", response = CutOff.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CutOff.class) })

    public Response checkCutoffGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true) @QueryParam("bank") String bank,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.checkCutoffGet(trdrFi,bank,securityContext);
    }
}
