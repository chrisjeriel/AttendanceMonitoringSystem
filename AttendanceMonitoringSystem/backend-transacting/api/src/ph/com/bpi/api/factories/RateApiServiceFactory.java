package ph.com.bpi.api.factories;

import ph.com.bpi.api.RateApiService;
import ph.com.bpi.api.impl.RateApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class RateApiServiceFactory {

   private final static RateApiService service = new RateApiServiceImpl();

   public static RateApiService getRateApi()
   {
      return service;
   }
}
