package ph.com.bpi.api.factories;

import ph.com.bpi.api.InquiryApiService;
import ph.com.bpi.api.impl.InquiryApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class InquiryApiServiceFactory {

   private final static InquiryApiService service = new InquiryApiServiceImpl();

   public static InquiryApiService getInquiryApi()
   {
      return service;
   }
}
