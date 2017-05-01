package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0224DAO;
import ph.com.bpi.model.hibernate.T0224;

public class T0224DAOImpl extends BaseDAOImpl<T0224> implements T0224DAO{

public T0224DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0224.class);
}

}