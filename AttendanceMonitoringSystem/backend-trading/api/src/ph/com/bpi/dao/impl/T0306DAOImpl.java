package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0306DAO;
import ph.com.bpi.model.hibernate.T0306;

public class T0306DAOImpl extends BaseDAOImpl<T0306> implements T0306DAO{

public T0306DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0306.class);
}

}