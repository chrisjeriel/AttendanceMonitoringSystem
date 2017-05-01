package ph.com.bpi.api.factories;

import ph.com.bpi.api.SysRefApiService;
import ph.com.bpi.api.impl.SysRefApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class SysRefApiServiceFactory {
    private final static SysRefApiService service = new SysRefApiServiceImpl();

    public static SysRefApiService getSysRefApi() {
        return service;
    }
}
