package ph.com.bpi.api;

import ph.com.bpi.api.SysRefApiService;
import ph.com.bpi.api.factories.SysRefApiServiceFactory;
import ph.com.bpi.model.ObjectResponse;


import ph.com.bpi.api.NotFoundException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.annotations.ApiParam;

@Path("/sys-ref")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the sys-ref API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class SysRefApi  {
   private final SysRefApiService delegate = SysRefApiServiceFactory.getSysRefApi();

    @GET
    @Path("/all")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Gets all records of FXREF", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Response.", response = ObjectResponse.class) })
    public Response sysRefAllGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysRefAllGet(securityContext);
    }
    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get reference table records", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response sysRefGet(@ApiParam(value = "Transaction Code",required=true) @QueryParam("tCode") String tCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysRefGet(tCode,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update reference table", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = {  })
    public Response sysRefPost(@ApiParam(value = "Transaction Code",required=true) @QueryParam("tCode") String tCode,
    		@ApiParam(value = "Trader FI",required=true) @QueryParam("trdrFi") String trdrFi,
    		@ApiParam(value = "Branch Code",required=true) @QueryParam("brchCode") String brchCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sysRefPost(tCode,trdrFi,brchCode,securityContext);
    }
}
