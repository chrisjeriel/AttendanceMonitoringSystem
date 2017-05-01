package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0201DAO;
import ph.com.bpi.model.hibernate.T0201;

public class T0201DAOImpl extends BaseDAOImpl<T0201> implements T0201DAO{

public T0201DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0201.class);
}

}