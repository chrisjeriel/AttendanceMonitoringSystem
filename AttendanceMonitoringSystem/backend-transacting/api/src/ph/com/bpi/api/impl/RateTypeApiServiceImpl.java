package ph.com.bpi.api.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.api.RateTypeApiService;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.T0200DAO;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.model.hibernate.T0200;
import ph.com.bpi.utilities.ApplicationUtils;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class RateTypeApiServiceImpl extends RateTypeApiService {
  
      @Override
      public Response rateTypeListGet(String trdrFi,SecurityContext securityContext)
      throws NotFoundException {
		  APIResponse response = new APIResponse();
		  APIResponseMeta meta = new APIResponseMeta();
		  HashMap<String, String> data = ApplicationUtils.getHeaderDetails();
		  try{
			  T0200DAO myT0200Dao = DaoFactory.getT0200DAO();
			  if (myT0200Dao.getAllRecords().size()==0)
			  {
				  throw new Exception("Table is empty, please update");
			  }
			  List<T0200> T0200List = myT0200Dao.getAllRecords(); // get all t0200
			  List<T0200> result = new ArrayList<T0200>();
			  for (T0200 currT0200: T0200List)
			  {
				  if (currT0200.getTrdrFi().equals(trdrFi))
				  {
					  result.add(currT0200);
					  continue;
				  }
			  }
			 response.setData(T0200List);		  
		  }
		  catch(Exception e)
		  {
			  response.setData(e.getMessage());
			  meta.setCode(500);
		  }
      return Response.ok().entity(response).build();
  }
  
}
