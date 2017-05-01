package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.LoginApiService;
import ph.com.bpi.api.factories.LoginApiServiceFactory;

import io.swagger.annotations.ApiParam;



import ph.com.bpi.model.ObjectResponse;
import ph.com.bpi.model.LoginDetails;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;



import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/login")


@io.swagger.annotations.Api(description = "the login API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class LoginApi  {
   private final LoginApiService delegate = LoginApiServiceFactory.getLoginApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Login user with credentials provided", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response that may contain user info or status of logon", response = ObjectResponse.class) })

    public Response loginPost(@ApiParam(value = "Transacting Unit" ,required=true) LoginDetails userDetails,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.loginPost(userDetails,securityContext);
    }
}
