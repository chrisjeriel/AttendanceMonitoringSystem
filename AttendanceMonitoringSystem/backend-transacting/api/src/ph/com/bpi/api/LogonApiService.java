package ph.com.bpi.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import ph.com.bpi.model.LogonBody;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen",
		date = "2016-10-14T13:58:17.342+08:00")
public abstract class LogonApiService{
	public abstract Response logonPost(LogonBody data, SecurityContext securityContext) throws NotFoundException;
}
