package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0107DAO;
import ph.com.bpi.model.hibernate.T0107;

public class T0107DAOImpl extends BaseDAOImpl<T0107> implements T0107DAO{

public T0107DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0107.class);
}

}