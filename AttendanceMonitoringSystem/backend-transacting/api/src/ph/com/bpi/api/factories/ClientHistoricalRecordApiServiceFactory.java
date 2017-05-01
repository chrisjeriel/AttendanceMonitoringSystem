package ph.com.bpi.api.factories;

import ph.com.bpi.api.ClientHistoricalRecordApiService;
import ph.com.bpi.api.impl.ClientHistoricalRecordApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ClientHistoricalRecordApiServiceFactory {

   private final static ClientHistoricalRecordApiService service = new ClientHistoricalRecordApiServiceImpl();

   public static ClientHistoricalRecordApiService getClientHistoricalRecordApi()
   {
      return service;
   }
}
