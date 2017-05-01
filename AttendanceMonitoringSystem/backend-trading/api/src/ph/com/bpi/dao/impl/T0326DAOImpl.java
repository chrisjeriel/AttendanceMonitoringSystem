package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0326DAO;
import ph.com.bpi.model.hibernate.T0326;

public class T0326DAOImpl extends BaseDAOImpl<T0326> implements T0326DAO{

public T0326DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory,T0326.class);
}

}