package ph.com.bpi.api.impl;

import ph.com.bpi.api.*;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.T0220DAO;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.*;
import ph.com.bpi.dao.T0118DAO;
import ph.com.bpi.dao.T0225DAO;
import ph.com.bpi.dao.T0300DAO;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.*;
import ph.com.bpi.dao.T0118DAO;
import ph.com.bpi.dao.T0220DAO;
import ph.com.bpi.dao.T0225DAO;
import ph.com.bpi.dao.T0300DAO;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.*;
import ph.com.bpi.model.hibernate.T0118;
import ph.com.bpi.model.hibernate.T0220;
import ph.com.bpi.model.hibernate.T0225;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.io.InputStream;

 
 

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class TransactionApiServiceImpl extends TransactionApiService {
  
      @Override
      public Response transactionAcceptedTcListGet(String listIndc,Integer trdrFi,String tranUnit,String refNmbr,String proctag,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionAcceptedTcListPrintGet(Tclistprintinput tclistprintinput,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionBpiClientAccountNumberGet(String accountNumber,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionBtsuGetEquivalentAmtGet(Float requestRate,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionBtsuPurchaseDataEntryPost(DataEntry dataEntry,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionBtsuSaleDataEntryPost(DataEntry dataEntry,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionBtsuSaleOverridePost(DataEntry dataEntry,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionCashAcceptanceOrSettlementDetailsGet(String trdrFi,String tranIndc,String brchCode,String currCode,String refNmbr,String inqyType,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();

    	  data.put(AppConstants.TRDR_FI,trdrFi);
    	  data.put(AppConstants.TRAN_INDC,tranIndc);
    	  data.put(AppConstants.BRANCH_CODE,brchCode);
    	  data.put(AppConstants.CURR_CODE,currCode);
    	  data.put(AppConstants.REF_NUMBER,refNmbr);
    	  data.put(AppConstants.INQY_TYPE,inqyType);
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  try{
 			 mfResponse = MFSendDetailsUtil.sendDetails (AppConstants.TC_CAS_GET,data);
 			 values = MFReceiveDetailsUtil.receiveDetails (mfResponse, AppConstants.TC_CAS_GET,
 					 StringUtils.EMPTY, StringUtils.EMPTY);
  			 response.setData(values.get(0));
     	  }
     	  catch(MFResponseException e)
     	  {
     		meta.setCode(Integer.valueOf(e.getCode()));
   			meta.setErrorMessage(e.getMessage());
   			e.printStackTrace();  
     	  }
    	  
    	  return Response.ok().entity(response).build();
  }
  
      @Override
      public Response transactionCashAcceptanceOrSettlementListGet(String trdrFi,String tranIndc,String brchCode,String currCode,String refNmbr,String listType,String proctag,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  
    	  data.put(AppConstants.TRDR_FI,trdrFi);
    	  data.put(AppConstants.TRAN_INDC,tranIndc);
    	  data.put(AppConstants.BRANCH_CODE,brchCode);
    	  data.put(AppConstants.CURR_CODE,currCode);
    	  data.put(AppConstants.REF_NUMBER,refNmbr);
    	  data.put(AppConstants.LIST_TYPE,listType);
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  try{
			  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_CAS_LIST,data);
			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_CAS_LIST,
    					 StringUtils.EMPTY, StringUtils.EMPTY);
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
  
      @Override
      public Response transactionCashAcceptanceOrSettlementUpdatePost(String refNmbr,String atelVald,String stelVald,SecurityContext securityContext)
      throws NotFoundException {
  		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.REF_NUMBER,refNmbr);
  		data.put(AppConstants.ATEL_VALD,atelVald);
  		data.put(AppConstants.STEL_VALD,stelVald);

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_CAS_UPDATE, AppConstants.PROC_TAG_TC_UPDATE, StringUtils.EMPTY, data);
  		
  			String message = ApplicationUtils.subString(mfResponse, 131, 19);
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
      public Response transactionCbgfxClientSearchGet(CBGFXClientBody cBGFXClientBody,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionCbgfxClientSearchPost(String surname,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionCheckDepositAccountGet(CheckDepositAccountBody checkDepositAccount,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionClientAccountNumberIsPhpGet(Integer clntAcct,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	//  data.put(, value)
    	  T0118DAO dao118 = DaoFactory.getT0118DAO(); 
   
    	  List<HashMap<String,String>> result = new ArrayList<HashMap<String,String>>();
    	  String mfResponse = StringUtils.EMPTY;
		  try
		  {
			  String message = "";
	    			 mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_TRAN_DATA_ENTRY,data);
//	    			 values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_TRAN_DATA_ENTRY,
//	    					 StringUtils.EMPTY, StringUtils.EMPTY);
	    			 if (mfResponse!=null && ApplicationUtils.subString(mfResponse,57,4).equals("0000"))
	    			 {
	    				
	    				 message =  ApplicationUtils.subString(mfResponse,131 , 19);
	    			 }
	    			 else if (mfResponse==null || mfResponse.trim().length()==0)
	    			 {
	    				 message = "No connection to mainframe … please try again";
	    			 }
	    			 else
	    			 {
	    				 message = ApplicationUtils.subString(mfResponse, 61, 70).trim();
	    			 }
	    			
	    			
 			 meta.setCode(200);
		  }
		  catch(MFResponseException mfe)
		  {
			meta.setCode(Integer.valueOf(mfe.getCode()));
			meta.setErrorMessage(mfe.getMessage());
			mfe.printStackTrace();
		  }
		
		  response.setMeta(meta);
		  response.setData(result);
		 
		  return Response.ok().entity(response).build();
    	  // do some magic!
//      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionClientAccountNumberValidateGet(Integer clntAcct,Integer currAcct,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionComputedAmountsGet(ComputedAmountsBody computedAmountsBody,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionCurrencyCombinationsGet(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionCurrencyCombinationsGet_1(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionDailyDetailsPost(DailyDetailsBody dailyDetailsBody,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();

    	  data.put(AppConstants.TRDR_FI,dailyDetailsBody.getTrdrFi());
    	  data.put(AppConstants.TRAN_INDC,dailyDetailsBody.getTranIndc());
    	  data.put(AppConstants.RQST_TYPE,dailyDetailsBody.getRqstType());
    	  data.put(AppConstants.REF_NUMBER,dailyDetailsBody.getRefNmbr());
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  try{
 			 mfResponse = MFSendDetailsUtil.sendDetails (AppConstants.TC_CAS_GET,data);
 			 values = MFReceiveDetailsUtil.receiveDetails (mfResponse, AppConstants.TC_CAS_GET,
 					 StringUtils.EMPTY, StringUtils.EMPTY);
  			 response.setData(values.get(0));
     	  }
     	  catch(MFResponseException e)
     	  {
     		meta.setCode(Integer.valueOf(e.getCode()));
   			meta.setErrorMessage(e.getMessage());
   			e.printStackTrace();  
     	  }
    	  
    	  return Response.ok().entity(response).build();
  }
  
      @Override
      public Response transactionDailyListGet(DailyListBody dailyListBody,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  
    	  data.put(AppConstants.GOFFCODE,dailyListBody.getGoffcode());
    	  data.put(AppConstants.TRDR_FI,dailyListBody.getTrdrFi());
    	  data.put(AppConstants.TRAN_INDC,dailyListBody.getTranIndc());
    	  data.put(AppConstants.AMNT_SW,dailyListBody.getAmntSw().toString());
    	  data.put(AppConstants.RQST_TYPE,dailyListBody.getRqstType());
    	  data.put(AppConstants.REF_NUMBER,dailyListBody.getRefNumber());
    	  data.put(AppConstants.CURR_FR,dailyListBody.getCurrFr());
    	  data.put(AppConstants.CURR_TO,dailyListBody.getCurrTo());
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  try{
			  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_DAILY_LIST,data);
			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_DAILY_LIST,
    					 StringUtils.EMPTY, StringUtils.EMPTY);
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
  
      @Override
      public Response transactionDailyListSummaryGet(String tranIndc,Integer trdrFi,String refNmbr,Integer rqstType,String proctag,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionDataEntryPost(DataEntryBody dataEntryBody,SecurityContext securityContext)
      throws NotFoundException {
    	  
    	  //check if cut-off exceeeded, need help implementing this, cant understand what it means - Adrian
    	  
    	  
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	//  data.put(, value)
    	  T0300DAO dao300 = DaoFactory.getT0300DAO(); 
    	  data.put(AppConstants.TRAN_INDC,dataEntryBody.getTranIndc().toString());
    	  data.put("TRDR_FI",dataEntryBody.getTrdrFi().toString());
    	  data.put("C_LNAME",dataEntryBody.getCLname().toString());
    	  data.put("C_FNAME",dataEntryBody.getCFname().toString());
    	  data.put("C_MNAME",dataEntryBody.getCMname().toString());
    	  data.put("C_ADDR1",dataEntryBody.getCAddr1().toString());
    	  data.put("C_ADDR2",dataEntryBody.getCAddr2().toString());
    	  data.put("TELNO",dataEntryBody.getTelno().toString());
    	  data.put("TIN",dataEntryBody.getTin().toString());
    	  data.put("BDAY",dataEntryBody.getBday().toString());
    	  data.put("CUST_INDC",dataEntryBody.getCustIndc().toString());
    	  data.put("CORP_TAG",dataEntryBody.getCorpTag().toString());
    	  data.put("DOCU_TAG",dataEntryBody.getDocuTag().toString());
    	  data.put("GOFFCODE",dataEntryBody.getGOffCode().toString());
    	  data.put("BOOK_UNIT",dataEntryBody.getBookUnit().toString());
    	  data.put("MANG_UNIT",dataEntryBody.getMangUnit().toString());
    	  data.put("DEAL_RATE",dataEntryBody.getDealRate().toString());
    	  data.put("RQST_RATE",dataEntryBody.getRqstRate().toString());
    	  data.put("GRNT_RATE",dataEntryBody.getGrntRate().toString());
    	  data.put("NET_AMNT",dataEntryBody.getNetAmnt().toString());
    	  data.put("ACPT_AMNT",dataEntryBody.getAcptAmnt().toString());
    	  data.put("CURR_FR",dataEntryBody.getCurrFr().toString());
    	  data.put("ACPT_MODE",dataEntryBody.getAcptMode().toString());
    	  data.put("ACPT_CHECK_INDC",dataEntryBody.getAcptCheckIndc().toString());
    	  data.put("CHKDTL1",dataEntryBody.getChkdtl1().toString());
    	  data.put("ACPT_REFNO",dataEntryBody.getAcptRefno().toString());
    	  data.put("ACHRG_DED",dataEntryBody.getAchrgDed().toString());
    	  data.put("ACPT_DOCS",dataEntryBody.getAcptDocs().toString());
    	  data.put("ACPT_COMM",dataEntryBody.getAcptComm().toString());
    	  data.put("ACPT_POST",dataEntryBody.getAcptPost().toString());
    	  data.put("R_LNAME",dataEntryBody.getRLname().toString());
    	  data.put("R_FNAME",dataEntryBody.getRFname().toString());
    	  data.put("R_MNAME",dataEntryBody.getRMname().toString());
    	  data.put("SETL_AMNT",dataEntryBody.getSetlAmnt().toString());
    	  data.put("CURR_TO",dataEntryBody.getCurrTo().toString());
    	  data.put("SETL_MODE",dataEntryBody.getSetlMode().toString());
    	  data.put("SETL_CHCK_INDC",dataEntryBody.getSetlChckIndc().toString());
    	  data.put("CHKDTL2",dataEntryBody.getChkdtl2().toString());
    	  data.put("SETL_REFNO",dataEntryBody.getSetlRefno().toString());
    	  data.put("SCHRG_DED",dataEntryBody.getSchrgDed().toString());
    	  data.put("SETL_DOCS",dataEntryBody.getSetlDocs().toString());
    	  data.put("SETL_COMM",dataEntryBody.getSetlComm().toString());
    	  data.put("SETL_POST",dataEntryBody.getSetlPost().toString());
    	  data.put("B_LNAME",dataEntryBody.getBLname().toString());
    	  data.put("B_FNAME",dataEntryBody.getBFname().toString());
    	  data.put("B_MNAME",dataEntryBody.getBMname().toString());
    	  data.put("B_BDAY",dataEntryBody.getBBday().toString());
    	  data.put("B_ADDR1",dataEntryBody.getBAddr1().toString());
    	  data.put("B_ADDR2",dataEntryBody.getBAddr2().toString());
    	  data.put("B_TIN",dataEntryBody.getBTin().toString());
    	  data.put("INVI_CODE",dataEntryBody.getInviCode().toString());
    	  data.put("GUSER_ID",dataEntryBody.getGuserid().toString());
    	  data.put("RMRK_BRCH",dataEntryBody.getRmrkBrch().toString());
    	  data.put("OVERDID1",dataEntryBody.getOverdId1().toString());
    	  data.put("OVERDID2",dataEntryBody.getOverdId2().toString());
    	  data.put("OVERDPTT",dataEntryBody.getOverdPtt().toString());
    	  data.put("BENE_TAG",dataEntryBody.getBeneTag().toString());
    	  data.put("TRAN_TAG",dataEntryBody.getTranTag().toString());
    	  data.put("FVEC_TAG",dataEntryBody.getFvecTag().toString());
    	  List<HashMap<String,String>> result = new ArrayList<HashMap<String,String>>();
    	  String mfResponse = StringUtils.EMPTY;
		  try
		  {
			  String message = "";
	    			 mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_TRAN_DATA_ENTRY,data);
//	    			 values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_TRAN_DATA_ENTRY,
//	    					 StringUtils.EMPTY, StringUtils.EMPTY);
	    			 if (mfResponse!=null && ApplicationUtils.subString(mfResponse,57,4).equals("0000"))
	    			 {
	    				 message =  ApplicationUtils.subString(mfResponse,131 , 19);
	    			 }
	    			 else if (mfResponse==null || mfResponse.trim().length()==0)
	    			 {
	    				 message = "No connection to mainframe … please try again";
	    			 }
	    			 else
	    			 {
	    				 message = ApplicationUtils.subString(mfResponse, 61, 70).trim();
	    			 }
	    			
	    			
 			 meta.setCode(200);
		  }
		  catch(MFResponseException mfe)
		  {
			meta.setCode(Integer.valueOf(mfe.getCode()));
			meta.setErrorMessage(mfe.getMessage());
			mfe.printStackTrace();
		  }
		
		  response.setMeta(meta);
		  response.setData(result);
		 
		  return Response.ok().entity(response).build();
  }
  
      @Override
      public Response transactionDealRateGet(DealRateBody dealRateBody,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionDealRateGet_2(String fromCurrency,String toCurrency,String mode,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionForexPurchaseDataEntryPost(DataEntry dataEntryForm,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionForexPurchaseFinalUpdatePost(DataEntry dataEntryForm,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionForexSaleCashAcceptancePost(DataEntry dataEntryForm,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionForexSaleDataEntryPost(DataEntry dataEntryForm,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionForexSaleOverridePost(DataEntry dataEntryForm,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionInvisibleCodesListGet(String transactionType,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionIssuedMcListGet(Integer trdrFi,String tranUnit,String mcSerno,String proctag,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionListGet(String transactionType,String referenceNo,Boolean isCorrected,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionLocalOverridePost(LocalOverrideBody localOverride,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionMcSettlementDetailsGet(String trdrFi,String tranIndc,String brchCode,String currCode,String refNmbr,String inqyType,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();

    	  data.put(AppConstants.TRDR_FI,trdrFi);
    	  data.put(AppConstants.TRAN_INDC,tranIndc);
    	  data.put(AppConstants.BRANCH_CODE,brchCode);
    	  data.put(AppConstants.CURR_CODE,currCode);
    	  data.put(AppConstants.REF_NUMBER,refNmbr);
    	  data.put(AppConstants.INQY_TYPE,inqyType);
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  try{
 			 mfResponse = MFSendDetailsUtil.sendDetails (AppConstants.TC_MCS_GET,data);
 			 values = MFReceiveDetailsUtil.receiveDetails (mfResponse, AppConstants.TC_MCS_GET,
 					 StringUtils.EMPTY, StringUtils.EMPTY);
  			 response.setData(values.get(0));
     	  }
     	  catch(MFResponseException e)
     	  {
     		meta.setCode(Integer.valueOf(e.getCode()));
   			meta.setErrorMessage(e.getMessage());
   			e.printStackTrace();  
     	  }
    	  
    	  return Response.ok().entity(response).build();
  }
  
      @Override
      public Response transactionMcSettlementListGet(String trdrFi,String tranIndc,String brchCode,String currCode,String refNmbr,String listType,String proctag,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  
    	  data.put(AppConstants.TRDR_FI,trdrFi);
    	  data.put(AppConstants.TRAN_INDC,tranIndc);
    	  data.put(AppConstants.BRANCH_CODE,brchCode);
    	  data.put(AppConstants.CURR_CODE,currCode);
    	  data.put(AppConstants.REF_NUMBER,refNmbr);
    	  data.put(AppConstants.LIST_TYPE,listType);
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  try{
			  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_MCS_LIST,data);
			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_MCS_LIST,
    					 StringUtils.EMPTY, StringUtils.EMPTY);
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
  
      @Override
      public Response transactionMcSettlementUpdatePost(String refNmbr,String mcNmbr,SecurityContext securityContext)
      throws NotFoundException {
		APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();
			
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		data.put(AppConstants.REF_NUMBER,refNmbr);
		data.put(AppConstants.MC_NMBR,mcNmbr);

		try {
			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_MCS_UPDATE, AppConstants.PROC_TAG_TC_UPDATE, StringUtils.EMPTY, data);
		
			String message = ApplicationUtils.subString(mfResponse, 131, 19);
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
      public Response transactionMcSettlementPost(String referenceNo,String mcNumber,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionMtsCodesMtsTypeGet(String mtsType,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionOrDetailsGet(String refNmbr,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionOverrideDetailsGet(OverrideBody overrideBody,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionOverrideListGet(OverrideBody overrideBody,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionOverrideUpdatePost(String refNmbr,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionPrintAdviceReferenceNoPost(String referenceNo,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionSettlementCodesGet(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionSpecialRequestDetailsGet(SpecialRequestDetailsBody specialRequestDetailsBody,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionSpecialRequestListGet(SpecialRequestDetailsBody specialRequestDetailsBody,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionSpecialRequestUpdatePost(SpecialRequestUpdateBody specialRequestUpdateBody,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionTellerValidationReferenceNoPost(String referenceNo,String acceptanceValidationCode,String settlementValidationCode,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionTmuPurchaseDataEntryPost(DataEntry tmuForm,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionTmuSaleDataEntryPost(DataEntry tmuForm,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionTmuSaleSpecialRequestPost(DataEntry tmuForm,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response transactionReferenceNoGet(String referenceNo,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
}
