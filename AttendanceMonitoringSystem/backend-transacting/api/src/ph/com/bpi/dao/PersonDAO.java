package ph.com.bpi.dao;

import java.util.List;

import ph.com.bpi.model.hibernate.Person;

public interface PersonDAO{

	public List<Person> getAllPersons();

	public void insertPerson(Person person);
}
