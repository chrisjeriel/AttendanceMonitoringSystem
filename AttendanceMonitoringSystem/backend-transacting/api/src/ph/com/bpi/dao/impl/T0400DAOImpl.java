package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0400DAO;
import ph.com.bpi.model.hibernate.T0400;

public class T0400DAOImpl extends BaseDAOImpl<T0400> implements T0400DAO{

	public T0400DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0400.class);
	}

}
