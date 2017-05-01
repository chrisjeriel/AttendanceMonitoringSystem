package ph.com.bpi.api.factories;

import ph.com.bpi.api.DownloadApiService;
import ph.com.bpi.api.impl.DownloadApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-20T17:39:48.019+08:00")
public class DownloadApiServiceFactory {
    private final static DownloadApiService service = new DownloadApiServiceImpl();

    public static DownloadApiService getDownloadApi() {
        return service;
    }
}
