package ph.com.bpi.api.factories;

import ph.com.bpi.api.IncomeApiService;
import ph.com.bpi.api.impl.IncomeApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class IncomeApiServiceFactory {

   private final static IncomeApiService service = new IncomeApiServiceImpl();

   public static IncomeApiService getIncomeApi()
   {
      return service;
   }
}
