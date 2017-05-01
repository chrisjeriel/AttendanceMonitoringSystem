package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0128DAO;
import ph.com.bpi.model.hibernate.T0128;

public class T0128DAOImpl extends BaseDAOImpl<T0128> implements T0128DAO{

public T0128DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0128.class);
}

}