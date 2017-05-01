package ph.com.bpi.api.factories;

import ph.com.bpi.api.MtsCodeApiService;
import ph.com.bpi.api.impl.MtsCodeApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class MtsCodeApiServiceFactory {

   private final static MtsCodeApiService service = new MtsCodeApiServiceImpl();

   public static MtsCodeApiService getMtsCodeApi()
   {
      return service;
   }
}
