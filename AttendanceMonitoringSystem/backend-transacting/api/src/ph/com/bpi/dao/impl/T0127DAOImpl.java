package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0127DAO;
import ph.com.bpi.model.hibernate.T0127;

public class T0127DAOImpl extends BaseDAOImpl<T0127> implements T0127DAO{

public T0127DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0127.class);
}

}