package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0120DAO;
import ph.com.bpi.model.hibernate.T0120;

public class T0120DAOImpl extends BaseDAOImpl<T0120> implements T0120DAO{

public T0120DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0120.class);
}

}