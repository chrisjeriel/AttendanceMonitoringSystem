package ph.com.bpi.api.factories;

import ph.com.bpi.api.CurrencyCodeApiService;
import ph.com.bpi.api.impl.CurrencyCodeApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CurrencyCodeApiServiceFactory {

   private final static CurrencyCodeApiService service = new CurrencyCodeApiServiceImpl();

   public static CurrencyCodeApiService getCurrencyCodeApi()
   {
      return service;
   }
}
