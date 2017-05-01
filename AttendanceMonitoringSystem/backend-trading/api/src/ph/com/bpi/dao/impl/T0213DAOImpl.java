package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0213DAO;
import ph.com.bpi.model.hibernate.T0213;

public class T0213DAOImpl extends BaseDAOImpl<T0213> implements T0213DAO{

public T0213DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0213.class);
}

}