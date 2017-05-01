package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0302DAO;
import ph.com.bpi.model.hibernate.T0302;

public class T0302DAOImpl extends BaseDAOImpl<T0302> implements T0302DAO{

public T0302DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0302.class);
}

}