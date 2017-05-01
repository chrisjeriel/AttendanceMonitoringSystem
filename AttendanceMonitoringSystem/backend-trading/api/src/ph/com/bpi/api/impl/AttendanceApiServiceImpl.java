package ph.com.bpi.api.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import ph.com.bpi.api.AttendanceApiService;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.dao.AttendancesDAO;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.model.hibernate.Attendances;
import ph.com.bpi.model.hibernate.Sessions;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class AttendanceApiServiceImpl extends AttendanceApiService {
	DaoFactory dao = new DaoFactory();
	
	//GET Methods
	@SuppressWarnings("unchecked")
	@Override
	public Response getSessionsList(String date,SecurityContext securityContext) throws NotFoundException {
        APIResponse response = new APIResponse();
        APIResponseMeta meta = new APIResponseMeta();
        List<Sessions> data = null;
		try {
			meta.setCode(200);
			
			if (date == null || date.equalsIgnoreCase("")) {
				data = dao.getSessionFactory().openSession().createQuery("FROM Sessions WHERE DATE_FORMAT(start, '%Y-%m-%d') = DATE_FORMAT(NOW(), '%Y-%m-%d')").list();
			} else {
				data = dao.getSessionFactory().openSession().createQuery("FROM Sessions").list();
			}
			System.out.println(data);
			response.setData(data);
		} catch (Exception e) {
			meta.setCode(500);
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		response.setMeta(meta);
        return Response.ok().entity(response).build();
    }
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Response getAttendanceList(String sessionId,SecurityContext securityContext) throws NotFoundException {
        APIResponse response = new APIResponse();
        APIResponseMeta meta = new APIResponseMeta();
        List<Attendances> data = null;
        System.out.println("CALLED THIS");
		try {
			meta.setCode(200);
			String sql = "FROM Attendances WHERE SESSION_ID = " + sessionId;
			data = dao.getSessionFactory().openSession().createQuery(sql).list();
			System.out.println(data);

			response.setData(data);
		} catch (Exception e) {
			meta.setCode(500);
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		response.setMeta(meta);
        return Response.ok().entity(response).build();
    }
    
   
	//POST Methods
	public Response saveAttendanceTimeInPost(HashMap<String, String> paramData,SecurityContext securityContext) throws NotFoundException {
        APIResponse response = new APIResponse();
        APIResponseMeta meta = new APIResponseMeta();
        Attendances attendance = new Attendances();
        AttendancesDAO attendancesDAO = DaoFactory.getAttendancesDAO();
		try {
			meta.setCode(200);
			System.out.println("LIST");
			System.out.println(attendancesDAO.getAllRecords());
			System.out.println("TO BE ADDED");
			
			attendance.setSessionId(new Integer(paramData.get("sessionId")));
			attendance.setIdNumber(paramData.get("idNumber"));
			attendance.setTimeIn(paramData.get("timeIn"));
			attendance.setTimeOut(paramData.get("timeOut"));
			
			System.out.println(attendance);
			attendancesDAO.saveRecord(attendance);
			System.out.println(dao);
			
			response.setData(paramData);
		} catch (Exception e) {
			meta.setCode(500);
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		response.setMeta(meta);
        return Response.ok().entity(response).build();
    }
}
