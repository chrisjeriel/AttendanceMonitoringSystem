package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0320DAO;
import ph.com.bpi.model.hibernate.T0320;

public class T0320DAOImpl extends BaseDAOImpl<T0320> implements T0320DAO{

public T0320DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0320.class);
}

}