package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0501DAO;
import ph.com.bpi.model.hibernate.T0501;

public class T0501DAOImpl extends BaseDAOImpl<T0501> implements T0501DAO{

	public T0501DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0501.class);
	}

}
