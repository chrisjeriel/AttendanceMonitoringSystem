package ph.com.bpi.api.factories;

import ph.com.bpi.api.McroApiService;
import ph.com.bpi.api.impl.McroApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class McroApiServiceFactory {
    private final static McroApiService service = new McroApiServiceImpl();

    public static McroApiService getMcroApi() {
        return service;
    }
}
