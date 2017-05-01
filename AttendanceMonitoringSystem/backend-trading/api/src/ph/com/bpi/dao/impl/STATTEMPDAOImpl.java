package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.STATTEMPDAO;
import ph.com.bpi.model.hibernate.STATTEMP;

public class STATTEMPDAOImpl extends BaseDAOImpl<STATTEMP> implements STATTEMPDAO{
	public STATTEMPDAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, STATTEMP.class);
	}
}
