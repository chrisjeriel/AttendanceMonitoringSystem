package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0102DAO;
import ph.com.bpi.model.hibernate.T0102;

public class T0102DAOImpl extends BaseDAOImpl<T0102> implements T0102DAO{

public T0102DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0102.class);
}

}