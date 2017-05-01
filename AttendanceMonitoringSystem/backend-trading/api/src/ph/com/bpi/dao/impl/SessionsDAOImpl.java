package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.SessionsDAO;
import ph.com.bpi.model.hibernate.Sessions;

public class SessionsDAOImpl extends BaseDAOImpl<Sessions> implements SessionsDAO{

public SessionsDAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, Sessions.class);
}

}