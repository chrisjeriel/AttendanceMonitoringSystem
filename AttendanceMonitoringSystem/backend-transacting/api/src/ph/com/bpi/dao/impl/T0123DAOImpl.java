package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0123DAO;
import ph.com.bpi.model.hibernate.T0123;

public class T0123DAOImpl extends BaseDAOImpl<T0123> implements T0123DAO{

public T0123DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0123.class);
}

}