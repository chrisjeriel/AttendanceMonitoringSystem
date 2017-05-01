package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0134DAO;
import ph.com.bpi.model.hibernate.T0134;

public class T0134DAOImpl extends BaseDAOImpl<T0134> implements T0134DAO{

public T0134DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0134.class);
}

}