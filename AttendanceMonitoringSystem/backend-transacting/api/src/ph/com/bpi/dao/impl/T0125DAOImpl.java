package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0125DAO;
import ph.com.bpi.model.hibernate.T0125;

public class T0125DAOImpl extends BaseDAOImpl<T0125> implements T0125DAO{

public T0125DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0125.class);
}

}