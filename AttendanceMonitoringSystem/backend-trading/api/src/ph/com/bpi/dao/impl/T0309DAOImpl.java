package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0309DAO;
import ph.com.bpi.model.hibernate.T0309;

public class T0309DAOImpl extends BaseDAOImpl<T0309> implements T0309DAO{

public T0309DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0309.class);
}

}