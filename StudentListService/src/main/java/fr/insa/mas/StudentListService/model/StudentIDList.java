package fr.insa.mas.StudentListService.model;

import java.util.ArrayList;
import java.util.List;

public class StudentIDList {
	List <Integer> studentList;
	
	

	public StudentIDList() {
		this.studentList = new ArrayList<Integer>();
	}

	public List<Integer> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Integer> studentList) {
		this.studentList = studentList;
	}
	public void addStudentID(Integer id) {
		this.studentList.add(id);
	}
	

}
