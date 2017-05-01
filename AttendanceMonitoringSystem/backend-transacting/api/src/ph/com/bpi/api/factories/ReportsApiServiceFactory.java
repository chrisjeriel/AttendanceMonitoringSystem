package ph.com.bpi.api.factories;

import ph.com.bpi.api.ReportsApiService;
import ph.com.bpi.api.impl.ReportsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ReportsApiServiceFactory {

   private final static ReportsApiService service = new ReportsApiServiceImpl();

   public static ReportsApiService getReportsApi()
   {
      return service;
   }
}
