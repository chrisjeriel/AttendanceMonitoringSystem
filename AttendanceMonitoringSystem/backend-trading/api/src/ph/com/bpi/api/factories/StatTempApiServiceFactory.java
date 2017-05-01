package ph.com.bpi.api.factories;

import ph.com.bpi.api.StatTempApiService;
import ph.com.bpi.api.impl.StatTempApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class StatTempApiServiceFactory {
    private final static StatTempApiService service = new StatTempApiServiceImpl();

    public static StatTempApiService getStatTempApi() {
        return service;
    }
}
