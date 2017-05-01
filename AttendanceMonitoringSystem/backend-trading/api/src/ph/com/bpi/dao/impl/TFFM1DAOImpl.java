package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.TFFM1DAO;
import ph.com.bpi.model.hibernate.TFFM1;

public class TFFM1DAOImpl extends BaseDAOImpl<TFFM1> implements TFFM1DAO{

public TFFM1DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, TFFM1.class);
}

}