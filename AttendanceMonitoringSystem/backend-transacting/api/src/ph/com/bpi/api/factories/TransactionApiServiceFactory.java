package ph.com.bpi.api.factories;

import ph.com.bpi.api.TransactionApiService;
import ph.com.bpi.api.impl.TransactionApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class TransactionApiServiceFactory {

   private final static TransactionApiService service = new TransactionApiServiceImpl();

   public static TransactionApiService getTransactionApi()
   {
      return service;
   }
}
