package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0502DAO;
import ph.com.bpi.model.hibernate.T0502;

public class T0502DAOImpl extends BaseDAOImpl<T0502> implements T0502DAO{

	public T0502DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0502.class);
	}

}
