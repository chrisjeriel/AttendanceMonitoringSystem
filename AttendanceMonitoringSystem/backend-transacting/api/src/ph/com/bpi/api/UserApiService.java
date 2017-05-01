package ph.com.bpi.api;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;


import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-09T10:06:22.771+08:00")
public abstract class UserApiService {
    public abstract Response userAddPost(String tranFi,String brchCode,String userId,String lname,String fname,String mname,String userType,String nbrchCode,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userDeletePost(String tranFi,String brchCode,String userId,String lname,String fname,String mname,String userType,String nbrchCode,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userGetGet(String userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userListGet(String tranFi,String brchCode,String userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userUpdatePost(String tranFi,String brchCode,String userId,String lname,String fname,String mname,String userType,String nbrchCode,SecurityContext securityContext) throws NotFoundException;
}
