package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0147DAO;
import ph.com.bpi.model.hibernate.T0147;

public class T0147DAOImpl extends BaseDAOImpl<T0147> implements T0147DAO{

public T0147DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0147.class);
}

}