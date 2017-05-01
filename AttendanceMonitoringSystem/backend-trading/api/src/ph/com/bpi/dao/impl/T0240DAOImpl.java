package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0240DAO;
import ph.com.bpi.model.hibernate.T0240;

public class T0240DAOImpl extends BaseDAOImpl<T0240> implements T0240DAO{

public T0240DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0240.class);
}

}