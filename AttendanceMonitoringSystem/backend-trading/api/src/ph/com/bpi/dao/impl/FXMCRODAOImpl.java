package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.FXMCRODAO;
import ph.com.bpi.model.hibernate.FXMCRO;

public class FXMCRODAOImpl extends BaseDAOImpl<FXMCRO> implements FXMCRODAO{
	public FXMCRODAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, FXMCRO.class);
	}

}
