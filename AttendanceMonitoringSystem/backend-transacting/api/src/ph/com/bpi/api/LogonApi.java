package ph.com.bpi.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.annotations.ApiParam;
import ph.com.bpi.api.factories.LogonApiServiceFactory;
import ph.com.bpi.model.LogonBody;
import ph.com.bpi.model.APIResponse;

@Path("/logon")
@Consumes({"application/json"})
@Produces({"application/json"})
@io.swagger.annotations.Api(description = "the logon API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen",
		date = "2016-10-14T13:58:17.342+08:00")
public class LogonApi{
	private final LogonApiService delegate = LogonApiServiceFactory.getLogonApi();

	@POST

	@Consumes({"application/json"})
	@Produces({"application/json"})
	@io.swagger.annotations.ApiOperation(value = "",
			notes = "User login.",
			response = APIResponse.class,
			tags = {"Authentication",})
	@io.swagger.annotations.ApiResponses(value = {
			@io.swagger.annotations.ApiResponse(code = 200, message = "Response.", response = APIResponse.class)})
	public Response logonPost(@ApiParam(value = "", required = true) LogonBody data,
			@Context SecurityContext securityContext) throws NotFoundException{
		return delegate.logonPost(data, securityContext);
	}
}
