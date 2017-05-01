package ph.com.bpi.api.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

import ph.com.bpi.api.AppConstants;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.api.RateApiService;
import ph.com.bpi.dao.BaseDAO;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.T0216DAO;
import ph.com.bpi.dao.T0220DAO;
import ph.com.bpi.dao.T0225DAO;
import ph.com.bpi.dao.T0229DAO;
import ph.com.bpi.dao.T0232DAO;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.model.TModelBase;
import ph.com.bpi.model.hibernate.T0105;
import ph.com.bpi.model.hibernate.T0216;
import ph.com.bpi.model.hibernate.T0220;
import ph.com.bpi.model.hibernate.T0225;
import ph.com.bpi.model.hibernate.T0229;
import ph.com.bpi.model.hibernate.T0232;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class RateApiServiceImpl extends RateApiService {
  
      @Override
      public Response rateInquiryGet(Integer trdrFi,Integer rateType,Integer wCurr,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  T0220DAO dao220 = DaoFactory.getT0220DAO();
    	  T0225DAO dao225 = DaoFactory.getT0225DAO();
    	  T0229DAO dao229 = DaoFactory.getT0229DAO();
    	  
    	  T0232DAO dao232 = DaoFactory.getT0232DAO();
    	  
    	  
    	  List<HashMap<String,String>> result = new ArrayList<HashMap<String,String>>();
    	  String mfResponse = StringUtils.EMPTY;
		  try
		  {
			  meta.setCode(200);

	    	  if (rateType==1 && (trdrFi==1||trdrFi==2))
	    	  {
	    			 mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INQUIRY_RATES_OTC,data);
	    			 values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INQUIRY_RATES_OTC,
	    					 StringUtils.EMPTY, StringUtils.EMPTY);
	    			 dao220.deleteAllRecords();
	    			 for (HashMap<String,String> row : values)
	    			 {
	    				  HashMap<String,String> rowResult = new HashMap<String,String>();
	    		    	  T0220 model = new T0220();
	    		    	  model.parse(row);
	    		    	  dao220.saveRecord(model);
	    		    	  rowResult.put("prch_rate", model.getPrchRate().toString());
	    		    	  rowResult.put("sale_rate", model.getSaleRate().toString());
	    		    	  result.add(rowResult);
	    			 }
	    	  }
	    	  else if (rateType==2)
			  {
				  dao225.deleteAllRecords();
				 
				  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INQUIRY_RATES_TIER,data);
				  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INQUIRY_RATES_TIER,
	    					 StringUtils.EMPTY, StringUtils.EMPTY);
				  for (HashMap<String,String> row : values)
	    			 {
	    		    	  T0225 model = new T0225();
	    		    	  model.parse(row);
	    		    	  dao225.saveRecord(model);
	    			 }
				  result = values;
			  }
	    	  else if (rateType == 3)
	    	  {
	    		  dao229.deleteAllRecords();
					 
				  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INQUIRY_RATES_PREF,data);
				  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INQUIRY_RATES_PREF,
	    					 StringUtils.EMPTY, StringUtils.EMPTY);
				  for (HashMap<String,String> row : values)
	    			 {
	    		    	  T0229 model = new T0229();
	    		    	  model.parse(row);
	    		    	  dao229.saveRecord(model);
	    			 }
				  result = values;
	    	  }
	    	  else if (rateType == 4)
	    	  {
	    		  String tranCode = "";
	    		  T0105 t0105 = new T0105();
	    		  data.put(AppConstants.TRDR_FI, trdrFi.toString());
				  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_CURRENCY,data);
				  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_CURRENCY,
	    					 StringUtils.EMPTY, StringUtils.EMPTY);
				  t0105.parse(values.get(0));
				  if (trdrFi==3)
				  {
					  if (t0105.getCurrCode().trim().length()==0)
					  {
						  tranCode = wCurr==1?"T0211":"T0214";
					  }
					  else
					  {
						  tranCode = wCurr==1?"T0210":"T0213";
					  }
				  }
				  else{
					  tranCode = wCurr==1?"T0235":"T0234";
				  }
				  mfResponse = MFSendDetailsUtil.sendDetails(tranCode.substring(1),data);
				  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, tranCode.substring(1),
	    					 StringUtils.EMPTY, StringUtils.EMPTY);
				  TModelBase base = null;
				  Class<?> cl;
				try {
					cl = Class.forName("ph.com.bpi.model.hibernate."+tranCode);

					Constructor<?> cons = cl.getConstructor(String.class);
					base = (TModelBase) cons.newInstance(tranCode);
					java.lang.reflect.Method m = DaoFactory.class.getMethod("get"+tranCode+"DAO", null);
					BaseDAO<TModelBase> invoke = (BaseDAO<TModelBase>) m.invoke(null, null);
					BaseDAO baseDao = invoke;
					baseDao.deleteAllRecords();
					for (HashMap<String,String> row :values)
					{
						base.parse(row);
						baseDao.saveRecord(base);
					  }
					  result = values;
				} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	    	  }
	    	  else if (rateType == 5)
	    	  {
	    		  dao232.deleteAllRecords();
					 
				  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INQUIRY_RATES_US,data);
				  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INQUIRY_RATES_US,
	    					 StringUtils.EMPTY, StringUtils.EMPTY);
				  for (HashMap<String,String> row : values)
	    			 {
					  	T0232 model = new T0232();
					  	model.parse(row);
					  	dao232.saveRecord(model);
	    			 }
				  result = values;
	    	  }
 			else if (rateType == 6)
	    	  {
 				T0216DAO dao216 = DaoFactory.getT0216DAO();
 				dao216.deleteAllRecords();
				  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INQUIRY_RATES_USB,data);
				  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INQUIRY_RATES_USB,
	    					 StringUtils.EMPTY, StringUtils.EMPTY);
				  for (HashMap<String,String> row : values)
	    			 {
					  	T0216 model = new T0216();
					  	model.parse(row);
					  	dao216.saveRecord(model);
	    			 }
				  result = values;
	    	  }
 			else
 			{
 				meta.setCode(500);
 				meta.setErrorMessage("Invalid rate inquiry combination");
 			}

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
      public Response rateOtcGetGet(String trdrFi,String tranFi,String currCode,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  
    	  data.put(AppConstants.TRDR_FI,trdrFi);
    	  data.put(AppConstants.TRAN_FI,tranFi);
    	  data.put(AppConstants.CURR_CODE,currCode);
    	  String mfResponse = StringUtils.EMPTY;
    	  try{
			 T0220DAO dao220 = DaoFactory.getT0220DAO();
			
			 mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INQUIRY_RATES_OTC,data);
			 values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INQUIRY_RATES_OTC,
					 StringUtils.EMPTY, StringUtils.EMPTY);
 			response.setData(values.get(0));
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
      public Response rateOtcListGet(SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();

    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  try{
 			 T0220DAO dao220 = DaoFactory.getT0220DAO();
 			
 			 mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INQUIRY_RATES_OTC,data);
 			 values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INQUIRY_RATES_OTC,
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
      public Response rateTierGetGet(String trdrFi,String tranFi,String currCode,SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  String mfResponse = StringUtils.EMPTY;
    	  data.put(AppConstants.TRDR_FI,trdrFi);
    	  data.put(AppConstants.TRAN_FI,tranFi);
    	  data.put(AppConstants.CURR_CODE,currCode);
    	  
    	  try{
			  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INQUIRY_RATES_TIER,data);
			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INQUIRY_RATES_TIER,
    					 StringUtils.EMPTY, StringUtils.EMPTY);
			  response.setData(values.get(0));
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
      public Response rateTierListGet(SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  String mfResponse = StringUtils.EMPTY;
    	  
    	  try{
			  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INQUIRY_RATES_TIER,data);
			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INQUIRY_RATES_TIER,
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
  
}
