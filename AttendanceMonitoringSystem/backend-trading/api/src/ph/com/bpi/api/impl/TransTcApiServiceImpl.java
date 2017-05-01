package ph.com.bpi.api.impl;

import org.apache.commons.lang3.StringUtils;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.model.hibernate.T0902;
import ph.com.bpi.model.hibernate.T0910;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.api.TransTcApiService;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.T0902DAO;
import ph.com.bpi.dao.T0910DAO;
import ph.com.bpi.utilities.AppConstants;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class TransTcApiServiceImpl extends TransTcApiService {
  
      @Override
      public Response transTcListPost(String listIndc, String brchCode, String trdrFi, SecurityContext securityContext)
      throws NotFoundException {
          APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  T0902DAO dao902 = DaoFactory.getT0902DAO();
    	  List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  data.put(AppConstants.LIST_INDC, listIndc);
    	  data.put(AppConstants.TRDR_FI, trdrFi);
    	  data.put(AppConstants.BRANCH_CODE, "A".equals(data.get(AppConstants.LIST_INDC)) ? StringUtils.repeat(StringUtils.SPACE, 7) : brchCode);
    	  data.put(AppConstants.REF_NMBR, StringUtils.EMPTY);
    	  
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_TRANS_TC_LIST, AppConstants.PROC_TAG_FIRST_BATCH, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_TRANS_TC_LIST, StringUtils.EMPTY, StringUtils.EMPTY);
    		  dao902.deleteAllRecords();
    		  for (HashMap<String, String> row : values){
    			  T0902 model = new T0902();
    			  model.parse(row);
    			  dao902.saveRecord(model);
    		  }
    		  result = values;
    		  
    	  }
    	  catch(MFResponseException e){
    		  meta.setCode(Integer.valueOf(e.getCode()));
    		  meta.setErrorMessage(e.getMessage());
    		  e.printStackTrace();
    	  }
    	  response.setMeta(meta);
    	  response.setData(result);
      return Response.ok().entity(response).build();
  }
  
      @Override
      public Response transTcRefNoPost(String refNo,SecurityContext securityContext)
      throws NotFoundException {
          APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  T0910DAO dao910 = DaoFactory.getT0910DAO();
    	  List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  data.put(AppConstants.REF_NMBR, refNo);
    	  
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_TRANS_TC_REFNO, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_TRANS_TC_REFNO, StringUtils.EMPTY, StringUtils.EMPTY);
    		  dao910.deleteAllRecords();
    		  for (HashMap<String, String> row : values){
    			  T0910 model = new T0910();
    			  model.parse(row);
    			  dao910.saveRecord(model);
    		  }
    		  result = values;
    		  
    	  }
    	  catch(MFResponseException e){
    		  meta.setCode(Integer.valueOf(e.getCode()));
    		  meta.setErrorMessage(e.getMessage());
    		  e.printStackTrace();
    	  }
    	  response.setMeta(meta);
    	  response.setData(result);
      return Response.ok().entity(response).build();
  }
  
}
