package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.AcceptanceSettlementModeApiService;
import ph.com.bpi.api.factories.AcceptanceSettlementModeApiServiceFactory;

import io.swagger.annotations.ApiParam;


import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;


import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/acceptance-settlement-mode")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the acceptance-settlement-mode API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class AcceptanceSettlementModeApi  {
   private final AcceptanceSettlementModeApiService delegate = AcceptanceSettlementModeApiServiceFactory.getAcceptanceSettlementModeApi();

    @GET
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Acceptance Settlement Modes", notes = "List of acceptance/settlement modes", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response acceptanceSettlementModeListGet(@ApiParam(value = "Mode code",required=true) @QueryParam("mode_code") Integer modeCode,@ApiParam(value = "Procedure tag",required=true) @QueryParam("proctag") Integer proctag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.acceptanceSettlementModeListGet(modeCode,proctag,securityContext);
    }
}
