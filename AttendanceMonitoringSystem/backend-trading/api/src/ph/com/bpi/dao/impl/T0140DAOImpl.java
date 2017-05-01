package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0140DAO;
import ph.com.bpi.model.hibernate.T0140;

public class T0140DAOImpl extends BaseDAOImpl<T0140> implements T0140DAO{

public T0140DAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0140.class);
}

}