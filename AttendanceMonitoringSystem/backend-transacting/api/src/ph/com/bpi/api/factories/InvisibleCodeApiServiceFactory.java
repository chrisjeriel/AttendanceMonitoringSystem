package ph.com.bpi.api.factories;

import ph.com.bpi.api.InvisibleCodeApiService;
import ph.com.bpi.api.impl.InvisibleCodeApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class InvisibleCodeApiServiceFactory {

   private final static InvisibleCodeApiService service = new InvisibleCodeApiServiceImpl();

   public static InvisibleCodeApiService getInvisibleCodeApi()
   {
      return service;
   }
}
