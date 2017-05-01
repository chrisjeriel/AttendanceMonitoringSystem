package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0334DAO;
import ph.com.bpi.model.hibernate.T0334;

public class T0334DAOImpl extends BaseDAOImpl<T0334> implements T0334DAO{

public T0334DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0334.class);
}

}