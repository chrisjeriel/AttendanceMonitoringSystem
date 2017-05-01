package ph.com.bpi.api.factories;

import ph.com.bpi.api.CheckCutoffApiService;
import ph.com.bpi.api.impl.CheckCutoffApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CheckCutoffApiServiceFactory {

   private final static CheckCutoffApiService service = new CheckCutoffApiServiceImpl();

   public static CheckCutoffApiService getCheckCutoffApi()
   {
      return service;
   }
}
