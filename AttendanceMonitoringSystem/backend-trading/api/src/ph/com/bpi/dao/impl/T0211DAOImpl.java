package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0211DAO;
import ph.com.bpi.model.hibernate.T0211;

public class T0211DAOImpl extends BaseDAOImpl<T0211> implements T0211DAO{

public T0211DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0211.class);
}

}