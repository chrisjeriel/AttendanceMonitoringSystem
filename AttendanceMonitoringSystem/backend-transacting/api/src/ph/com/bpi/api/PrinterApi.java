package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.PrinterApiService;
import ph.com.bpi.api.factories.PrinterApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.ErrorModel;
import ph.com.bpi.model.Printer;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/printer")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the printer API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class PrinterApi  {
   private final PrinterApiService delegate = PrinterApiServiceFactory.getPrinterApi();

    @POST
    @Path("/add")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Adds new printer, and sets it to default if specified.", response = ErrorModel.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Add printer result", response = ErrorModel.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ErrorModel.class) })

    public Response printerAddPost(@ApiParam(value = "",required=true) @QueryParam("hardwareId") String hardwareId,@ApiParam(value = "",required=true) @QueryParam("controlCode") String controlCode,@ApiParam(value = "",required=true) @QueryParam("isDefault") Boolean isDefault,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.printerAddPost(hardwareId,controlCode,isDefault,securityContext);
    }
    @DELETE
    @Path("/delete/{printerId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Deletes printer specified by printerId", response = ErrorModel.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Delete printer result", response = ErrorModel.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ErrorModel.class) })

    public Response printerDeletePrinterIdDelete(@ApiParam(value = "",required=true) @PathParam("printerId") String printerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.printerDeletePrinterIdDelete(printerId,securityContext);
    }
    @GET
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns the list of printers. Saved printers will have a printerId while printers not yet saved won't.", response = Printer.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of printers", response = Printer.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Printer.class, responseContainer = "List") })

    public Response printerListGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.printerListGet(securityContext);
    }
}
