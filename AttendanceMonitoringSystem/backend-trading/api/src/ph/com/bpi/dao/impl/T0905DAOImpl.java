package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0905DAO;
import ph.com.bpi.model.hibernate.T0905;

public class T0905DAOImpl extends BaseDAOImpl<T0905> implements T0905DAO{

public T0905DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0905.class);
}

}