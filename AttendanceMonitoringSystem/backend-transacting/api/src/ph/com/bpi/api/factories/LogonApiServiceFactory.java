package ph.com.bpi.api.factories;

import ph.com.bpi.api.LogonApiService;
import ph.com.bpi.api.impl.LogonApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-14T13:58:17.342+08:00")
public class LogonApiServiceFactory {
    private final static LogonApiService service = new LogonApiServiceImpl();

    public static LogonApiService getLogonApi() {
        return service;
    }
}
