package ph.com.bpi.api.impl;

import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.model.InterbankDataEntryBody;
import ph.com.bpi.model.hibernate.T0803;
import ph.com.bpi.model.hibernate.T0804;
import ph.com.bpi.model.hibernate.T0811;
import ph.com.bpi.model.hibernate.T0812;
import ph.com.bpi.model.hibernate.T0814;
import ph.com.bpi.model.hibernate.T0815;
import ph.com.bpi.model.hibernate.T0816;
import ph.com.bpi.model.hibernate.T0817;
import ph.com.bpi.utilities.AppConstants;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;
import ph.com.bpi.model.InterbankDefineFileProcessBody;
import ph.com.bpi.model.InterbankErrorCorrectBody;
import ph.com.bpi.api.InterbankApiService;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.T0803DAO;
import ph.com.bpi.dao.T0804DAO;
import ph.com.bpi.dao.T0811DAO;
import ph.com.bpi.dao.T0812DAO;
import ph.com.bpi.dao.T0814DAO;
import ph.com.bpi.dao.T0815DAO;
import ph.com.bpi.dao.T0816DAO;
import ph.com.bpi.dao.T0817DAO;
import ph.com.bpi.exception.MFResponseException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class InterbankApiServiceImpl extends InterbankApiService {
  
      @Override
      public Response interbankDataEntryPost(InterbankDataEntryBody interbankDataEntry,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  //List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  String mfResponse = StringUtils.EMPTY;
    	  
		  data.put(AppConstants.TRAN_TYPE, interbankDataEntry.getTranType());
		  data.put(AppConstants.CNTR_PRTY, interbankDataEntry.getCntrPrty());
		  data.put(AppConstants.CNTC_PRSN, interbankDataEntry.getCntcPrsn());
		  data.put(AppConstants.ADDRESS1, interbankDataEntry.getAddress1());
		  data.put(AppConstants.ADDRESS2, interbankDataEntry.getAddress2());
		  data.put(AppConstants.TRAN_AMNT, interbankDataEntry.getTranAmnt());
		  data.put(AppConstants.EXCH_RATE, interbankDataEntry.getExchRate());
		  data.put(AppConstants.EQVT_AMNT, interbankDataEntry.getEqvtAmnt());
		  data.put(AppConstants.VAL_DATE, interbankDataEntry.getValDate());
		  data.put(AppConstants.RECV_ACCT, interbankDataEntry.getRecvAcct());
		  data.put(AppConstants.REMARKS, interbankDataEntry.getRemarks());
		  data.put(AppConstants.BANK_NAME, interbankDataEntry.getBankName());
		  data.put(AppConstants.OTHR_INST, interbankDataEntry.getOthrInst());
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTERBANK_DATA_ENTRY, data);
    		  /*values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INTERBANK_DATA_ENTRY, StringUtils.EMPTY, StringUtils.EMPTY);
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
      public Response interbankDefineFileListPost(String bankCode,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  T0804DAO dao804 = DaoFactory.getT0804DAO();
    	  T0803DAO dao803 = DaoFactory.getT0803DAO();
    	  List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  data.put(AppConstants.BANK_CODE, bankCode);
    	  try{
    		  meta.setCode(200);
    		  if(bankCode.equals("")){
    			  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTERBANK_DEFINE_LIST, AppConstants.PROC_TAG_FIRST_BATCH, data);
        		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INTERBANK_DEFINE_LIST, StringUtils.EMPTY, StringUtils.EMPTY);
        		  dao804.deleteAllRecords();
        		  for (HashMap<String, String> row : values){
        			  T0804 model = new T0804();
        			  model.parse(row);
        			  dao804.saveRecord(model);
        		  }
        		  result = values;
    		  }else{
    			  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTERBANK_DEFINE_GET, data);
        		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_INTERBANK_DEFINE_GET, StringUtils.EMPTY, StringUtils.EMPTY);
        		  dao803.deleteAllRecords();
        		  for (HashMap<String, String> row : values){
        			  T0803 model = new T0803();
        			  model.parse(row);
        			  dao803.saveRecord(model);
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
      public Response interbankDefineFileProcessPost(InterbankDefineFileProcessBody interbankDefineFileProcess,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  //List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  System.out.print(interbankDefineFileProcess.toString());
    	  
		  data.put(AppConstants.BANK_CODE, interbankDefineFileProcess.getBankCode());
		  data.put(AppConstants.CNTR_PRTY, interbankDefineFileProcess.getCntrPrty());
		  data.put(AppConstants.BANK_NAME, interbankDefineFileProcess.getBankName());
		  data.put(AppConstants.ADDRESS1, interbankDefineFileProcess.getAddress1());
		  data.put(AppConstants.ADDRESS2, interbankDefineFileProcess.getAddress2());
		  data.put(AppConstants.CNTC_PRSN, interbankDefineFileProcess.getCntcPrsn());
		  data.put(AppConstants.RECV_ACCT, interbankDefineFileProcess.getRecvAcct());
		  data.put(AppConstants.OTHR_INST, interbankDefineFileProcess.getOthrInst());
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTERBANK_DEFINE_PROCESS, AppConstants.PROC_TAG_POST ,data);
    		  meta.setErrorMessage(mfResponse.substring(0, 70));
    		  //values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INTERBANK_DEFINE_PROCESS, StringUtils.EMPTY, StringUtils.EMPTY);
    		  //response.setData(values);
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
      public Response interbankErrorCorrectPost(InterbankErrorCorrectBody interbankErrorCorrect,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  //List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  String mfResponse = StringUtils.EMPTY;
    	  
		  data.put(AppConstants.TRAN_NAME, "I");
		  data.put(AppConstants.G_LOG_DATE, interbankErrorCorrect.getGLogDate());
		  data.put(AppConstants.REF_NMBR, interbankErrorCorrect.getRefNmbr());
		  data.put(AppConstants.TRAN_INDTR, interbankErrorCorrect.getTranIndtr());
		  data.put(AppConstants.MANG_UNIT, StringUtils.EMPTY);
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTERBANK_ERROR_CORRECT, data);
    		  /*values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INTERBANK_ERROR_CORRECT, StringUtils.EMPTY, StringUtils.EMPTY);
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
      public Response interbankInquiryListPost(String tranIndtr,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  T0811DAO dao811 = DaoFactory.getT0811DAO();
    	  String mfResponse = StringUtils.EMPTY;
    	  List<HashMap<String,String>> result = new ArrayList<HashMap<String,String>>();
    	  
    	  data.put(AppConstants.TRAN_INDTR, tranIndtr);
    	  data.put(AppConstants.REF_NMBR, StringUtils.EMPTY);
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTERBANK_INQUIRY_LIST, AppConstants.PROC_TAG_FIRST_BATCH, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INTERBANK_INQUIRY_LIST, StringUtils.EMPTY, StringUtils.EMPTY);
    		  dao811.deleteAllRecords();
    		  for(HashMap<String, String> row : values){
    			  T0811 model = new T0811();
    			  model.parse(row);
    			  dao811.saveRecord(model);
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
      public Response interbankInquiryListNextPost(String tranIndtr,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  T0811DAO dao811 = DaoFactory.getT0811DAO();
    	  String mfResponse = StringUtils.EMPTY;
    	  List<HashMap<String,String>> result = new ArrayList<HashMap<String,String>>();
    	  
    	  data.put(AppConstants.TRAN_INDTR, tranIndtr);
    	  data.put(AppConstants.REF_NMBR, StringUtils.EMPTY);
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTERBANK_INQUIRY_LIST, AppConstants.PROC_TAG_NEXT_BATCH, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INTERBANK_INQUIRY_LIST, StringUtils.EMPTY, StringUtils.EMPTY);
    		  dao811.deleteAllRecords();
    		  for(HashMap<String, String> row : values){
    			  T0811 model = new T0811();
    			  model.parse(row);
    			  dao811.saveRecord(model);
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
      public Response interbankInquiryRefNoPost(String refNo,String tranIndtr,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  T0812DAO dao812 = DaoFactory.getT0812DAO();
    	  String mfResponse = StringUtils.EMPTY;
    	  List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
    	  
    	  data.put(AppConstants.TRAN_INDTR, tranIndtr);
    	  data.put(AppConstants.REF_NMBR, refNo);
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTERBANK_INQUIRY_REF_NO, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_INTERBANK_INQUIRY_REF_NO, StringUtils.EMPTY,	StringUtils.EMPTY);
    		  dao812.deleteAllRecords();

    		  for(HashMap<String, String> row : values){
    			  T0812 model = new T0812();
    			  model.parse(row);
    			  dao812.saveRecord(model);
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
      public Response interbankLoaListPost(String tranIndtr,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  T0817DAO dao817 = DaoFactory.getT0817DAO();
    	  String mfResponse = StringUtils.EMPTY;
    	  List<HashMap<String,String>> result = new ArrayList<HashMap<String,String>>();

    	  data.put(AppConstants.TRAN_INDTR, tranIndtr);
    	  data.put(AppConstants.LOA_NMBR, StringUtils.EMPTY);
    	  data.put(AppConstants.CNTR_PRTY, StringUtils.EMPTY);
    	  data.put(AppConstants.ABS_TIME, "0");
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTERBANK_LOA_LIST, AppConstants.PROC_TAG_FIRST_BATCH, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INTERBANK_LOA_LIST, StringUtils.EMPTY, StringUtils.EMPTY);
    		  dao817.deleteAllRecords();
    		  for(HashMap<String, String> row : values){
    			  T0817 model = new T0817();
    			  model.parse(row);
    			  dao817.saveRecord(model);
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
      public Response interbankLoaListNextPost(String tranIndtr,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  T0817DAO dao817 = DaoFactory.getT0817DAO();
    	  String mfResponse = StringUtils.EMPTY;
    	  List<HashMap<String,String>> result = new ArrayList<HashMap<String,String>>();

    	  data.put(AppConstants.TRAN_INDTR, tranIndtr);
    	  data.put(AppConstants.LOA_NMBR, StringUtils.EMPTY);
    	  data.put(AppConstants.CNTR_PRTY, StringUtils.EMPTY);
    	  data.put(AppConstants.ABS_TIME, "0");
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTERBANK_LOA_LIST, AppConstants.PROC_TAG_NEXT_BATCH, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(tranIndtr.equals("P") ? mfResponse.substring(70) : mfResponse, AppConstants.TC_INTERBANK_LOA_LIST, StringUtils.EMPTY, StringUtils.EMPTY);
    		  dao817.deleteAllRecords();
    		  for(HashMap<String, String> row : values){
    			  T0817 model = new T0817();
    			  model.parse(row);
    			  dao817.saveRecord(model);
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
      public Response interbankLoaPurchasePrintPost(String gLogDate,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  T0815DAO dao815 = DaoFactory.getT0815DAO();
    	  List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  data.put(AppConstants.G_LOG_DATE, gLogDate);
    	  data.put(AppConstants.LOA_NMBR, StringUtils.EMPTY);
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTERBANK_LOA_PURCHASE_PRINT, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INTERBANK_LOA_PURCHASE_PRINT, StringUtils.EMPTY, StringUtils.EMPTY);
    		  dao815.deleteAllRecords();
    		  for (HashMap<String, String> row : values){
    			  T0815 model = new T0815();
    			  model.parse(row);
    			  dao815.saveRecord(model);
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
      public Response interbankLoaSalePrintPost(String gLogDate,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  T0816DAO dao816 = DaoFactory.getT0816DAO();
    	  List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  data.put(AppConstants.G_LOG_DATE, gLogDate);
    	  data.put(AppConstants.CNTR_PRTY, StringUtils.EMPTY);
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTERBANK_LOA_SALE_PRINT, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INTERBANK_LOA_SALE_PRINT, StringUtils.EMPTY, StringUtils.EMPTY);
    		  dao816.deleteAllRecords();
    		  for (HashMap<String, String> row : values){
    			  T0816 model = new T0816();
    			  model.parse(row);
    			  dao816.saveRecord(model);
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
      public Response interbankReportPost(String refNo,String tranIndtr,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  T0814DAO dao814 = DaoFactory.getT0814DAO();
    	  List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();
    	  String mfResponse = StringUtils.EMPTY;
    	  
    		  data.put(AppConstants.TRAN_INDTR, tranIndtr);
        	  data.put(AppConstants.REF_NMBR, refNo);
    	  
    	  try{
    		  meta.setCode(200);
    		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTERBANK_REPORT, AppConstants.PROC_TAG_FIRST_BATCH, data);
    		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INTERBANK_REPORT, StringUtils.EMPTY, StringUtils.EMPTY);
    		  dao814.deleteAllRecords();
    		  for (HashMap<String, String> row : values){
    			  T0814 model = new T0814();
    			  model.parse(row);
    			  dao814.saveRecord(model);
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
	public Response interbankDefineFileProcessPut(InterbankDefineFileProcessBody interbankDefineFileProcess,
			SecurityContext securityContext) throws NotFoundException {
		  APIResponse response = new APIResponse();
	  	  APIResponseMeta meta = new APIResponseMeta();
	  	  //List<HashMap<String, String>> values;
	  	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
	  	  String mfResponse = StringUtils.EMPTY;
	  	  System.out.print(interbankDefineFileProcess);
  		  data.put(AppConstants.BANK_CODE, interbankDefineFileProcess.getBankCode());
  		  data.put(AppConstants.CNTR_PRTY, interbankDefineFileProcess.getCntrPrty());
  		  data.put(AppConstants.BANK_NAME, interbankDefineFileProcess.getBankName());
  		  data.put(AppConstants.ADDRESS1, interbankDefineFileProcess.getAddress1());
  		  data.put(AppConstants.ADDRESS2, interbankDefineFileProcess.getAddress2());
  		  data.put(AppConstants.CNTC_PRSN, interbankDefineFileProcess.getCntcPrsn());
  		  data.put(AppConstants.RECV_ACCT, interbankDefineFileProcess.getRecvAcct());
  		  data.put(AppConstants.OTHR_INST, interbankDefineFileProcess.getOthrInst());
	  	  try{
	  		  meta.setCode(200);
	  		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTERBANK_DEFINE_PROCESS, AppConstants.PROC_TAG_USER_UPDATE, data);
	  		  meta.setErrorMessage(mfResponse.substring(0, 70));
	  		  /* values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INTERBANK_DEFINE_PROCESS, StringUtils.EMPTY, StringUtils.EMPTY);
	  		  response.setData(values);*/
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
	public Response interbankDefineFileProcessDelete(InterbankDefineFileProcessBody interbankDefineFileProcess,
			SecurityContext securityContext) throws NotFoundException {
		  APIResponse response = new APIResponse();
	  	  APIResponseMeta meta = new APIResponseMeta();
	  	  //List<HashMap<String, String>> values;
	  	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
	  	  String mfResponse = StringUtils.EMPTY;
	  	  
  		  data.put(AppConstants.BANK_CODE, interbankDefineFileProcess.getBankCode());
  		  data.put(AppConstants.CNTR_PRTY, interbankDefineFileProcess.getCntrPrty());
  		  data.put(AppConstants.BANK_NAME, interbankDefineFileProcess.getBankName());
  		  data.put(AppConstants.ADDRESS1, interbankDefineFileProcess.getAddress1());
  		  data.put(AppConstants.ADDRESS2, interbankDefineFileProcess.getAddress2());
  		  data.put(AppConstants.CNTC_PRSN, interbankDefineFileProcess.getCntcPrsn());
  		  data.put(AppConstants.RECV_ACCT, interbankDefineFileProcess.getRecvAcct());
  		  data.put(AppConstants.OTHR_INST, interbankDefineFileProcess.getOthrInst());
	  	  try{
	  		  meta.setCode(200);
	  		  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INTERBANK_DEFINE_PROCESS, AppConstants.PROC_TAG_USER_DELETE, data);
	  		  meta.setErrorMessage(mfResponse.substring(0, 70));
	  		  /*values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INTERBANK_DEFINE_PROCESS, StringUtils.EMPTY, StringUtils.EMPTY);
	  		  response.setData(values);*/
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

