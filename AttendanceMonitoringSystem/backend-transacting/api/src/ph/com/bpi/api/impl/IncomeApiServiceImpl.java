package ph.com.bpi.api.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

import ph.com.bpi.api.ApiResponseMessage;
import ph.com.bpi.api.AppConstants;
import ph.com.bpi.api.IncomeApiService;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.T0908DAO;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.model.hibernate.T0908;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class IncomeApiServiceImpl extends IncomeApiService {
  
      @Override
      public Response incomeGetGet(String trdrFi,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  String mfResponse = StringUtils.EMPTY;
    			  
    	  data.put(AppConstants.TRDR_FI, trdrFi);
    	  try{
 			 mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INCOME_GET,"3",StringUtils.EMPTY,data);
 			 values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INCOME_GET,
 					 StringUtils.EMPTY, StringUtils.EMPTY);
 			T0908DAO dao908 = DaoFactory.getT0908DAO();
 			dao908.deleteAllRecords();
 			T0908 model = new T0908();
 	    	List<HashMap<String, String>> result = new ArrayList<HashMap<String,String>>();

			for (HashMap<String,String> row: values)
			{
				model = new T0908();
				model.parse(row);
				dao908.saveRecord(model);
				row.remove("trdr_fi");
				row.remove("id");
				result.add(row);
			}
 			response.setData(result);
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
