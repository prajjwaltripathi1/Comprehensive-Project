package com.mindtree.patient.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.patient.entity.Patient;

@Service
public interface PatientService {
	Patient add(Patient pat);
	List<Patient> list();
	Patient serachById(long id);

}
