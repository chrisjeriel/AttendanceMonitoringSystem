package ph.com.bpi.api;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;

 

import ph.com.bpi.model.ErrorModel;
import ph.com.bpi.model.LoginResult;
import ph.com.bpi.model.CpResponse;
import java.util.Date;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public abstract class AccountApiService {
  
      public abstract Response accountFirstOfficerOverridePost(String userId,String userPassword,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response userLogin(String officeCode,String userId,String userPassword,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response accountLogoutPost(String userId,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response accountSecondOfficerOverridePost(String userId,String userPassword,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response accountUserIdPut(Date transactionDate,String officeCode,String userId,String oldPassword,String newPassword,SecurityContext securityContext)
      throws NotFoundException;
  
}
