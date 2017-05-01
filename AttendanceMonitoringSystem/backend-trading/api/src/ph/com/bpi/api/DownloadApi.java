package ph.com.bpi.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import io.swagger.annotations.ApiParam;
import ph.com.bpi.api.factories.DownloadApiServiceFactory;
import ph.com.bpi.model.ObjectResponse;

@Path("/download")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the download API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-20T17:39:48.019+08:00")
public class DownloadApi  {
   private final DownloadApiService delegate = DownloadApiServiceFactory.getDownloadApi();

    @GET
    @Path("/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Download Daily Summary report transaction ", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "the result of downloading tables", response = ObjectResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = ObjectResponse.class) })
    public Response downloadGet(@ApiParam(value = "",required=true) @QueryParam("tran_indc") String tranIndc
,@ApiParam(value = "",required=true) @QueryParam("rqst_type") String rqstType
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.downloadGet(tranIndc,rqstType,securityContext);
    }
}
