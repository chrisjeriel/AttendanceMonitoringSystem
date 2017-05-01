package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.ClientHistoricalRecordApiService;
import ph.com.bpi.api.factories.ClientHistoricalRecordApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.Failed;
import ph.com.bpi.model.Historicalrecordslist;
import java.util.Date;
import ph.com.bpi.model.Historicalrecordssummary;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/client-historical-record")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the client-historical-record API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ClientHistoricalRecordApi  {
   private final ClientHistoricalRecordApiService delegate = ClientHistoricalRecordApiServiceFactory.getClientHistoricalRecordApi();

    @GET
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns list summary of Client Historical Records", response = Historicalrecordslist.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Historicalrecordslist.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Historicalrecordslist.class, responseContainer = "List") })

    public Response clientHistoricalRecordListGet(@ApiParam(value = "",required=true, allowableValues="P, S") @QueryParam("tran_indc") String tranIndc,@ApiParam(value = "",required=true) @QueryParam("tran_date") Date tranDate,@ApiParam(value = "",required=true) @QueryParam("tran_time") String tranTime,@ApiParam(value = "",required=true) @QueryParam("c_lname") String cLname,@ApiParam(value = "",required=true) @QueryParam("c_fname") String cFname,@ApiParam(value = "",required=true) @QueryParam("c_mname") String cMname,@ApiParam(value = "",required=true) @QueryParam("proctag") String proctag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.clientHistoricalRecordListGet(tranIndc,tranDate,tranTime,cLname,cFname,cMname,proctag,securityContext);
    }
    @GET
    @Path("/list-summary")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns list summary of Client Historical Records", response = Historicalrecordssummary.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Historicalrecordssummary.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Historicalrecordssummary.class, responseContainer = "List") })

    public Response clientHistoricalRecordListSummaryGet(@ApiParam(value = "",required=true, allowableValues="P, S") @QueryParam("tran_indc") String tranIndc,@ApiParam(value = "",required=true) @QueryParam("search_tag") String searchTag,@ApiParam(value = "",required=true) @QueryParam("c_lname") String cLname,@ApiParam(value = "",required=true) @QueryParam("c_fname") String cFname,@ApiParam(value = "",required=true) @QueryParam("c_mname") String cMname,@ApiParam(value = "",required=true) @QueryParam("proctag") String proctag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.clientHistoricalRecordListSummaryGet(tranIndc,searchTag,cLname,cFname,cMname,proctag,securityContext);
    }
}
