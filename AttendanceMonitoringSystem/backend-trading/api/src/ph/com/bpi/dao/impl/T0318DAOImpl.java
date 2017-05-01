package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0318DAO;
import ph.com.bpi.model.hibernate.T0318;

public class T0318DAOImpl extends BaseDAOImpl<T0318> implements T0318DAO{

public T0318DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0318.class);
}

}