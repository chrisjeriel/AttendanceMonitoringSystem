package ph.com.bpi.api.factories;

import ph.com.bpi.api.InitialLogonApiService;
import ph.com.bpi.api.impl.InitialLogonApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-09T14:07:28.663+08:00")
public class InitialLogonApiServiceFactory {
    private final static InitialLogonApiService service = new InitialLogonApiServiceImpl();

    public static InitialLogonApiService getInitialLogonApi() {
        return service;
    }
}
