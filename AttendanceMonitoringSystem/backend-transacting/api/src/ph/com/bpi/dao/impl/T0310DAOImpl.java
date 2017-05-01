package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0310DAO;
import ph.com.bpi.model.hibernate.T0310;

public class T0310DAOImpl extends BaseDAOImpl<T0310> implements T0310DAO{

	public T0310DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0310.class);
	}

}
