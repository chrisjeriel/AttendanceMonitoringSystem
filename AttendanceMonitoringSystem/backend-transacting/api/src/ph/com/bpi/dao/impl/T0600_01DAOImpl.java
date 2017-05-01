package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0600_01DAO;
import ph.com.bpi.model.hibernate.T0600_01;

public class T0600_01DAOImpl extends BaseDAOImpl<T0600_01> implements T0600_01DAO{

	public T0600_01DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0600_01.class);
	}

}
