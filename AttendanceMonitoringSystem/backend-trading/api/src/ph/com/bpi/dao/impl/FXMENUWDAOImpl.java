package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.FXMENUWDAO;
import ph.com.bpi.model.hibernate.FXMENUW;

public class FXMENUWDAOImpl extends BaseDAOImpl<FXMENUW> implements FXMENUWDAO{
	public FXMENUWDAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, FXMENUW.class);
	}
}
