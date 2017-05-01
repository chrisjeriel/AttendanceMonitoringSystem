package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0500DAO;
import ph.com.bpi.model.hibernate.T0500;

public class T0500DAOImpl extends BaseDAOImpl<T0500> implements T0500DAO{

	public T0500DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0500.class);
	}

}
