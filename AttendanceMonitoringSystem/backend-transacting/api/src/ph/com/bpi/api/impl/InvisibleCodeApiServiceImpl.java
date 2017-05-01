package ph.com.bpi.api.impl;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

import ph.com.bpi.api.AppConstants;
import ph.com.bpi.api.InvisibleCodeApiService;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.T0121DAO;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.model.hibernate.T0121;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class InvisibleCodeApiServiceImpl extends InvisibleCodeApiService {
  
      @Override
      public Response invisibleCodeListGet(String trdrFi,String inviCode,String proctag,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  
    	  data.put(AppConstants.TRDR_FI,trdrFi);
    	  data.put(AppConstants.INVI_CODE,inviCode);
    	  String mfResponse = StringUtils.EMPTY;
    	  try{
			 T0121DAO dao121 = DaoFactory.getT0121DAO();
			 mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INVI_CODE_LIST,"3",StringUtils.EMPTY,data);
			 values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INVI_CODE_LIST,
					 StringUtils.EMPTY, StringUtils.EMPTY);
			 dao121.deleteAllRecords();
			 for (HashMap<String,String> row: values)
			 {
				 T0121 curr121 = new T0121();
				 curr121.parse(row);
				 dao121.saveRecord(curr121);
			 }
			 response.setData(values);
    	  }
    	  catch(MFResponseException e)
    	  {
    		meta.setCode(Integer.valueOf(e.getCode()));
  			meta.setErrorMessage(e.getMessage());
  			e.printStackTrace();  
    	  }
		  response.setMeta(meta);
		  return Response.ok().entity(response).build();

  }
  
}
