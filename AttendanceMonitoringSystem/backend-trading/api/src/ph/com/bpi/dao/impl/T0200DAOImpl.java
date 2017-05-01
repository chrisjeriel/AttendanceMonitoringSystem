package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0200DAO;
import ph.com.bpi.model.hibernate.T0200;

public class T0200DAOImpl extends BaseDAOImpl<T0200> implements T0200DAO{

public T0200DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0200.class);
}

}