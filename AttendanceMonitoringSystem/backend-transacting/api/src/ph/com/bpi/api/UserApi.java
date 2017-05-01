package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.UserApiService;
import ph.com.bpi.api.factories.UserApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/user")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the user API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-09T10:06:22.771+08:00")
public class UserApi  {
   private final UserApiService delegate = UserApiServiceFactory.getUserApi();

    @POST
    @Path("/add")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "ADD user", notes = "CBG-FX (Transacting) Add User", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })
    public Response userAddPost(@ApiParam(value = "",required=true) @QueryParam("tran_fi") String tranFi
,@ApiParam(value = "",required=true) @QueryParam("brch_code") String brchCode
,@ApiParam(value = "",required=true) @QueryParam("user_id") String userId
,@ApiParam(value = "",required=true) @QueryParam("lname") String lname
,@ApiParam(value = "",required=true) @QueryParam("fname") String fname
,@ApiParam(value = "",required=true) @QueryParam("mname") String mname
,@ApiParam(value = "",required=true) @QueryParam("user_type") String userType
,@ApiParam(value = "",required=true) @QueryParam("nbrch_code") String nbrchCode
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userAddPost(tranFi,brchCode,userId,lname,fname,mname,userType,nbrchCode,securityContext);
    }
    @POST
    @Path("/delete")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "delete user", notes = "Delete USER", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })
    public Response userDeletePost(@ApiParam(value = "",required=true) @QueryParam("tran_fi") String tranFi
,@ApiParam(value = "",required=true) @QueryParam("brch_code") String brchCode
,@ApiParam(value = "",required=true) @QueryParam("user_id") String userId
,@ApiParam(value = "",required=true) @QueryParam("lname") String lname
,@ApiParam(value = "",required=true) @QueryParam("fname") String fname
,@ApiParam(value = "",required=true) @QueryParam("mname") String mname
,@ApiParam(value = "",required=true) @QueryParam("user_type") String userType
,@ApiParam(value = "",required=true) @QueryParam("nbrch_code") String nbrchCode
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userDeletePost(tranFi,brchCode,userId,lname,fname,mname,userType,nbrchCode,securityContext);
    }

    @GET
    @Path("/get")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "GET user", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })
    public Response userGetGet(@ApiParam(value = "",required=true) @QueryParam("user_id") String userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userGetGet(userId,securityContext);
    }
    @GET
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "LIST user", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })
    public Response userListGet(@ApiParam(value = "",required=true) @QueryParam("tran_fi") String tranFi
,@ApiParam(value = "",required=true) @QueryParam("brch_code") String brchCode
,@ApiParam(value = "",required=true) @QueryParam("user_id") String userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userListGet(tranFi,brchCode,userId,securityContext);
    }
    @POST
    @Path("/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "UPDATE user", notes = "Update User", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })
    public Response userUpdatePost(@ApiParam(value = "",required=true) @QueryParam("tran_fi") String tranFi
,@ApiParam(value = "",required=true) @QueryParam("brch_code") String brchCode
,@ApiParam(value = "",required=true) @QueryParam("user_id") String userId
,@ApiParam(value = "",required=true) @QueryParam("lname") String lname
,@ApiParam(value = "",required=true) @QueryParam("fname") String fname
,@ApiParam(value = "",required=true) @QueryParam("mname") String mname
,@ApiParam(value = "",required=true) @QueryParam("user_type") String userType
,@ApiParam(value = "",required=true) @QueryParam("nbrch_code") String nbrchCode
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userUpdatePost(tranFi,brchCode,userId,lname,fname,mname,userType,nbrchCode,securityContext);
    }
}
