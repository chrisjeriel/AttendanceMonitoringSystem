package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0232DAO;
import ph.com.bpi.model.hibernate.T0232;

public class T0232DAOImpl extends BaseDAOImpl<T0232> implements T0232DAO{

public T0232DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0232.class);
}

}