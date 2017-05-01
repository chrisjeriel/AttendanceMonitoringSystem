package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0301DAO;
import ph.com.bpi.model.hibernate.T0301;

public class T0301DAOImpl extends BaseDAOImpl<T0301> implements T0301DAO{

	public T0301DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0301.class);
	}

}
