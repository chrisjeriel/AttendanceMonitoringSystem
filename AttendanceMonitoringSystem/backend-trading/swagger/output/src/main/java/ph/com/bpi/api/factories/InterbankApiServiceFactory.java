package ph.com.bpi.api.factories;

import ph.com.bpi.api.InterbankApiService;
import ph.com.bpi.api.impl.InterbankApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-01T15:13:18.774+08:00")
public class InterbankApiServiceFactory {
    private final static InterbankApiService service = new InterbankApiServiceImpl();

    public static InterbankApiService getInterbankApi() {
        return service;
    }
}
