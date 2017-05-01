package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0204DAO;
import ph.com.bpi.model.hibernate.T0204;

public class T0204DAOImpl extends BaseDAOImpl<T0204> implements T0204DAO{

public T0204DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0204.class);
}

}