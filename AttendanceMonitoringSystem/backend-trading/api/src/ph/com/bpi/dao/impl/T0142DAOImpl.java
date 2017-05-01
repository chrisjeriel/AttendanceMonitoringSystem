package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0142DAO;
import ph.com.bpi.model.hibernate.T0142;

public class T0142DAOImpl extends BaseDAOImpl<T0142> implements T0142DAO{

public T0142DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0142.class);
}

}