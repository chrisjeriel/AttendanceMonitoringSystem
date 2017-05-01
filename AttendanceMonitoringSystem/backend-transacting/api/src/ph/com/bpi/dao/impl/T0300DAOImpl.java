package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0300DAO;
import ph.com.bpi.model.hibernate.T0300;

public class T0300DAOImpl extends BaseDAOImpl<T0300> implements T0300DAO{

	public T0300DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0300.class);
	}

}
