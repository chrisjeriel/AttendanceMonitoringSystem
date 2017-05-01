package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0812DAO;
import ph.com.bpi.model.hibernate.T0812;

public class T0812DAOImpl extends BaseDAOImpl<T0812> implements T0812DAO{

	public T0812DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0812.class);
	}

}
