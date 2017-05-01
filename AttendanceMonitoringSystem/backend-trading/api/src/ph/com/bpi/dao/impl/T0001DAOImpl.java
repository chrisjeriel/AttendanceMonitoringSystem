package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0001DAO;
import ph.com.bpi.model.hibernate.T0001;

public class T0001DAOImpl extends BaseDAOImpl<T0001> implements T0001DAO{

public T0001DAOImpl(SessionFactory mSessionFactory ) {
super (mSessionFactory,T0001.class);
}

}