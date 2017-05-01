package ph.com.bpi.api.factories;

import ph.com.bpi.api.MaintenanceApiService;
import ph.com.bpi.api.impl.MaintenanceApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class MaintenanceApiServiceFactory {

   private final static MaintenanceApiService service = new MaintenanceApiServiceImpl();

   public static MaintenanceApiService getMaintenanceApi()
   {
      return service;
   }
}
