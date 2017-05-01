package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0130DAO;
import ph.com.bpi.model.hibernate.T0130;

public class T0130DAOImpl extends BaseDAOImpl<T0130> implements T0130DAO{

public T0130DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0130.class);
}

}