package ph.com.bpi.api.factories;

import ph.com.bpi.api.AcceptanceSettlementModeApiService;
import ph.com.bpi.api.impl.AcceptanceSettlementModeApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class AcceptanceSettlementModeApiServiceFactory {

   private final static AcceptanceSettlementModeApiService service = new AcceptanceSettlementModeApiServiceImpl();

   public static AcceptanceSettlementModeApiService getAcceptanceSettlementModeApi()
   {
      return service;
   }
}
