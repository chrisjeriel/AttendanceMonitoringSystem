package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0817DAO;
import ph.com.bpi.model.hibernate.T0817;

public class T0817DAOImpl extends BaseDAOImpl<T0817> implements T0817DAO{

	public T0817DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0817.class);
	}

}
