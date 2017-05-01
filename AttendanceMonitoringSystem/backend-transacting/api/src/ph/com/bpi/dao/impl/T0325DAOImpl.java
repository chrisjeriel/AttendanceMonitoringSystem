package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0325DAO;
import ph.com.bpi.model.hibernate.T0325;

public class T0325DAOImpl extends BaseDAOImpl<T0325> implements T0325DAO{

	public T0325DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0325.class);
	}

}
