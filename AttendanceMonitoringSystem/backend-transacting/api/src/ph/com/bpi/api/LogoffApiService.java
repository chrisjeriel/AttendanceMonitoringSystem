package ph.com.bpi.api;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;

import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-08T16:20:30.216+08:00")
public abstract class LogoffApiService {
    public abstract Response logoffPost(String goffcode,String guserid,SecurityContext securityContext) throws NotFoundException;
}
