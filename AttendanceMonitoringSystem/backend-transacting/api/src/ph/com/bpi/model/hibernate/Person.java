package ph.com.bpi.model.hibernate;

public class Person{

	private Integer id;

	private String firstName;

	private String lastName;

	public Integer getId(){
		return id;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		Person person = (Person) obj;
		if(firstName != null ? !firstName.equals(person.firstName) : person.firstName != null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public String toString(){
		return "Person [id=" + id + ", name=" + firstName + " " + lastName + "]";
	}
}
