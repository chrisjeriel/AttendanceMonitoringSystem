package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0307DAO;
import ph.com.bpi.model.hibernate.T0307;

public class T0307DAOImpl extends BaseDAOImpl<T0307> implements T0307DAO{

public T0307DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0307.class);
}

}