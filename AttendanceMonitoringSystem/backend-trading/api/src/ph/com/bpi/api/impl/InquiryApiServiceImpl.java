package ph.com.bpi.api.impl;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;
import ph.com.bpi.utilities.AppConstants;
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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class InquiryApiServiceImpl extends InquiryApiService {
  
      @Override
      public Response inquiryPurchaseTransactionTypePost(String transactionType,String trdrFi,SecurityContext securityContext)
      throws NotFoundException {
    		APIResponse response = new APIResponse();
    		APIResponseMeta meta = new APIResponseMeta();
    			
    		String type = "0", amntSw = "0";
    		
    		switch (transactionType) {
    			case "1":
    				amntSw = "1";
    				break;
    			case "2":
    				amntSw = "2";
    				break;
    			case "C":
    				type = "9";
    				amntSw = "2";
    				break;
    		}
    		
    		
    		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
      		data.put(AppConstants.TRDR_FI, trdrFi);
      		data.put(AppConstants.BRANCH_CODE, StringUtils.repeat(" ", 7));
    		data.put(AppConstants.TRAN_INDC, "P");
      		data.put(AppConstants.INQY_TYPE, type);
      		data.put(AppConstants.AMNT_SW, amntSw);
      		data.put(AppConstants.REF_NMBR, StringUtils.repeat(" ", 19));
      		data.put(AppConstants.CURR_FR, StringUtils.repeat(" ", 3));
      		System.out.println("@@@@: " + data);

      		try {
      			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INQUIRY_TC, "3", data);
      			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INQUIRY_TC,
     					 StringUtils.EMPTY, StringUtils.EMPTY);
      		
      			response.setData(message);
      		} catch (MFResponseException e) {
      			meta.setCode(Integer.parseInt(e.getCode()));
      			meta.setErrorMessage(e.getMessage());
      			e.printStackTrace();
      		}
      		response.setMeta(meta);
      		return Response.ok().entity(response).build();
  }
  
      @Override
      public Response inquiryPurchaseTransactionTypeRefNoPost(String transactionType,String refNo,String trdrFi,SecurityContext securityContext)
      throws NotFoundException {
  		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		String type = "0";

  		if (transactionType.equals("C") ) {
  				type = "9";
  		}
  		
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    		data.put(AppConstants.TRDR_FI, trdrFi);
    		data.put(AppConstants.TRAN_INDC, "P");
    		data.put(AppConstants.REF_NMBR, refNo);
    		data.put(AppConstants.INQY_TYPE, type);

    		System.out.println("@@@@: " + data);
    		
    		try {
    			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INQUIRY_REF, data);
    			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(68), AppConstants.TC_INQUIRY_REF,
   					 StringUtils.EMPTY, StringUtils.EMPTY);
    		
    			response.setData(message.get(0));
    		} catch (MFResponseException e) {
    			meta.setCode(Integer.parseInt(e.getCode()));
    			meta.setErrorMessage(e.getMessage());
    			e.printStackTrace();
    		}
    		response.setMeta(meta);
    		return Response.ok().entity(response).build();
  }
  
      @Override
      public Response inquirySaleTransactionTypePost(String transactionType,String trdrFi,SecurityContext securityContext)
      throws NotFoundException {
  		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		String type = "0", amntSw = "0";
  		
  		switch (transactionType) {
  			case "1":
  				amntSw = "1";
				break;
  			case "2":
  				amntSw = "2";
				break;
  			case "C":
  				type = "9";
  				amntSw = "2";
				break;
  		}
  		
  		
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    		data.put(AppConstants.TRDR_FI, trdrFi);
      		data.put(AppConstants.BRANCH_CODE, StringUtils.repeat(" ", 7));
    		data.put(AppConstants.TRAN_INDC, "S");
    		data.put(AppConstants.INQY_TYPE, type);
    		data.put(AppConstants.AMNT_SW, amntSw);
      		data.put(AppConstants.REF_NMBR, StringUtils.repeat(" ", 19));
    		data.put(AppConstants.CURR_TO, StringUtils.repeat(" ", 3));
    		
    		try {
    			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INQUIRY_TC, data);
    			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INQUIRY_TC,
   					 StringUtils.EMPTY, StringUtils.EMPTY);
    		
    			response.setData(message);
    		} catch (MFResponseException e) {
    			meta.setCode(Integer.parseInt(e.getCode()));
    			meta.setErrorMessage(e.getMessage());
    			e.printStackTrace();
    		}
    		response.setMeta(meta);
    		return Response.ok().entity(response).build();
  }
  
      @Override
      public Response inquirySaleTransactionTypeRefNoPost(String transactionType,String refNo,String trdrFi,SecurityContext securityContext)
      throws NotFoundException {
    		APIResponse response = new APIResponse();
      		APIResponseMeta meta = new APIResponseMeta();
      			
      		String type = "0";
      		
      		if (transactionType.equals("C") ) {
      				type = "9";
      		}
      		
      		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
        		data.put(AppConstants.TRDR_FI, trdrFi);
        		data.put(AppConstants.TRAN_INDC, "S");
        		data.put(AppConstants.REF_NMBR, refNo);
        		data.put(AppConstants.INQY_TYPE, type);

        		try {
        			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INQUIRY_REF, data);
        			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INQUIRY_REF,
       					 StringUtils.EMPTY, StringUtils.EMPTY);
        		
        			response.setData(message.get(0));
        		} catch (MFResponseException e) {
        			meta.setCode(Integer.parseInt(e.getCode()));
        			meta.setErrorMessage(e.getMessage());
        			e.printStackTrace();
        		}
        		response.setMeta(meta);
        		return Response.ok().entity(response).build();
  }
  
}
