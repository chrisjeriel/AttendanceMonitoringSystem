package ph.com.bpi.api.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

import ph.com.bpi.api.AppConstants;
import ph.com.bpi.api.LogonApiService;
import ph.com.bpi.api.NotFoundException;
import ph.com.bpi.dao.DaoFactory;
import ph.com.bpi.dao.HeaderDataDAO;
import ph.com.bpi.dao.T0001DAO;
import ph.com.bpi.exception.MFResponseException;
import ph.com.bpi.model.APIResponse;
import ph.com.bpi.model.APIResponseMeta;
import ph.com.bpi.model.LogonBody;
import ph.com.bpi.model.hibernate.HeaderData;
import ph.com.bpi.model.hibernate.T0001;
import ph.com.bpi.utilities.ApplicationUtils;
import ph.com.bpi.utilities.MFReceiveDetailsUtil;
import ph.com.bpi.utilities.MFSendDetailsUtil;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen",
		date = "2016-10-14T13:58:17.342+08:00")
public class LogonApiServiceImpl extends LogonApiService{
	@Override
	public Response logonPost(LogonBody data, SecurityContext securityContext) throws NotFoundException{

		APIResponse response = new APIResponse();
		APIResponseMeta meta = new APIResponseMeta();

		List<HashMap<String, String>> values;
		String mfResponse = StringUtils.EMPTY;
		HashMap<String, String> mfData = new HashMap<>();

		T0001DAO dao = DaoFactory.getT0001DAO();
		T0001 model = new T0001();

		HeaderDataDAO headerDao = DaoFactory.getHeaderDataDAO();
		HeaderData headerData = new HeaderData();

		Date transactionDate = data.getTransactionDate();
		String officeCode = data.getOfficeCode();
		String userId = data.getUserId();
		String password = data.getPassword();
		String newPassword = data.getNewPassword();
		boolean changePassword = data.getChangePassword();

		boolean hasError = false;

		/**
		 * Header
		 */
		mfData.put(AppConstants.G_OFFICE_CODE, data.getOfficeCode());
		mfData.put(AppConstants.G_USER_ID, data.getUserId());
		mfData.put(AppConstants.G_LUID, StringUtils.repeat(StringUtils.SPACE, 4));
		mfData.put(AppConstants.G_TRAN_FI, StringUtils.repeat(StringUtils.SPACE, 2));
		mfData.put(AppConstants.C_LOG_DATE, ApplicationUtils.dateToString(data.getTransactionDate()));
		mfData.put(AppConstants.G_LOG_TIME, ApplicationUtils.datetimeToString(data.getTransactionDate()));
		/**
		 * Details
		 */
		mfData.put(AppConstants.G_LOG_TYPE, "2");
		mfData.put(AppConstants.G_PASSWORD, password);
		mfData.put(AppConstants.G_NEW_PASS, newPassword);

		try{
			String mfLogonResponse = ApplicationUtils.mfLogon(mfData);
			if(ApplicationUtils.subString(mfLogonResponse, 0, 4).equalsIgnoreCase("0000")){
				String mfLogonResponseDetail = StringUtils.upperCase(ApplicationUtils.subString(mfLogonResponse, 4, 8));

				hasError = true;
				meta.setCode(403);

				// ACF2 ID in user.
				if(mfLogonResponseDetail.equalsIgnoreCase("ACF01137")
						|| mfLogonResponseDetail.equalsIgnoreCase("ACF01138")
						|| mfLogonResponseDetail.equalsIgnoreCase("ACF01129")
						|| mfLogonResponseDetail.equalsIgnoreCase("ACF01134")){
					meta.setErrorMessage("ACF2 ID in use.");
					meta.setErrorType(mfLogonResponseDetail);

					// Password expired.
				}else if(mfLogonResponseDetail.equalsIgnoreCase("ACF01017")
						|| mfLogonResponseDetail.equalsIgnoreCase("ACF00118")){
					meta.setErrorMessage("Password expired.");
					meta.setErrorType(mfLogonResponseDetail);

					//  UNKNOWN.
				}else if(mfLogonResponseDetail.equalsIgnoreCase("ACF01014")
						|| mfLogonResponseDetail.equalsIgnoreCase("ACF01004")){
					meta.setErrorMessage("");
					meta.setErrorType(mfLogonResponseDetail);

					// Password not matched.
				}else if(mfLogonResponseDetail.equalsIgnoreCase("ACF01014")
						|| mfLogonResponseDetail.equalsIgnoreCase("ACF01004")){
					meta.setErrorMessage("Password expired.");
					meta.setErrorType(mfLogonResponseDetail);

					// UNKNOWN.
				}else{
					meta.setErrorMessage("");
					meta.setErrorType(mfLogonResponseDetail);
				}
			}else{
				if(!changePassword || StringUtils.isBlank(newPassword)){
					newPassword = StringUtils.repeat(StringUtils.SPACE, 8);
				}
			}

			if(hasError){
				response.setData(new Object());
				response.setMeta(meta);

				return Response.ok().entity(response).build();
			}

			mfResponse = MFSendDetailsUtil.sendDetails(AppConstants.TC_LOGON, mfData);

			values = MFReceiveDetailsUtil.receiveDetails(mfResponse, AppConstants.TC_LOGON, StringUtils.EMPTY,
					StringUtils.EMPTY);

			/**
			 * Parse model from values.
			 */
			model.parse(values.get(0));
			dao.saveRecord(model);

			/**
			 * Save header details.
			 */
			headerData.setOfficeCode(officeCode);
			headerData.setUserId(userId);
			headerData.setLuid(ApplicationUtils.subString(mfResponse, 7, 4));
			headerData.setTranFi(model.getgTranFi());
			headerData.setLogDate(ApplicationUtils.dateToString(transactionDate));
			headerData.setLogTime(ApplicationUtils.datetimeToString(transactionDate));

			headerDao.deleteAllRecords();
			headerDao.saveRecord(headerData);

			meta.setCode(200);
			response.setData(dao.getRecord(model.getId()));

		}catch(MFResponseException e){
			meta.setCode(Integer.valueOf(e.getCode()));
			meta.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}

		response.setMeta(meta);

		return Response.ok().entity(response).build();
	}
}
