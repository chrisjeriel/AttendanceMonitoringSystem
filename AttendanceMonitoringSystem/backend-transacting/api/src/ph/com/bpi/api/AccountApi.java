package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.AccountApiService;
import ph.com.bpi.api.factories.AccountApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.ErrorModel;
import ph.com.bpi.model.LoginResult;
import ph.com.bpi.model.CpResponse;
import java.util.Date;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/account")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the account API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class AccountApi  {
   private final AccountApiService delegate = AccountApiServiceFactory.getAccountApi();

    @POST
    @Path("/firstOfficerOverride")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "First Officer override facility", response = ErrorModel.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "First Officer override response", response = ErrorModel.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = ErrorModel.class) })

    public Response accountFirstOfficerOverridePost(@ApiParam(value = "First Officer's User ID",required=true) @QueryParam("userId") String userId,@ApiParam(value = "First Officer's password",required=true) @QueryParam("userPassword") String userPassword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.accountFirstOfficerOverridePost(userId,userPassword,securityContext);
    }
    @POST
    @Path("/login")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "User login stuff", response = LoginResult.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Login response", response = LoginResult.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = LoginResult.class) })

    public Response userLogin(@ApiParam(value = "Office Code",required=true) @QueryParam("officeCode") String officeCode,@ApiParam(value = "User ID to be logged in",required=true) @QueryParam("userId") String userId,@ApiParam(value = "User password",required=true) @QueryParam("userPassword") String userPassword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userLogin(officeCode,userId,userPassword,securityContext);
    }
    @POST
    @Path("/logout")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "User signout", response = ErrorModel.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Logout response", response = ErrorModel.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = ErrorModel.class) })

    public Response accountLogoutPost(@ApiParam(value = "User ID to be logged out",required=true) @QueryParam("userId") String userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.accountLogoutPost(userId,securityContext);
    }
    @POST
    @Path("/secondOfficerOverride")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Seconde Officer override facility", response = ErrorModel.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Second Officer override response", response = ErrorModel.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = ErrorModel.class) })

    public Response accountSecondOfficerOverridePost(@ApiParam(value = "Second Officer's User ID",required=true) @QueryParam("userId") String userId,@ApiParam(value = "Second Officer's password",required=true) @QueryParam("userPassword") String userPassword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.accountSecondOfficerOverridePost(userId,userPassword,securityContext);
    }
    @PUT
    @Path("/{userId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Change password", response = CpResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Change password response", response = CpResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = CpResponse.class) })

    public Response accountUserIdPut(@ApiParam(value = "Date of Transaction in MM/DD/YYYY format",required=true) @QueryParam("transactionDate") Date transactionDate,@ApiParam(value = "Office Code",required=true) @QueryParam("officeCode") String officeCode,@ApiParam(value = "User ID to be logged in",required=true) @PathParam("userId") String userId,@ApiParam(value = "User's old password",required=true) @QueryParam("oldPassword") String oldPassword,@ApiParam(value = "Proposed new password",required=true) @QueryParam("newPassword") String newPassword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.accountUserIdPut(transactionDate,officeCode,userId,oldPassword,newPassword,securityContext);
    }
}
