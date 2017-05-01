package ph.com.bpi.api.impl;

import ph.com.bpi.api.MenuApiService;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.FXMENUDAO;
import ph.com.bpi.dao.FXMENUDDAO;
import ph.com.bpi.dao.FXMENUWDAO;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class MenuApiServiceImpl extends MenuApiService {
    @Override
    public Response menuGet(String type, SecurityContext securityContext) throws NotFoundException {
        APIResponse response = new APIResponse();
        APIResponseMeta meta = new APIResponseMeta();
        FXMENUDAO fxMenu = DaoFactory.getFXMENUDAO();
        FXMENUDDAO fxMenuD = DaoFactory.getFXMENUDDAO();
        FXMENUWDAO fxMenuW = DaoFactory.getFXMENUWDAO();
        if(type.equalsIgnoreCase("D")){
        	meta.setCode(200);
        	response.setData(fxMenuD.getAllRecords());
        }else if(type.equalsIgnoreCase("W")){
        	meta.setCode(200);
        	response.setData(fxMenuW.getAllRecords());
        }else if(type.equalsIgnoreCase("")){
        	meta.setCode(200);
        	response.setData(fxMenu.getAllRecords());
        }else{
        	meta.code(201);
        	meta.setErrorMessage("Invalid Menu type.");
        }
        response.setMeta(meta);
        return Response.ok().entity(response).build();
    }
}
