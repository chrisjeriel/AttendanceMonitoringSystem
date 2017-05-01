package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0115DAO;
import ph.com.bpi.model.hibernate.T0115;

public class T0115DAOImpl extends BaseDAOImpl<T0115> implements T0115DAO{

	public T0115DAOImpl(SessionFactory mSessionFactory) {
		super(mSessionFactory, T0115.class);
	}

}