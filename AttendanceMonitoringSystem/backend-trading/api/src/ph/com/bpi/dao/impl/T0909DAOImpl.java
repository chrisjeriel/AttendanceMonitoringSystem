package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0909DAO;
import ph.com.bpi.model.hibernate.T0909;

public class T0909DAOImpl extends BaseDAOImpl<T0909> implements T0909DAO{

public T0909DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0909.class);
}

}