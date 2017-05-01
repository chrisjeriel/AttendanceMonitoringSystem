package ph.com.bpi.api.impl;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

import ph.com.bpi.api.ApiResponseMessage;
import ph.com.bpi.api.AppConstants;
import ph.com.bpi.api.InitialLogonApiService;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.T0001DAO;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.model.hibernate.T0001;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-09T14:07:28.663+08:00")
public class InitialLogonApiServiceImpl extends InitialLogonApiService {
    @Override
    public Response initialLogonPost(String gpassword, String clogdate, String glogtime, String glogtype, String gnewpass, SecurityContext securityContext) throws NotFoundException {
        
		APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();

		List<HashMap<String, String>> values;
		String mfResponse = StringUtils.EMPTY;
    	HashMap<String,String> data = ApplicationUtils.getHeaderDetails();
    	
    	data.put(AppConstants.GPASSWORD, gpassword);
    	data.put(AppConstants.C_LOG_DATE, clogdate);
    	data.put(AppConstants.G_LOG_TIME, glogtime);
    	data.put(AppConstants.G_LOG_TYPE, glogtype);
    	data.put(AppConstants.G_NEW_PASS, gnewpass);

		T0001DAO dao = DaoFactory.getT0001DAO();
		T0001 model = new T0001();
		
		try{
			mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_LOGON, StringUtils.EMPTY, StringUtils.EMPTY,
					data);

			values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_LOGON, StringUtils.EMPTY,
					StringUtils.EMPTY);
			model.parse(values.get(0));
			dao.saveRecord(model);

			meta.setCode(200);
			response.setData(dao.getRecord(model.getId()));

		}catch(MFResponseException e){
			meta.setCode(Integer.valueOf(e.getCode()));
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
    	response.setMeta(meta);
        return Response.ok().entity(response).build();
    }
}
