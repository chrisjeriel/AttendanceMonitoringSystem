package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.BulletinBoardApiService;
import ph.com.bpi.api.factories.BulletinBoardApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.Failed;
import ph.com.bpi.model.Specialmsg;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/bulletin-board")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the bulletin-board API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class BulletinBoardApi  {
   private final BulletinBoardApiService delegate = BulletinBoardApiServiceFactory.getBulletinBoardApi();

    @GET
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns list of special message (daily) from bulletin board based on Trader", response = Specialmsg.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Specialmsg.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Specialmsg.class, responseContainer = "List") })

    public Response bulletinBoardListGet(@ApiParam(value = "Trader",required=true) @QueryParam("trdr_fi") String trdrFi,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.bulletinBoardListGet(trdrFi,securityContext);
    }
}
