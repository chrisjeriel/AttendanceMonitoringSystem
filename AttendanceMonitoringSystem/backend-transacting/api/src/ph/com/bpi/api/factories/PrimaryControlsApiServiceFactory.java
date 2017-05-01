package ph.com.bpi.api.factories;

import ph.com.bpi.api.PrimaryControlsApiService;
import ph.com.bpi.api.impl.PrimaryControlsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class PrimaryControlsApiServiceFactory {

   private final static PrimaryControlsApiService service = new PrimaryControlsApiServiceImpl();

   public static PrimaryControlsApiService getPrimaryControlsApi()
   {
      return service;
   }
}
