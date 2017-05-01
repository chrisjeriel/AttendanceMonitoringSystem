package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0803DAO;
import ph.com.bpi.model.hibernate.T0803;

public class T0803DAOImpl extends BaseDAOImpl<T0803> implements T0803DAO{

	public T0803DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0803.class);
	}

}
