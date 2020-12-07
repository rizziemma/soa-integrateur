package fr.insa.mas.studentManagementMS.model;

//@XmlRootElement(name="Student")
public class Student {
	private int id;
	private String lastName;
	private String firstName;
	
	public Student() {
		super();
	}
	public Student(int id, String lastName, String firstName) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

}
