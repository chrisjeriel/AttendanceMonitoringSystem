package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0333DAO;
import ph.com.bpi.model.hibernate.T0333;

public class T0333DAOImpl extends BaseDAOImpl<T0333> implements T0333DAO{

public T0333DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0333.class);
}

}