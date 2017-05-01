package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0311DAO;
import ph.com.bpi.model.hibernate.T0311;

public class T0311DAOImpl extends BaseDAOImpl<T0311> implements T0311DAO{

public T0311DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0311.class);
}

}