package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0216DAO;
import ph.com.bpi.model.hibernate.T0216;

public class T0216DAOImpl extends BaseDAOImpl<T0216> implements T0216DAO{

public T0216DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0216.class);
}

}