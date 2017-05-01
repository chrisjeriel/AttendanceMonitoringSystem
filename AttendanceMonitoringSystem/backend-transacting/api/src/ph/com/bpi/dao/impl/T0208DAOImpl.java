package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0208DAO;
import ph.com.bpi.model.hibernate.T0208;

public class T0208DAOImpl extends BaseDAOImpl<T0208> implements T0208DAO{

public T0208DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0208.class);
}

}