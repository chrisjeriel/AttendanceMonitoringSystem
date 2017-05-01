package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0910DAO;
import ph.com.bpi.model.hibernate.T0910;

public class T0910DAOImpl extends BaseDAOImpl<T0910> implements T0910DAO{

	public T0910DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0910.class);
	}

}
