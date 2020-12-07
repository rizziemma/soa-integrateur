package fr.insa.mas.StudentListService.model;

public class StudentInfos {

	private int id;
	private String birthDate;
	private String lastName;
	private String firstName;
	public StudentInfos(int id, String birthDate, String lastName, String firstName) {
		super();
		this.id = id;
		this.birthDate = birthDate;
		this.lastName = lastName;
		this.firstName = firstName;
	}
	public StudentInfos() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
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
