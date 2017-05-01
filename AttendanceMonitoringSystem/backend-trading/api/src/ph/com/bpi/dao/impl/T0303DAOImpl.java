package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0303DAO;
import ph.com.bpi.model.hibernate.T0303;

public class T0303DAOImpl extends BaseDAOImpl<T0303> implements T0303DAO{

public T0303DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0303.class);
}

}