package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.TransactingUnitApiService;
import ph.com.bpi.api.factories.TransactingUnitApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.ErrorModel;
import ph.com.bpi.model.TransactingUnit;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/transacting-unit")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the transacting-unit API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class TransactingUnitApi  {
   private final TransactingUnitApiService delegate = TransactingUnitApiServiceFactory.getTransactingUnitApi();

    @GET
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "List of Transacting Unit", response = TransactingUnit.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Print operation result", response = TransactingUnit.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = TransactingUnit.class, responseContainer = "List") })

    public Response transactingUnitListGet(@ApiParam(value = "",required=true) @QueryParam("tran_fi") String tranFi,@ApiParam(value = "",required=true) @QueryParam("proctag") String proctag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactingUnitListGet(tranFi,proctag,securityContext);
    }
}
