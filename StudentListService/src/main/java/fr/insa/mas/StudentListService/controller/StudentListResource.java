package fr.insa.mas.StudentListService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import fr.insa.mas.StudentListService.model.Evaluation;
import fr.insa.mas.StudentListService.model.Student;
import fr.insa.mas.StudentListService.model.StudentIDList;
import fr.insa.mas.StudentListService.model.StudentInfos;

@RestController
@RequestMapping("/students")
public class StudentListResource {
	@Autowired
	private RestTemplate template;
	
	@GetMapping(value="/ids/{id}")
	public StudentIDList getIDStudents(@PathVariable("id") String spe) {
		StudentIDList l = new StudentIDList();
		l.addStudentID(0);
		l.addStudentID(1);
		l.addStudentID(2);
		l.addStudentID(3);

		return l;
	}
	
	@GetMapping(value="/all/{idSpeciality}")
	public List<Student> getStudents(@PathVariable("idSpeciality") String spe) {
		StudentIDList l = new StudentIDList();
		l.addStudentID(0);
		l.addStudentID(1);
		l.addStudentID(2);
		l.addStudentID(3);
		
		int i = 0;
		List<Student> s = new ArrayList<Student>();
		
		while(i<l.getStudentList().size()) {
			StudentInfos infos = template.getForObject("http://studentInfoService/student/"+i, StudentInfos.class);
			Evaluation eval = template.getForObject("http://studentEvalService/evaluation/"+i, Evaluation.class);
			s.add(new Student(i, infos.getLastName(), infos.getFirstName(), eval.getAverage()));
			i++;	
		}
		
		return s;
		
	}

}
