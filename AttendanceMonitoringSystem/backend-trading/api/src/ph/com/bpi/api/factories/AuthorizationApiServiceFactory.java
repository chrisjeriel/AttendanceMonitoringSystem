package ph.com.bpi.api.factories;

import ph.com.bpi.api.AuthorizationApiService;
import ph.com.bpi.api.impl.AuthorizationApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class AuthorizationApiServiceFactory {

   private final static AuthorizationApiService service = new AuthorizationApiServiceImpl();

   public static AuthorizationApiService getAuthorizationApi()
   {
      return service;
   }
}
