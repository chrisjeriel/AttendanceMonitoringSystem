package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0327DAO;
import ph.com.bpi.model.hibernate.T0327;

public class T0327DAOImpl extends BaseDAOImpl<T0327> implements T0327DAO{

	public T0327DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0327.class);
	}

}
