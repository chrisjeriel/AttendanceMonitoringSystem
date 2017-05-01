package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0906DAO;
import ph.com.bpi.model.hibernate.T0906;

public class T0906DAOImpl extends BaseDAOImpl<T0906> implements T0906DAO{

public T0906DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0906.class);
}

}