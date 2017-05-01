package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.FXPARAMDAO;
import ph.com.bpi.model.hibernate.FXPARAM;

public class FXPARAMDAOImpl extends BaseDAOImpl<FXPARAM> implements FXPARAMDAO{
	public FXPARAMDAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, FXPARAM.class);
	}

}
