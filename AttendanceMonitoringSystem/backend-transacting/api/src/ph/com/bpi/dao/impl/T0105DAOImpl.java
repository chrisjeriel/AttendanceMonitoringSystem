package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0105DAO;
import ph.com.bpi.model.hibernate.T0105;

public class T0105DAOImpl extends BaseDAOImpl<T0105> implements T0105DAO{

	public T0105DAOImpl(SessionFactory mSessionFactory) {
		super(mSessionFactory, T0105.class);
	}

}