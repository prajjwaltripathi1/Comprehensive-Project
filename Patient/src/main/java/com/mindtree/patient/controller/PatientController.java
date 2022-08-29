package com.mindtree.patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.patient.entity.Patient;
import com.mindtree.patient.service.PatientService;

@RestController
@RequestMapping("/patient")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class PatientController {
	
	@Autowired
    PatientService patService;
	
	@PostMapping
	public Patient add(@RequestBody Patient pat) {
		
		return patService.add(pat);
	}
	
	@GetMapping
	public List<Patient> list()
	{
		return patService.list();
	}
	
	@GetMapping("/{id}")
	public Patient searchById(@PathVariable long id)
	{
		return patService.serachById(id);
	}

}
