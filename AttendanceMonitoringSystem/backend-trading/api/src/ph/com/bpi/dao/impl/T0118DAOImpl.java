package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0118DAO;
import ph.com.bpi.model.hibernate.T0118;

public class T0118DAOImpl extends BaseDAOImpl<T0118> implements T0118DAO{

public T0118DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0118.class);
}

}