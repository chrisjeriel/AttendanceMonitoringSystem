package ph.com.bpi.api;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;


import ph.com.bpi.model.CashFlowBody;
import java.util.*;
import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public abstract class CashFlowApiService {
  
      public abstract Response cashFlowDetailPost(CashFlowBody cashFlowDetail,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response cashFlowListPost(String brchCode,SecurityContext securityContext)
      throws NotFoundException;
  
}
