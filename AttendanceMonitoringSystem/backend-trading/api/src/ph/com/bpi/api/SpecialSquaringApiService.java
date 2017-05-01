package ph.com.bpi.api;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;



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



import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public abstract class SpecialSquaringApiService {
  
      public abstract Response specialSquaringApprovePost(SpecialSquaringApproveBody specialSquaringApprove,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response specialSquaringComputePost(SpecialSquaringComputeBody specialSquaringCompute,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response specialSquaringFinalUpdatePost(SpecialSquaringFinalBody specialSquaringFinal,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response specialSquaringListPost(SpecialSquaringListBody specialSquaringNew,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response specialSquaringNewTransProcessPost(SpecialSquaringNewBody specialSquaringNew,SecurityContext securityContext)
      throws NotFoundException;
  
}
