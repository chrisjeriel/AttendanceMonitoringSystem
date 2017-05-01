package ph.com.bpi.api.factories;

import ph.com.bpi.api.InterbankApiService;
import ph.com.bpi.api.impl.InterbankApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class InterbankApiServiceFactory {

   private final static InterbankApiService service = new InterbankApiServiceImpl();

   public static InterbankApiService getInterbankApi()
   {
      return service;
   }
}
