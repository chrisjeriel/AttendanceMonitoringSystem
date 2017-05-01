package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0604DAO;
import ph.com.bpi.model.hibernate.T0604;

public class T0604DAOImpl extends BaseDAOImpl<T0604> implements T0604DAO{

	public T0604DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0604.class);
	}

}
