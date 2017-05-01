package ph.com.bpi.dao.impl; 
import org.hibernate.SessionFactory;

import ph.com.bpi.dao.T0100DAO;
import ph.com.bpi.model.hibernate.T0100;

public class T0100DAOImpl extends BaseDAOImpl<T0100> implements T0100DAO{
public T0100DAOImpl(SessionFactory mSessionFactory) {
super(mSessionFactory, T0100.class);
}

}