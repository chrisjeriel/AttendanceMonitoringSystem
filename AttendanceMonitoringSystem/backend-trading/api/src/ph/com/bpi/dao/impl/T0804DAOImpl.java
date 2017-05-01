package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0804DAO;
import ph.com.bpi.model.hibernate.T0804;

public class T0804DAOImpl extends BaseDAOImpl<T0804> implements T0804DAO{

public T0804DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0804.class);
}

}