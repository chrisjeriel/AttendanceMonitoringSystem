package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0225DAO;
import ph.com.bpi.model.hibernate.T0225;

public class T0225DAOImpl extends BaseDAOImpl<T0225> implements T0225DAO{

public T0225DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0225.class);
}

}