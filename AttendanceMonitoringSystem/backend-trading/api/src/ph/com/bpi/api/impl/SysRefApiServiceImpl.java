package ph.com.bpi.api.impl;


import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.api.SysRefApiService;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.FXREFDAO;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.utilities.AppConstants;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class SysRefApiServiceImpl extends SysRefApiService {
    @Override
    public Response sysRefAllGet(SecurityContext securityContext) throws NotFoundException {
    	APIResponse response = new APIResponse();
    	APIResponseMeta meta = new APIResponseMeta();
    	FXREFDAO fxRefDAO = DaoFactory.getFXREFDAO();
    	meta.setCode(200);
    	response.setData(fxRefDAO.getAllRecords());
    	response.setMeta(meta);
        return Response.ok().entity(response).build();
    }
    @Override
    public Response sysRefGet(String tCode,SecurityContext securityContext) throws NotFoundException {
        APIResponse response = new APIResponse();
        APIResponseMeta meta = new APIResponseMeta();
		try {
			System.out.println("TCODE@@@@@: " + tCode);
			meta.setCode(200);
			Class<?> daoFactory = Class.forName("ph.com.bpi.dao.DaoFactory");
			Object daoObjFactory = daoFactory.newInstance();
			Method method = daoFactory.getDeclaredMethod("get" + tCode + "DAO");
			Class<?> daoCls = Class.forName("ph.com.bpi.dao." + tCode + "DAO");
			Object daoObj = method.invoke(daoObjFactory);
			method = daoCls.getMethod("getAllRecords");
			response.setData(method.invoke(daoObj));
		} catch (Exception e) {
			meta.setCode(500);
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		response.setMeta(meta);
        return Response.ok().entity(response).build();
    }
    @SuppressWarnings("rawtypes")
	@Override
    public Response sysRefPost(String tCode,String trdrFi,String brchCode,SecurityContext securityContext) throws NotFoundException {
        APIResponse response = new APIResponse();
        APIResponseMeta meta = new APIResponseMeta();
        String mfResponse = StringUtils.EMPTY;
        List<HashMap<String, String>> values = new ArrayList<>();
        HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
        meta.setCode(200);
        data.put(AppConstants.TRDR_FI, trdrFi);
        data.put(AppConstants.BRANCH_CODE, brchCode);
        
        try{
   		  	mfResponse = MFSendDetailsUtil.sendDetails(tCode, AppConstants.PROC_TAG_FIRST_BATCH,data);
   		  	values = MFReceiveDetailsUtil.receiveDetails(mfResponse.trim(), tCode, StringUtils.EMPTY, StringUtils.EMPTY);
        }catch(MFResponseException e){
			meta.setCode(Integer.valueOf(e.getCode()));
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
        }
        
        try{
        	Class<?> daoFactory = Class.forName("ph.com.bpi.dao.DaoFactory");
			Object daoObjFactory = daoFactory.newInstance();
			Method method = daoFactory.getDeclaredMethod("get" + tCode + "DAO");
			Class<?> daoCls = Class.forName("ph.com.bpi.dao." + tCode + "DAO");
			Object daoObj = method.invoke(daoObjFactory);
			method = daoCls.getMethod("deleteAllRecords");
			method.invoke(daoObj);
			
			for (HashMap<String, String> map : values) {
				//Object
				Class<?> modelCls = Class.forName("ph.com.bpi.model.hibernate." + tCode);
				Object modelObj = modelCls.newInstance();
				
				//Parsing
				Class[] paramParse = new Class[1];
				paramParse[0] = map.getClass();
				method = modelCls.getMethod("parse", paramParse);
				method.invoke(modelObj, map);
				
				//saving
				Class[] paramSave = new Class[1];
				paramSave[0] = Object.class;
				method = daoCls.getMethod("saveRecord", paramSave);
				method.invoke(daoObj, modelObj);
			}
        } catch (Exception e) {
			meta.setCode(500);
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
        
        response.setMeta(meta);
        return Response.ok().entity(response).build();
    }
}
