package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0112DAO;
import ph.com.bpi.model.hibernate.T0105;
import ph.com.bpi.model.hibernate.T0112;

public class T0112DAOImpl extends BaseDAOImpl<T0112> implements T0112DAO{

	public T0112DAOImpl(SessionFactory mSessionFactory) {
		super(mSessionFactory, T0112.class);
	}

}