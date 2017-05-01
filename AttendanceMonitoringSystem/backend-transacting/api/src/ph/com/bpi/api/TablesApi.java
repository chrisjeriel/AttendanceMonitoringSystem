package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.TablesApiService;
import ph.com.bpi.api.factories.TablesApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.ErrorModel;
import ph.com.bpi.model.ReferenceTable;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/tables")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the tables API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class TablesApi  {
   private final TablesApiService delegate = TablesApiServiceFactory.getTablesApi();

    @GET
    @Path("/download")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Triggers download of table specified in table_id in the background.\nTo get table names and their IDs, use /tables/getInfo", response = ErrorModel.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "the result of downloading tables", response = ErrorModel.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = ErrorModel.class) })

    public Response tablesDownloadGet(@ApiParam(value = "Table ID",required=true) @QueryParam("table_id") Integer tableId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.tablesDownloadGet(tableId,securityContext);
    }
    @GET
    @Path("/info")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns the list of tables with their respective ids.", response = ReferenceTable.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of reference files / tables", response = ReferenceTable.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ReferenceTable.class) })

    public Response tablesInfoGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.tablesInfoGet(securityContext);
    }
}
