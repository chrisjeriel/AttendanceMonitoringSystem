package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0313DAO;
import ph.com.bpi.model.hibernate.T0313;

public class T0313DAOImpl extends BaseDAOImpl<T0313> implements T0313DAO{

public T0313DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0313.class);
}

}