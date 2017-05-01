package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0816DAO;
import ph.com.bpi.model.hibernate.T0816;

public class T0816DAOImpl extends BaseDAOImpl<T0816> implements T0816DAO{

	public T0816DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0816.class);
	}

}
