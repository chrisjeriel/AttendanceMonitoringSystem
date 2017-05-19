package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.InquiryApiService;
import ph.com.bpi.api.factories.InquiryApiServiceFactory;

import io.swagger.annotations.ApiParam;



import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;



import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/inquiry")


@io.swagger.annotations.Api(description = "the inquiry API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class InquiryApi  {
   private final InquiryApiService delegate = InquiryApiServiceFactory.getInquiryApi();

   @GET
   @Path("/getMembersList")
   @Produces({ "application/json" })
   @io.swagger.annotations.ApiOperation(value = "", notes = "get list of attendances by session Id", response = ObjectResponse.class, tags={  })
   @io.swagger.annotations.ApiResponses(value = { 
       @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })
   public Response getMembersList(@Context SecurityContext securityContext)
   throws NotFoundException {
       return delegate.getMembersList(securityContext);
   }
   
   @GET
   @Path("/getMember")
   @Produces({ "application/json" })
   @io.swagger.annotations.ApiOperation(value = "", notes = "get list of attendances by session Id", response = ObjectResponse.class, tags={  })
   @io.swagger.annotations.ApiResponses(value = { 
       @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })
   public Response getMember(@ApiParam(value = "",required=true) @QueryParam("idNumber") String idNumber, @Context SecurityContext securityContext)
   throws NotFoundException {
       return delegate.getMember(idNumber, securityContext);
   }
}
