package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0010DAO;
import ph.com.bpi.model.hibernate.T0010;

public class T0010DAOImpl extends BaseDAOImpl<T0010> implements T0010DAO{

public T0010DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0010.class);
}

}