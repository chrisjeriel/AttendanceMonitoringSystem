package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0234DAO;
import ph.com.bpi.model.hibernate.T0234;

public class T0234DAOImpl extends BaseDAOImpl<T0234> implements T0234DAO{

public T0234DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0234.class);
}

}