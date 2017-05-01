package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0131DAO;
import ph.com.bpi.model.hibernate.T0131;

public class T0131DAOImpl extends BaseDAOImpl<T0131> implements T0131DAO{

public T0131DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0131.class);
}

}