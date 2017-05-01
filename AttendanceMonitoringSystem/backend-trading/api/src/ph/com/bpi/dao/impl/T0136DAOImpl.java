package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0136DAO;
import ph.com.bpi.model.hibernate.T0136;

public class T0136DAOImpl extends BaseDAOImpl<T0136> implements T0136DAO{

public T0136DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0136.class);
}

}