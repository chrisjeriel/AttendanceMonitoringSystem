package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0230DAO;
import ph.com.bpi.model.hibernate.T0230;

public class T0230DAOImpl extends BaseDAOImpl<T0230> implements T0230DAO{

public T0230DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0230.class);
}

}