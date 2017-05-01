package ph.com.bpi.api.impl;

import ph.com.bpi.api.*;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.model.LoginDetails;

import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.exception.MFResponseException;

import java.util.ArrayList;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

import com.bpi.EHLLAPIImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class LoginApiServiceImpl extends LoginApiService {

	@Override
	public Response loginPost(LoginDetails userDetails, SecurityContext securityContext) throws NotFoundException {
		APIResponse response = new APIResponse();
  	  	APIResponseMeta meta = new APIResponseMeta();
  	  	String mfResponse = StringUtils.EMPTY;
  	  	String retCode = StringUtils.EMPTY;
  	  	try{
  	  		meta.setCode(200);
  	  		retCode = mfResponse.substring(0,8);
  	  		if(retCode.substring(0, 3).equals("ACF")){
  	  			switch (retCode) {
					//Successful Logon
  	  				case "ACF01134":
					case "ACF01137":
					case "ACF01138":
					case "ACF01129":
						if(mfResponse.substring(80,88).equals("ACFAE139")){
							meta.setErrorMessage(mfResponse.substring(9,69) + "\n" + mfResponse.substring(89));
						}else{
							//ACF2 ID Already Signe On
							throw new MFResponseException("400", mfResponse.substring(89, 159));
						}
						break;
					//Password Expired/New Password Matches a previous password
					case "ACF01017":
					case "ACF00118":
					//Logon ID not Found
					case "ACF01004":
					//Password not Matched
					case "ACF01012":
					//ACF2 ID Expired
					case "ACF01014":
					//Password not Matched/User not authorized for this region
					case "ACFAE134":
						throw new MFResponseException("400", mfResponse.substring(9,70));
					default:
						throw new MFResponseException("400", mfResponse.substring(9,70));
				}
  	  		}
	  	  }
	  	  catch(MFResponseException e){
	  		  meta.setCode(Integer.valueOf(e.getCode()));
	  		  meta.setErrorMessage(e.getMessage());
	  		  e.printStackTrace();
	  	  }
	  	  response.setMeta(meta);
	  	  response.setData(new ArrayList<>());
		return Response.ok().entity(response).build();
	}
	


}
