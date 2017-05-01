package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0323DAO;
import ph.com.bpi.model.hibernate.T0323;

public class T0323DAOImpl extends BaseDAOImpl<T0323> implements T0323DAO{

public T0323DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory,T0323.class);
}

}