package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0205DAO;
import ph.com.bpi.model.hibernate.T0205;

public class T0205DAOImpl extends BaseDAOImpl<T0205> implements T0205DAO{

public T0205DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0205.class);
}

}