package ph.com.bpi.api;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;


import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-20T17:39:48.019+08:00")
public abstract class DownloadApiService {
    public abstract Response downloadGet(String tranIndc,String rqstType,SecurityContext securityContext) throws NotFoundException;
}
