package ph.com.bpi.api.factories;

import ph.com.bpi.api.TablesApiService;
import ph.com.bpi.api.impl.TablesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class TablesApiServiceFactory {

   private final static TablesApiService service = new TablesApiServiceImpl();

   public static TablesApiService getTablesApi()
   {
      return service;
   }
}
