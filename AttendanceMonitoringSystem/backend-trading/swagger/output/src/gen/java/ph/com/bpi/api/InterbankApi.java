package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.InterbankApiService;
import ph.com.bpi.api.factories.InterbankApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/interbank")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the interbank API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-01T15:13:18.774+08:00")
public class InterbankApi  {
   private final InterbankApiService delegate = InterbankApiServiceFactory.getInterbankApi();

    @GET
    @Path("/inquiry/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Interbank – Inquiry - List", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })
    public Response interbankInquiryListGet(@ApiParam(value = "transaction indicator",required=true) @QueryParam("tranIndtr") String tranIndtr
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.interbankInquiryListGet(tranIndtr,securityContext);
    }
}
