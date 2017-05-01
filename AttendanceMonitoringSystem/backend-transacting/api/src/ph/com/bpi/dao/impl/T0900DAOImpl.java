package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0900DAO;
import ph.com.bpi.model.hibernate.T0900;

public class T0900DAOImpl extends BaseDAOImpl<T0900> implements T0900DAO{

	public T0900DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0900.class);
	}

}
