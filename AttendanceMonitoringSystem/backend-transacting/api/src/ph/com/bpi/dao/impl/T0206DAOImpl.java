package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0206DAO;
import ph.com.bpi.model.hibernate.T0206;

public class T0206DAOImpl extends BaseDAOImpl<T0206> implements T0206DAO{

public T0206DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0206.class);
}

}