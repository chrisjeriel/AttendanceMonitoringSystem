package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0600_3DAO;
import ph.com.bpi.model.hibernate.T0600_3;

public class T0600_3DAOImpl extends BaseDAOImpl<T0600_3> implements T0600_3DAO{

	public T0600_3DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0600_3.class);
	}

}
