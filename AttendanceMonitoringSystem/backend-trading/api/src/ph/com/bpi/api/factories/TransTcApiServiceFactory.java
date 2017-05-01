package ph.com.bpi.api.factories;

import ph.com.bpi.api.TransTcApiService;
import ph.com.bpi.api.impl.TransTcApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class TransTcApiServiceFactory {

   private final static TransTcApiService service = new TransTcApiServiceImpl();

   public static TransTcApiService getTransTcApi()
   {
      return service;
   }
}
