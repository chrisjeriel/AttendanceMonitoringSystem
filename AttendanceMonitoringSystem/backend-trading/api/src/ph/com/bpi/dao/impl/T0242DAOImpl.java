package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0242DAO;
import ph.com.bpi.model.hibernate.T0242;

public class T0242DAOImpl extends BaseDAOImpl<T0242> implements T0242DAO{

public T0242DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0242.class);
}

}