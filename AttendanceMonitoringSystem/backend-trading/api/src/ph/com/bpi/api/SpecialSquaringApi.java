package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.SpecialSquaringApiService;
import ph.com.bpi.api.factories.SpecialSquaringApiServiceFactory;

import io.swagger.annotations.ApiParam;



import ph.com.bpi.model.SpecialSquaringApproveBody;
import java.util.*;
import ph.com.bpi.model.ObjectResponse;
import ph.com.bpi.model.SpecialSquaringComputeBody;
import ph.com.bpi.model.SpecialSquaringFinalBody;
import ph.com.bpi.model.SpecialSquaringListBody;
import ph.com.bpi.model.SpecialSquaringNewBody;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;



import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/special-squaring")


@io.swagger.annotations.Api(description = "the special-squaring API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SpecialSquaringApi  {
   private final SpecialSquaringApiService delegate = SpecialSquaringApiServiceFactory.getSpecialSquaringApi();

    @POST
    @Path("/approve")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Special Squaring - Treasury Approval", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response specialSquaringApprovePost(@ApiParam(value = "special squaring approve parameter object" ,required=true) SpecialSquaringApproveBody specialSquaringApprove,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.specialSquaringApprovePost(specialSquaringApprove,securityContext);
    }
    @POST
    @Path("/compute")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Special Squaring - Data Entry - Compute", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response specialSquaringComputePost(@ApiParam(value = "special squaring compuete parameter object" ,required=true) SpecialSquaringComputeBody specialSquaringCompute,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.specialSquaringComputePost(specialSquaringCompute,securityContext);
    }
    @POST
    @Path("/final-update")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Special Squaring - Final Update", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response specialSquaringFinalUpdatePost(@ApiParam(value = "special squaring approve parameter object" ,required=true) SpecialSquaringFinalBody specialSquaringFinal,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.specialSquaringFinalUpdatePost(specialSquaringFinal,securityContext);
    }
    @POST
    @Path("/list")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Special Squaring - List", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response specialSquaringListPost(@ApiParam(value = "special squaring list parameter object" ,required=true) SpecialSquaringListBody specialSquaringNew,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.specialSquaringListPost(specialSquaringNew,securityContext);
    }
    @POST
    @Path("/new-trans/process")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Special Squaring - Data Entry - New Transaction", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "meta", response = ObjectResponse.class) })

    public Response specialSquaringNewTransProcessPost(@ApiParam(value = "special squaring new transaction parameter object" ,required=true) SpecialSquaringNewBody specialSquaringNew,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.specialSquaringNewTransProcessPost(specialSquaringNew,securityContext);
    }
}
