package com.bpi.test;

import java.math.BigDecimal;
import java.util.Iterator;

import com.bpi.dao.T0309_BDAO;
import com.bpi.impl.T0309_BDAOImpl;
import com.bpi.model.T0309_B;

public class T0309_BUnitTest {

public static void startTest(){
T0309_BDAO modelDao = new T0309_BDAOImpl();
T0309_B model = new T0309_B();

for (int count = 1; count <= 4; count++) {
modelDao = new T0309_BDAOImpl();
model = new T0309_B();

model.setRefNmbr("REF_NMBR"+count);
model.setAcctNmbr(new BigDecimal(count));
model.setTranAmnt(new BigDecimal(count));
model.setEqvlAmnt(new BigDecimal(count));
modelDao.saveRecord(model);
}

model.setId(1);
model.setEqvlAmnt(new BigDecimal(12));
modelDao.saveRecord(model);

System.out.println(modelDao.getRecord(1).toString());

modelDao.deleteRecord(2);

Iterator iterator = modelDao.getAllRecords().iterator();

while (iterator.hasNext()) {
System.out.println(iterator.next());
}
}

}