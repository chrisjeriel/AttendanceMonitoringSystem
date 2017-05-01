package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0212DAO;
import ph.com.bpi.model.hibernate.T0212;

public class T0212DAOImpl extends BaseDAOImpl<T0212> implements T0212DAO{

public T0212DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0212.class);
}

}