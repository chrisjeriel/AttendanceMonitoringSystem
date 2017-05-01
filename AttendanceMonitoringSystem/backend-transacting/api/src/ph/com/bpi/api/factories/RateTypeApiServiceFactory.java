package ph.com.bpi.api.factories;

import ph.com.bpi.api.RateTypeApiService;
import ph.com.bpi.api.impl.RateTypeApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class RateTypeApiServiceFactory {

   private final static RateTypeApiService service = new RateTypeApiServiceImpl();

   public static RateTypeApiService getRateTypeApi()
   {
      return service;
   }
}
