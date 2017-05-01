package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0324DAO;
import ph.com.bpi.model.hibernate.T0324;

public class T0324DAOImpl extends BaseDAOImpl<T0324> implements T0324DAO{

	public T0324DAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0324.class);
	}

}
