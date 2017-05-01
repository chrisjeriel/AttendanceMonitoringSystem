package ph.com.bpi.api.factories;

import ph.com.bpi.api.LogoffApiService;
import ph.com.bpi.api.impl.LogoffApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class LogoffApiServiceFactory {

   private final static LogoffApiService service = new LogoffApiServiceImpl();

   public static LogoffApiService getLogoffApi()
   {
      return service;
   }
}
