package com.bpi.test;

import java.math.BigDecimal;
import java.util.Iterator;

import com.bpi.dao.T0309_ADAO;
import com.bpi.impl.T0309_ADAOImpl;
import com.bpi.model.T0309_A;

public class T0309_AUnitTest {

public static void startTest(){
T0309_ADAO modelDao = new T0309_ADAOImpl();
T0309_A model = new T0309_A();

for (int count = 1; count <= 4; count++) {
modelDao = new T0309_ADAOImpl();
model = new T0309_A();

model.setTranDate("TRAN_DATE"+count);
model.setBrchCode("BRCH_CODE"+count);
model.setTrdrFi("TRDR_FI"+count);
model.setTranIndc("TRAN_INDC"+count);
model.setRefNmbr("REF_NMBR"+count);
model.setcLName("C_LNAME"+count);
model.setcFName("C_FNAME"+count);
model.setcMName("C_MNAME"+count);
model.setcAddr1("C_ADDR1"+count);
model.setcAddr2("C_ADDR2"+count);
model.setTelNo("TELNO"+count);
model.setTin("TIN"+count);
model.setBday("BDAY"+count);
model.setClntTag("CLNT_TAG"+count);
model.setCorpTag("CORP_TAG"+count);
model.setDocuTag("DOCU_TAG"+count);
model.setMangUnit("MANG_UNIT"+count);
model.setBookUnit("BOOK_UNIT"+count);
model.setCurrFr("CURR_FR"+count);
model.setTranAmnt(new BigDecimal(count));
model.setDealRate(new BigDecimal(count));
model.setRqstRate(new BigDecimal(count));
model.setGrntRate(new BigDecimal(count));
model.setCurrTo("CURR_TO"+count);
model.setEquiAmnt(new BigDecimal(count));
model.setNetAmnt(new BigDecimal(count));
model.setAcptMode(new BigDecimal(count));
model.setAcptRefNo("ACPT_REFNO"+count);
model.setAchrgDed("ACHRG_DED"+count);
model.setAcptDocs(new BigDecimal(count));
model.setAcptComm(new BigDecimal(count));
model.setrLName("R_LNAME"+count);
model.setrFName("R_FNAME"+count);
model.setrMName("R_MNAME"+count);
model.setAtelVald("ATEL_VALD"+count);
model.setSetlMode(new BigDecimal(count));
model.setSetlRefNo("SETL_REFNO"+count);
model.setSchrgDed("SCHRG_DED"+count);
model.setSetlDocs(new BigDecimal(count));
model.setSetlComm(new BigDecimal(count));
model.setbLName("B_LNAME"+count);
model.setbFName("B_FNAME"+count);
model.setbMName("B_MNAME"+count);
model.setbBday("B_BDAY"+count);
model.setbAddr1("B_ADDR1"+count);
model.setbAddr2("B_ADDR2"+count);
model.setStelVald("STEL_VALD"+count);
model.setInviCode("INVI_CODE"+count);
model.setUserId("USERID"+count);
model.setTermId("TERMID"+count);
model.setStatRqst("STAT_RQST"+count);
model.setRmrkBrch("RMRK_BRCH"+count);
model.setRmrkTrdr("RMRK_TRDR"+count);
model.setAcptPost(new BigDecimal(count));
model.setSetlPost(new BigDecimal(count));
model.setOvrdPtt(new BigDecimal(count));
model.setbTin("B_TIN"+count);
modelDao.saveRecord(model);
}

model.setId(1);
model.setbTin("update");
modelDao.saveRecord(model);

System.out.println(modelDao.getRecord(1).toString());

modelDao.deleteRecord(2);

Iterator iterator = modelDao.getAllRecords().iterator();

while (iterator.hasNext()) {
System.out.println(iterator.next());
}
}

}