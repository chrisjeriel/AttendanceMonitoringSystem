package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.SendhostApiService;
import ph.com.bpi.api.factories.SendhostApiServiceFactory;

import io.swagger.annotations.ApiParam;



import ph.com.bpi.model.SendHostBody;
import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;



import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/sendhost")


@io.swagger.annotations.Api(description = "the sendhost API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SendhostApi  {
   private final SendhostApiService delegate = SendhostApiServiceFactory.getSendhostApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "send host api", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = ObjectResponse.class) })

    public Response sendhostPost(@ApiParam(value = "send host body" ,required=true) SendHostBody sendHostBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sendhostPost(sendHostBody,securityContext);
    }
}
