package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.FXMENUDAO;
import ph.com.bpi.model.hibernate.FXMENU;

public class FXMENUDAOImpl extends BaseDAOImpl<FXMENU> implements FXMENUDAO{
	public FXMENUDAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, FXMENU.class);
	}
}
