package ph.com.bpi.api.factories;

import ph.com.bpi.api.SpecialSquaringApiService;
import ph.com.bpi.api.impl.SpecialSquaringApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SpecialSquaringApiServiceFactory {

   private final static SpecialSquaringApiService service = new SpecialSquaringApiServiceImpl();

   public static SpecialSquaringApiService getSpecialSquaringApi()
   {
      return service;
   }
}
