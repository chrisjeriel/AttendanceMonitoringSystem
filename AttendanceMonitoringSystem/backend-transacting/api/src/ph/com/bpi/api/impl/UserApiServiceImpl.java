package ph.com.bpi.api.impl;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

import ph.com.bpi.api.AppConstants;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.api.UserApiService;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.T0134DAO;
import ph.com.bpi.dao.T0140DAO;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-09T10:06:22.771+08:00")
public class UserApiServiceImpl extends UserApiService {
    @Override
    public Response userAddPost(String tranFi, String brchCode, String userId, String lname, String fname, String mname, String userType, String nbrchCode, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
		APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();

    	HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	data.put(AppConstants.TRAN_FI, tranFi);
    	data.put(AppConstants.BRANCH_CODE, brchCode);
    	data.put(AppConstants.USER_ID, userId);
    	data.put(AppConstants.LAST_NAME, lname);
    	data.put(AppConstants.FIRST_NAME, fname);
    	data.put(AppConstants.MIDDLE_NAME, mname);
    	data.put(AppConstants.USER_TYPE, userType);
    	data.put(AppConstants.N_BRANCH_CODE, nbrchCode);
    	
    	String errorMessage = doesRefTableExists();
    	if (errorMessage.length()!=0)
    	{
    		response.setData(errorMessage);
    		meta.setCode(500);
    		meta.setErrorMessage(errorMessage);
    		response.setMeta(meta);
    		Response.ok().entity(response).build();
    	}
    	try {
			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_USER, AppConstants.PROC_TAG_USER_ADD, StringUtils.EMPTY, data);
			List<HashMap<String,String>>values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_USER, StringUtils.EMPTY, StringUtils.EMPTY);
    	} catch (MFResponseException e) {
    		meta.setCode(Integer.parseInt(e.getCode()));
    		meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}

		response.setMeta(meta);
		return Response.ok().entity(response).build();
    }
    public String doesRefTableExists()
    {
    	String errorMessage = "Valid Transacting Units table is not found. Please Download!";
    	try{
        	T0134DAO dao134 = DaoFactory.getT0134DAO();
        	if (dao134.getAllRecords().size()==0)
        	{
        		errorMessage = "Valid Transacting Units table is EMPTY. Please Update!";
        		throw new Exception();
        	}
        	errorMessage = "Valid User Levels table is not found. Please Download!";
        	T0140DAO dao140 = DaoFactory.getT0140DAO();
        	if (dao140.getAllRecords().size()==0)
        	{
        		errorMessage = "Valid User Levels table is EMPTY. Please Update!";
        		throw new Exception();
        	}
    	}
    	catch (Exception e)
    	{
    		return errorMessage;
    	}
    
    	return "";
    }
    
    @Override
    public Response userDeletePost(String tranFi, String brchCode, String userId, String lname, String fname, String mname, String userType, String nbrchCode, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
    	APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();

    	HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	data.put(AppConstants.TRAN_FI, tranFi);
    	data.put(AppConstants.BRANCH_CODE, brchCode);
    	data.put(AppConstants.USER_ID, userId);
    	data.put(AppConstants.LAST_NAME, lname);
    	data.put(AppConstants.FIRST_NAME, fname);
    	data.put(AppConstants.MIDDLE_NAME, mname);
    	data.put(AppConstants.USER_TYPE, userType);
    	data.put(AppConstants.N_BRANCH_CODE, nbrchCode);
    	String errorMessage = doesRefTableExists();
    	if (errorMessage.length()!=0)
    	{
    		response.setData(errorMessage);
    		meta.setCode(500);
    		meta.setErrorMessage(errorMessage);
    		response.setMeta(meta);
    		Response.ok().entity(response).build();
    	}
    	try {
			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_USER, AppConstants.PROC_TAG_USER_DELETE, StringUtils.EMPTY, data);
			List<HashMap<String,String>>values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_USER, StringUtils.EMPTY, StringUtils.EMPTY);
    	} catch (MFResponseException e) {
			// TODO Auto-generated catch block
    		meta.setCode(Integer.parseInt(e.getCode()));
    		meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}

		response.setMeta(meta);
		return Response.ok().entity(response).build();
    }
    @Override
    public Response userGetGet(String userId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
    	APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();

    	HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	data.put(AppConstants.USER_ID, userId);
    	try {
			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_USER_GET, AppConstants.PROC_TAG_USER_DELETE, StringUtils.EMPTY, data);
			List<HashMap<String,String>>values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_USER_GET, StringUtils.EMPTY, StringUtils.EMPTY);
			System.out.println("values is " +values);
			response.setData(values);
    	} catch (MFResponseException e) {
			// TODO Auto-generated catch block
    		meta.setCode(Integer.parseInt(e.getCode()));
    		meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
    	
		response.setMeta(meta);
		return Response.ok().entity(response).build();
    }
    @Override
    public Response userListGet(String tranFi, String brchCode, String userId, SecurityContext securityContext) throws NotFoundException {
    	APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();

    	HashMap<String, String> data = ApplicationUtils.getHeaderDetails();

    	data.put(AppConstants.TRAN_FI, tranFi);
    	data.put(AppConstants.BRANCH_CODE, brchCode);
    	data.put(AppConstants.USER_ID, userId);
    	

    	try {
			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_USER_GET, AppConstants.PROC_TAG_USER_DELETE, StringUtils.EMPTY, data);
			List<HashMap<String,String>>values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_USER_GET, StringUtils.EMPTY, StringUtils.EMPTY);
			response.setData(values);
    	} catch (MFResponseException e) {
    		meta.setCode(Integer.parseInt(e.getCode()));
    		meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
    	
		response.setMeta(meta);
		return Response.ok().entity(response).build();
	}
    @Override
    public Response userUpdatePost(String tranFi, String brchCode, String userId, String lname, String fname, String mname, String userType, String nbrchCode, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
    	APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();

    	HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
    	data.put(AppConstants.TRAN_FI, tranFi);
    	data.put(AppConstants.BRANCH_CODE, brchCode);
    	data.put(AppConstants.USER_ID, userId);
    	data.put(AppConstants.LAST_NAME, lname);
    	data.put(AppConstants.FIRST_NAME, fname);
    	data.put(AppConstants.MIDDLE_NAME, mname);
    	data.put(AppConstants.USER_TYPE, userType);
    	data.put(AppConstants.N_BRANCH_CODE, nbrchCode);
    	
    	String errorMessage = doesRefTableExists();
    	if (errorMessage.length()!=0)
    	{
    		response.setData(errorMessage);
    		meta.setCode(500);
    		meta.setErrorMessage(errorMessage);
    		response.setMeta(meta);
    		Response.ok().entity(response).build();
    	}
    	
    	try {
			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_USER, AppConstants.PROC_TAG_USER_UPDATE, StringUtils.EMPTY, data);
			List<HashMap<String,String>>values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_USER, StringUtils.EMPTY, StringUtils.EMPTY);
    	} catch (MFResponseException e) {
			// TODO Auto-generated catch block
    		meta.setCode(Integer.parseInt(e.getCode()));
    		meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}

		response.setMeta(meta);
		return Response.ok().entity(response).build();
    }
}
