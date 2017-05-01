package ph.com.bpi.api.factories;

import ph.com.bpi.api.DeletelogApiService;
import ph.com.bpi.api.impl.DeletelogApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class DeletelogApiServiceFactory {

   private final static DeletelogApiService service = new DeletelogApiServiceImpl();

   public static DeletelogApiService getDeletelogApi()
   {
      return service;
   }
}
