package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0226DAO;
import ph.com.bpi.model.hibernate.T0226;

public class T0226DAOImpl extends BaseDAOImpl<T0226> implements T0226DAO{

public T0226DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0226.class);
}

}