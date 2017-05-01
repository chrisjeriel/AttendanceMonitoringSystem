package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.DeletelogApiService;
import ph.com.bpi.api.factories.DeletelogApiServiceFactory;

import io.swagger.annotations.ApiParam;


import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;



import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/deletelog")


@io.swagger.annotations.Api(description = "the deletelog API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class DeletelogApi  {
   private final DeletelogApiService delegate = DeletelogApiServiceFactory.getDeletelogApi();

    @DELETE
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get list of BP Accounts - BC10", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response deletelogDelete(@ApiParam(value = "f trandate" ,required=true) String fTransdate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deletelogDelete(fTransdate,securityContext);
    }
}
