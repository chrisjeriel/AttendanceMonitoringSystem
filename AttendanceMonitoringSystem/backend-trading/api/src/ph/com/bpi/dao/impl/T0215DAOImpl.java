package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0215DAO;
import ph.com.bpi.model.hibernate.T0215;

public class T0215DAOImpl extends BaseDAOImpl<T0215> implements T0215DAO{

public T0215DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0215.class);
}

}