package ph.com.bpi.api.impl;

import ph.com.bpi.api.*;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.T0010DAO;
import ph.com.bpi.dao.T0011DAO;
import ph.com.bpi.dao.T0102DAO;
import ph.com.bpi.dao.T0114DAO;
import ph.com.bpi.dao.T0115DAO;
import ph.com.bpi.dao.T0118DAO;
import ph.com.bpi.dao.T0120DAO;
import ph.com.bpi.dao.T0121DAO;
import ph.com.bpi.dao.T0130DAO;
import ph.com.bpi.dao.T0131DAO;
import ph.com.bpi.dao.T0133DAO;
import ph.com.bpi.dao.T0134DAO;
import ph.com.bpi.dao.T0138DAO;
import ph.com.bpi.dao.T0142DAO;
import ph.com.bpi.dao.T0146DAO;
import ph.com.bpi.dao.T0205DAO;
import ph.com.bpi.dao.T0235DAO;
import ph.com.bpi.dao.impl.T0118DAOImpl;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.*;
import ph.com.bpi.model.hibernate.T0010;
import ph.com.bpi.model.hibernate.T0011;
import ph.com.bpi.model.hibernate.T0102;
import ph.com.bpi.model.hibernate.T0114;
import ph.com.bpi.model.hibernate.T0115;
import ph.com.bpi.model.hibernate.T0118;
import ph.com.bpi.model.hibernate.T0120;
import ph.com.bpi.model.hibernate.T0121;
import ph.com.bpi.model.hibernate.T0130;
import ph.com.bpi.model.hibernate.T0131;
import ph.com.bpi.model.hibernate.T0133;
import ph.com.bpi.model.hibernate.T0134;
import ph.com.bpi.model.hibernate.T0138;
import ph.com.bpi.model.hibernate.T0142;
import ph.com.bpi.model.hibernate.T0146;
import ph.com.bpi.model.hibernate.T0205;
import ph.com.bpi.model.hibernate.T0208;
import ph.com.bpi.model.hibernate.T0211;
import ph.com.bpi.model.hibernate.T0214;
import ph.com.bpi.model.hibernate.T0227;
import ph.com.bpi.model.hibernate.T0235;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;
import ph.com.bpi.utilities.AppConstants;
import java.util.*;
import java.io.InputStream;
import java.math.BigDecimal;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class MaintenanceApiServiceImpl extends MaintenanceApiService {
  

    public  Response maintenanceAcceptanceSettlementEncodePut(AcceptanceSettlementBody acceptanceSettlementBody,SecurityContext securityContext)
    throws NotFoundException{
    	APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();
			
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		data.put(AppConstants.MODE_CODE,acceptanceSettlementBody.getModeCode());
		data.put(AppConstants.MODE_DESC,acceptanceSettlementBody.getModeDesc());
		data.put(AppConstants.MCRO_TAG,acceptanceSettlementBody.getMcroTag());
		data.put(AppConstants.ACTV_TAG,acceptanceSettlementBody.getActvTag().toString());
		data.put(AppConstants.PHP_TAG,acceptanceSettlementBody.getPhpTag().toString());

		try {
			meta.setCode(200);
			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.ACCEPTANCE_SETTLEMENT_ENCODE_TC,AppConstants.PROC_TAG_PUT, data);
		
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
    public Response maintenanceValidCurrenciesEncodePut(ValidCurrecyEncodeBody validCurrencyEncode,SecurityContext securityContext)
    throws NotFoundException {
    	APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();

		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		data.put(AppConstants.CURR_CODE,validCurrencyEncode.getCurrCode());
		data.put(AppConstants.CURR_BPI,validCurrencyEncode.getCurrBpi());
		data.put(AppConstants.CURR_CASA,validCurrencyEncode.getCurrCasa());
		data.put(AppConstants.CURR_DESC,validCurrencyEncode.getCurrDesc());
	

		try {
			meta.setCode(200);
			String mfResponse = MFSendDetailsUtil.sendDetails("0119",AppConstants.PROC_TAG_PUT, data);
		
			String message = ApplicationUtils.subString(mfResponse, 131, 19);
			meta.setErrorMessage(message);
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
    public Response maintenanceValidCurrenciesEncodeDelete(ValidCurrecyEncodeBody validCurrencyEncode,SecurityContext securityContext)
    throws NotFoundException {
    	APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();
			
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		data.put(AppConstants.CURR_CODE,validCurrencyEncode.getCurrCode());
		data.put(AppConstants.CURR_BPI,validCurrencyEncode.getCurrBpi());
		data.put(AppConstants.CURR_CASA,validCurrencyEncode.getCurrCasa());
		data.put(AppConstants.CURR_DESC,validCurrencyEncode.getCurrDesc());
	

		try {
			meta.setCode(200);
			String mfResponse = MFSendDetailsUtil.sendDetails("0119",AppConstants.PROC_TAG_DELETE, data);
		
			String message = ApplicationUtils.subString(mfResponse, 131, 19);
			meta.setErrorMessage(message);
			response.setData(message);
		} catch (MFResponseException e) {
			meta.setCode(Integer.parseInt(e.getCode()));
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		response.setMeta(meta);
		return Response.ok().entity(response).build();
}
    public  Response maintenanceAcceptanceSettlementEncodePost(AcceptanceSettlementBody acceptanceSettlementBody,SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();
			
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		data.put(AppConstants.MODE_CODE,acceptanceSettlementBody.getModeCode());
		data.put(AppConstants.MODE_DESC,acceptanceSettlementBody.getModeDesc());
		data.put(AppConstants.MCRO_TAG,acceptanceSettlementBody.getMcroTag());
		data.put(AppConstants.ACTV_TAG,acceptanceSettlementBody.getActvTag().toString());
		data.put(AppConstants.PHP_TAG,acceptanceSettlementBody.getPhpTag().toString());

		try {
			meta.setCode(200);
			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.ACCEPTANCE_SETTLEMENT_ENCODE_TC,AppConstants.PROC_TAG_POST, data);
		
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

    public  Response maintenanceAcceptanceSettlementListGet(SecurityContext securityContext)
    throws NotFoundException{ 
		APIResponse response = new APIResponse();
	  	APIResponseMeta meta = new APIResponseMeta();
	  	
	  	List<HashMap<String, String>> values;
	  	
	  	HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
	  	data.put(AppConstants.MODE_CODE, "0");
   	  	String mfResponse = StringUtils.EMPTY;
   	  
   	  	try{
   	  		meta.setCode(200);
			mfResponse = MFSendDetailsUtil.sendDetails( AppConstants.ACCEPTANCE_SETTLEMENT_LIST_TC,"3",data);
			values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.ACCEPTANCE_SETTLEMENT_LIST_TC,
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

    public  Response maintenanceApplicationCodeEncodePost(List<ApplicationCodeBody> applicationCodeBody,SecurityContext securityContext)
    throws NotFoundException{ 
  		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		List<HashMap<String, String>> dataList = new ArrayList <HashMap<String, String>> ();

		for (int i = 0; i < 5; i++) {
			HashMap<String, String> databit = ApplicationUtils.getHeaderDetails();
			String cod = StringUtils.EMPTY, des  = StringUtils.EMPTY;
			if (i < applicationCodeBody.size()) {
				cod = applicationCodeBody.get(i).getApplCod();
				des = applicationCodeBody.get(i).getApplDes();
			}
			databit.put(AppConstants.APPL_COD, cod);
			databit.put(AppConstants.APPL_DES, des);
			dataList.add(databit);
			//System.out.print(applicationCodeBody.get(i) + "DOOOOOOOOOO");
		}

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_APPL_ENCODE, data, dataList);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_APPL_ENCODE,
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

    public  Response maintenanceApplicationCodeListGet(SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
	  	APIResponseMeta meta = new APIResponseMeta();
	  	
	  	List<HashMap<String, String>> values;
	  	T0142DAO dao = DaoFactory.getT0142DAO();
	  	HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
   	  	String mfResponse = StringUtils.EMPTY;
   	  
 		List<HashMap<String, String>> dataList = new ArrayList <HashMap<String, String>> ();

		for (int i = 0; i < 5; i++) {
			HashMap<String, String> databit = ApplicationUtils.getHeaderDetails();
			databit.put(AppConstants.APPL_COD, StringUtils.EMPTY);
			databit.put(AppConstants.APPL_DES, StringUtils.EMPTY);
			dataList.add(databit);
		}
   	  	
   	  	try{
			mfResponse = MFSendDetailsUtil.sendDetails( AppConstants.APPLICATION_CODE_LIST_TC , data , dataList);
			values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.APPLICATION_CODE_LIST_TC,
   					 StringUtils.EMPTY, StringUtils.EMPTY);
			for (HashMap<String , String> item : values) {
 				 T0142 t0142 = new T0142();
 				t0142.parse(item);
 				dao.saveRecord(t0142);
 			}
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
    
    public Response maintenanceLOASignatoriesListGet(String trdrFi, SecurityContext securityContext)
    		  throws NotFoundException{ 
    	APIResponse response = new APIResponse();
     	  APIResponseMeta meta = new APIResponseMeta();
     	  List<HashMap<String, String>> values;
     	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    
     	  String mfResponse = StringUtils.EMPTY;
     	  data.put(AppConstants.TRDR_FI, trdrFi);
     	  try{
  			  mfResponse = MFSendDetailsUtil.sendDetails( AppConstants.MAINTENANCE_LOA_LIST, data);
  			 values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.MAINTENANCE_LOA_LIST, 
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
    	      
    public Response maintenanceLOASignatoriesEncodePost(String trdrFi, List<LoaSignatoriesBody> loaSignatoriesBody, SecurityContext securityContext)
    	 throws NotFoundException{ 
  		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
   	  data.put(AppConstants.TRDR_FI, trdrFi);

  		List<HashMap<String, String>> dataList = new ArrayList <HashMap<String, String>> ();

		for (int i = 0; i < loaSignatoriesBody.size(); i++) {
		   	  
			HashMap<String, String> databit = ApplicationUtils.getHeaderDetails();
			databit.put(AppConstants.LNAME, loaSignatoriesBody.get(i).getLastName());
			databit.put(AppConstants.MNAME, loaSignatoriesBody.get(i).getMiddleName());
			databit.put(AppConstants.FNAME, loaSignatoriesBody.get(i).getfirstName());
			
			dataList.add(databit);
		}

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.MAINTENANCE_LOA_ENCODE, data, dataList);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.MAINTENANCE_LOA_ENCODE,
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
    
    public  Response maintenanceApprovingAuthorityLimitListGet(SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
     	  APIResponseMeta meta = new APIResponseMeta();
     	  List<HashMap<String, String>> values;
     	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    
     	  String mfResponse = StringUtils.EMPTY;
     	  
     	  try{
  			  mfResponse = MFSendDetailsUtil.sendDetails( AppConstants.APPROVING_AUTHORITY_LIMIT_LIST_TC,"3",data);
  			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.APPROVING_AUTHORITY_LIMIT_LIST_TC,
     					 StringUtils.EMPTY, StringUtils.EMPTY);
  			 
  			  T0146DAO dao = DaoFactory.getT0146DAO();
  			for (HashMap<String , String> item : values) {
  				 T0146 t0146 = new T0146();
  				t0146.parse(item);
  				dao.saveRecord(t0146);
  			}
  			 
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

    public  Response maintenanceBestBuySellGet(String trdrFi,String currCode,SecurityContext securityContext)
    throws NotFoundException{ 
  		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, trdrFi);
  		data.put(AppConstants.CURR_CODE, currCode);

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_BBS_GET, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_BBS_GET,
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

    public  Response maintenanceBestBuySellProcessPost(BuyAndSellBody buyAndSellBody,SecurityContext securityContext)
    throws NotFoundException{ 
  		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, buyAndSellBody.getTrdrFi());
  		data.put(AppConstants.CURR_CODE, buyAndSellBody.getCurrCode());
  		data.put(AppConstants.PHP_BID, buyAndSellBody.getPhpBid());
  		data.put(AppConstants.PHP_OFFR, buyAndSellBody.getPhpOffr());
  		data.put(AppConstants.NEW_BID, buyAndSellBody.getNewBid());
  		data.put(AppConstants.NEW_OFFR, buyAndSellBody.getNewOffr());

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_BBS_PROCESS, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_BBS_PROCESS,
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
    public  Response maintenanceTieredRateSprdProcessPost(TieredRateSprdBody tieredRateSprdBody,SecurityContext securityContext)
    throws NotFoundException{ 
  		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, tieredRateSprdBody.getTrdrFi());
  		data.put(AppConstants.CURR_CODE, tieredRateSprdBody.getCurrCode());

  		List<T0227> T0227s = tieredRateSprdBody.getT0227s();
  		List<HashMap<String, String>> dataList = new ArrayList <HashMap<String, String>> ();

		for (int i = 0; i < T0227s.size(); i++) {
			HashMap<String, String> databit = ApplicationUtils.getHeaderDetails();
			databit.put(AppConstants.TRDR_FI, T0227s.get(i).getTrdrFi());
			databit.put(AppConstants.TRAN_FI, T0227s.get(i).getTranFi());
			databit.put(AppConstants.CURR_CODE, T0227s.get(i).getCurrCode());
			databit.put(AppConstants.TIER_NMBR, T0227s.get(i).getTierNmbr().toString());
			databit.put(AppConstants.AMNT_FROM, T0227s.get(i).getAmntFrom().toString());
			databit.put(AppConstants.AMNT_TO, T0227s.get(i).getAmntTo().toString());
			databit.put(AppConstants.PRCH_SPRD, T0227s.get(i).getPrchSprd().toString());
			databit.put(AppConstants.SALE_SPRD, T0227s.get(i).getSaleSprd().toString());
			
			dataList.add(databit);
		}

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_TIERED_SPREAD_PROCESS, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_TIERED_SPREAD_PROCESS,
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
    
    public  Response maintenanceBoardRateGet(String trdrFi,String tranId,String currCode,SecurityContext securityContext)
    throws NotFoundException{ 
  		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, trdrFi);
  		data.put(AppConstants.TRAN_ID, tranId);
  		data.put(AppConstants.CURR_CODE, currCode);

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_BR_GET, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_BR_GET,
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

    public  Response maintenanceBoardRateProcessPost(BoardRateProcess boardRateProcess,SecurityContext securityContext)
    throws NotFoundException{
  		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, boardRateProcess.getTrdrFi());
  		data.put(AppConstants.CURR_CODE, boardRateProcess.getCurrCode());
  		data.put(AppConstants.PRCH_RATE, boardRateProcess.getPrchRate());
  		data.put(AppConstants.SALE_RATE, boardRateProcess.getSaleRate());
  		data.put(AppConstants.NPRCH_RATE, boardRateProcess.getNprchRate());
  		data.put(AppConstants.NSALE_RATE, boardRateProcess.getNsaleRate());

  		System.out.println(boardRateProcess.toString());
  		
  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_BR_PROCESS, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_BR_PROCESS,
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

    public  Response maintenanceBtsuAcceptPost(BtsuAcceptBody btsuAcceptBody,SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, btsuAcceptBody.getTrdrFi());
  		data.put(AppConstants.CURR_CODE, btsuAcceptBody.getCurrCode());
  		

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.MAINTENANCE_BTSU_ACCEPT_TC, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.MAINTENANCE_BTSU_ACCEPT_TC,
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

    public  Response maintenanceBtsuListGet(String trdrFi,String currCode,SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
     	  APIResponseMeta meta = new APIResponseMeta();
     	  List<HashMap<String, String>> values;
     	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
     	 data.put(AppConstants.TRDR_FI, trdrFi);
   		data.put(AppConstants.CURR_CODE, currCode);
     	  String mfResponse = StringUtils.EMPTY;
     	  
     	  try{
  			  mfResponse = MFSendDetailsUtil.sendDetails( AppConstants.MAINTENANCE_BTSU_LIST_TC,data);
  			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.MAINTENANCE_BTSU_LIST_TC,
     					 StringUtils.EMPTY, StringUtils.EMPTY);
  			 
  			  T0205DAO dao = DaoFactory.getT0205DAO();
  			for (HashMap<String , String> item : values) {
  				 T0205 t0205 = new T0205();
  				t0205.parse(item);
  				dao.saveRecord(t0205);
  			}
  			 
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

    public  Response maintenanceBtsuProcessPost(BtsuProcessBody btsuProcessBody,SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, btsuProcessBody.getCurrCode());
  		data.put("USD_BID", btsuProcessBody.getUsdBid());
  		data.put("USD_OFFR", btsuProcessBody.getUsdOffr());
  		//data.put(AppConstants.TRDR_FI, btsuProcessBody.getT0205s());
  		List<T0205> list = btsuProcessBody.getT0205s();
  		List<HashMap<String,String>> dataList = new ArrayList<HashMap<String,String>>();
		
		for (T0205 item : list){
			HashMap<String,String> temp =  new  HashMap<String,String>();
			temp.put(AppConstants.CURR_CODE,item.getCurrCode());
			temp.put(AppConstants.TRDR_FI,item.getTrdrFi());
			temp.put(AppConstants.USD_BID,item.getUsdBId().toString());
			temp.put(AppConstants.USD_OFFER,item.getUsdOffr().toString());
			dataList.add(temp);
		}

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.MAINTENANCE_BTSU_PROCESS_TC, data,dataList);
  			
		
			response.setData(mfResponse.substring(0, 70));
  		} catch (MFResponseException e) {
  			meta.setCode(Integer.parseInt(e.getCode()));
  			meta.setErrorMessage(e.getMessage());
  			e.printStackTrace();
  		}
  		response.setMeta(meta);
  		return Response.ok().entity(response).build();
    }

    public  Response maintenanceBulletinBoardGet(String trdrFi, SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
   	  APIResponseMeta meta = new APIResponseMeta();
   	  List<HashMap<String, String>> values;
   	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  
   	  String mfResponse = StringUtils.EMPTY;
   	  data.put(AppConstants.TRDR_FI, trdrFi);
   	  
   	  try{
			  mfResponse = MFSendDetailsUtil.sendDetails( AppConstants.BULLETIN_BOARD_TC_GET,data);
			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.BULLETIN_BOARD_TC_GET,
   					 StringUtils.EMPTY, StringUtils.EMPTY);
			 
			  T0102DAO dao = DaoFactory.getT0102DAO();
			for (HashMap<String , String> item : values) {
				 T0102 t0102 = new T0102();
				t0102.parse(item);
				dao.saveRecord(t0102);
			}
			 
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

    public  Response maintenanceBulletinBoardPost(String trdrFi, String spclMsg,SecurityContext securityContext)
    throws NotFoundException{ 
    	System.out.println("SPAPSPA " + spclMsg);
    	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
     	data.put(AppConstants.TRDR_FI, trdrFi);
  		data.put(AppConstants.SPCL_MSG1, StringUtils.substring(spclMsg, 0, 60));
  		data.put(AppConstants.SPCL_MSG2, StringUtils.substring(spclMsg, 60, 120));
  		data.put(AppConstants.SPCL_MSG3, StringUtils.substring(spclMsg, 120, 180));
  		data.put(AppConstants.SPCL_MSG4, StringUtils.substring(spclMsg, 180, 240));
  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.BULLETIN_BOARD_TC_POST, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.BULLETIN_BOARD_TC_POST,
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

    public  Response maintenanceBuySellStListGet(String trdrFi,String currCode,SecurityContext securityContext)
    throws NotFoundException{ 
    	
    	APIResponse response = new APIResponse();
   	  APIResponseMeta meta = new APIResponseMeta();
   	  List<HashMap<String, String>> values;
   	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
   	 data.put(AppConstants.TRDR_FI, trdrFi);
 		data.put(AppConstants.CURR_CODE, currCode);
   	  String mfResponse = StringUtils.EMPTY;
   	  
   	  try{
			  mfResponse = MFSendDetailsUtil.sendDetails( AppConstants.BUY_SELL_ST_LIST_TC,data);
			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.BUY_SELL_ST_LIST_TC,
   					 StringUtils.EMPTY, StringUtils.EMPTY);
			 
			  T0235DAO dao = DaoFactory.getT0235DAO();
			for (HashMap<String , String> item : values) {
				 T0235 t0235 = new T0235();
				t0235.parse(item);
				dao.saveRecord(t0235);
			}
			 
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

    public  Response maintenanceBuySellStUpdatePost(List<T0208> buysellBody,SecurityContext securityContext)
    throws NotFoundException{
    	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  	
  		List<HashMap<String,String>> dataList = new ArrayList<HashMap<String,String>>();
		
		for (T0208 item : buysellBody){
			HashMap<String,String> temp =  new  HashMap<String,String>();
			temp.put(AppConstants.CURR_CODE,item.getCurrCode());
			temp.put(AppConstants.TRDR_FI,item.getTrdrFi());
			temp.put("DREC_TAG",item.getDrecTag());
			temp.put("FCDU_PRCH",item.getFcduPrch().toString());
			temp.put("FCDU_SALE",item.getFcduSale().toString());
			temp.put("NOTE_PTCH",item.getNotePtch().toString());
			dataList.add(temp);
		}
  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.BUY_SELL_ST_UPDATE_TC, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.BUY_SELL_ST_UPDATE_TC,
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

    public  Response maintenanceOtcRateRateGet(String trdrFi,String tranId,String currCode,SecurityContext securityContext)
    throws NotFoundException{ 
  		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, trdrFi);
  		data.put(AppConstants.TRAN_ID, tranId);
  		data.put(AppConstants.CURR_CODE, currCode);

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_OTC_RATE_GET, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_OTC_RATE_GET,
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

    public  Response maintenanceOtcRateRateProcessPost(OtcRateBody otcRateBody,SecurityContext securityContext)
    throws NotFoundException{ 
  		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, otcRateBody.getTrdrFi());
  		data.put(AppConstants.CURR_CODE, otcRateBody.getCurrCode());
  		data.put(AppConstants.PRCH_RATE, otcRateBody.getPrchRate());
  		data.put(AppConstants.SALE_RATE, otcRateBody.getSaleRate());
  		data.put(AppConstants.NPRCH_RATE, otcRateBody.getNprchRate());
  		data.put(AppConstants.NSALE_RATE, otcRateBody.getNsaleRate());

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_OTC_RATE_PROCESS, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_OTC_RATE_PROCESS,
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

    public  Response maintenanceOtcRateSpreadGet(String trdrFi,String tranId,String currCode,SecurityContext securityContext)
    throws NotFoundException{ 
		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, trdrFi);
  		data.put(AppConstants.TRAN_ID, tranId);
  		data.put(AppConstants.CURR_CODE, currCode);

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_OTC_SPREAD_GET, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_OTC_SPREAD_GET,
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

    public  Response maintenanceOtcRateSpreadProcessPost(OtcRateSpreadBody otcRateSpreadBody,SecurityContext securityContext)
    throws NotFoundException{
    	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		System.out.println (otcRateSpreadBody.toString());
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, otcRateSpreadBody.getTrdrFi());
  		data.put(AppConstants.TRAN_FI, otcRateSpreadBody.getTranFi());
  		data.put(AppConstants.CURR_CODE, otcRateSpreadBody.getCurrCode());
  		data.put(AppConstants.PRCH_SPRD, otcRateSpreadBody.getPrchSprd());
  		data.put(AppConstants.SALE_SPRD, otcRateSpreadBody.getSaleSprd());
  		data.put(AppConstants.NPRCH_SPRD, otcRateSpreadBody.getNprchSprd());
  		data.put(AppConstants.NSALE_SPRD, otcRateSpreadBody.getNsaleSprd());

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_OTC_SPREAD_PROCESS, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_OTC_SPREAD_PROCESS,
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

    public  Response maintenancePreferredClientRateGet(String trdrFi,String currCode,SecurityContext securityContext)
    throws NotFoundException{ 
		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, trdrFi);
  		data.put(AppConstants.CURR_CODE, currCode);

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_PC_RATE_GET, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_PC_RATE_GET,
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

    public  Response maintenanceRefRateGet(String trdrFi,String currCode,SecurityContext securityContext)
    throws NotFoundException{ 
		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, trdrFi);
  		data.put(AppConstants.CURR_CODE, currCode);

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_RR_GET, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_RR_GET,
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

    public  Response maintenanceRefRatePhpListGet(String trdrFi,String currCode,SecurityContext securityContext)
    throws NotFoundException{ 
		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, trdrFi);
  		data.put(AppConstants.CURR_CODE, currCode);

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_RR_PHP_LIST, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_RR_PHP_LIST,
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

    public  Response maintenanceRefRateUsdListGet(String trdrFi,String currCode,SecurityContext securityContext)
    throws NotFoundException{ 
		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, trdrFi);
  		data.put(AppConstants.CURR_CODE, currCode);

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_RR_USD_LIST, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_RR_USD_LIST,
					 StringUtils.EMPTY, StringUtils.EMPTY);
 		
 			response.setData(message);
 			meta.setCode(200);
  		} catch (MFResponseException e) {
  			meta.setCode(Integer.parseInt(e.getCode()));
  			meta.setErrorMessage(e.getMessage());
  			e.printStackTrace();
  		}
  		response.setMeta(meta);
  		return Response.ok().entity(response).build();
    }

    public  Response maintenanceRefRateProcessPost(RefRateProcessBody refRateProcessBody,SecurityContext securityContext)
    throws NotFoundException{ 

  		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, refRateProcessBody.getTrdrFi());
  		data.put(AppConstants.CURR_CODE, refRateProcessBody.getCurrCode());
  		data.put(AppConstants.RFR_RATE, refRateProcessBody.getRefrRate());
  		data.put(AppConstants.NRFR_RATE, refRateProcessBody.getNefrRate());
  		
  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_RR_PROCESS, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_RR_PROCESS,
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

    public  Response maintenanceSpreadGet(String trdrFi,String spreads,SecurityContext securityContext)
    throws NotFoundException{ 
		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, trdrFi);
  		data.put(AppConstants.SPREADS, spreads);

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_SPREAD_GET, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_SPREAD_GET,
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

    public  Response maintenanceSpreadProcessPost(List<SpreadProcessBody> spreadProcessBody,SecurityContext securityContext)
    throws NotFoundException{ 

  		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		List<HashMap<String, String>> dataList = new ArrayList <HashMap<String, String>> ();

		for (int i = 0; i < spreadProcessBody.size(); i++) {
			HashMap<String, String> databit = ApplicationUtils.getHeaderDetails();
			databit.put(AppConstants.SEQN_NO, spreadProcessBody.get(i).getSeqnNo());
			databit.put(AppConstants.SPREADS, spreadProcessBody.get(i).getSpreads());
			
			dataList.add(databit);
		}

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_SPREAD_PROCESS, data, dataList);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_SPREAD_PROCESS,
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

    public  Response maintenanceTieredRateRateGet(String trdrFi,String tranId,String currCode,String tierNmbr,SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI,  trdrFi);
  		data.put(AppConstants.TRAN_ID,tranId);
  		data.put(AppConstants.CURR_CODE, currCode);
  		data.put(AppConstants.TIER_NMBR, tierNmbr);

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_TIERED_RATE_GET, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_TIERED_RATE_GET,
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

    public  Response maintenanceTieredRateSprdGet(String trdrFi,String tranId,String currCode,String tierNmbr,SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI,  trdrFi);
  		data.put(AppConstants.TRAN_ID,tranId);
  		data.put(AppConstants.CURR_CODE, currCode);
  		data.put(AppConstants.TIER_NMBR, tierNmbr);

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_TIERED_SPREAD_GET, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_TIERED_SPREAD_GET,
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

    public  Response maintenanceTradingUnitGet(String trdrFi,SecurityContext securityContext)
    throws NotFoundException{ 
    	//System.out.print(trdrFi+ " DITOOOOOOOOOOOO");
    	APIResponse response = new APIResponse();
   	  APIResponseMeta meta = new APIResponseMeta();
   	  List<HashMap<String, String>> values;
   	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
   	  data.put(AppConstants.TRDR_FI, trdrFi);
  
   	  String mfResponse = StringUtils.EMPTY;
   	  
   	  try{	
   		  meta.setCode(200);
   		  mfResponse = MFSendDetailsUtil.sendDetails( AppConstants.MAINTENANCE_TRADING_UNIT_TC,data);
   		  values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.MAINTENANCE_TRADING_UNIT_TC,
   					 StringUtils.EMPTY, StringUtils.EMPTY);
			 
			  T0130DAO dao = DaoFactory.getT0130DAO();
			for (HashMap<String , String> item : values) {
				 T0130 t0130 = new T0130();
				t0130.parse(item);
				dao.saveRecord(t0130);
			}
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

    public  Response maintenanceTradingUnitEncodePut(TradingUnitEncode tradingUnitBody,SecurityContext securityContext)
    throws NotFoundException{
    	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI,tradingUnitBody.getTrdrFi());
  		data.put(AppConstants.TRDR_DESC,tradingUnitBody.getTrdrDesc());
  		data.put(AppConstants.TRDR_PCC,tradingUnitBody.getTrdrPcc().toString());
  		data.put(AppConstants.FORC_UNLD,tradingUnitBody.getForcUnld());
  		data.put(AppConstants.TRAN_FI,tradingUnitBody.getTranFi());
  		

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TRADING_UNIT_ENCODE, AppConstants.PROC_TAG_PUT, data);
  		
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

    public  Response maintenanceTradingUnitEncodePost(TradingUnitEncode tradingUnitBody,SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI,tradingUnitBody.getTrdrFi());
  		data.put(AppConstants.TRDR_DESC,tradingUnitBody.getTrdrDesc());
  		data.put(AppConstants.TRDR_PCC,tradingUnitBody.getTrdrPcc().toString());
  		data.put(AppConstants.FORC_UNLD,tradingUnitBody.getForcUnld());
  		data.put(AppConstants.TRAN_FI,tradingUnitBody.getTranFi());
  		

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TRADING_UNIT_ENCODE, AppConstants.PROC_TAG_POST,  data);
  		
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

    public  Response maintenanceTradingUnitEncodeDelete(TradingUnitEncode tradingUnitBody,SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI,tradingUnitBody.getTrdrFi());
  		data.put(AppConstants.TRDR_DESC,tradingUnitBody.getTrdrDesc());
  		data.put(AppConstants.TRDR_PCC,tradingUnitBody.getTrdrPcc().toString());
  		data.put(AppConstants.FORC_UNLD,tradingUnitBody.getForcUnld());
  		data.put(AppConstants.TRAN_FI,tradingUnitBody.getTranFi());
  		

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TRADING_UNIT_ENCODE, AppConstants.PROC_TAG_DELETE, data);
  		
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

    public  Response maintenanceTradingUnitListGet(SecurityContext securityContext)
    throws NotFoundException{ 
    	
     	
    	APIResponse response = new APIResponse();
   	  APIResponseMeta meta = new APIResponseMeta();
   	  List<HashMap<String, String>> values;
   	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  
   	  String mfResponse = StringUtils.EMPTY;
   	  
   	  try{
   		  meta.setCode(200);
			  mfResponse = MFSendDetailsUtil.sendDetails( AppConstants.MAINTENANCE_TRADING_UNIT_LIST_TC,"3",data);
			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.MAINTENANCE_TRADING_UNIT_LIST_TC,
   					 StringUtils.EMPTY, StringUtils.EMPTY);
			 
			  T0131DAO dao = DaoFactory.getT0131DAO();
			for (HashMap<String , String> item : values) {
				 T0131 t0131 = new T0131();
				t0131.parse(item);
				dao.saveRecord(t0131);
			}
			 
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

    public  Response maintenanceTransactingUnitGet(String tranFi,SecurityContext securityContext)
    throws NotFoundException{
    		APIResponse response = new APIResponse();
     	  APIResponseMeta meta = new APIResponseMeta();
     	  List<HashMap<String, String>> values;
     	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
     	  System.out.println("TRAN_FI: "+tranFi);
     	  data.put(AppConstants.TRAN_FI, tranFi);
     	  T0133DAO dao = DaoFactory.getT0133DAO();
     
     	 
     	 
     	  String mfResponse = StringUtils.EMPTY;
     	  
     	  try{
     		  meta.setCode(200);
  			  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TRANSACTING_UNIT_TC,"3",data);
  			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TRANSACTING_UNIT_TC,
     					 StringUtils.EMPTY, StringUtils.EMPTY);
  			  for (HashMap<String,String> items:values){
  				  T0133 t0133 = new T0133();
  				  t0133.parse(items);
  				  dao.saveRecord(t0133);
  			  }
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

    public  Response maintenanceTransactingUnitEncodePost(TransactingUnitEncode transactingUnitBody,SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();
			
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		data.put(AppConstants.TRAN_FI,transactingUnitBody.getTranFi());
		data.put(AppConstants.TRAN_DESC,transactingUnitBody.getTranDesc());
	

		try {
			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TRANSACTING_UNIT_ENCODE_TC, AppConstants.PROC_TAG_POST,  data);
			
		
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

    public  Response maintenanceTransactingUnitEncodeDelete(TransactingUnitEncode transactingUnitBody,SecurityContext securityContext)
    throws NotFoundException{ APIResponse response = new APIResponse();
	APIResponseMeta meta = new APIResponseMeta();
	
	HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
	data.put(AppConstants.TRAN_FI,transactingUnitBody.getTranFi());
	data.put(AppConstants.TRAN_DESC,transactingUnitBody.getTranDesc());


	try {
		String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TRANSACTING_UNIT_ENCODE_TC, AppConstants.PROC_TAG_PUT,  data);
		
	
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

    public  Response maintenanceTransactingUnitListGet(SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
   	  APIResponseMeta meta = new APIResponseMeta();
   	  List<HashMap<String, String>> values;
   	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
   	 T0134DAO dao = DaoFactory.getT0134DAO();
   
   	 
   	 
   	  String mfResponse = StringUtils.EMPTY;
   	  
   	  try{
   		  meta.setCode(200);
			  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TRANSACTING_UNIT_LIST_TC,"3",data);
			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TRANSACTING_UNIT_LIST_TC,
   					 StringUtils.EMPTY, StringUtils.EMPTY);
			  for (HashMap<String,String> items:values){
				  T0134 t0134 = new T0134();
				  t0134.parse(items);
				  dao.saveRecord(t0134);
			  }
			  response.setData(values);
	      }
	 	  catch(MFResponseException e)
	 	  {
	 		  System.out.print(e);
	 		meta.setCode(Integer.valueOf(e.getCode()));
				meta.setErrorMessage(e.getMessage());
				e.printStackTrace();  
	 	  }
		  response.setMeta(meta);
   	  return Response.ok().entity(response).build();
    }

    public  Response maintenanceTransactionMonitoringGet(SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
   	  APIResponseMeta meta = new APIResponseMeta();
   	  List<HashMap<String, String>> values;
   	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
   	 T0114DAO dao = DaoFactory.getT0114DAO();
   
   	 
   	 
   	  String mfResponse = StringUtils.EMPTY;
   	  
   	  try{
   		  	  meta.setCode(200);
			  mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.MAINTENANCE_TRANSACTION_MONITORING,data);
			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.MAINTENANCE_TRANSACTION_MONITORING,
   					 StringUtils.EMPTY, StringUtils.EMPTY);
			  for (HashMap<String,String> items:values){
				  T0114 t0114 = new T0114();
				  t0114.parse(items);
				  dao.saveRecord(t0114);
			  }
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

    public  Response maintenanceTransactionMonitoringProcessPost(TransactionMonitoringBody transactionBody,SecurityContext securityContext)
    throws NotFoundException{
    	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		System.out.print(transactionBody);
  		data.put(AppConstants.ptrck_amnt,transactionBody.getPtrckAmnt());
  		data.put(AppConstants.ptrck_days,transactionBody.getPtrckDays());
  		data.put(AppConstants.ptrck_indc,transactionBody.getPtrckIndc().toString());
  		data.put(AppConstants.strck_amnt,transactionBody.getStrckAmnt());
  		data.put(AppConstants.strck_days,transactionBody.getStrckDays());
  		data.put(AppConstants.strck_indc,transactionBody.getStrckIndc().toString());

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.MAINTENANCE_TRANSACTION_MONITORING_POST, AppConstants.PROC_TAG_TC_UPDATE,  data);
  		
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

    public  Response maintenanceUsVisaFeeGet(String trdrFi,String currCode,SecurityContext securityContext)
    throws NotFoundException{ 
     	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI,  trdrFi);
  		data.put(AppConstants.CURR_CODE, currCode);

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_USA_VISA_GET, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse.substring(70), AppConstants.TC_USA_VISA_GET,
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

    public  Response maintenanceUsVisaFeeProcessPost(UsVisaFeeProcessBody usVisaFeeProcessBody,SecurityContext securityContext)
    throws NotFoundException{ 
  		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  		
  		System.out.println(usVisaFeeProcessBody.toString());
  		
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRDR_FI, usVisaFeeProcessBody.getTrdrFi());
  		data.put(AppConstants.CURR_CODE, usVisaFeeProcessBody.getCurrCode());
  		data.put(AppConstants.EXCH_RATE, usVisaFeeProcessBody.getExchRate());
  		data.put(AppConstants.USD_AMNT, usVisaFeeProcessBody.getUsdAmnt());
  		data.put(AppConstants.PHP_EQUIV, usVisaFeeProcessBody.getPhpEquiv());
  		data.put(AppConstants.NEXCH_RATE, usVisaFeeProcessBody.getNexchRate());
  		data.put(AppConstants.NUSD_AMNT, usVisaFeeProcessBody.getNusdAmnt());

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_USA_VISA_PROCESS, data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_USA_VISA_PROCESS,
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

    public  Response maintenanceUserAccessEncodePut(UserAccessBody userAccessBody,SecurityContext securityContext)
    throws NotFoundException{ APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();
			
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		data.put(AppConstants.TRAN_FI,userAccessBody.getTranFi() );
		data.put(AppConstants.USER_ACCS,userAccessBody.getUserAccs() );
		data.put(AppConstants.USER_TYPE,userAccessBody.getUserType() );

		
		try {
			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.MAINTENANCE_USER_ACCESS_ENCODE_TC,"2", data);
			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.MAINTENANCE_USER_ACCESS_ENCODE_TC,
				 StringUtils.EMPTY, StringUtils.EMPTY);
	
		response.setData(message);
		} catch (MFResponseException e) {
			meta.setCode(Integer.parseInt(e.getCode()));
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		response.setMeta(meta);
		return Response.ok().entity(response).build();}

    public  Response maintenanceUserAccessEncodePost(UserAccessBody userAccessBody,SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRAN_FI,userAccessBody.getTranFi() );
  		data.put(AppConstants.USER_ACCS,userAccessBody.getUserAccs() );
  		data.put(AppConstants.USER_TYPE,userAccessBody.getUserType() );
 
  		
  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.MAINTENANCE_USER_ACCESS_ENCODE_TC,"1", data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.MAINTENANCE_USER_ACCESS_ENCODE_TC,
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

    public  Response maintenanceUserAccessEncodeDelete(UserAccessBody userAccessBody,SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRAN_FI,userAccessBody.getTranFi() );
  		data.put(AppConstants.USER_ACCS,userAccessBody.getUserAccs() );
  		data.put(AppConstants.USER_TYPE,userAccessBody.getUserType() );
 
  		
  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.MAINTENANCE_USER_ACCESS_ENCODE_TC,"3", data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.MAINTENANCE_USER_ACCESS_ENCODE_TC,
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

    public  Response maintenanceUserAccessLoadGet(String tranFi,String brchCode,SecurityContext securityContext)
    throws NotFoundException{     	APIResponse response = new APIResponse();
 	  APIResponseMeta meta = new APIResponseMeta();
 	  List<HashMap<String, String>> values;
 	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();

 	  String mfResponse = StringUtils.EMPTY;
 	  
 	  try{
			  mfResponse = MFSendDetailsUtil.sendDetails( AppConstants.MAINTENANCE_USER_ACCESS_LOAD_TC,data);
			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.MAINTENANCE_USER_ACCESS_LOAD_TC,
 					 StringUtils.EMPTY, StringUtils.EMPTY);
			  
			  T0138DAO dao = DaoFactory.getT0138DAO();
			for (HashMap<String , String> item : values) {
				T0138 t0138 = new T0138();
				t0138.parse(item);
				dao.saveRecord(t0138);
			}
			 
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

    public  Response maintenanceUserFileGet(String userId,SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
   	  APIResponseMeta meta = new APIResponseMeta();
   	  List<HashMap<String, String>> values;
   	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
   	  data.put(AppConstants.USER_ID, userId);
   	  
   	  String mfResponse = StringUtils.EMPTY;
   	  
   	  try{
			  mfResponse = MFSendDetailsUtil.sendDetails( AppConstants.MAINTENANCE_USER_FILE_TC,data);
			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.MAINTENANCE_USER_FILE_TC,
   					 StringUtils.EMPTY, StringUtils.EMPTY);
			  
			  T0010DAO dao = DaoFactory.getT0010DAO();
			for (HashMap<String , String> item : values) {
				T0010 t0010 = new T0010();
				t0010.parse(item);
				dao.saveRecord(t0010);
			}
			 
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

    public  Response maintenanceUserFileEncodePut(UserFileEncode approvingAuthorityBody,SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRAN_FI,approvingAuthorityBody.getTranFi() );
  		data.put(AppConstants.FIRST_NAME,approvingAuthorityBody.getFname() );
  		data.put(AppConstants.BRANCH_CODE,approvingAuthorityBody.getBrchCode() );
  		data.put(AppConstants.MIDDLE_NAME,approvingAuthorityBody.getMname() );
  		data.put(AppConstants.N_BRANCH_CODE,approvingAuthorityBody.getNbrchCode() );
  		data.put(AppConstants.USER_ID,approvingAuthorityBody.getUserId() );
  		data.put(AppConstants.USER_TYPE,approvingAuthorityBody.getUserType() );
  		data.put(AppConstants.LAST_NAME,approvingAuthorityBody.getLname() );
  		
  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.MAINTENANCE_USER_FILE_ENCODE_TC,"3", data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.MAINTENANCE_USER_FILE_ENCODE_TC,
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

    public  Response maintenanceUserFileEncodePost(UserFileEncode approvingAuthorityBody,SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRAN_FI,approvingAuthorityBody.getTranFi() );
  		data.put(AppConstants.FIRST_NAME,approvingAuthorityBody.getFname() );
  		data.put(AppConstants.BRANCH_CODE,approvingAuthorityBody.getBrchCode() );
  		data.put(AppConstants.MIDDLE_NAME,approvingAuthorityBody.getMname() );
  		data.put(AppConstants.N_BRANCH_CODE,approvingAuthorityBody.getNbrchCode() );
  		data.put(AppConstants.USER_ID,approvingAuthorityBody.getUserId() );
  		data.put(AppConstants.USER_TYPE,approvingAuthorityBody.getUserType() );
  		data.put(AppConstants.LAST_NAME,approvingAuthorityBody.getLname() );
  		
  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.MAINTENANCE_USER_FILE_ENCODE_TC,"1", data);
  			
		
			response.setData(mfResponse.substring(0,70));
  		} catch (MFResponseException e) {
  			meta.setCode(Integer.parseInt(e.getCode()));
  			meta.setErrorMessage(e.getMessage());
  			e.printStackTrace();
  		}
  		response.setMeta(meta);
  		return Response.ok().entity(response).build();
    }

    public  Response maintenanceUserFileEncodeDelete(UserFileEncode approvingAuthorityBody,SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		data.put(AppConstants.TRAN_FI,approvingAuthorityBody.getTranFi() );
  		data.put(AppConstants.FIRST_NAME,approvingAuthorityBody.getFname() );
  		data.put(AppConstants.BRANCH_CODE,approvingAuthorityBody.getBrchCode() );
  		data.put(AppConstants.MIDDLE_NAME,approvingAuthorityBody.getMname() );
  		data.put(AppConstants.N_BRANCH_CODE,approvingAuthorityBody.getNbrchCode() );
  		data.put(AppConstants.USER_ID,approvingAuthorityBody.getUserId() );
  		data.put(AppConstants.USER_TYPE,approvingAuthorityBody.getUserType() );
  		data.put(AppConstants.LAST_NAME,approvingAuthorityBody.getLname() );
  		
  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.MAINTENANCE_USER_FILE_ENCODE_TC,"2", data);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.MAINTENANCE_USER_FILE_ENCODE_TC,
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

    public  Response maintenanceUserFileListGet(String tranFi,String brchCode,String userId,SecurityContext securityContext)
    throws NotFoundException{
    	System.out.println("tranFi +" + tranFi);
    	System.out.println("brchCode" + brchCode);
    	System.out.println("userId +" + userId);
      	APIResponse response = new APIResponse();
     	  APIResponseMeta meta = new APIResponseMeta();
     	  List<HashMap<String, String>> values;
     	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
     	  data.put(AppConstants.TRAN_FI, tranFi);
     	 data.put(AppConstants.USER_ID, userId);
     	 data.put(AppConstants.BRANCH_CODE, brchCode);
     	  String mfResponse = StringUtils.EMPTY;
     	  
     	  try{
  			  mfResponse = MFSendDetailsUtil.sendDetails( AppConstants.MAINTENANCE_USER_FILE_LIST_TC,data);
  			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.MAINTENANCE_USER_FILE_LIST_TC,
     					 StringUtils.EMPTY, StringUtils.EMPTY);
  			  
  			  T0011DAO dao = DaoFactory.getT0011DAO();
  			for (HashMap<String , String> item : values) {
  				T0011 t0011 = new T0011();
  				t0011.parse(item);
  				dao.saveRecord(t0011);
  			}
  			 
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

    public  Response maintenanceUserListPrintGet(SecurityContext securityContext)
    throws NotFoundException{ 
     	return null;
    }

    public  Response maintenanceValidCurrenciesEncodePost(ValidCurrecyEncodeBody validCurrencyEncode,SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();
		System.out.print(validCurrencyEncode);	
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		data.put(AppConstants.CURR_CODE,validCurrencyEncode.getCurrCode());
		data.put(AppConstants.CURR_BPI,validCurrencyEncode.getCurrBpi());
		data.put(AppConstants.CURR_CASA,validCurrencyEncode.getCurrCasa());
		data.put(AppConstants.CURR_DESC,validCurrencyEncode.getCurrDesc());
	

		try {
			meta.setCode(200);
			String mfResponse = MFSendDetailsUtil.sendDetails("0119",AppConstants.PROC_TAG_POST, data);
		
			String message = ApplicationUtils.subString(mfResponse, 131, 19);
			meta.setErrorMessage(message);
			response.setData(message);
		} catch (MFResponseException e) {
			meta.setCode(Integer.parseInt(e.getCode()));
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		response.setMeta(meta);
		return Response.ok().entity(response).build();
		}

    public  Response maintenanceValidCurrenciesListGet(SecurityContext securityContext)
    throws NotFoundException{ 
    	APIResponse response = new APIResponse();
     	  APIResponseMeta meta = new APIResponseMeta();
     	  List<HashMap<String, String>> values;
     	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    
     	  String mfResponse = StringUtils.EMPTY;
     	  
     	  try{
     		  meta.setCode(200);
  			  mfResponse = MFSendDetailsUtil.sendDetails( AppConstants.valid_currency_list_tc, AppConstants.PROC_TAG_FIRST_BATCH,data);
  			  values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.valid_currency_list_tc,
     					 StringUtils.EMPTY, StringUtils.EMPTY);
  			  
  			  T0118DAO dao = DaoFactory.getT0118DAO();
  			for (HashMap<String , String> item : values) {
  				T0118 t0118 = new T0118();
  				t0118.parse(item);
  				dao.saveRecord(t0118);
  			}
  			 
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
    
    public Response maintenanceRefRatePhpProcessPost(List<T0214> refRateUsdProcessBody,SecurityContext securityContext)
    	    throws NotFoundException {
    	APIResponseMeta meta = new APIResponseMeta();
    	APIResponse response = new APIResponse();
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();

		List<HashMap<String,String>> dataList = new ArrayList<HashMap<String,String>>();
		int x = 0;
		System.out.print(refRateUsdProcessBody.size());
		for (T0214 item : refRateUsdProcessBody){
			HashMap<String,String> temp =  new  HashMap<String,String>();
			temp.put(AppConstants.TRDR_FI,item.getTrdrFi());
			temp.put(AppConstants.CURR_CODE,item.getCurrCode());
			temp.put(AppConstants.REFR_RATE,item.getRefrRate().toString());
			dataList.add(temp);
		}
	

		try {
			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.REF_RATE_PHP_PROCESS_POST,  data,dataList);
		
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
    
    
    public  Response maintenanceRefRateUsdProcessPost(List<T0211> refRateUsdProcessBody,SecurityContext securityContext)
    throws NotFoundException{ 
		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		
  		List<HashMap<String,String>> dataList = new ArrayList<HashMap<String,String>>();
		
		for (T0211 item : refRateUsdProcessBody){
			HashMap<String,String> temp =  new  HashMap<String,String>();
			temp.put(AppConstants.TRDR_FI,item.getTrdrFi());
			temp.put(AppConstants.CURR_CODE,item.getCurrCode());
			temp.put(AppConstants.REFR_RATE,item.getRefrRate().toString());
			dataList.add(temp);
		}

  		try {
  			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_RR_USD_PROCESS, data, dataList);
  			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_RR_USD_PROCESS,
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
	public Response maintenanceApprovingAuthorityLimitEncodePost(List<ApprovingAuthorityBody> approvingAuthorityBody,
			SecurityContext securityContext) throws NotFoundException {
		APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();
			
	
	
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		
		List<HashMap<String,String>> dataList = new ArrayList<HashMap<String,String>>();
		
		for (ApprovingAuthorityBody item : approvingAuthorityBody){
			HashMap<String,String> temp =  new  HashMap<String,String>();
			temp.put(AppConstants.OFCR1_TYP,item.getOfcr1Typ());
			temp.put(AppConstants.OFCR2_TYP,item.getOfcr2Typ());
			temp.put(AppConstants.OVRD_PTT,item.getOvrdPtt().toString());
			temp.put(AppConstants.PHP_LIMIT,item.getPhpLmt().toString());
			dataList.add(temp);
		}
System.out.println("@@@@: " + dataList);
		
		int x = 0;
		for (HashMap<String, String> hashMap : dataList) {
			x++;
			if (x == 1) {
				data.put(AppConstants.OVRD_PPT1, hashMap.get("ovrd_ptt"));
				data.put(AppConstants.OFCR1_TYP1, hashMap.get("ofcr1_typ"));
				data.put(AppConstants.OFCR2_TYP1, hashMap.get("ofcr2_typ"));
				data.put(AppConstants.PHP_LIMIT1, hashMap.get("php_limit"));
			} else if (x == 2) {
				data.put(AppConstants.OVRD_PPT2, hashMap.get("ovrd_ptt"));
				data.put(AppConstants.OFCR1_TYP2, hashMap.get("ofcr1_typ"));
				data.put(AppConstants.OFCR2_TYP2, hashMap.get("ofcr2_typ"));
				data.put(AppConstants.PHP_LIMIT2, hashMap.get("php_limit"));
			} else if (x == 3) {
				data.put(AppConstants.OVRD_PPT3, hashMap.get("ovrd_ptt"));
				data.put(AppConstants.OFCR1_TYP3, hashMap.get("ofcr1_typ"));
				data.put(AppConstants.OFCR2_TYP3, hashMap.get("ofcr2_typ"));
				data.put(AppConstants.PHP_LIMIT3, hashMap.get("php_limit"));
			} else if (x == 4) {
				data.put(AppConstants.OVRD_PPT4, hashMap.get("ovrd_ptt"));
				data.put(AppConstants.OFCR1_TYP4, hashMap.get("ofcr1_typ"));
				data.put(AppConstants.OFCR2_TYP4, hashMap.get("ofcr2_typ"));
				data.put(AppConstants.PHP_LIMIT4, hashMap.get("php_limit"));
			}
			System.out.println("LOG:@@@ " + x + " ---- " + data);
		}
	
		try {
			String mfResponse = MFSendDetailsUtil.sendDetails("0147",AppConstants.PROC_TAG_POST,data);
		
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
	public Response maintenanceInvisibleCodeListGet(String trdrFi, String inviCode, SecurityContext securityContext)
			throws NotFoundException {
		APIResponseMeta meta = new APIResponseMeta();
    	APIResponse response = new APIResponse();
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		String mfResponse = StringUtils.EMPTY;
		List<HashMap<String, String>> values;
		T0120DAO dao0120 = DaoFactory.getT0120DAO();
		T0121DAO dao0121 = DaoFactory.getT0121DAO();
		data.put(AppConstants.TRDR_FI, trdrFi);
		data.put(AppConstants.INVISIBLE_CODE, inviCode);
		
		try{
			meta.setCode(200);
			if(inviCode.equals("")){
				mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INVI_CODE_LIST, AppConstants.PROC_TAG_FIRST_BATCH, data);
				values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INVI_CODE_LIST,
    					 StringUtils.EMPTY, StringUtils.EMPTY);
				for(HashMap<String, String> map : values){
					T0121 row = new T0121();
					row.parse(map);
					dao0121.saveRecord(row);
				}
			}else{
				mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INVI_CODE_DTLS, data);
				values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_INVI_CODE_DTLS,
   					 StringUtils.EMPTY, StringUtils.EMPTY);
				for(HashMap<String, String> map : values){
					T0120 row = new T0120();
					row.parse(map);
					dao0120.saveRecord(row);
				}
			}
		} catch (MFResponseException e) {
			meta.setCode(Integer.parseInt(e.getCode()));
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		response.setMeta(meta);
		return Response.ok().entity(response).build();
	}

	@Override
	public Response maintenanceInvisibleCodePost(InvisibleCodeBody invisibleCodeBody, SecurityContext securityContext)
			throws NotFoundException {
		APIResponseMeta meta = new APIResponseMeta();
    	APIResponse response = new APIResponse();
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		String mfResponse = StringUtils.EMPTY;
		
		data.put(AppConstants.TRDR_FI, invisibleCodeBody.getTrdrFi());
		data.put(AppConstants.INVISIBLE_CODE, invisibleCodeBody.getInviCode());
		data.put(AppConstants.TRAN_CODE, invisibleCodeBody.getTranCode());
		data.put(AppConstants.FORM_NMBR, invisibleCodeBody.getFormNmbr());
		data.put(AppConstants.INVI_DESC, invisibleCodeBody.getInviDesc());
		data.put(AppConstants.TAG, "A");
		
		try{
			meta.setCode(200);
			mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INVI_CODE_SAVE, data);
			response.setData(ApplicationUtils.subString(mfResponse, 131, 19));
			
		} catch (MFResponseException e) {
			meta.setCode(Integer.parseInt(e.getCode()));
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		response.setMeta(meta);
		return Response.ok().entity(response).build();
	}

	@Override
	public Response maintenanceInvisibleCodeDelete(InvisibleCodeBody invisibleCodeBody, SecurityContext securityContext)
			throws NotFoundException {
		APIResponseMeta meta = new APIResponseMeta();
    	APIResponse response = new APIResponse();
		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		String mfResponse = StringUtils.EMPTY;
		
		data.put(AppConstants.TRDR_FI, invisibleCodeBody.getTrdrFi());
		data.put(AppConstants.INVISIBLE_CODE, invisibleCodeBody.getInviCode());
		data.put(AppConstants.TRAN_CODE, invisibleCodeBody.getTranCode());
		data.put(AppConstants.FORM_NMBR, invisibleCodeBody.getFormNmbr());
		data.put(AppConstants.INVI_DESC, invisibleCodeBody.getInviDesc());
		data.put(AppConstants.TAG, "D");
		
		try{
			meta.setCode(200);
			mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_INVI_CODE_SAVE, data);
			response.setData(ApplicationUtils.subString(mfResponse, 131, 19));
			
		} catch (MFResponseException e) {
			meta.setCode(Integer.parseInt(e.getCode()));
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		response.setMeta(meta);
		return Response.ok().entity(response).build();
	}
    

 
}
