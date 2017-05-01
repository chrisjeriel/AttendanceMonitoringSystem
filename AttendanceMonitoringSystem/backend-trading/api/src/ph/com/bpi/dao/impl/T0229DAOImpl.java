package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0229DAO;
import ph.com.bpi.model.hibernate.T0229;

public class T0229DAOImpl extends BaseDAOImpl<T0229> implements T0229DAO{

public T0229DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0229.class);
}

}