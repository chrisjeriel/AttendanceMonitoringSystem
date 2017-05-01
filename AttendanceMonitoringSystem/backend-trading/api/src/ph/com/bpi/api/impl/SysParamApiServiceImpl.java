package ph.com.bpi.api.impl;


import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.api.SysParamApiService;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.FXPARAMDAO;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.model.SysParamBody;
import ph.com.bpi.model.hibernate.FXPARAM;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-12T16:11:13.527+08:00")
public class SysParamApiServiceImpl extends SysParamApiService {
    @Override
    public Response sysParamGet(SecurityContext securityContext) throws NotFoundException {
        APIResponse response = new APIResponse();
        APIResponseMeta meta = new APIResponseMeta();
        FXPARAMDAO fxParam = DaoFactory.getFXPARAMDAO();
        meta.setCode(200);
        response.setData(fxParam.getAllRecords());
        response.setMeta(meta);
        return Response.ok().entity(response).build();
    }
    @Override
    public Response sysParamPut(SysParamBody sysParamBody,SecurityContext securityContext) throws NotFoundException {
        APIResponse response = new APIResponse();
        APIResponseMeta meta = new APIResponseMeta();
        FXPARAMDAO daoFxParam = DaoFactory.getFXPARAMDAO();
        FXPARAM fxParam = new FXPARAM();
        fxParam = daoFxParam.getRecord(1);
        if(!sysParamBody.getSysName().equals("")){
        	fxParam.setSysname(sysParamBody.getSysName());
        }
        if(!sysParamBody.getVersion().equals("")){
        	fxParam.setVersion(sysParamBody.getVersion());
        }
        if(!sysParamBody.getMfRegion().equals("")){
        	fxParam.setMfregion(sysParamBody.getMfRegion());
        }
        if(!sysParamBody.getMfApplid().equals("")){
        	if(sysParamBody.getMfApplid().indexOf("LOGON APPLID(") < 0){
        		fxParam.setMfapplid("LOGON APPLID(" + sysParamBody.getMfApplid() + ")");
        	}else{
        		fxParam.setMfapplid(sysParamBody.getMfApplid());
        	}
        }
        if(!sysParamBody.getTranId().equals("")){
        	fxParam.setTranid(sysParamBody.getTranId());
        }
        if(!sysParamBody.getPrevDate().equals("")){
        	fxParam.setPrevdate(sysParamBody.getPrevDate());
        }
        if(!sysParamBody.getTraderFi().equals("")){
        	fxParam.setTraderfi(sysParamBody.getTraderFi());
        }
        if(!sysParamBody.getRateOvrd().equals("")){
        	fxParam.setRateOvrd(sysParamBody.getRateOvrd());
        }
        if(!sysParamBody.getTranOvrd().equals("")){
        	fxParam.setTranOvrd(sysParamBody.getTranOvrd());
        }
        if(!sysParamBody.getLockRate().equals("")){
        	fxParam.setLockRate(sysParamBody.getLockRate());
        }
        if(!sysParamBody.getSysTest().equals("")){
        	fxParam.setSystest(sysParamBody.getSysTest());
        }
        if(!sysParamBody.getSysOffc().equals("")){
        	fxParam.setSysoffc(sysParamBody.getSysOffc());
        }
        if(!sysParamBody.getValdUser().equals("")){
        	fxParam.setValdUser(sysParamBody.getValdUser());
        }
        if(!sysParamBody.getRetDays().equals("")){
        	fxParam.setRetdays(sysParamBody.getRetDays());
        }
        if(!sysParamBody.getSysTimer().equals("")){
        	fxParam.setSystimer(sysParamBody.getSysTimer());
        }
        if(!sysParamBody.getSysAlarm01().equals("")){
        	fxParam.setSysalarm01(sysParamBody.getSysAlarm01());
        }
        if(!sysParamBody.getSysAlarm02().equals("")){
        	fxParam.setSysalarm02(sysParamBody.getSysAlarm02());
        }
        
        meta.setCode(200);
        daoFxParam.updateRecord(fxParam);
        meta.setErrorMessage("Saving successful!");
        response.meta(meta);
        return Response.ok().entity(response).build();
    }
}
