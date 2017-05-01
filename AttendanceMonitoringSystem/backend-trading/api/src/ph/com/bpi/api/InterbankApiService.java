package ph.com.bpi.api;

import ph.com.bpi.model.InterbankDataEntryBody;
import ph.com.bpi.model.InterbankDefineFileProcessBody;
import ph.com.bpi.model.InterbankErrorCorrectBody;

import ph.com.bpi.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public abstract class InterbankApiService {
  
      public abstract Response interbankDataEntryPost(InterbankDataEntryBody interbankDataEntry,SecurityContext securityContext)
      throws NotFoundException;

      public abstract Response interbankDefineFileProcessPut(InterbankDefineFileProcessBody interbankDefineFileProcess,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response interbankDefineFileProcessDelete(InterbankDefineFileProcessBody interbankDefineFileProcess,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response interbankDefineFileListPost(String bankCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response interbankDefineFileProcessPost(InterbankDefineFileProcessBody interbankDefineFileProcess,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response interbankErrorCorrectPost(InterbankErrorCorrectBody interbankErrorCorrect,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response interbankInquiryListPost(String tranIndtr,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response interbankInquiryListNextPost(String tranIndtr,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response interbankInquiryRefNoPost(String refNo,String tranIndtr,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response interbankLoaListPost(String tranIndtr,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response interbankLoaListNextPost(String tranIndtr,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response interbankLoaPurchasePrintPost(String gLogDate,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response interbankLoaSalePrintPost(String gLogDate,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response interbankReportPost(String refNo,String tranIndtr,SecurityContext securityContext)
      throws NotFoundException;
  
}
