package ph.com.bpi.api;

import ph.com.bpi.api.*;
import ph.com.bpi.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import ph.com.bpi.model.ObjectResponse;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-01T15:13:18.774+08:00")
public abstract class InterbankApiService {
    public abstract Response interbankInquiryListGet(String tranIndtr,SecurityContext securityContext) throws NotFoundException;
}
