package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0319DAO;
import ph.com.bpi.model.hibernate.T0319;

public class T0319DAOImpl extends BaseDAOImpl<T0319> implements T0319DAO{

	public T0319DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0319.class);
	}

}
