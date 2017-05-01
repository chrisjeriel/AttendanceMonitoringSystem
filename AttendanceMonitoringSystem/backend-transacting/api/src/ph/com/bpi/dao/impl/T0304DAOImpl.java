package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0304DAO;
import ph.com.bpi.model.hibernate.T0304;

public class T0304DAOImpl extends BaseDAOImpl<T0304> implements T0304DAO{

	public T0304DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0304.class);
	}

}
