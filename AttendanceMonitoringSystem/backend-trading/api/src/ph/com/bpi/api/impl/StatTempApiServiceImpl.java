package ph.com.bpi.api.impl;

import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.api.StatTempApiService;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.STATTEMPDAO;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class StatTempApiServiceImpl extends StatTempApiService {
    @Override
    public Response statTempGet(SecurityContext securityContext) throws NotFoundException {
        APIResponse response = new APIResponse();
        APIResponseMeta meta = new APIResponseMeta();
        STATTEMPDAO statTemp = DaoFactory.getSTATTEMPDAO();
        meta.setCode(200);
        response.setData(statTemp.getAllRecords());
        response.setMeta(meta);
        return Response.ok().entity(response).build();
    }
}
