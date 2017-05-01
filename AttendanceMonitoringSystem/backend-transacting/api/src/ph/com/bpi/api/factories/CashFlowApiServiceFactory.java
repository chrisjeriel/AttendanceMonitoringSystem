package ph.com.bpi.api.factories;

import ph.com.bpi.api.CashFlowApiService;
import ph.com.bpi.api.impl.CashFlowApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CashFlowApiServiceFactory {

   private final static CashFlowApiService service = new CashFlowApiServiceImpl();

   public static CashFlowApiService getCashFlowApi()
   {
      return service;
   }
}
