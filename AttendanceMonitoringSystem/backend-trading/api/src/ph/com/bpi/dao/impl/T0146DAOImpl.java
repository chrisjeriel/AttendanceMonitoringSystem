package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0146DAO;
import ph.com.bpi.model.hibernate.T0146;

public class T0146DAOImpl extends BaseDAOImpl<T0146> implements T0146DAO{

public T0146DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0146.class);
}

}