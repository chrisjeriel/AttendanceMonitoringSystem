package ph.com.bpi.api;

import java.util.HashMap;

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
import ph.com.bpi.api.factories.AttendanceApiServiceFactory;
import ph.com.bpi.model.ObjectResponse;

@Path("/attendance")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the attendance API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class AttendanceApi  {
   private final AttendanceApiService delegate = AttendanceApiServiceFactory.getAttendanceApi();
   
   //GET Methods
   @GET
   @Path("/getSessionsList")
   @Produces({ "application/json" })
   @io.swagger.annotations.ApiOperation(value = "", notes = "get list of sessions by date", response = ObjectResponse.class, tags={  })
   @io.swagger.annotations.ApiResponses(value = { 
       @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })
   public Response getSessionsList(@ApiParam(value = "",required=true) @QueryParam("date") String date, @Context SecurityContext securityContext)
   throws NotFoundException {
       return delegate.getSessionsList(date, securityContext);
   }
   
   @GET
   @Path("/getAttendanceList")
   @Produces({ "application/json" })
   @io.swagger.annotations.ApiOperation(value = "", notes = "get list of attendances by session Id", response = ObjectResponse.class, tags={  })
   @io.swagger.annotations.ApiResponses(value = { 
       @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })
   public Response getAttendanceList(@ApiParam(value = "",required=true) @QueryParam("sessionId") String sessionId, @Context SecurityContext securityContext)
   throws NotFoundException {
       return delegate.getAttendanceList(sessionId, securityContext);
   }
   
   //POST Methods
   @POST
   @Path("/saveTimePost")
   @Produces({ "application/json" })
   @io.swagger.annotations.ApiOperation(value = "", notes = "get list of attendances by session Id", response = ObjectResponse.class, tags={  })
   @io.swagger.annotations.ApiResponses(value = { 
       @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })
   public Response saveAttendanceTimePost(@ApiParam(value = "transacting unit body" ,required=true) HashMap<String, String> paramData, @Context SecurityContext securityContext)
   throws NotFoundException {
       return delegate.saveAttendanceTimePost(paramData, securityContext);
   }
}
