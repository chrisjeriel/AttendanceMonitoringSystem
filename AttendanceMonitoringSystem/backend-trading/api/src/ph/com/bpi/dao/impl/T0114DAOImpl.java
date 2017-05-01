package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0114DAO;
import ph.com.bpi.model.hibernate.T0114;

public class T0114DAOImpl extends BaseDAOImpl<T0114> implements T0114DAO{

public T0114DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0114.class);
}

}