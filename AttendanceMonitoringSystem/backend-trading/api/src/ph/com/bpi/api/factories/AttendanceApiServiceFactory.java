package ph.com.bpi.api.factories;

import ph.com.bpi.api.AttendanceApiService;
import ph.com.bpi.api.impl.AttendanceApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class AttendanceApiServiceFactory {
    private final static AttendanceApiService service = new AttendanceApiServiceImpl();

    public static AttendanceApiService getAttendanceApi() {
        return service;
    }
}
