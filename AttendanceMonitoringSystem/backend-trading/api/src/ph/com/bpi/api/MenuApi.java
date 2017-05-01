package ph.com.bpi.api;

import ph.com.bpi.api.MenuApiService;
import ph.com.bpi.api.factories.MenuApiServiceFactory;
import ph.com.bpi.model.ObjectResponse;
import ph.com.bpi.api.NotFoundException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.annotations.ApiParam;

@Path("/menu")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the menu API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class MenuApi  {
   private final MenuApiService delegate = MenuApiServiceFactory.getMenuApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "System Menus", response = ObjectResponse.class, tags={ "Menu", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Response.", response = ObjectResponse.class) })
    public Response menuGet(@ApiParam(value = "Menu Type",required=true) @QueryParam("type") String type,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.menuGet(type,securityContext);
    }
}
