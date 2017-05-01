package ph.com.bpi.api.factories;

import ph.com.bpi.api.SysadApiService;
import ph.com.bpi.api.impl.SysadApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SysadApiServiceFactory {

   private final static SysadApiService service = new SysadApiServiceImpl();

   public static SysadApiService getSysadApi()
   {
      return service;
   }
}
