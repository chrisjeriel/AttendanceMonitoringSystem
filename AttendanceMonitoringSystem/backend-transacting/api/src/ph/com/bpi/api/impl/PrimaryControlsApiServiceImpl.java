package ph.com.bpi.api.impl;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

import ph.com.bpi.api.AppConstants;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.api.PrimaryControlsApiService;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.T0100DAO;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.model.hibernate.T0100;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class PrimaryControlsApiServiceImpl extends PrimaryControlsApiService {
  
      @Override
      public Response primaryControlsGet(String trdrFi,SecurityContext securityContext)
      throws NotFoundException {

		  APIResponse response = new APIResponse();
		  APIResponseMeta meta = new APIResponseMeta();
		  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  List<HashMap<String, String>> values;

		  data.put(AppConstants.TRDR_FI, trdrFi);
		  try{
			 String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_PRIMARY_CTRLS,data);
			 values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_PRIMARY_CTRLS,
					 StringUtils.EMPTY, StringUtils.EMPTY);
			 response.setData(values.get(0));
		  }
		  catch(MFResponseException e)
		  {
			  response.setData("Reference file is empty, Please update");
			  meta.setCode(500);
			  meta.setErrorMessage(e.getMessage());
		  }
    	  response.setMeta(meta);
    	  return Response.ok().entity(response).build();
  }
  
}
