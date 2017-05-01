package ph.com.bpi.api;

import io.swagger.annotations.ApiParam;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import ph.com.bpi.api.factories.InitialLogonApiServiceFactory;
import ph.com.bpi.model.ObjectResponse;

@Path("/initial-logon")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the initial-logon API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-09T14:07:28.663+08:00")
public class InitialLogonApi  {
   private final InitialLogonApiService delegate = InitialLogonApiServiceFactory.getInitialLogonApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "CBG-FX (Transacting) Initial Logon to M/F", notes = "CBG-FX (Transacting) Initial Logon to M/F", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })
    public Response initialLogonPost(@ApiParam(value = "",required=true) @QueryParam("gpassword") String gpassword
,@ApiParam(value = "",required=true) @QueryParam("clogdate") String clogdate
,@ApiParam(value = "",required=true) @QueryParam("glogtime") String glogtime
,@ApiParam(value = "",required=true) @QueryParam("glogtype") String glogtype
,@ApiParam(value = "") @QueryParam("gnewpass") String gnewpass
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.initialLogonPost(gpassword,clogdate,glogtime,glogtype,gnewpass,securityContext);
    }
}
