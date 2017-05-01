package ph.com.bpi.api.factories;

import ph.com.bpi.api.TransactingUnitApiService;
import ph.com.bpi.api.impl.TransactingUnitApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class TransactingUnitApiServiceFactory {

   private final static TransactingUnitApiService service = new TransactingUnitApiServiceImpl();

   public static TransactingUnitApiService getTransactingUnitApi()
   {
      return service;
   }
}
