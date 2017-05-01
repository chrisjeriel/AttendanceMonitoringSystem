package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0811DAO;
import ph.com.bpi.model.hibernate.T0811;

public class T0811DAOImpl extends BaseDAOImpl<T0811> implements T0811DAO{

public T0811DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0811.class);
}

}