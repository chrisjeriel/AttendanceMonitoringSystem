package ph.com.bpi.api.impl;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

import ph.com.bpi.api.AppConstants;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.api.TransactingUnitApiService;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.T0134DAO;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.model.hibernate.T0134;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class TransactingUnitApiServiceImpl extends TransactingUnitApiService {
  
      @Override
      public Response transactingUnitListGet(String tranFi,String proctag,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  data.put(AppConstants.TRAN_FI, tranFi);
    	  
    	  try{
 			 mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_TRANS_UNIT_LIST,proctag,StringUtils.EMPTY,data);
 			 values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_TRANS_UNIT_LIST,
 					 StringUtils.EMPTY, StringUtils.EMPTY);
 			 T0134DAO dao134 = DaoFactory.getT0134DAO();
 			 dao134.deleteAllRecords();
 			 for (HashMap<String,String> row : values)
 			 {
	 			 T0134 model = new T0134();
	 			 model.parse(row);
	 			 dao134.saveRecord(model);
 			 }
 			 response.setData(response);
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
