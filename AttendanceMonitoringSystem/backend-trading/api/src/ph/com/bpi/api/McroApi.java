package ph.com.bpi.api;

import ph.com.bpi.api.McroApiService;
import ph.com.bpi.api.factories.McroApiServiceFactory;
import ph.com.bpi.model.ObjectResponse;
import ph.com.bpi.api.NotFoundException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/mcro")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the mcro API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class McroApi  {
   private final McroApiService delegate = McroApiServiceFactory.getMcroApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "System MCRO.", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Response.", response = ObjectResponse.class) })
    public Response mcroGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.mcroGet(securityContext);
    }
}
