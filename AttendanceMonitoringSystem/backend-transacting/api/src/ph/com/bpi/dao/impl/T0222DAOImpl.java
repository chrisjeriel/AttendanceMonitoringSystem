package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0222DAO;
import ph.com.bpi.model.hibernate.T0222;

public class T0222DAOImpl extends BaseDAOImpl<T0222> implements T0222DAO{

public T0222DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0222.class);
}

}