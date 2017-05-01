package ph.com.bpi.api;

import ph.com.bpi.api.InterbankApiService;
import ph.com.bpi.api.factories.InterbankApiServiceFactory;

import io.swagger.annotations.ApiParam;



import ph.com.bpi.model.InterbankDataEntryBody;
import ph.com.bpi.model.ObjectResponse;
import ph.com.bpi.model.InterbankDefineFileProcessBody;
import ph.com.bpi.model.InterbankErrorCorrectBody;

import ph.com.bpi.api.NotFoundException;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/interbank")


@io.swagger.annotations.Api(description = "the interbank API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class InterbankApi  {
   private final InterbankApiService delegate = InterbankApiServiceFactory.getInterbankApi();

   @PUT
   @Path("/define-file/process")
   
   @Produces({ "application/json" })
   @io.swagger.annotations.ApiOperation(value = "", notes = "Interbank – Define File - Process", response = ObjectResponse.class, tags={  })
   @io.swagger.annotations.ApiResponses(value = { 
       @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

   public Response interbankDefineFileProcessPut(@ApiParam(value = "interbank define file process parameter object" ,required=true) InterbankDefineFileProcessBody interbankDefineFileProcess,@Context SecurityContext securityContext)
   throws NotFoundException {
       return delegate.interbankDefineFileProcessPut(interbankDefineFileProcess,securityContext);
   }
   @DELETE
   @Path("/define-file/process")
   
   @Produces({ "application/json" })
   @io.swagger.annotations.ApiOperation(value = "", notes = "Interbank – Define File - Process", response = ObjectResponse.class, tags={  })
   @io.swagger.annotations.ApiResponses(value = { 
       @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

   public Response interbankDefineFileProcessDelete(@ApiParam(value = "interbank define file process parameter object" ,required=true) InterbankDefineFileProcessBody interbankDefineFileProcess,@Context SecurityContext securityContext)
   throws NotFoundException {
       return delegate.interbankDefineFileProcessDelete(interbankDefineFileProcess,securityContext);
   }
    @POST
    @Path("/data-entry")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Interbank – Define Entry", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response interbankDataEntryPost(@ApiParam(value = "interbank data entry parameter object" ,required=true) InterbankDataEntryBody interbankDataEntry,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.interbankDataEntryPost(interbankDataEntry,securityContext);
    }
    @GET
    @Path("/define-file/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Interbank – Define File - List", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response interbankDefineFileListPost(@ApiParam(value = "bank code",required=true) @QueryParam("bankCode") String bankCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.interbankDefineFileListPost(bankCode,securityContext);
    }
    @POST
    @Path("/define-file/process")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Interbank – Define File - Process", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response interbankDefineFileProcessPost(@ApiParam(value = "interbank define file process parameter object" ,required=true) InterbankDefineFileProcessBody interbankDefineFileProcess,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.interbankDefineFileProcessPost(interbankDefineFileProcess,securityContext);
    }
    @POST
    @Path("/error-correct")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Interbank – Error Correct", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response interbankErrorCorrectPost(@ApiParam(value = "interbank error correct parameter object" ,required=true) InterbankErrorCorrectBody interbankErrorCorrect,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.interbankErrorCorrectPost(interbankErrorCorrect,securityContext);
    }
    @GET
    @Path("/inquiry/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Interbank – Inquiry - List", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response interbankInquiryListPost(@ApiParam(value = "transaction indicator",required=true) @QueryParam("tranIndtr") String tranIndtr,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.interbankInquiryListPost(tranIndtr,securityContext);
    }
    @GET
    @Path("/inquiry/list/next")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Interbank – Inquiry - List", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response interbankInquiryListNextPost(@ApiParam(value = "transaction indicator",required=true) @QueryParam("tranIndtr") String tranIndtr,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.interbankInquiryListNextPost(tranIndtr,securityContext);
    }
    @GET
    @Path("/inquiry/{refNo}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Interbank – Inquiry by Reference Number", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response interbankInquiryRefNoPost(@ApiParam(value = "reference number",required=true) @PathParam("refNo") String refNo,@ApiParam(value = "transaction indicator",required=true) @QueryParam("tranIndtr") String tranIndtr,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.interbankInquiryRefNoPost(refNo,tranIndtr,securityContext);
    }
    @GET
    @Path("/loa/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Interbank – LOA - List", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response interbankLoaListPost(@ApiParam(value = "tranIndtr",required=true) @QueryParam("tranIndtr") String tranIndtr,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.interbankLoaListPost(tranIndtr,securityContext);
    }
    @GET
    @Path("/loa/list/next")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Interbank – LOA - List - Next", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response interbankLoaListNextPost(@ApiParam(value = "tranIndtr",required=true) @QueryParam("tranIndtr") String tranIndtr,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.interbankLoaListNextPost(tranIndtr,securityContext);
    }
    @GET
    @Path("/loa/purchase/print")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Interbank – LOA - Purchase - Print", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response interbankLoaPurchasePrintPost(@ApiParam(value = "gLogDate",required=true) @QueryParam("gLogDate") String gLogDate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.interbankLoaPurchasePrintPost(gLogDate,securityContext);
    }
    @GET
    @Path("/loa/sale/print")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Interbank – LOA - Sale - Print", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response interbankLoaSalePrintPost(@ApiParam(value = "gLogDate",required=true) @QueryParam("gLogDate") String gLogDate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.interbankLoaSalePrintPost(gLogDate,securityContext);
    }
    @GET
    @Path("/report")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Interbank – Report", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response interbankReportPost(@ApiParam(value = "reference number",required=true) @QueryParam("refNo") String refNo,@ApiParam(value = "transaction indicator",required=true) @QueryParam("tranIndtr") String tranIndtr,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.interbankReportPost(refNo, tranIndtr,securityContext);
    }
}
