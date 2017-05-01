package ph.com.bpi.dao.impl;

import org.hibernate.SessionFactory;

import ph.com.bpi.dao.AttendancesDAO;
import ph.com.bpi.model.hibernate.Attendances;

public class AttendancesDAOImpl extends BaseDAOImpl<Attendances> implements AttendancesDAO{

public AttendancesDAOImpl(SessionFactory mSessionFactory) {
super (mSessionFactory, Attendances.class);
}

}