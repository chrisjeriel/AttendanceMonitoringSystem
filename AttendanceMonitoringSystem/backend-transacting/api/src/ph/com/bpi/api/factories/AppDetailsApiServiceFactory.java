package ph.com.bpi.api.factories;

import ph.com.bpi.api.AppDetailsApiService;
import ph.com.bpi.api.impl.AppDetailsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class AppDetailsApiServiceFactory {

   private final static AppDetailsApiService service = new AppDetailsApiServiceImpl();

   public static AppDetailsApiService getAppDetailsApi()
   {
      return service;
   }
}
