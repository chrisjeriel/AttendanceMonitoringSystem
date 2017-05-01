package ph.com.bpi.api;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;

 

import ph.com.bpi.model.Rates;
import ph.com.bpi.model.Failed;
import ph.com.bpi.model.Otclist;
import ph.com.bpi.model.Tierrates;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public abstract class RateApiService {
  
      public abstract Response rateInquiryGet(Integer trdrFi,Integer rateType,Integer wCurr,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response rateOtcGetGet(String trdrFi,String tranFi,String currCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response rateOtcListGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response rateTierGetGet(String trdrFi,String tranFi,String currCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response rateTierListGet(SecurityContext securityContext)
      throws NotFoundException;
  
}
