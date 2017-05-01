package ph.com.bpi.api.impl;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;
import ph.com.bpi.utilities.AppConstants;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;

import java.util.HashMap;
import java.util.List;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.exception.MFResponseException;

import java.io.InputStream;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-20T17:39:48.019+08:00")
public class DownloadApiServiceImpl extends DownloadApiService {
    @Override
    public Response downloadGet(String tranIndc, String rqstType, SecurityContext securityContext) throws NotFoundException {
  		APIResponse response = new APIResponse();
  		APIResponseMeta meta = new APIResponseMeta();
  			
  		HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
  		String ref_nmbr = StringUtils.repeat(StringUtils.SPACE, 19);
		data.put(AppConstants.TRDR_FI, "2");
		data.put(AppConstants.TRAN_INDC, tranIndc);
		data.put(AppConstants.RQST_TYPE, rqstType);
		data.put(AppConstants.REF_NMBR, ref_nmbr);

		try {
			String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_REPORTS_DL,AppConstants.PROC_TAG_FIRST_BATCH, data);
			List<HashMap<String, String>> message = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_REPORTS_DL,
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
}
