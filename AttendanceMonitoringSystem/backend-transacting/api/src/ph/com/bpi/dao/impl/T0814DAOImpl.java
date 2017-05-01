package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0814DAO;
import ph.com.bpi.model.hibernate.T0814;

public class T0814DAOImpl extends BaseDAOImpl<T0814> implements T0814DAO{

	public T0814DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0814.class);
	}

}
