package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.PrimaryControlsApiService;
import ph.com.bpi.api.factories.PrimaryControlsApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.ErrorModel;
import ph.com.bpi.model.PrimaryControl;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/primary-controls")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the primary-controls API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class PrimaryControlsApi  {
   private final PrimaryControlsApiService delegate = PrimaryControlsApiServiceFactory.getPrimaryControlsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Inquire primary controls. General > GetCutOff", response = PrimaryControl.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Print operation result", response = PrimaryControl.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = PrimaryControl.class) })

    public Response primaryControlsGet(@ApiParam(value = "",required=true, allowableValues="1, 2, 3") @QueryParam("trdr_fi") String trdrFi,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.primaryControlsGet(trdrFi,securityContext);
    }
}
