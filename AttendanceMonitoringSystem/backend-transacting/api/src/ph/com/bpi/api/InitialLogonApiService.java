package ph.com.bpi.api;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;


import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-09T14:07:28.663+08:00")
public abstract class InitialLogonApiService {
    public abstract Response initialLogonPost(String gpassword,String clogdate,String glogtime,String glogtype,String gnewpass,SecurityContext securityContext) throws NotFoundException;
}
