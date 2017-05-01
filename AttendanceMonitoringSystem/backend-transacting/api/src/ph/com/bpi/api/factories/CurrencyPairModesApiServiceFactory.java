package ph.com.bpi.api.factories;

import ph.com.bpi.api.CurrencyPairModesApiService;
import ph.com.bpi.api.impl.CurrencyPairModesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CurrencyPairModesApiServiceFactory {

   private final static CurrencyPairModesApiService service = new CurrencyPairModesApiServiceImpl();

   public static CurrencyPairModesApiService getCurrencyPairModesApi()
   {
      return service;
   }
}
