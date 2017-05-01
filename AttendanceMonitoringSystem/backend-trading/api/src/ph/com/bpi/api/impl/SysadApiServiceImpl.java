package ph.com.bpi.api.impl;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;
import ph.com.bpi.model.hibernate.T0100;
import ph.com.bpi.model.hibernate.T0104;
import ph.com.bpi.model.hibernate.T0105;
import ph.com.bpi.model.hibernate.T0109;
import ph.com.bpi.model.hibernate.T0110;
import ph.com.bpi.model.hibernate.T0123;
import ph.com.bpi.model.hibernate.T0125;
import ph.com.bpi.model.hibernate.T0136;

import java.util.*;

import ph.com.bpi.utilities.AppConstants;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.T0100DAO;
import ph.com.bpi.dao.T0104DAO;
import ph.com.bpi.dao.T0105DAO;
import ph.com.bpi.dao.T0109DAO;
import ph.com.bpi.dao.T0110DAO;
import ph.com.bpi.dao.T0123DAO;
import ph.com.bpi.dao.T0125DAO;
import ph.com.bpi.dao.T0136DAO;
import ph.com.bpi.exception.MFResponseException;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SysadApiServiceImpl extends SysadApiService {
  

	@Override
	public Response sysadCutoffTimeOverrideCheckGet(String trdrFi, SecurityContext securityContext)
			throws NotFoundException {
		  APIResponse response = new APIResponse();
	  	  APIResponseMeta meta = new APIResponseMeta();
	  	  List<HashMap<String, String>> values;
	  	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
	  	  T0100DAO dao100 = DaoFactory.getT0100DAO();
	  	  List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
	  	  String mfResponse = StringUtils.EMPTY;
	  	  
	  	  data.put(AppConstants.TRDR_FI, trdrFi);
	  	  try{
	  		  meta.setCode(200);
	  		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_CUTOFF_TIME_OVERRIDE_CHECK_GET, data);
	  		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_CUTOFF_TIME_OVERRIDE_CHECK_GET, StringUtils.EMPTY, StringUtils.EMPTY);
	  		  dao100.deleteAllRecords();
	  		  
	  		  for (HashMap<String, String> row : values){
	  			  T0100 model = new T0100();
	  			  model.parse(row);
	  			  dao100.saveRecord(model);
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
      public Response sysadCutoffTimeOverrideCheckPost(CutoffTimeErrorCheckBody cutoffTimeErrorCheck,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  //List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  String mfResponse = StringUtils.EMPTY;
    	  
		  data.put(AppConstants.TRDR_FI, cutoffTimeErrorCheck.getTrdrFi());
		  data.put(AppConstants.CUT_TIME_ONE, cutoffTimeErrorCheck.getCutTime1());
		  data.put(AppConstants.CUT_TIME_TWO, cutoffTimeErrorCheck.getCutTime2());
		  data.put(AppConstants.RATE_VPRD, cutoffTimeErrorCheck.getRateVprd());
		  data.put(AppConstants.POVRD_INDC, cutoffTimeErrorCheck.getPovrdInc());
		  data.put(AppConstants.SOVRD_INDC, cutoffTimeErrorCheck.getSovrdInc());
    	  
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_CUTOFF_TIME_OVERRIDE_CHECK, data);
    		  /*values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_CUTOFF_TIME_OVERRIDE_CHECK, StringUtils.EMPTY, StringUtils.EMPTY);
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
      public Response sysadCutoffTimeRegularSquaringGet(SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  T0125DAO dao125 = DaoFactory.getT0125DAO();
    	  List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  data.put(AppConstants.TRDR_FI, StringUtils.EMPTY);
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_CUTOFF_TIME_REG_SQUARING_GET, AppConstants.PROC_TAG_FIRST_BATCH, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_CUTOFF_TIME_REG_SQUARING_GET, StringUtils.EMPTY, StringUtils.EMPTY);
    		  dao125.deleteAllRecords();
    		  for (HashMap<String, String> row : values){
    			  T0125 model = new T0125();
    			  model.parse(row);
    			  dao125.saveRecord(model);
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
      public Response sysadCutoffTimeRegularSquaringPost(CutoffTimeRegularSquaringBody cutoffTimeRegularSquaring,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  //List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  data.put(AppConstants.TRDR_FI, cutoffTimeRegularSquaring.getTrdrFi());
		  data.put(AppConstants.SCUT_TIME, cutoffTimeRegularSquaring.getScutTime());
    	  
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_CUTOFF_TIME_REG_SQUARING_POST, AppConstants.PROC_TAG_USER_ADD, data);
    		  /*values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_CUTOFF_TIME_REG_SQUARING_POST, StringUtils.EMPTY, StringUtils.EMPTY);
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
      public Response sysadCutoffTimeRegularSquaringPatch(CutoffTimeRegularSquaringBody cutoffTimeRegularSquaring,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  //List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  String mfResponse = StringUtils.EMPTY;
    	  
		  data.put(AppConstants.TRDR_FI, cutoffTimeRegularSquaring.getTrdrFi());
		  data.put(AppConstants.SCUT_TIME, cutoffTimeRegularSquaring.getScutTime());
    	  
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_CUTOFF_TIME_REG_SQUARING_POST, AppConstants.PROC_TAG_USER_UPDATE, data);
    		  /*values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_CUTOFF_TIME_REG_SQUARING_POST, StringUtils.EMPTY, StringUtils.EMPTY);
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
      public Response sysadCutoffTimeRegularSquaringDelete(CutoffTimeRegularSquaringBody cutoffTimeRegularSquaring,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  //List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  String mfResponse = StringUtils.EMPTY;
    	  
		  data.put(AppConstants.TRDR_FI, cutoffTimeRegularSquaring.getTrdrFi());
		  data.put(AppConstants.SCUT_TIME, cutoffTimeRegularSquaring.getScutTime());
    	  
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_CUTOFF_TIME_REG_SQUARING_POST, AppConstants.PROC_TAG_USER_DELETE, data);
    		  /*values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_CUTOFF_TIME_REG_SQUARING_POST, StringUtils.EMPTY, StringUtils.EMPTY);
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
      public Response sysadDocStampPostageCommissionPost(List<SysadDocStampsBody> sysadDocStamps,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response sysadIntradayPositionLimitsGet(SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  T0136DAO dao136 = DaoFactory.getT0136DAO();
    	  List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
    	  String mfResponse = StringUtils.EMPTY;
    	  
//    	  data.put(AppConstants.TRDR_FI, data.get(AppConstants.TRDR_FI));
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTRADAY_POS_LIMITS_GET, AppConstants.PROC_TAG_FIRST_BATCH, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INTRADAY_POS_LIMITS_GET, StringUtils.EMPTY, StringUtils.EMPTY);
    		  dao136.deleteAllRecords();
    		  for (HashMap<String, String> row : values){
    			  T0136 model = new T0136();
    			  model.parse(row);
    			  dao136.saveRecord(model);
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
      public Response sysadIntradayPositionLimitsPost(SysadInterdayPositionLimitsBody sysadInterdayPositionLimits,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  String mfResponse = StringUtils.EMPTY;
    	  
		  data.put(AppConstants.TRDR_FI, sysadInterdayPositionLimits.getTrdrFi());
		  data.put(AppConstants.INTR_LIMIT, sysadInterdayPositionLimits.getIntrLimit());
    	  
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTRADAY_POS_LIMITS_TRANS, AppConstants.PROC_TAG_USER_ADD, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INTRADAY_POS_LIMITS_TRANS, StringUtils.EMPTY, StringUtils.EMPTY);
    		  response.setData(values);
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
      public Response sysadIntradayPositionLimitsDelete(SysadInterdayPositionLimitsBody sysadInterdayPositionLimits,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  String mfResponse = StringUtils.EMPTY;
    	  
		  data.put(AppConstants.TRDR_FI, sysadInterdayPositionLimits.getTrdrFi());
		  data.put(AppConstants.INTR_LIMIT, sysadInterdayPositionLimits.getIntrLimit());
    	  
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTRADAY_POS_LIMITS_TRANS, AppConstants.PROC_TAG_USER_DELETE, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INTRADAY_POS_LIMITS_TRANS, StringUtils.EMPTY, StringUtils.EMPTY);
    		  response.setData(values);
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
      public Response sysadIntradayPositionLimitsPatch(SysadInterdayPositionLimitsBody sysadInterdayPositionLimits,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  String mfResponse = StringUtils.EMPTY;
    	  
		  data.put(AppConstants.TRDR_FI, sysadInterdayPositionLimits.getTrdrFi());
		  data.put(AppConstants.INTR_LIMIT, sysadInterdayPositionLimits.getIntrLimit());
    	  
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTRADAY_POS_LIMITS_TRANS, AppConstants.PROC_TAG_USER_UPDATE, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INTRADAY_POS_LIMITS_TRANS, StringUtils.EMPTY, StringUtils.EMPTY);
    		  response.setData(values);
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
      public Response sysadTransactionAmountSettingsGet(String trdrFi, String currCode, SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  T0104DAO dao104 = DaoFactory.getT0104DAO();
    	  List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  data.put(AppConstants.TRDR_FI, trdrFi);
    	  data.put(AppConstants.CURR_CODE, currCode);
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_TRAN_AMT_SETTING, AppConstants.PROC_TAG_FIRST_BATCH, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_TRAN_AMT_SETTING, StringUtils.EMPTY, StringUtils.EMPTY);
    		  dao104.deleteAllRecords();
    		  for (HashMap<String, String> row : values){
    			  T0104 model = new T0104();
    			  model.parse(row);
    			  dao104.saveRecord(model);
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
      public Response sysadTransactionAmountSettingsPatch(SysadTransactionAmountSettingBody sysadTransactionAmountSetting,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  String mfResponse = StringUtils.EMPTY;
    	  
		  data.put(AppConstants.TRDR_FI, sysadTransactionAmountSetting.getTrdrFi());
		  data.put(AppConstants.CURR_CODE, sysadTransactionAmountSetting.getCurrCode());
		  data.put(AppConstants.MIN_AMNT, sysadTransactionAmountSetting.getMinAmnt());
		  data.put(AppConstants.PABV_LIM, sysadTransactionAmountSetting.getPabvLim());
		  data.put(AppConstants.SABV_LIM, sysadTransactionAmountSetting.getSabvLim());
    	  
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_TRAN_AMT_SETTING_PUT, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_TRAN_AMT_SETTING_PUT, StringUtils.EMPTY, StringUtils.EMPTY);
    		  response.setData(values);
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
      public Response sysadTransactionAmountSettingsAllGet(SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  T0105DAO dao105 = DaoFactory.getT0105DAO();
    	  List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  data.put(AppConstants.TRDR_FI, "2");
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_TRAN_AMT_SETTING_ALL, AppConstants.PROC_TAG_FIRST_BATCH, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_TRAN_AMT_SETTING_ALL, StringUtils.EMPTY, StringUtils.EMPTY);
    		  dao105.deleteAllRecords();
    		  for (HashMap<String, String> row : values){
    			  T0105 model = new T0105();
    			  model.parse(row);
    			  dao105.saveRecord(model);
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
	public Response sysadBpiBfbSettlementGet(String trdrFi, String currCode, SecurityContext securityContext) throws NotFoundException {
		  APIResponse response = new APIResponse();
	  	  APIResponseMeta meta = new APIResponseMeta();
	  	  List<HashMap<String, String>> values;
	  	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
	  	  T0110DAO dao110 = DaoFactory.getT0110DAO();
	  	  T0109DAO dao109 = DaoFactory.getT0109DAO();
	  	  List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
	  	  String mfResponse = StringUtils.EMPTY;
	  	  
	  	  data.put(AppConstants.TRDR_FI, trdrFi);
	  	  data.put(AppConstants.CURR_CODE, currCode);
	  	  try{
	  		  meta.setCode(200);
	  		  if("".equals(currCode)){
	  			 mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_BPI_BFB_SETTLEMENT_LIST_ALL, AppConstants.PROC_TAG_FIRST_BATCH, data);
		  		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_BPI_BFB_SETTLEMENT_LIST_ALL, StringUtils.EMPTY, StringUtils.EMPTY);
		  		  dao109.deleteAllRecords();
		  		  for (HashMap<String, String> row : values){
		  			  T0110 model = new T0110();
		  			  model.parse(row);
		  			  dao110.saveRecord(model);
		  		  }
		  		  result = values;
	  		  }else{
	  			 mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_BPI_BFB_SETTLEMENT_LIST, data);
		  		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_BPI_BFB_SETTLEMENT_LIST, StringUtils.EMPTY, StringUtils.EMPTY);
		  		  dao109.deleteAllRecords();
		  		  for (HashMap<String, String> row : values){
		  			  T0109 model = new T0109();
		  			  model.parse(row);
		  			  dao109.saveRecord(model);
		  		  }
		  		  result = values;
	  		  }
	  		  
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
	public Response sysadBpiBfbSettlementPut(BpiBfbSettlementBody bpiBfbSettlementBody, SecurityContext securityContext)
			throws NotFoundException {
		  APIResponse response = new APIResponse();
	  	  APIResponseMeta meta = new APIResponseMeta();
	  	  //List<HashMap<String, String>> values;
	  	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
	  	  String mfResponse = StringUtils.EMPTY;
	  	  
  		  data.put(AppConstants.TRDR_FI, bpiBfbSettlementBody.getTrdrFi());
  		  data.put(AppConstants.CURR_CODE, bpiBfbSettlementBody.getCurrCode());
  		  data.put(AppConstants.BPI_ACCT, bpiBfbSettlementBody.getBpiAcct());
  		  data.put(AppConstants.BFB_ACCT, bpiBfbSettlementBody.getBfbAcct());
	  	  try{
	  		  meta.setCode(200);
	  		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_BPI_BFB_SETTLEMENT_PROCESS, AppConstants.PROC_TAG_USER_UPDATE, data);
	  		  /*values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_BPI_BFB_SETTLEMENT_PROCESS, StringUtils.EMPTY, StringUtils.EMPTY);
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
	public Response sysadBpiBfbSettlementPost(BpiBfbSettlementBody bpiBfbSettlementBody, SecurityContext securityContext)
			throws NotFoundException {
		APIResponse response = new APIResponse();
	  	  APIResponseMeta meta = new APIResponseMeta();
	  	  //List<HashMap<String, String>> values;
	  	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
	  	  String mfResponse = StringUtils.EMPTY;
	  	  
		  data.put(AppConstants.TRDR_FI, bpiBfbSettlementBody.getTrdrFi());
		  data.put(AppConstants.CURR_CODE, bpiBfbSettlementBody.getCurrCode());
		  data.put(AppConstants.BPI_ACCT, bpiBfbSettlementBody.getBpiAcct());
		  data.put(AppConstants.BFB_ACCT, bpiBfbSettlementBody.getBfbAcct());
	  	  try{
	  		  meta.setCode(200);
	  		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_BPI_BFB_SETTLEMENT_PROCESS, AppConstants.PROC_TAG_USER_ADD, data);
	  		  /*values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_BPI_BFB_SETTLEMENT_PROCESS, StringUtils.EMPTY, StringUtils.EMPTY);
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
	public Response sysadBpiBfbSettlementDelete(BpiBfbSettlementBody bpiBfbSettlementBody, SecurityContext securityContext)
			throws NotFoundException {
		APIResponse response = new APIResponse();
	  	  APIResponseMeta meta = new APIResponseMeta();
	  	  //List<HashMap<String, String>> values;
	  	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
	  	  String mfResponse = StringUtils.EMPTY;
	  	  
		  data.put(AppConstants.TRDR_FI, bpiBfbSettlementBody.getTrdrFi());
		  data.put(AppConstants.CURR_CODE, bpiBfbSettlementBody.getCurrCode());
		  data.put(AppConstants.BPI_ACCT, bpiBfbSettlementBody.getBpiAcct());
		  data.put(AppConstants.BFB_ACCT, bpiBfbSettlementBody.getBfbAcct());
	  	  try{
	  		  meta.setCode(200);
	  		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_BPI_BFB_SETTLEMENT_PROCESS, AppConstants.PROC_TAG_USER_DELETE, data);
	  		  /*values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_BPI_BFB_SETTLEMENT_PROCESS, StringUtils.EMPTY, StringUtils.EMPTY);
	  		  response.setData(values);*/
	  		  meta.setErrorMessage(mfResponse.substring(0, 70));
	  		  
	  	  }
	  	  catch(MFResponseException e){
	  		  meta.setCode(Integer.valueOf(e.getCode()));
	  		  meta.setErrorMessage(e.getMessage());
	  		  e.printStackTrace();
	  	  }
	  	  response.setMeta(meta);
		return  Response.ok().entity(response).build();
	}

	@Override
	public Response sysadDocStampPostageCommissionGet(String modeCode, String trdrFi, SecurityContext securityContext)
			throws NotFoundException {
		APIResponse response = new APIResponse();
  	  APIResponseMeta meta = new APIResponseMeta();
  	  List<HashMap<String, String>> values;
  	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  	  T0123DAO dao123 = DaoFactory.getT0123DAO();
  	  List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
  	  String mfResponse = StringUtils.EMPTY;
  	  
  	data.put(AppConstants.MODE_CODE, modeCode);
  	  data.put(AppConstants.TRDR_FI, trdrFi);
  	  try{
  		  meta.setCode(200);
  		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.DOC_STAMP_POSTAGE_COMMISSION_GET_TC, data);
  		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.DOC_STAMP_POSTAGE_COMMISSION_GET_TC, StringUtils.EMPTY, StringUtils.EMPTY);
  		  dao123.deleteAllRecords();
  		  for (HashMap<String, String> row : values){
  			  T0123 model = new T0123();
  			  model.parse(row);
  			  System.out.print(model.toString());
  			  System.out.println("");
  			  dao123.saveRecord(model);
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
	public Response sysadDocStampPostageCommissionPut(DocStampPostageCommissionBody docStampPostageCommissionBody,
			SecurityContext securityContext) throws NotFoundException {
		APIResponse response = new APIResponse();
		  APIResponseMeta meta = new APIResponseMeta();
		  List<HashMap<String, String>> values;
		  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		  List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
		  String mfResponse = StringUtils.EMPTY;
		  
		  data.put(AppConstants.TRDR_FI, docStampPostageCommissionBody.getTrdrFi());
		  data.put(AppConstants.MODE_CODE, docStampPostageCommissionBody.getModeCode());
		  data.put(AppConstants.ADOC_PERC, docStampPostageCommissionBody.getAdocPerc());
		  data.put(AppConstants.ADOC_AMNT, docStampPostageCommissionBody.getAdocAmnt());
		  data.put(AppConstants.ADOC_INDC, docStampPostageCommissionBody.getAdocIndc());
		  data.put(AppConstants.ACOM_PERC, docStampPostageCommissionBody.getAcomPerc());
		  data.put(AppConstants.ACOM_AMNT, docStampPostageCommissionBody.getAcomAmnt());
		  data.put(AppConstants.ACOM_INDC, docStampPostageCommissionBody.getAcomIndc());
		  data.put(AppConstants.SDOC_PERC, docStampPostageCommissionBody.getSdocPerc());
		  data.put(AppConstants.SDOC_AMNT, docStampPostageCommissionBody.getSdocAmnt());
		  data.put(AppConstants.SDOC_INDC, docStampPostageCommissionBody.getSdocIndc());
		  data.put(AppConstants.SCOM_PERC, docStampPostageCommissionBody.getScomPerc());
		  data.put(AppConstants.SCOM_AMNT, docStampPostageCommissionBody.getScomAmnt());
		  data.put(AppConstants.SCOM_INDC, docStampPostageCommissionBody.getScomIndc());
		  data.put(AppConstants.TC_POST, docStampPostageCommissionBody.getTcPost());
		  try{
			  meta.setCode(200);
			  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.DOC_STAMP_POSTAGE_COMMISSION_PUT_TC, data);
			  /*values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.DOC_STAMP_POSTAGE_COMMISSION_PUT_TC, StringUtils.EMPTY, StringUtils.EMPTY);
			  result = values;*/
			  meta.setErrorMessage(mfResponse.substring(0, 70));
			  
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
