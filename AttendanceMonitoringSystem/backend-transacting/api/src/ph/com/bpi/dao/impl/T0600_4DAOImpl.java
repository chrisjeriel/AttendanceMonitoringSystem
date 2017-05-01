package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0600_4DAO;
import ph.com.bpi.model.hibernate.T0600_4;

public class T0600_4DAOImpl extends BaseDAOImpl<T0600_4> implements T0600_4DAO{

	public T0600_4DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0600_4.class);
	}

}
