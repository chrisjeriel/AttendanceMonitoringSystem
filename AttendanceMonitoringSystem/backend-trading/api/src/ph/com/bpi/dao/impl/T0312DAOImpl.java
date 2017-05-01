package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0312DAO;
import ph.com.bpi.model.hibernate.T0312;

public class T0312DAOImpl extends BaseDAOImpl<T0312> implements T0312DAO{

public T0312DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0312.class);
}

}