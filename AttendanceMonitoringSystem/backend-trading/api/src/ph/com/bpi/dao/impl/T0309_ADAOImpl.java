package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0309_ADAO;
import ph.com.bpi.model.hibernate.T0309_A;

public class T0309_ADAOImpl extends BaseDAOImpl<T0309_A> implements T0309_ADAO{

public T0309_ADAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, T0309_A.class);
}

}