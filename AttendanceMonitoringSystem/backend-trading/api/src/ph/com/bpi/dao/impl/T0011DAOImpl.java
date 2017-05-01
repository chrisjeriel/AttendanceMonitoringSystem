package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0011DAO;
import ph.com.bpi.model.hibernate.T0011;

public class T0011DAOImpl extends BaseDAOImpl<T0011> implements T0011DAO{

public T0011DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0011.class);
}

}