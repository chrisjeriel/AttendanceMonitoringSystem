package ph.com.bpi.api.impl;

import org.apache.commons.lang3.StringUtils;
import ph.com.bpi.api.*;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.*;



import ph.com.bpi.model.CashFlowBody;
import java.util.*;
import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.utilities.AppConstants;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;
import sun.awt.AppContext;

import java.io.InputStream;



import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class CashFlowApiServiceImpl extends CashFlowApiService {
  
      @Override
      public Response cashFlowDetailPost(CashFlowBody cashFlowDetail,SecurityContext securityContext)
      throws NotFoundException {
          MetaResponse meta = new MetaResponse();
          ObjectResponse obj = new ObjectResponse();

          HashMap<String, String> params = ApplicationUtils.getHeaderDetails();
          params.put(AppConstants.TRAN_FI, "FS");
          params.put(AppConstants.TRAN_UNIT, "FS");
          params.put(AppConstants.SEQ_NO, "0");
          params.put(AppConstants.CURR_CODE, cashFlowDetail.getCurrCode());
          params.put(AppConstants.BRANCH_CODE, cashFlowDetail.getBrchCode());
          params.put(AppConstants.FLOW_INDC, cashFlowDetail.getFlowIndc());

          String response = "";
          try {
              response = MFSendDetailsUtil.sendDetails(AppConstants.TC_CASHFLOW_DETAIL, params);
              System.out.println("cashFlowDetailPost - Response from sendDetails(): " + response);

              // toc and indexField is currently empty
              List<HashMap<String, String>> data = MFReceiveDetailsUtil.receiveDetails(response, AppConstants.TC_CASHFLOW_DETAIL, "", "");
              meta.setCode("200");
              meta.setErrorType("Request Successful");

              obj.setData(data);
          } catch (MFResponseException e) {
              e.printStackTrace();
              meta.setCode(e.getCode());
              meta.setErrorMessage(e.getMessage());
          }finally {
              obj.setMeta(meta);
          }

          return Response.ok().entity(obj).build();
  }
  
      @Override
      public Response cashFlowListPost(String brchCode,SecurityContext securityContext)
      throws NotFoundException {
          MetaResponse meta = new MetaResponse();
          ObjectResponse obj = new ObjectResponse();

          HashMap<String, String> params = ApplicationUtils.getHeaderDetails();
          params.put(AppConstants.TRAN_FI, "FS");
          params.put(AppConstants.TRAN_UNIT, brchCode);
          params.put(AppConstants.CURR_CODE, StringUtils.repeat(StringUtils.SPACE, 3));

          String response = "";
          try {
              response = MFSendDetailsUtil.sendDetails(AppConstants.TC_CASHFLOW_LIST, params);
              System.out.println("cashFlowListPost - Response from sendDetails(): " + response);

              // toc and indexField is currently empty
              List<HashMap<String, String>> data = MFReceiveDetailsUtil.receiveDetails(response, AppConstants.TC_CASHFLOW_LIST, "", "");
              meta.setCode("200");
              meta.setErrorType("Request Successful");
              obj.setData(data);
          } catch (MFResponseException e) {
              e.printStackTrace();
              meta.setCode(e.getCode());
              meta.setErrorMessage(e.getMessage());
          }finally {
              obj.setMeta(meta);
          }

          return Response.ok().entity(obj).build();
  }
  
}
