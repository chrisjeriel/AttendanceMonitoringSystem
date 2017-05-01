package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0316DAO;
import ph.com.bpi.model.hibernate.T0316;

public class T0316DAOImpl extends BaseDAOImpl<T0316> implements T0316DAO{

public T0316DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0316.class);
}

}