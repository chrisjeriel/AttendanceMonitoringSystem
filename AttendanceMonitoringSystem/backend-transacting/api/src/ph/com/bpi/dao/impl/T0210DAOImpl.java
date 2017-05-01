package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0210DAO;
import ph.com.bpi.model.hibernate.T0210;

public class T0210DAOImpl extends BaseDAOImpl<T0210> implements T0210DAO{

public T0210DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0210.class);
}

}