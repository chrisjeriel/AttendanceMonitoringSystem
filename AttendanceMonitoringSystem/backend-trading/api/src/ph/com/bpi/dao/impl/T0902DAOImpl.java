package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0902DAO;
import ph.com.bpi.model.hibernate.T0902;

public class T0902DAOImpl extends BaseDAOImpl<T0902> implements T0902DAO{

public T0902DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0902.class);
}

}