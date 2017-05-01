package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.InvisibleCodeApiService;
import ph.com.bpi.api.factories.InvisibleCodeApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/invisible-code")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the invisible-code API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class InvisibleCodeApi  {
   private final InvisibleCodeApiService delegate = InvisibleCodeApiServiceFactory.getInvisibleCodeApi();

    @GET
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Trasaction Invisible code list", notes = "List of invisible codes", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response invisibleCodeListGet(@ApiParam(value = "trdr_fi",required=true) @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "invi_code",required=true) @QueryParam("invi_code") String inviCode,@ApiParam(value = "proctag",required=true) @QueryParam("proctag") String proctag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.invisibleCodeListGet(trdrFi,inviCode,proctag,securityContext);
    }
}
