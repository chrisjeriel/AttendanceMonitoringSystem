package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.FXMENUDDAO;
import ph.com.bpi.model.hibernate.FXMENUD;

public class FXMENUDDAOImpl extends BaseDAOImpl<FXMENUD> implements FXMENUDDAO{
	public FXMENUDDAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, FXMENUD.class);
	}
}
