package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0144DAO;
import ph.com.bpi.model.hibernate.T0144;

public class T0144DAOImpl extends BaseDAOImpl<T0144> implements T0144DAO{

public T0144DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0144.class);
}

}