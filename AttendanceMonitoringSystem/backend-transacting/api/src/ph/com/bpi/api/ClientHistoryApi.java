package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.ClientHistoryApiService;
import ph.com.bpi.api.factories.ClientHistoryApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.Failed;
import ph.com.bpi.model.Clienthistory;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/client-history")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the client-history API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ClientHistoryApi  {
   private final ClientHistoryApiService delegate = ClientHistoryApiServiceFactory.getClientHistoryApi();

    @GET
    @Path("/get")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get client history", response = Clienthistory.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Clienthistory.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Clienthistory.class, responseContainer = "List") })

    public Response clientHistoryGetGet(@ApiParam(value = "",required=true) @QueryParam("tran_indc") String tranIndc,@ApiParam(value = "",required=true) @QueryParam("c_lname") String cLname,@ApiParam(value = "",required=true) @QueryParam("c_fname") String cFname,@ApiParam(value = "",required=true) @QueryParam("c_mname") String cMname,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.clientHistoryGetGet(tranIndc,cLname,cFname,cMname,securityContext);
    }
}
