package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0903DAO;
import ph.com.bpi.model.hibernate.T0903;

public class T0903DAOImpl extends BaseDAOImpl<T0903> implements T0903DAO{

	public T0903DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0903.class);
	}

}
