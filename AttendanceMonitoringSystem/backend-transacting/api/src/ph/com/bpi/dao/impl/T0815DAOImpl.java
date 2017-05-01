package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0815DAO;
import ph.com.bpi.model.hibernate.T0815;

public class T0815DAOImpl extends BaseDAOImpl<T0815> implements T0815DAO{

	public T0815DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0815.class);
	}

}
