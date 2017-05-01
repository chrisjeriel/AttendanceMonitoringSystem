package ph.com.bpi.api.factories;

import ph.com.bpi.api.UserApiService;
import ph.com.bpi.api.impl.UserApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-09T10:06:22.771+08:00")
public class UserApiServiceFactory {
    private final static UserApiService service = new UserApiServiceImpl();

    public static UserApiService getUserApi() {
        return service;
    }
}
