package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0904DAO;
import ph.com.bpi.model.hibernate.T0904;

public class T0904DAOImpl extends BaseDAOImpl<T0904> implements T0904DAO{

public T0904DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0904.class);
}

}