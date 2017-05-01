package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0907DAO;
import ph.com.bpi.model.hibernate.T0907;

public class T0907DAOImpl extends BaseDAOImpl<T0907> implements T0907DAO{

	public T0907DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0907.class);
	}

}
