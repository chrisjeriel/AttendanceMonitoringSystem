package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.MtsCodeApiService;
import ph.com.bpi.api.factories.MtsCodeApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.MTSCodeGetBody;
import ph.com.bpi.model.ObjectResponse;
import ph.com.bpi.model.MTSCodeListBody;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/mts-code")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the mts-code API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class MtsCodeApi  {
   private final MtsCodeApiService delegate = MtsCodeApiServiceFactory.getMtsCodeApi();

    @GET
    @Path("/get")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "MTS Code", notes = "Get MTS Code", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response mtsCodeGetGet(@ApiParam(value = "MTS Code" ,required=true) MTSCodeGetBody mTSCodeGetBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.mtsCodeGetGet(mTSCodeGetBody,securityContext);
    }
    @GET
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "MTS Code List", notes = "List of MTS Codes", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response mtsCodeListGet(@ApiParam(value = "MTS Code" ,required=true) MTSCodeListBody mTSCodeListBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.mtsCodeListGet(mTSCodeListBody,securityContext);
    }
}
