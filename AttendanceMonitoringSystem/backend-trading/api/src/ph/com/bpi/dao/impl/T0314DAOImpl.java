package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0314DAO;
import ph.com.bpi.model.hibernate.T0314;

public class T0314DAOImpl extends BaseDAOImpl<T0314> implements T0314DAO{

public T0314DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0314.class);
}

}