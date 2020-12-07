package fr.insa.mas.StudentEvalService.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.mas.StudentEvalService.model.Evaluation;

@RestController
@RequestMapping("/evaluation")
public class StudentEvalResource {
	
	@GetMapping(value="/{id}")
	public Evaluation getInfoStudent(@PathVariable("id") int id) {
		List<Evaluation> evals = Arrays.asList(
				new Evaluation(0, 13F),
				new Evaluation(1, 19.65F),
				new Evaluation(2, 18F),
				new Evaluation(3, 15F)
				);
		return evals.get(id);
	}

}
