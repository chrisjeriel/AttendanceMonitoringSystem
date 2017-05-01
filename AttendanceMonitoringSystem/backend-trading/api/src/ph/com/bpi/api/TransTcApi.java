package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.TransTcApiService;
import ph.com.bpi.api.factories.TransTcApiServiceFactory;

import io.swagger.annotations.ApiParam;



import ph.com.bpi.model.TransactionTCBody;
import java.util.*;
import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;



import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/trans-tc")


@io.swagger.annotations.Api(description = "the trans-tc API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class TransTcApi  {
   private final TransTcApiService delegate = TransTcApiServiceFactory.getTransTcApi();

    @GET
    @Path("/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Transaction with TCs - List", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response transTcListPost(@ApiParam(value = "LIST INDC",required=true) @QueryParam("listIndc") String listIndc,
    		@ApiParam(value = "BRCH CODE",required=true) @QueryParam("brchCode") String brchCode,
    		@ApiParam(value = "TRDR FI",required=true) @QueryParam("trdrFi") String trdrFi,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transTcListPost(listIndc,brchCode,trdrFi,securityContext);
    }
    @GET
    @Path("/{refNo}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Transaction with TCs by Reference Number", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response transTcRefNoPost(@ApiParam(value = "reference number",required=true) @PathParam("refNo") String refNo,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transTcRefNoPost(refNo,securityContext);
    }
}
