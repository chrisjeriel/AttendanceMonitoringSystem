package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0908DAO;
import ph.com.bpi.model.hibernate.T0908;

public class T0908DAOImpl extends BaseDAOImpl<T0908> implements T0908DAO{

public T0908DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0908.class);
}

}