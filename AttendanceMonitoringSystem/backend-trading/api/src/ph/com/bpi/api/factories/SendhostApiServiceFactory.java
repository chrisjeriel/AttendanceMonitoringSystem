package ph.com.bpi.api.factories;

import ph.com.bpi.api.SendhostApiService;
import ph.com.bpi.api.impl.SendhostApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SendhostApiServiceFactory {

   private final static SendhostApiService service = new SendhostApiServiceImpl();

   public static SendhostApiService getSendhostApi()
   {
      return service;
   }
}
