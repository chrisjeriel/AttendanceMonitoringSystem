package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.ReferenceFilesApiService;
import ph.com.bpi.api.factories.ReferenceFilesApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.ErrorModel;
import ph.com.bpi.model.ReferenceFile;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/reference-files")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the reference-files API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ReferenceFilesApi  {
   private final ReferenceFilesApiService delegate = ReferenceFilesApiServiceFactory.getReferenceFilesApi();

    @GET
    @Path("/download")
    @Consumes({ "application/json" })
    @Produces({ "application/octet-stream" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Downloads all reference files data and populates corresponding reference tables", response = ErrorModel.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ErrorModel.class) })

    public Response referenceFilesDownloadGet(@ApiParam(value = "List Transaction codes of reference files to be downloaded in Utility > Download Reference Files",required=true) @QueryParam("transactionCodes") List<String> transactionCodes,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.referenceFilesDownloadGet(transactionCodes,securityContext);
    }
    @GET
    @Path("/download/all")
    @Consumes({ "application/json" })
    @Produces({ "application/octet-stream" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Downloads all reference files data and populates corresponding reference tables", response = ErrorModel.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ErrorModel.class) })

    public Response referenceFilesDownloadAllGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.referenceFilesDownloadAllGet(securityContext);
    }
    @GET
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns list of all reference files", response = ReferenceFile.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of reference files", response = ReferenceFile.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ReferenceFile.class, responseContainer = "List") })

    public Response referenceFilesListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.referenceFilesListGet(securityContext);
    }
}
