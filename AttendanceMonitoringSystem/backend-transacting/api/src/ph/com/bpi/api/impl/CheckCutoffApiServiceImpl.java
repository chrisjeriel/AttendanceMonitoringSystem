package ph.com.bpi.api.impl;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import ph.com.bpi.api.ApiResponseMessage;
import ph.com.bpi.api.AppConstants;
import ph.com.bpi.api.CheckCutoffApiService;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFSendDetailsUtil;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class CheckCutoffApiServiceImpl extends CheckCutoffApiService {
  
      @Override
      public Response checkCutoffGet(String trdrFi,String bank,SecurityContext securityContext)
      throws NotFoundException {
		  APIResponse response = new APIResponse();
		  APIResponseMeta meta = new APIResponseMeta();
		  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		  data.put(AppConstants.TRDR_FI, trdrFi);
		  data.put(AppConstants.BANK, bank);
		  List<HashMap<String, String>> values;
		  String message = "";
		  try
		  {
			 String mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_CHECK_CUTOFF,data);
			 if (mfResponse!=null && ApplicationUtils.subString(mfResponse,57,4).equals("0000"))
				 message = "true";
			 else
				 message = "false";
			 response.setData(message);
			 meta.setCode(200);
		  }
		  catch(MFResponseException mfe)
		  {
			meta.setCode(Integer.valueOf(mfe.getCode()));
			meta.setErrorMessage(mfe.getMessage());
			mfe.printStackTrace();
		  }
      return Response.ok().entity(response).build();
  }
  
}
