package ph.com.bpi.api.factories;

import ph.com.bpi.api.LogoffApiService;
import ph.com.bpi.api.impl.LogoffApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-08T16:20:30.216+08:00")
public class LogoffApiServiceFactory {
    private final static LogoffApiService service = new LogoffApiServiceImpl();

    public static LogoffApiService getLogoffApi() {
        return service;
    }
}
