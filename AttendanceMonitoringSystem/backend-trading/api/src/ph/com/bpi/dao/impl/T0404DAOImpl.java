package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0404DAO;
import ph.com.bpi.model.hibernate.T0404;

public class T0404DAOImpl extends BaseDAOImpl<T0404> implements T0404DAO{

public T0404DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0404.class);
}

}