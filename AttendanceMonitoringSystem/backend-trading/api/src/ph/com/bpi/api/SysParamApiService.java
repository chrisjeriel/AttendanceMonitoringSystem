package ph.com.bpi.api;

import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.model.SysParamBody;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public abstract class SysParamApiService {
    public abstract Response sysParamGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response sysParamPut(SysParamBody sysParamBody, SecurityContext securityContext) throws NotFoundException;
}
