package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0218DAO;
import ph.com.bpi.model.hibernate.T0218;

public class T0218DAOImpl extends BaseDAOImpl<T0218> implements T0218DAO{

public T0218DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0218.class);
}

}