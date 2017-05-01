package ph.com.bpi.dao.impl;


import org.hibernate.SessionFactory;

import ph.com.bpi.dao.MembersDAO;
import ph.com.bpi.model.hibernate.Members;

public class MembersDAOImpl extends BaseDAOImpl<Members> implements MembersDAO{

public MembersDAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, Members.class);
}

}