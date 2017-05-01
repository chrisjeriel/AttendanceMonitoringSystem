package ph.com.bpi.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ph.com.bpi.dao.PersonDAO;
import ph.com.bpi.model.hibernate.Person;

@Repository
@Transactional(readOnly = true)
public class PersonDAOImpl implements PersonDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public List<Person> getAllPersons(){
		Session session = sessionFactory.openSession();
		String hql = "FROM Person";
		Query query = session.createQuery(hql);
		List<Person> persons = query.list();
		return persons;
	}

	@Transactional(readOnly = false)
	public void insertPerson(Person employee){
		Session session = sessionFactory.openSession();
		session.save(employee);
	}

}
