package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.TMEMBERSDAO;
import ph.com.bpi.model.hibernate.TMEMBERS;

public class TMEMBERSDAOImpl extends BaseDAOImpl<TMEMBERS> implements TMEMBERSDAO{

public TMEMBERSDAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, TMEMBERS.class);
}

}