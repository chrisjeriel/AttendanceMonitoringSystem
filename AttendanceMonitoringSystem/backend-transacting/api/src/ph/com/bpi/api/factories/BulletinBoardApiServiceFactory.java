package ph.com.bpi.api.factories;

import ph.com.bpi.api.BulletinBoardApiService;
import ph.com.bpi.api.impl.BulletinBoardApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class BulletinBoardApiServiceFactory {

   private final static BulletinBoardApiService service = new BulletinBoardApiServiceImpl();

   public static BulletinBoardApiService getBulletinBoardApi()
   {
      return service;
   }
}
