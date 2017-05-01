package ph.com.bpi.api;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;

 

import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public abstract class InvisibleCodeApiService {
  
      public abstract Response invisibleCodeListGet(String trdrFi,String inviCode,String proctag,SecurityContext securityContext)
      throws NotFoundException;
  
}
