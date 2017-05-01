package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0220DAO;
import ph.com.bpi.model.hibernate.T0220;

public class T0220DAOImpl extends BaseDAOImpl<T0220> implements T0220DAO{

public T0220DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0220.class);
}

}