package fr.insa.mas.studentManagementMS.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.mas.studentManagementMS.model.Student;

@RestController
public class StudentRessource {

	@GetMapping("/students")
	public int studentNumber() {
		return 200;
	}
	
	@GetMapping(value="/students/{id}")
	public Student infosStudent(@PathVariable int id) {
		Student s = new Student(id, "Bla", "Blo");
		return s;
	}
	/*
	@GetMapping(value="/students/xml/{id}", produces = MediaType.APPLICATION_XML_VALUE)
	public Student xmlInfosStudent(@PathVariable int id) {
		Student s = new Student(id, "Blu", "Bli");
		return s;
	}
	*/
	
	@PostMapping(value = "/students")
	public void insertStudent(@RequestBody Student s) {
		System.out.println("Inserted student " + s.getId());
		
	}
	
	@PutMapping(value = "/students")
	public void updateStudent(@RequestBody Student s) {
		System.out.println("Updated student " + s.getId());
		
	}
	
	@DeleteMapping(value = "/students/{id}")
	public void deleteStudent(@PathVariable int id) {
		System.out.println("Deleted student " + id);
		
	}
	
}
