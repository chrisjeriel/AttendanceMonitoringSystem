package ph.com.bpi.api.impl;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;

import java.util.HashMap;
import java.util.List;

import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.exception.MFResponseException;

import java.io.InputStream;

 
 







import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CashFlowApiServiceImpl extends CashFlowApiService {
  
      @Override
      public Response cashFlowDetailsGet(String tranFi,String tranUnit,String flowIndc,String currCode,String seqNo,String proctag,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response cashFlowDetailsSummaryGet(String tranFi,String tranUnit,String currCode,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response cashFlowListSummaryGet(String tranFi,String tranUnit,String currCode,String proctag,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  String mfResponse = StringUtils.EMPTY;
    	  data.put(AppConstants.TRAN_FI, tranFi);
    	  data.put(AppConstants.TRAN_UNIT, tranUnit);
    	  data.put(AppConstants.CURR_CODE, currCode);
    	  
    	  try{
  			 mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_CASHFLOW_LIST,proctag,StringUtils.EMPTY,data);
  			 values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_CASHFLOW_LIST,
  					 StringUtils.EMPTY, StringUtils.EMPTY);
  			 response.setData(values);
    	  }
    	  catch(MFResponseException e)
    	  {
    		  meta.setCode(Integer.parseInt(e.getCode()));
    		  meta.setErrorMessage(e.getMessage());
    		  e.printStackTrace();
    	  }
    	  response.setMeta(meta);
    	  return Response.ok().entity(response).build();
  }
      @Override
      public Response cashFlowUpdatePost(String tranFi, String tranUnit, String currCode, String amount, String tag, SecurityContext securityContext) throws NotFoundException {

		APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();
			
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
	   	data.put(AppConstants.TRAN_FI, tranFi);
    	data.put(AppConstants.TRAN_UNIT, tranUnit);
    	data.put(AppConstants.CURR_CODE, currCode);
    	data.put(AppConstants.AMOUNT, amount);
    	data.put(AppConstants.TAG, tag);
    	try {
			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_CASHFLOW_UPDATE, AppConstants.PROC_TAG_CASH_FLOW_UPDATE, StringUtils.EMPTY, data);

	    	String message = ApplicationUtils.subString(mfResponse, 61, 7);
	    	response.setData(message);
    	} catch (MFResponseException e) {
    		meta.setCode(Integer.parseInt(e.getCode()));
    		meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
    	}
    	response.setMeta(meta);
		return Response.ok().entity(response).build();
      }
  
}
