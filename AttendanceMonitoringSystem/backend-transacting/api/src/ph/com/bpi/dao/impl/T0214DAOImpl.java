package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0214DAO;
import ph.com.bpi.model.hibernate.T0214;

public class T0214DAOImpl extends BaseDAOImpl<T0214> implements T0214DAO{

public T0214DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0214.class);
}

}