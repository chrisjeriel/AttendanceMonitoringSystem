package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0133DAO;
import ph.com.bpi.model.hibernate.T0133;

public class T0133DAOImpl extends BaseDAOImpl<T0133> implements T0133DAO{

public T0133DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0133.class);
}

}