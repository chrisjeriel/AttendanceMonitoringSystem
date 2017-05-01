package ph.com.bpi.api.factories;

import ph.com.bpi.api.ReferenceFilesApiService;
import ph.com.bpi.api.impl.ReferenceFilesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ReferenceFilesApiServiceFactory {

   private final static ReferenceFilesApiService service = new ReferenceFilesApiServiceImpl();

   public static ReferenceFilesApiService getReferenceFilesApi()
   {
      return service;
   }
}
