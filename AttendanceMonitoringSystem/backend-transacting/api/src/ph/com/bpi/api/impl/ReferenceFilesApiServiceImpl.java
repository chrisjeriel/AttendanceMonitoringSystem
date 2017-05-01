package ph.com.bpi.api.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.api.ReferenceFilesApiService;
import ph.com.bpi.dao.BaseDAO;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.model.TModelBase;
import ph.com.bpi.model.TableFieldProperty;
import ph.com.bpi.model.hibernate.T0011;
import ph.com.bpi.model.hibernate.T0100;
import ph.com.bpi.model.hibernate.T0105;
import ph.com.bpi.model.hibernate.T0112;
import ph.com.bpi.model.hibernate.T0115;
import ph.com.bpi.model.hibernate.T0118;
import ph.com.bpi.model.hibernate.T0121;
import ph.com.bpi.model.hibernate.T0128;
import ph.com.bpi.model.hibernate.T0131;
import ph.com.bpi.model.hibernate.T0134;
import ph.com.bpi.model.hibernate.T0140;
import ph.com.bpi.model.hibernate.T0200;
import ph.com.bpi.utilities.AppTableProperties;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class ReferenceFilesApiServiceImpl extends ReferenceFilesApiService {
	 final String[] included ={"T0105","T0112","T0115","T0128","T0118",
			  "T0121","T0131","T0134","T0200","T0100","T0140",
			  "T0011"};
      @Override
      public Response referenceFilesDownloadGet(List<String> transactionCodes,SecurityContext securityContext)
      throws NotFoundException {
    	  
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
    	  List<HashMap<String, String>> values;
    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  
    	  List<Class<? extends TModelBase>> tCodes = new ArrayList<Class<? extends TModelBase>>();
    	 
    	  
    	  ArrayList<String> includedList = new ArrayList<String>(Arrays.asList(included));
    	  Boolean isSuccesful = true;
    	  for (String trCode: transactionCodes)
    	  {
//    		  if (!includedList.contains(trCode.toUpperCase()))
//    		  {
//    			  continue;
//    		  }
    		  BaseDAO base;
    		  TModelBase model;
    		  switch (trCode.toUpperCase())
    		  {
    		  	case "T0105":
			  		base =  DaoFactory.getT0105DAO();
			  		model = new T0105();
			  		break;
			  	case "T0112":
			  		base =  DaoFactory.getT0112DAO();
			  		model = new T0112();
			  		break;
			  	case "T0115":
			  		base =  DaoFactory.getT0115DAO();
			  		model = new T0115();
			  		break;
			  	case "T0128":
			  		base =  DaoFactory.getT0128DAO();
			  		model = new T0128();
			  		break;
			  	case "T0118":
			  		base =  DaoFactory.getT0118DAO();
			  		model = new T0118();
			  		break;
			  	case "T0121":
			  		base =  DaoFactory.getT0121DAO();
			  		model = new T0121();
			  		break;
			  	case "T0131":
			  		base =  DaoFactory.getT0131DAO();
			  		model = new T0131();
			  		break;
			  	case "T0134":
			  		base =  DaoFactory.getT0134DAO();
			  		model = new T0134();
			  		break;
			  	case "T0200":
			  		base =  DaoFactory.getT0200DAO();
			  		model = new T0200();
			  		break;
			  	case "T0100":
			  		base =  DaoFactory.getT0100DAO();
			  		model = new T0100();
			  		break;
			  	case "T0140":
			  		base =  DaoFactory.getT0140DAO();
			  		model = new T0140();
			  		break;
			  	case "T0011":
			  		base = DaoFactory.getT0011DAO();
			  		model = new T0011();
			  		break;
			  	default:
			  		continue;
    		  }
    		  try{
    			  String tranCode = trCode.toUpperCase().split("T")[1];

    			 String mfResponse = MFSendDetailsUtil.sendDetails(tranCode,data);
    			 values = MFReceiveDetailsUtil.receiveDetails(mfResponse, tranCode,
    					 StringUtils.EMPTY, StringUtils.EMPTY);
    			 base.deleteAllRecords();
    			 for (HashMap<String,String> row: values)
    			 {
    				 model.parse(row);
    				 base.saveRecord(model);
    			 }
    		  }
    		  catch(MFResponseException e)
    		  {
    			meta.setCode(Integer.parseInt(e.getCode()));
    			meta.setErrorMessage(e.getMessage());
    		  }
    	  }
    	  response.setData(isSuccesful?"Reference Files Succesfully Download":
    		  "There was a problem downloading reference files.");
    	  response.setMeta(meta);
    	  return Response.ok().entity(response).build();
  }
  
      @Override
      public Response referenceFilesDownloadAllGet(SecurityContext securityContext)
      throws NotFoundException {
    	  ArrayList<String> includedList = new ArrayList<String>(Arrays.asList(included));
    	  return referenceFilesDownloadGet(includedList,securityContext);
  }
  
      @Override
      public Response referenceFilesListGet(SecurityContext securityContext)
      throws NotFoundException {
    	  APIResponse response = new APIResponse();
    	  APIResponseMeta meta = new APIResponseMeta();
//    	  List<HashMap<String, String>> values;
//    	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	  
        	  for (String tranCode: included)
        	  {
        		  java.lang.reflect.Method m;
        		  BaseDAO base = null;
				try {
					m = DaoFactory.class.getMethod("get"+tranCode+"DAO", null);
	        		  base = (BaseDAO) m.invoke(null, null);

				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
					continue;
				}
//        		  TModelBase model = (TModelBase) base.getAllRecords().get(0);
//        		  String desc = base.getAllRecords().get(0)
//        				  Class.forName("ph.com.bpi.model.hibernate."+tranCode).getDeclaredField("")
//        				  map = (LinkedHashMap<String, TableFieldProperty>) AppTableProperties.class.getDeclaredField(tTranCode + "TFProperty")
//        					.get(AppTableProperties.class);
        		  
        	  }

      return Response.ok().entity(response).build();
  }
  
}
