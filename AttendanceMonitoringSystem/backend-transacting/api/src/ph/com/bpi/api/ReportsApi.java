package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.ReportsApiService;
import ph.com.bpi.api.factories.ReportsApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.ErrorModel;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/reports")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the reports API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ReportsApi  {
   private final ReportsApiService delegate = ReportsApiServiceFactory.getReportsApi();

    @GET
    @Path("/acceptedTCs/{transactionType}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Displays accepted traveler's checks for the day, filtered by transaction type", response = String.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of lines to be displayed. This is originally a large string of what the report will look like, but was split to an array for easier display.", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = String.class, responseContainer = "List") })

    public Response reportsAcceptedTCsTransactionTypeGet(@ApiParam(value = "",required=true, allowableValues="forex, btsu, tmu") @PathParam("transactionType") String transactionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.reportsAcceptedTCsTransactionTypeGet(transactionType,securityContext);
    }
    @GET
    @Path("/dailySummary/{transactionType}/{category}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Displays transactions for the day, filtered by transaction type and category", response = String.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of lines to be displayed. This is originally a large string of what the report will look like, but was split to an array for easier display.", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = String.class, responseContainer = "List") })

    public Response reportsDailySummaryTransactionTypeCategoryGet(@ApiParam(value = "",required=true, allowableValues="forex, btsu, tmu") @PathParam("transactionType") String transactionType,@ApiParam(value = "",required=true, allowableValues="purchase, sale") @PathParam("category") String category,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.reportsDailySummaryTransactionTypeCategoryGet(transactionType,category,securityContext);
    }
    @GET
    @Path("/errorCorrected/{transactionType}/{category}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Displays error-corrected transactions for the day, filtered by transaction type and category", response = String.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of lines to be displayed. This is originally a large string of what the report will look like, but was split to an array for easier display.", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = String.class, responseContainer = "List") })

    public Response reportsErrorCorrectedTransactionTypeCategoryGet(@ApiParam(value = "",required=true, allowableValues="forex, btsu, tmu") @PathParam("transactionType") String transactionType,@ApiParam(value = "",required=true, allowableValues="purchase, sale") @PathParam("category") String category,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.reportsErrorCorrectedTransactionTypeCategoryGet(transactionType,category,securityContext);
    }
    @GET
    @Path("/issuedMCs/{transactionType}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Displays issued manager's checks for the day, filtered by transaction type", response = String.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of lines to be displayed. This is originally a large string of what the report will look like, but was split to an array for easier display.", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = String.class, responseContainer = "List") })

    public Response reportsIssuedMCsTransactionTypeGet(@ApiParam(value = "",required=true, allowableValues="forex, btsu, tmu") @PathParam("transactionType") String transactionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.reportsIssuedMCsTransactionTypeGet(transactionType,securityContext);
    }
    @GET
    @Path("/printErrorCorrected/{transactionType}/{category}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Displays error-corrected transactions for the day, filtered by transaction type and category", response = ErrorModel.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Print operation result", response = ErrorModel.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ErrorModel.class) })

    public Response reportsPrintErrorCorrectedTransactionTypeCategoryGet(@ApiParam(value = "",required=true, allowableValues="forex, btsu, tmu") @PathParam("transactionType") String transactionType,@ApiParam(value = "",required=true, allowableValues="purchase, sale") @PathParam("category") String category,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.reportsPrintErrorCorrectedTransactionTypeCategoryGet(transactionType,category,securityContext);
    }
    @GET
    @Path("/printIssuedMCs/{transactionType}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Displays issued manager's checks for the day, filtered by transaction type", response = ErrorModel.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Print operation result", response = ErrorModel.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ErrorModel.class) })

    public Response reportsPrintIssuedMCsTransactionTypeGet(@ApiParam(value = "",required=true, allowableValues="forex, btsu, tmu") @PathParam("transactionType") String transactionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.reportsPrintIssuedMCsTransactionTypeGet(transactionType,securityContext);
    }
    @GET
    @Path("/printacceptedTCs/{transactionType}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Displays accepted traveler's checks for the day, filtered by transaction type", response = ErrorModel.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Print operation result", response = ErrorModel.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ErrorModel.class) })

    public Response reportsPrintacceptedTCsTransactionTypeGet(@ApiParam(value = "",required=true, allowableValues="forex, btsu, tmu") @PathParam("transactionType") String transactionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.reportsPrintacceptedTCsTransactionTypeGet(transactionType,securityContext);
    }
    @GET
    @Path("/printdailySummary/{transactionType}/{category}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Displays transactions for the day, filtered by transaction type and category", response = ErrorModel.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Print operation result", response = ErrorModel.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ErrorModel.class) })

    public Response reportsPrintdailySummaryTransactionTypeCategoryGet(@ApiParam(value = "",required=true, allowableValues="forex, btsu, tmu") @PathParam("transactionType") String transactionType,@ApiParam(value = "",required=true, allowableValues="purchase, sale") @PathParam("category") String category,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.reportsPrintdailySummaryTransactionTypeCategoryGet(transactionType,category,securityContext);
    }
}
