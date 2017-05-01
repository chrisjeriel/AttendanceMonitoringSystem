package ph.com.bpi.api.impl;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;

 

import ph.com.bpi.model.Failed;
import ph.com.bpi.model.Historicalrecordslist;
import java.util.Date;
import ph.com.bpi.model.Historicalrecordssummary;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ClientHistoricalRecordApiServiceImpl extends ClientHistoricalRecordApiService {
  
      @Override
      public Response clientHistoricalRecordListGet(String tranIndc,Date tranDate,String tranTime,String cLname,String cFname,String cMname,String proctag,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response clientHistoricalRecordListSummaryGet(String tranIndc,String searchTag,String cLname,String cFname,String cMname,String proctag,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
}
