package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0110DAO;
import ph.com.bpi.model.hibernate.T0110;

public class T0110DAOImpl extends BaseDAOImpl<T0110> implements T0110DAO{

public T0110DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0110.class);
}

}