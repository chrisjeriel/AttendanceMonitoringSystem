package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0227DAO;
import ph.com.bpi.model.hibernate.T0227;

public class T0227DAOImpl extends BaseDAOImpl<T0227> implements T0227DAO{

public T0227DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0227.class);
}

}