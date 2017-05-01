package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0104DAO;
import ph.com.bpi.model.hibernate.T0104;

public class T0104DAOImpl extends BaseDAOImpl<T0104> implements T0104DAO{

public T0104DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0104.class);
}

}