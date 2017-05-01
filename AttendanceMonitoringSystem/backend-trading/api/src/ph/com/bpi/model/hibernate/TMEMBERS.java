package ph.com.bpi.model.hibernate;

import java.util.HashMap;

public class TMEMBERS {

	private int id;
	private String idNumber;
	private String lastName;
	private String firstName;
	private String middleName;
	private String sex;
	private String civilStatus;
	private String bloodType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String toString() {
		return "T0104 [id=" + id + ", trdrFi=" + idNumber + "]";
	}
	
	public void parse(HashMap<String, String> map) {
		System.out.println("HERE AT PARSE.");
		System.out.println(map);
		for (String key : map.keySet()) {
			switch (key) {
			case "ID":
				id = new Integer(map.get(key));
				break;
			case "ID_NUMBER":
				idNumber = (map.get(key));
				break;
			case "LAST_NAME":
				lastName = (map.get(key));
				break;
			case "FIRST_NAME":
				firstName = (map.get(key));
				break;
			case "MIDDLE_NAME":
				middleName = (map.get(key));
				break;
			case "SEX":
				sex = (map.get(key));
				break;
			case "CIVIL_STATUS":
				civilStatus = (map.get(key));
				break;
			case "BLOOD_TYPE":
				bloodType = (map.get(key));
				break;
			}
		}
	}

}