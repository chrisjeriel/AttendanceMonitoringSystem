package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0317DAO;
import ph.com.bpi.model.hibernate.T0317;

public class T0317DAOImpl extends BaseDAOImpl<T0317> implements T0317DAO{

public T0317DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0317.class);
}

}