package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0121DAO;
import ph.com.bpi.model.hibernate.T0121;

public class T0121DAOImpl extends BaseDAOImpl<T0121> implements T0121DAO{

public T0121DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0121.class);
}

}