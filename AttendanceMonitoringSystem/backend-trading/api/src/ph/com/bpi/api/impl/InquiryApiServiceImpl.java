package ph.com.bpi.api.impl;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.hibernate.SessionFactory;

import ph.com.bpi.api.InquiryApiService;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.model.hibernate.Members;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class InquiryApiServiceImpl extends InquiryApiService {
	SessionFactory dao = new DaoFactory().getSessionFactory();
	DaoFactory daoFactory = new DaoFactory();
	@SuppressWarnings("static-access")
	@Override
	public Response getMembersList(SecurityContext securityContext) throws NotFoundException {
			APIResponse response = new APIResponse();
		    APIResponseMeta meta = new APIResponseMeta();
	        List<Members> data = null;
			try {
				meta.setCode(200);
				data = daoFactory.getMembersDAO().getAllRecords();
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

	@SuppressWarnings("unchecked")
	@Override
	public Response getMember(String idNumber, SecurityContext securityContext) throws NotFoundException {
		APIResponse response = new APIResponse();
	    APIResponseMeta meta = new APIResponseMeta();
        List<Members> data = null;
		try {
			meta.setCode(200);
			String sql = "FROM Members WHERE ID_NUMBER = '" + idNumber + "'";
			data = dao.openSession().createQuery(sql).list();
			
			if (data.isEmpty()) {
				meta.setCode(500);
				meta.setErrorMessage("No record found.");;
			}
			response.setData(data);
		} catch (Exception e) {
			meta.setCode(500);
			meta.setErrorMessage("No record found.");
			e.printStackTrace();
		}
		dao.openSession().close();
		response.setMeta(meta);
        return Response.ok().entity(response).build();
	}
  
    
	
  
}
