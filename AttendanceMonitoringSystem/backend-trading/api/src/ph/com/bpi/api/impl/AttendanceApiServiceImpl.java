package ph.com.bpi.api.impl;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.hibernate.SessionFactory;

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
	SessionFactory dao = new DaoFactory().getSessionFactory();
	
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
				data = dao.openSession().createQuery("FROM Sessions WHERE DATE_FORMAT(start, '%Y-%m-%d') = DATE_FORMAT(NOW(), '%Y-%m-%d')").list();
			} else {
				data = dao.openSession().createQuery("FROM Sessions").list();
			}
			System.out.println(data);
			response.setData(data);
		} catch (Exception e) {
			meta.setCode(500);
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		dao.openSession().close();
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
			data = dao.openSession().createQuery(sql).list();
			System.out.println(data);
			response.setData(data);
		} catch (Exception e) {
			meta.setCode(500);
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		dao.openSession().close();
		response.setMeta(meta);
        return Response.ok().entity(response).build();
    }
    
   
	//POST Methods
	@SuppressWarnings({ "unchecked", "unused" })
	public Response saveAttendanceTimePost(HashMap<String, String> paramData,SecurityContext securityContext) throws NotFoundException {
        APIResponse response = new APIResponse();
        APIResponseMeta meta = new APIResponseMeta();
        AttendancesDAO attDao = DaoFactory.getAttendancesDAO();
		try {
			String sql = "FROM Attendances WHERE SESSION_ID = '" + paramData.get("sessionId").toString() + "' AND ID_NUMBER = '" + paramData.get("idNumber") + "'";
			List<Attendances> dataList = dao.openSession().createQuery(sql).list();
			Attendances entity = new Attendances();
			SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
			if(dataList.size() > 0) {
				//Update Only
				entity = dataList.get(0);
				if (paramData.get("timeType").equalsIgnoreCase("in")) {
//					entity.setTimeIn(new Date().toString());
					meta.setCode(500);
					meta.setErrorMessage("Already timed in.");
				} else { 
					Date timeOut = new Date();
					
					entity.setTimeOut(df.format(timeOut));
					meta.setCode(200);
					meta.setErrorMessage("Successfully timed out.");
				}
				attDao.updateRecord(entity);
			} else {
				Date timeIn = new Date();
				entity.setFullName(paramData.get("fullName"));
				entity.setIdNumber(paramData.get("idNumber"));
				entity.setSessionId(Integer.valueOf(paramData.get("sessionId")));
				entity.setTimeIn(df.format(timeIn));
				
				attDao.saveRecord(entity);
				meta.setCode(200);
				meta.setErrorMessage("Successfully timed in.");
			}
		} catch (Exception e) {
			meta.setCode(500);
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		dao.openSession().close();
		response.setMeta(meta);
        return Response.ok().entity(response).build();
    }
}
