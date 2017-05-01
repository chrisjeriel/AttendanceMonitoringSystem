package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.HeaderDataDAO;
import ph.com.bpi.model.hibernate.HeaderData;

public class HeaderDataDAOImpl extends BaseDAOImpl<HeaderData> implements HeaderDataDAO{

	public HeaderDataDAOImpl(SessionFactory mSessionFactory){
		super(mSessionFactory, HeaderData.class);
	}

}
