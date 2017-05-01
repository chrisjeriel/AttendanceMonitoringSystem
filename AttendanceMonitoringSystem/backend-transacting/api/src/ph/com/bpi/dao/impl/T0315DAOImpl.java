package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0315DAO;
import ph.com.bpi.model.hibernate.T0315;

public class T0315DAOImpl extends BaseDAOImpl<T0315> implements T0315DAO{

	public T0315DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0315.class);
	}

}
