package fr.insa.mas.StudentListService.model;

public class Evaluation {
	private int idStudent;
	private float average;
	public Evaluation(int idStudent, float average) {
		super();
		this.idStudent = idStudent;
		this.average = average;
	}
	public Evaluation() {
		super();
	}
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	

}
