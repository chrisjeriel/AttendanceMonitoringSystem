package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0207DAO;
import ph.com.bpi.model.hibernate.T0207;

public class T0207DAOImpl extends BaseDAOImpl<T0207> implements T0207DAO{

public T0207DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0207.class);
}

}