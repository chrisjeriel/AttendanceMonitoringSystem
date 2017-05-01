package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0109DAO;
import ph.com.bpi.model.hibernate.T0109;

public class T0109DAOImpl extends BaseDAOImpl<T0109> implements T0109DAO{

public T0109DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0109.class);
}

}