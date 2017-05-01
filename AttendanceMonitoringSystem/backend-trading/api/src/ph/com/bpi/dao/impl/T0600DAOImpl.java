package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0600DAO;
import ph.com.bpi.model.hibernate.T0600;

public class T0600DAOImpl extends BaseDAOImpl<T0600> implements T0600DAO{

public T0600DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0600.class);
}

}