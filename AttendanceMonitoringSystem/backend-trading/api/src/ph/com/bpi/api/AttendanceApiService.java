package ph.com.bpi.api;

import java.util.HashMap;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public abstract class AttendanceApiService {
	
	//GET Methods
	public abstract Response getSessionsList(String date,SecurityContext securityContext) throws NotFoundException;
	public abstract Response getAttendanceList(String sessionId,SecurityContext securityContext) throws NotFoundException;

	//POST Methods
	public abstract Response saveAttendanceTimePost(HashMap<String, String> paramData,SecurityContext securityContext) throws NotFoundException;
}
