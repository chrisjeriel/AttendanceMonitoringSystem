package ph.com.bpi.api.impl;

import org.apache.commons.lang3.StringUtils;
import ph.com.bpi.api.*;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.*;


import ph.com.bpi.model.SpecialSquaringApproveBody;

import java.util.*;

import ph.com.bpi.model.ObjectResponse;
import ph.com.bpi.model.SpecialSquaringComputeBody;
import ph.com.bpi.model.SpecialSquaringFinalBody;
import ph.com.bpi.model.SpecialSquaringListBody;
import ph.com.bpi.model.SpecialSquaringNewBody;

import java.util.List;

import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.utilities.AppConstants;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;

import java.io.InputStream;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class SpecialSquaringApiServiceImpl extends SpecialSquaringApiService {

    @Override
    public Response specialSquaringApprovePost(SpecialSquaringApproveBody specialSquaringApprove, SecurityContext securityContext)
            throws NotFoundException {
        MetaResponse meta = new MetaResponse();
        ObjectResponse obj = new ObjectResponse();
        obj.setMeta(meta);
        String tCode = AppConstants.TC_SPECIAL_SQUARING_APPROVE;

        System.out.println("Transaction Code: " + tCode);

        HashMap<String, String> params = ApplicationUtils.getHeaderDetails();
        params.put(AppConstants.DEAL_WITH, specialSquaringApprove.getDealWith());
        params.put(AppConstants.REF_NMBR, specialSquaringApprove.getRefNo());
        params.put(AppConstants.TRSY_GRNT, specialSquaringApprove.getTrsyGrnt());
        params.put(AppConstants.TRSY_EQVL, specialSquaringApprove.getTrsyEqvl());
        params.put(AppConstants.TRSY_RATE, specialSquaringApprove.getTrsyRate());
        params.put(AppConstants.TRSY_RMRK, specialSquaringApprove.getTrsyRmrk());
        params.put(AppConstants.G_OFFICE_CODE, specialSquaringApprove.getGOffCode());

        String response = "";
        try {
            response = MFSendDetailsUtil.sendDetails(tCode, params);
            System.out.println("specialSquaringComputePost - Response from sendDetails(): " + response);

            // toc and indexField is currently empty
            List<HashMap<String, String>> data = MFReceiveDetailsUtil.receiveDetails(response, tCode, "", "");
            meta.setCode("200");
            meta.setErrorType("Request Successful");
            obj.setData(data);
        } catch (MFResponseException e) {
            e.printStackTrace();
            meta.setCode(e.getCode());
            meta.setErrorMessage(e.getMessage());
        }

        return Response.ok().entity(obj).build();
    }

    @Override
    public Response specialSquaringComputePost(SpecialSquaringComputeBody specialSquaringCompute, SecurityContext securityContext)
            throws NotFoundException {
        MetaResponse meta = new MetaResponse();
        ObjectResponse obj = new ObjectResponse();
        obj.setMeta(meta);
        String tCode = AppConstants.TC_SPECIAL_SQUARING_COMPUTE;
        
        HashMap<String, String> params = ApplicationUtils.getHeaderDetails();
        params.put(AppConstants.DEAL_WITH, specialSquaringCompute.getDealWith());
        params.put(AppConstants.G_TRAN_FI, specialSquaringCompute.getGTranfi()); //gTranfi on document
        params.put(AppConstants.TRAN_TYPE, specialSquaringCompute.getTranType());
        params.put(AppConstants.ACCEPT_AMT, specialSquaringCompute.getAcptAmt());
        params.put(AppConstants.CURR_PAIR, specialSquaringCompute.getCurrPair());
        params.put(AppConstants.ACPT_MODE, specialSquaringCompute.getAcptMode());
        params.put(AppConstants.SETL_AMNT, specialSquaringCompute.getSetlAmt());
        params.put(AppConstants.SETL_MODE, specialSquaringCompute.getSetlMode());
        params.put(AppConstants.GRNT_RATE, specialSquaringCompute.getGrantRate());

        String response = "";
        try {
            response = MFSendDetailsUtil.sendDetails(tCode, params);
            System.out.println("specialSquaringComputePost - Response from sendDetails(): " + response);

            // toc and indexField is currently empty
            List<HashMap<String, String>> data = MFReceiveDetailsUtil.receiveDetails(response, tCode, "", "");
            meta.setCode("200");
            meta.setErrorType("Request Successful");
            obj.setData(data);
        } catch (MFResponseException e) {
            e.printStackTrace();
            meta.setCode(e.getCode());
            meta.setErrorMessage(e.getMessage());
        }

        return Response.ok().entity(obj).build();
    }

    @Override
    public Response specialSquaringFinalUpdatePost(SpecialSquaringFinalBody specialSquaringFinal, SecurityContext securityContext)
            throws NotFoundException {
        MetaResponse meta = new MetaResponse();
        ObjectResponse obj = new ObjectResponse();
        obj.setMeta(meta);
        String tCode = AppConstants.TC_SPECIAL_SQUARING_FINAL_APPROVE;

        System.out.println("Transaction Code: " + tCode);

        HashMap<String, String> params = ApplicationUtils.getHeaderDetails();
        params.put(AppConstants.DEAL_WITH, specialSquaringFinal.getDealWith());
        params.put(AppConstants.REF_NMBR, specialSquaringFinal.getRefNo());
        params.put(AppConstants.GRNT_STAT, specialSquaringFinal.getGrntStat());
        params.put(AppConstants.G_OFFICE_CODE, specialSquaringFinal.getGOffCode());

        String response = "";
        try {
            response = MFSendDetailsUtil.sendDetails(tCode, params);
            System.out.println("specialSquaringComputePost - Response from sendDetails(): " + response);

            // toc and indexField is currently empty
            List<HashMap<String, String>> data = MFReceiveDetailsUtil.receiveDetails(response, tCode, "", "");
            meta.setCode("200");
            meta.setErrorType("Request Successful");
            obj.setData(data);
        } catch (MFResponseException e) {
            e.printStackTrace();
            meta.setCode(e.getCode());
            meta.setErrorMessage(e.getMessage());
        }

        return Response.ok().entity(obj).build();
    }

    @Override
    public Response specialSquaringListPost(SpecialSquaringListBody specialSquaringNew, SecurityContext securityContext)
            throws NotFoundException {
        MetaResponse meta = new MetaResponse();
        ObjectResponse obj = new ObjectResponse();
        obj.setMeta(meta);
        String tCode = AppConstants.TC_SPECIAL_SQUARING_LIST;

        System.out.println("Transaction Code: " + tCode);

        HashMap<String, String> params = ApplicationUtils.getHeaderDetails();
        params.put(AppConstants.TRDR_FI, specialSquaringNew.getTrdrFi());
        params.put(AppConstants.BANK, specialSquaringNew.getBank());
        params.put(AppConstants.BOOK, specialSquaringNew.getBook());
        params.put(AppConstants.TRAN_INDC, specialSquaringNew.getTranIndc());
        params.put(AppConstants.REF_NMBR, StringUtils.repeat(StringUtils.SPACE, 19));
        params.put(AppConstants.LIST_TYPE, specialSquaringNew.getListType());


        String response = "";
        try {
            response = MFSendDetailsUtil.sendDetails(tCode, params);
            System.out.println("specialSquaringListPost - Response from sendDetails(): " + response);

            // toc and indexField is currently empty
            List<HashMap<String, String>> data = MFReceiveDetailsUtil.receiveDetails(response, tCode, "", "");
            meta.setCode("200");
            meta.setErrorType("Request Successful");
            obj.setData(data);
        } catch (MFResponseException e) {
            e.printStackTrace();
            meta.setCode(e.getCode());
            meta.setErrorMessage(e.getMessage());
        }

        return Response.ok().entity(obj).build();
    }

    @Override
    public Response specialSquaringNewTransProcessPost(SpecialSquaringNewBody specialSquaringNew, SecurityContext securityContext)
            throws NotFoundException {
        MetaResponse meta = new MetaResponse();
        ObjectResponse obj = new ObjectResponse();
        obj.setMeta(meta);
        String tCode = AppConstants.TC_SPECIAL_SQUARING_NEW;
        
        
        System.out.println(specialSquaringNew.toString());

        HashMap<String, String> params = ApplicationUtils.getHeaderDetails();
        params.put(AppConstants.DEAL_WITH, specialSquaringNew.getDealWith());
        params.put(AppConstants.BANK, specialSquaringNew.getBank());
        params.put(AppConstants.BOOK, specialSquaringNew.getBook());
        params.put(AppConstants.TRAN_TYPE, specialSquaringNew.getTranType());
        params.put(AppConstants.CURR_PAIR, specialSquaringNew.getCurrPair());
        params.put(AppConstants.TRAN_AMNT, specialSquaringNew.getTranAmt());
        params.put(AppConstants.EQVT_AMNT, specialSquaringNew.getEquivalentAmnt());
        params.put(AppConstants.ACPT_MODE, specialSquaringNew.getAcptMode());
        params.put(AppConstants.SETL_MODE, specialSquaringNew.getSetlMode());
        params.put(AppConstants.GRNT_RATE, specialSquaringNew.getGrantRate());
        params.put(AppConstants.INVI_CODE, specialSquaringNew.getInviCode());
        params.put(AppConstants.BTSU_RMRK, specialSquaringNew.getBtsuRemarks());

        String response = "";
        try {
            response = MFSendDetailsUtil.sendDetails(tCode, params);
            System.out.println("specialSquaringNewTransProcessPost - Response from sendDetails(): " + response);

            // toc and indexField is currently empty
            List<HashMap<String, String>> data = MFReceiveDetailsUtil.receiveDetails(response, tCode, "", "");
            meta.setCode("200");
            meta.setErrorType("Request Successful");
            obj.setData(data);
        } catch (MFResponseException e) {
            e.printStackTrace();
            meta.setCode(e.getCode());
            meta.setErrorMessage(e.getMessage());
        }

        return Response.ok().entity(obj).build();
    }

}
