package ph.com.bpi.api.factories;

import ph.com.bpi.api.ClientHistoryApiService;
import ph.com.bpi.api.impl.ClientHistoryApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ClientHistoryApiServiceFactory {

   private final static ClientHistoryApiService service = new ClientHistoryApiServiceImpl();

   public static ClientHistoryApiService getClientHistoryApi()
   {
      return service;
   }
}
