package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0235DAO;
import ph.com.bpi.model.hibernate.T0235;

public class T0235DAOImpl extends BaseDAOImpl<T0235> implements T0235DAO{

public T0235DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0235.class);
}

}