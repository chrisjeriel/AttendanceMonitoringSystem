package ph.com.bpi.api;

import ph.com.bpi.api.SysParamApiService;
import ph.com.bpi.api.factories.SysParamApiServiceFactory;
import ph.com.bpi.model.ObjectResponse;
import ph.com.bpi.model.SysParamBody;
import ph.com.bpi.api.NotFoundException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.annotations.ApiParam;

@Path("/sys-param")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the sys-param API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class SysParamApi  {
   private final SysParamApiService delegate = SysParamApiServiceFactory.getSysParamApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "System Parameters", response = ObjectResponse.class, tags={ "SysParam", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Response.", response = ObjectResponse.class) })
    public Response sysParamGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysParamGet(securityContext);
    }
    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update System Parameters", response = ObjectResponse.class, tags={ "SysParam", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Response.", response = ObjectResponse.class) })
    public Response sysParamPut(@ApiParam(value = "sysparam data entry parameter object" ,required=true) SysParamBody sysParamBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysParamPut(sysParamBody,securityContext);
    }
}
