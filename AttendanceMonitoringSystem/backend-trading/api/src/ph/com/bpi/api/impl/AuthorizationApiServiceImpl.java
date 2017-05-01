package ph.com.bpi.api.impl;

import org.apache.commons.lang3.StringUtils;
import ph.com.bpi.api.*;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.*;
import ph.com.bpi.model.hibernate.T0309;
import ph.com.bpi.model.hibernate.T0310;
import ph.com.bpi.model.hibernate.T0313;
import ph.com.bpi.model.hibernate.T0314;
import ph.com.bpi.model.hibernate.T0315;
import ph.com.bpi.model.hibernate.T0316;
import ph.com.bpi.model.hibernate.T0803;
import ph.com.bpi.model.hibernate.T0804;

import java.util.*;

import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.T0309DAO;
import ph.com.bpi.dao.T0310DAO;
import ph.com.bpi.dao.T0313DAO;
import ph.com.bpi.dao.T0314DAO;
import ph.com.bpi.dao.T0315DAO;
import ph.com.bpi.dao.T0316DAO;
import ph.com.bpi.dao.T0803DAO;
import ph.com.bpi.dao.T0804DAO;
import ph.com.bpi.utilities.AppConstants;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class AuthorizationApiServiceImpl extends AuthorizationApiService {

	@Override
	public Response authorizationPurchaseTransactionTypePost(String transactionType, String trdrFi,
			SecurityContext securityContext) throws NotFoundException {
		APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();
		List<HashMap<String, String>> values;
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		T0310DAO dao310 = DaoFactory.getT0310DAO();
		T0314DAO dao314 = DaoFactory.getT0314DAO();
		T0316DAO dao316 = DaoFactory.getT0316DAO();
		List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
		String mfResponse = StringUtils.EMPTY;
		data.put(AppConstants.TRDR_FI, trdrFi);
		data.put(AppConstants.TRAN_INDC, "P");
		data.put(AppConstants.BRANCH_CODE, StringUtils.EMPTY);
		data.put(AppConstants.CURRENCY_CODE, StringUtils.EMPTY);
		data.put(AppConstants.REF_NMBR, StringUtils.EMPTY);
		data.put(AppConstants.LIST_TYPE, transactionType);
		try {
			meta.setCode(200);
			if (transactionType.trim().equals("0")) {
				mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_AUTH_ERROR_CORRECT_LIST,
						AppConstants.PROC_TAG_FIRST_BATCH, data);
				values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_AUTH_ERROR_CORRECT_LIST,
						StringUtils.EMPTY, StringUtils.EMPTY);
				dao310.deleteAllRecords();
				for (HashMap<String, String> row : values) {
					T0310 model = new T0310();
					model.parse(row);
					dao310.saveRecord(model);
				}
				result = values;
			} else if(transactionType.trim().equals("1")) {
				mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_AUTH_SPCL_RATE_LIST,
						AppConstants.PROC_TAG_FIRST_BATCH, data);
				values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_AUTH_SPCL_RATE_LIST,
						StringUtils.EMPTY, StringUtils.EMPTY);
				dao314.deleteAllRecords();
				for (HashMap<String, String> row : values) {
					T0314 model = new T0314();
					model.parse(row);
					dao314.saveRecord(model);
				}
				result = values;
			} else if(transactionType.trim().equals("2")) {
				mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_AUTH_TRADER_OVRD_LIST,
						AppConstants.PROC_TAG_FIRST_BATCH, data);
				values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_AUTH_TRADER_OVRD_LIST,
						StringUtils.EMPTY, StringUtils.EMPTY);
				dao316.deleteAllRecords();
				for (HashMap<String, String> row : values) {
					T0316 model = new T0316();
					model.parse(row);
					dao316.saveRecord(model);
				}
				result = values;
			} else {
				meta.setCode(500);
				meta.setErrorMessage("Invalid Transaction Type");
				response.setMeta(meta);
				return Response.ok().entity(response).build();
			}
		} catch (MFResponseException e) {
			meta.setCode(Integer.valueOf(e.getCode()));
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		response.setMeta(meta);
		response.setData(result);
		return Response.ok().entity(response).build();

	}

	@Override
	public Response authorizationPurchaseTransactionTypeRefNoPost(String trdrFi, String transactionType, String refNo,
			String brchCode, String currCode, SecurityContext securityContext) throws NotFoundException {
		APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();
		List<HashMap<String, String>> values;
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		T0309DAO dao309 = DaoFactory.getT0309DAO();
		T0313DAO dao313 = DaoFactory.getT0313DAO();
		T0315DAO dao315 = DaoFactory.getT0315DAO();
		List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
		String mfResponse = StringUtils.EMPTY;
		data.put(AppConstants.TRDR_FI, trdrFi);
		data.put(AppConstants.TRAN_INDC, "P");
		data.put(AppConstants.BRANCH_CODE, brchCode);
		data.put(AppConstants.CURRENCY_CODE, currCode);
		data.put(AppConstants.REF_NMBR, refNo);
		data.put(AppConstants.LIST_TYPE, transactionType);
		try {
			meta.setCode(200);
			if (transactionType.trim().equals("0")) {
				mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_AUTH_ERROR_CORRECT_REFNO, data);
				values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_AUTH_ERROR_CORRECT_REFNO,
						StringUtils.EMPTY, StringUtils.EMPTY);
				dao309.deleteAllRecords();
				for (HashMap<String, String> row : values) {
					T0309 model = new T0309();
					model.parse(row);
					dao309.saveRecord(model);
				}
				result = values;
			} else if(transactionType.trim().equals("1")) {
				mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_AUTH_SPCL_RATE_REFNO, data);
				values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_AUTH_SPCL_RATE_REFNO,
						StringUtils.EMPTY, StringUtils.EMPTY);
				dao313.deleteAllRecords();
				for (HashMap<String, String> row : values) {
					T0313 model = new T0313();
					model.parse(row);
					dao313.saveRecord(model);
				}
				result = values;
			} else if(transactionType.trim().equals("2")) {
				mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_AUTH_TRADER_OVRD_REFNO, data);
				values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_AUTH_TRADER_OVRD_REFNO,
						StringUtils.EMPTY, StringUtils.EMPTY);
				dao315.deleteAllRecords();
				for (HashMap<String, String> row : values) {
					T0315 model = new T0315();
					model.parse(row);
					dao315.saveRecord(model);
				}
				result = values;
			} else {
				meta.setCode(500);
				meta.setErrorMessage("Invalid Transaction Type");
				response.setMeta(meta);
				return Response.ok().entity(response).build();
			}
		} catch (MFResponseException e) {
			meta.setCode(Integer.valueOf(e.getCode()));
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		response.setMeta(meta);
		response.setData(result);
		return Response.ok().entity(response).build();

	}

	@Override
	public Response authorizationSaleCancelTransPost(String refNmbr, SecurityContext securityContext)
			throws NotFoundException {
  	  APIResponse response = new APIResponse();
  	  APIResponseMeta meta = new APIResponseMeta();
  	  //List<HashMap<String, String>> values;
  	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  	  String mfResponse = StringUtils.EMPTY;
  	  
		  data.put(AppConstants.REF_NMBR, refNmbr);
  	  try{
  		  meta.setCode(200);
  		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_AUTH_CANCEL_TRANS, data);
  		  /*values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_AUTH_CANCEL_TRANS, StringUtils.EMPTY, StringUtils.EMPTY);
  		  response.setData(values);*/
  		  meta.setErrorMessage(mfResponse.substring(0, 70));
  	  }
  	  catch(MFResponseException e){
  		  meta.setCode(Integer.valueOf(e.getCode()));
  		  meta.setErrorMessage(e.getMessage());
  		  e.printStackTrace();
  	  }
  	  response.setMeta(meta);
    return Response.ok().entity(response).build();
}

	@Override
	public Response authorizationSaleTransactionTypePost(String transactionType, String trdrFi,
			SecurityContext securityContext) throws NotFoundException {
		APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();
		List<HashMap<String, String>> values;
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		T0310DAO dao310 = DaoFactory.getT0310DAO();
		T0314DAO dao314 = DaoFactory.getT0314DAO();
		T0316DAO dao316 = DaoFactory.getT0316DAO();
		List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
		String mfResponse = StringUtils.EMPTY;
		data.put(AppConstants.TRDR_FI, trdrFi);
		data.put(AppConstants.TRAN_INDC, "S");
		data.put(AppConstants.BRANCH_CODE, StringUtils.EMPTY);
		data.put(AppConstants.CURRENCY_CODE, StringUtils.EMPTY);
		data.put(AppConstants.REF_NMBR, StringUtils.EMPTY);
		data.put(AppConstants.LIST_TYPE, transactionType);
		try {
			meta.setCode(200);
			if (transactionType.trim().equals("0")) {
				mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_AUTH_ERROR_CORRECT_LIST,
						AppConstants.PROC_TAG_FIRST_BATCH, data);
				values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_AUTH_ERROR_CORRECT_LIST,
						StringUtils.EMPTY, StringUtils.EMPTY);
				dao310.deleteAllRecords();
				for (HashMap<String, String> row : values) {
					T0310 model = new T0310();
					model.parse(row);
					dao310.saveRecord(model);
				}
				result = values;
			} else if(transactionType.trim().equals("1")) {
				mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_AUTH_SPCL_RATE_LIST,
						AppConstants.PROC_TAG_FIRST_BATCH, data);
				values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_AUTH_SPCL_RATE_LIST,
						StringUtils.EMPTY, StringUtils.EMPTY);
				dao314.deleteAllRecords();
				for (HashMap<String, String> row : values) {
					T0314 model = new T0314();
					model.parse(row);
					dao314.saveRecord(model);
				}
				result = values;
			} else if(transactionType.trim().equals("2")) {
				mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_AUTH_TRADER_OVRD_LIST,
						AppConstants.PROC_TAG_FIRST_BATCH, data);
				values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_AUTH_TRADER_OVRD_LIST,
						StringUtils.EMPTY, StringUtils.EMPTY);
				dao316.deleteAllRecords();
				for (HashMap<String, String> row : values) {
					T0316 model = new T0316();
					model.parse(row);
					dao316.saveRecord(model);
				}
				result = values;
			} else {
				meta.setCode(500);
				meta.setErrorMessage("Invalid Transaction Type");
				response.setMeta(meta);
				return Response.ok().entity(response).build();
			}
		} catch (MFResponseException e) {
			meta.setCode(Integer.valueOf(e.getCode()));
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		response.setMeta(meta);
		response.setData(result);
		return Response.ok().entity(response).build();

	}

	@Override
	public Response authorizationSaleTransactionTypeRefNoPost(String trdrFi, String transactionType, String refNo,
  			String brchCode, String currCode,SecurityContext securityContext) throws NotFoundException {
		APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();
		List<HashMap<String, String>> values;
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		T0309DAO dao309 = DaoFactory.getT0309DAO();
		T0313DAO dao313 = DaoFactory.getT0313DAO();
		T0315DAO dao315 = DaoFactory.getT0315DAO();
		List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
		String mfResponse = StringUtils.EMPTY;
		data.put(AppConstants.TRDR_FI, trdrFi);
		data.put(AppConstants.TRAN_INDC, "S");
		data.put(AppConstants.BRANCH_CODE, brchCode);
		data.put(AppConstants.CURRENCY_CODE, currCode);
		data.put(AppConstants.REF_NMBR, refNo);
		data.put(AppConstants.LIST_TYPE, transactionType);
		try {
			meta.setCode(200);
			if (transactionType.trim().equals("0")) {
				mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_AUTH_ERROR_CORRECT_REFNO, data);
				values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_AUTH_ERROR_CORRECT_REFNO,
						StringUtils.EMPTY, StringUtils.EMPTY);
				dao309.deleteAllRecords();
				for (HashMap<String, String> row : values) {
					T0309 model = new T0309();
					model.parse(row);
					dao309.saveRecord(model);
				}
				result = values;
			} else if(transactionType.trim().equals("1")) {
				mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_AUTH_SPCL_RATE_REFNO, data);
				values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_AUTH_SPCL_RATE_REFNO,
						StringUtils.EMPTY, StringUtils.EMPTY);
				dao313.deleteAllRecords();
				for (HashMap<String, String> row : values) {
					T0313 model = new T0313();
					model.parse(row);
					dao313.saveRecord(model);
				}
				result = values;
			} else if(transactionType.trim().equals("2")) {
				mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_AUTH_TRADER_OVRD_REFNO, data);
				values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_AUTH_TRADER_OVRD_REFNO,
						StringUtils.EMPTY, StringUtils.EMPTY);
				dao315.deleteAllRecords();
				for (HashMap<String, String> row : values) {
					T0315 model = new T0315();
					model.parse(row);
					dao315.saveRecord(model);
				}
				result = values;
			} else {
				meta.setCode(500);
				meta.setErrorMessage("Invalid Transaction Type");
				response.setMeta(meta);
				return Response.ok().entity(response).build();
			}
		} catch (MFResponseException e) {
			meta.setCode(Integer.valueOf(e.getCode()));
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		response.setMeta(meta);
		response.setData(result);
		return Response.ok().entity(response).build();

	}

	@Override
	public Response authorizationSpecialRatePost(AuthorizationSpecialRateBody authorizationSpecialRate,
			SecurityContext securityContext) throws NotFoundException {
  	  APIResponse response = new APIResponse();
  	  APIResponseMeta meta = new APIResponseMeta();
  	  //List<HashMap<String, String>> values;
  	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  	  String mfResponse = StringUtils.EMPTY;
  	  
	  data.put(AppConstants.TRDR_FI, authorizationSpecialRate.getTrdrFi());
	  data.put(AppConstants.REF_NMBR, authorizationSpecialRate.getRefNmbr());
	  data.put(AppConstants.GRNT_STAT, authorizationSpecialRate.getGrntStat());
	  data.put(AppConstants.GRNT_RATE, authorizationSpecialRate.getGrntRate());
	  data.put(AppConstants.RMRK_TRDR, authorizationSpecialRate.getRmrkTrdr());
	  data.put(AppConstants.G_USER_ID, authorizationSpecialRate.getGuserid());
  	  try{
  		  meta.setCode(200);
  		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_AUTH_SPECIAL_RATE, data);
  		  /*values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_AUTH_SPECIAL_RATE, StringUtils.EMPTY, StringUtils.EMPTY);
  		  response.setData(values);*/
  		  meta.setErrorMessage(mfResponse.substring(0, 70));
  	  }
  	  catch(MFResponseException e){
  		  meta.setCode(Integer.valueOf(e.getCode()));
  		  meta.setErrorMessage(e.getMessage());
  		  e.printStackTrace();
  	  }
  	  response.setMeta(meta);
    return Response.ok().entity(response).build();
}

	@Override
	public Response authorizationTraderOverridePost(AuthorizationTraderOverrideBody authorizationTraderOverride,
			SecurityContext securityContext) throws NotFoundException {
	  	  APIResponse response = new APIResponse();
	  	  APIResponseMeta meta = new APIResponseMeta();
	  	  //List<HashMap<String, String>> values;
	  	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
	  	  String mfResponse = StringUtils.EMPTY;
	  	  
	  	  data.put(AppConstants.TRDR_FI, authorizationTraderOverride.getTrdrFi());
		  data.put(AppConstants.REF_NMBR, authorizationTraderOverride.getRefNmbr());
		  data.put(AppConstants.GRNT_STAT, authorizationTraderOverride.getGrntStat());
		  data.put(AppConstants.RMRK_TRDR, authorizationTraderOverride.getRmrkTrdr());
		  data.put(AppConstants.G_USER_ID, authorizationTraderOverride.getGuserid());
	  	  try{
	  		  meta.setCode(200);
	  		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_AUTH_TRADER_OVERRIDE, data);
	  		  /*values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_AUTH_TRADER_OVERRIDE, StringUtils.EMPTY, StringUtils.EMPTY);
	  		  response.setData(values);*/
	  		  meta.setErrorMessage(mfResponse.substring(0, 70));
	  	  }
	  	  catch(MFResponseException e){
	  		  meta.setCode(Integer.valueOf(e.getCode()));
	  		  meta.setErrorMessage(e.getMessage());
	  		  e.printStackTrace();
	  	  }
	  	  response.setMeta(meta);
	    return Response.ok().entity(response).build();
}

}
