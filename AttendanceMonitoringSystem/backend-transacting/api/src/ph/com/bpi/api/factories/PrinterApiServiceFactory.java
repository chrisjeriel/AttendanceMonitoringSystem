package ph.com.bpi.api.factories;

import ph.com.bpi.api.PrinterApiService;
import ph.com.bpi.api.impl.PrinterApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class PrinterApiServiceFactory {

   private final static PrinterApiService service = new PrinterApiServiceImpl();

   public static PrinterApiService getPrinterApi()
   {
      return service;
   }
}
