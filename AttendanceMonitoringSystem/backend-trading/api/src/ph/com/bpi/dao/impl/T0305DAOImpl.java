package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0305DAO;
import ph.com.bpi.model.hibernate.T0305;

public class T0305DAOImpl extends BaseDAOImpl<T0305> implements T0305DAO{

public T0305DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0305.class);
}

}