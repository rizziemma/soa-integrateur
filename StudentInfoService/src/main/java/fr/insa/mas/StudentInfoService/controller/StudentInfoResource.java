package fr.insa.mas.StudentInfoService.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.mas.StudentInfoService.model.StudentInfos;


@RestController
@RequestMapping("/student")
public class StudentInfoResource {
	
	@GetMapping(value="/{id}")
	public StudentInfos getInfoStudent(@PathVariable("id") int id) {
		List<StudentInfos> etuds = Arrays.asList(
				new StudentInfos(0, "Bla", "Bla", "01/02/2019"),
				new StudentInfos(0, "Bli", "Bli", "02/10/2010"),
				new StudentInfos(0, "Blu", "Blu", "03/08/2012"),
				new StudentInfos(0, "Ble", "Ble", "04/05/2013")
				);
		System.out.println("Called");
		return etuds.get(id);
	}

}
