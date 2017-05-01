package ph.com.bpi.api.factories;

import ph.com.bpi.api.SysParamApiService;
import ph.com.bpi.api.impl.SysParamApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class SysParamApiServiceFactory {
    private final static SysParamApiService service = new SysParamApiServiceImpl();

    public static SysParamApiService getSysParamApi() {
        return service;
    }
}
