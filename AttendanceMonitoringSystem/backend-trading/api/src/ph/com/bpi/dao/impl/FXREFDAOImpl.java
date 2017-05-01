package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.FXREFDAO;
import ph.com.bpi.model.hibernate.FXREF;

public class FXREFDAOImpl extends BaseDAOImpl<FXREF> implements FXREFDAO{
	public FXREFDAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, FXREF.class);
	}
}
