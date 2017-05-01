package ph.com.bpi.api.factories;

import ph.com.bpi.api.LoginApiService;
import ph.com.bpi.api.impl.LoginApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class LoginApiServiceFactory {

   private final static LoginApiService service = new LoginApiServiceImpl();

   public static LoginApiService getLoginApi()
   {
      return service;
   }
}
