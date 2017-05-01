package ph.com.bpi.api.impl;


import ph.com.bpi.api.McroApiService;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.FXMCRODAO;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class McroApiServiceImpl extends McroApiService {
    @Override
    public Response mcroGet(SecurityContext securityContext) throws NotFoundException {
        APIResponse response = new APIResponse();
        APIResponseMeta meta = new APIResponseMeta();
        FXMCRODAO fxMcro = DaoFactory.getFXMCRODAO();
        meta.setCode(200);
        response.setData(fxMcro.getAllRecords());
        response.setMeta(meta);
        return Response.ok().entity(response).build();
    }
}
