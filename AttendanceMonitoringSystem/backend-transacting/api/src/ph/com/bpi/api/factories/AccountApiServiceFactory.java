package ph.com.bpi.api.factories;

import ph.com.bpi.api.AccountApiService;
import ph.com.bpi.api.impl.AccountApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class AccountApiServiceFactory {

   private final static AccountApiService service = new AccountApiServiceImpl();

   public static AccountApiService getAccountApi()
   {
      return service;
   }
}
