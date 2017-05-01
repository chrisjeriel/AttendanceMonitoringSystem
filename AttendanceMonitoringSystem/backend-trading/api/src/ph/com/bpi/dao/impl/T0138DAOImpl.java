package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0138DAO;
import ph.com.bpi.model.hibernate.T0138;

public class T0138DAOImpl extends BaseDAOImpl<T0138> implements T0138DAO{

public T0138DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0138.class);
}

}