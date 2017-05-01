package ph.com.bpi.api.impl;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;
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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-08T16:20:30.216+08:00")
public class LogoffApiServiceImpl extends LogoffApiService {
    @Override
    public Response logoffPost(String goffcode, String guserid, SecurityContext securityContext) throws NotFoundException {
	  APIResponse response = new APIResponse();
	  APIResponseMeta meta = new APIResponseMeta();
	  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
	  data.put(AppConstants.G_OFFICE_CODE, goffcode);
	  data.put(AppConstants.G_USER_ID, guserid);
	  List<HashMap<String, String>> values;
	  String message = "";
	  try
	  {
		 String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_LOGOFF,data);
		if (mfResponse!=null &&
				(ApplicationUtils.subString(mfResponse,57,4).equals("0017") ||
						ApplicationUtils.subString(mfResponse,57,4).equals("0178")))
			 message = ApplicationUtils.subString(mfResponse, 61, 70);
		 else
			 message = ApplicationUtils.subString(mfResponse, 61, 70);
		 response.setData(message);
		 meta.setCode(200);
	  }
	  catch(MFResponseException mfe)
	  {
		meta.setCode(Integer.valueOf(mfe.getCode()));
		meta.setErrorMessage(mfe.getMessage());
		mfe.printStackTrace();
	  }
    	
	  return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
