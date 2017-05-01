package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0309_BDAO;
import ph.com.bpi.model.hibernate.T0309_B;

public class T0309_BDAOImpl extends BaseDAOImpl<T0309_B> implements T0309_BDAO{

	public T0309_BDAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, T0309_B.class);
	}

}
