package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0117DAO;
import ph.com.bpi.model.hibernate.T0117;

public class T0117DAOImpl extends BaseDAOImpl<T0117> implements T0117DAO{

public T0117DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0117.class);
}

}