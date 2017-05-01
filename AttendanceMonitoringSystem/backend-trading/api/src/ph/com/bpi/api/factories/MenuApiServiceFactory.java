package ph.com.bpi.api.factories;

import ph.com.bpi.api.MenuApiService;
import ph.com.bpi.api.impl.MenuApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class MenuApiServiceFactory {
    private final static MenuApiService service = new MenuApiServiceImpl();

    public static MenuApiService getMenuApi() {
        return service;
    }
}
