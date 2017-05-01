package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0600_2DAO;
import ph.com.bpi.model.hibernate.T0600_2;

public class T0600_2DAOImpl extends BaseDAOImpl<T0600_2> implements T0600_2DAO{

	public T0600_2DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0600_2.class);
	}

}
