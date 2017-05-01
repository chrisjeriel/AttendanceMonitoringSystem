package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0901DAO;
import ph.com.bpi.model.hibernate.T0901;

public class T0901DAOImpl extends BaseDAOImpl<T0901> implements T0901DAO{

public T0901DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0901.class);
}

}